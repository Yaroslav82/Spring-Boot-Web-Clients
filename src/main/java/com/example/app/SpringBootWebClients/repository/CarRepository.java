package com.example.app.SpringBootWebClients.repository;

import com.example.app.SpringBootWebClients.entity.Car;
import com.example.app.SpringBootWebClients.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class CarRepository {

    private static final Logger LOGGER = Logger.getLogger(CarRepository.class.getName());

    List<Car> list;

    public List<Car> getCars() throws IOException {
        File jsonFile = new ClassPathResource(Constants.URL_FILES + Constants.FILE_CARS).getFile();
        String path = jsonFile.getAbsolutePath();

        try (Reader reader = Files.newBufferedReader(Paths.get(path))) {
            Gson gson = new Gson();
            list = gson.fromJson(reader, new TypeToken<List<Car>>() {}.getType());
            list.forEach(car -> car.setImg(Constants.URL_IMAGES + car.getImg()));
            return list;
        } catch (Exception ex) {
            LOGGER.info("CarRepository msg: " + ex.getMessage());
            return Collections.emptyList();
        }
    }
}
