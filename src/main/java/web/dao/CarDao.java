package web.dao;

import org.springframework.stereotype.Component;
import web.config.Car;


import java.util.List;

@Component
public interface CarDao {
    List<Car> getListCar(List<Car> list, int count);
}