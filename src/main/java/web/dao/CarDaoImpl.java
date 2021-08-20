package web.dao;

import org.springframework.stereotype.Component;
import web.config.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{
    public static List<Car> list;

    static {
        list = new ArrayList<>();


        list.add(new Car("Bmw", 2412, "Yellow"));
        list.add(new Car("BMX", 1512, "Greem"));
        list.add(new Car("Skoda", 3452, "Black"));
        list.add(new Car("Fera", 4122, "Red"));
        list.add(new Car("Dada", 1231, "Blue"));
    }
    public CarDaoImpl() {
    }
    @Override
    public List<Car> getListCar(List<Car> list, int count) {
        if (count >= 5 || count == 0) return list;
        return list.stream().limit(count).collect(Collectors.toList());
    }
}