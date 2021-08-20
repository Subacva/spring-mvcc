package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.config.Car;
import web.dao.CarDao;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getListCar(List<Car> list, int count) {
        if (count>=5||count==0)return list;
        return carDao.getListCar(list, count);
    }
}