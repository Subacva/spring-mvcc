package web.service;


import web.config.Car;

import java.util.List;

public interface CarService {
    List<Car>getListCar(List<Car> list, int count);
}