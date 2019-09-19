package br.com.mp.bsbdevfestival.controller;

import br.com.mp.bsbdevfestival.model.Car;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarController {

    public boolean validarNomeCarro(Car car) {
        return car.getName().isEmpty();
    }
}
