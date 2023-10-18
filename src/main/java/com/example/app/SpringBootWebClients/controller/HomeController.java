package com.example.app.SpringBootWebClients.controller;

import com.example.app.SpringBootWebClients.service.CarService;
import com.example.app.SpringBootWebClients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class HomeController {

    @Autowired
    CarService carService;
    @Autowired
    ClientService clientService;

    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("cars", carService.getCars());
        model.addAttribute("clients", clientService.getClients());
        return "home";
    }
}
