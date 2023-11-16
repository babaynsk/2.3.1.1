package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAOlmpl implements CarDAO{
    private final List<Car> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Mercedes","E",210));
        carsList.add(new Car("BMW","Bussines-sedan",5));
        carsList.add(new Car("Lada", "Desyatka",2110));
        carsList.add(new Car("Porshe", "Boxster",3));
        carsList.add(new Car("Toyota","Camry",70));
    }
    @Override
    public List<Car> getAllCars(){
        return carsList;
    }

    @Override
    public List<Car> lotCars(int carSize) {
        List<Car> resultCars = carsList.subList(0,carSize);
        return resultCars;
    }
}
