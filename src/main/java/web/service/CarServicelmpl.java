package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAOlmpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServicelmpl implements CarService{
    @Autowired
    private CarDAOlmpl carDAOlmpl;

    @Override
    public List<Car> getAllCars() {
        return carDAOlmpl.getAllCars();
    }

    @Override
    public List<Car> lotCars(int carSize){
        return carDAOlmpl.lotCars(carSize);
    }
}
