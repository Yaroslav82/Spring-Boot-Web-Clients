package com.example.app.SpringBootWebClients.service;

import com.example.app.SpringBootWebClients.entity.Car;
import com.example.app.SpringBootWebClients.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository repository;

    public List<Car> getCars() throws URISyntaxException, IOException {
        return repository.getCars();
    }
}
