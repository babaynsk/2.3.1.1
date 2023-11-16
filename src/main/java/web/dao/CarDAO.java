package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
@Component
public interface CarDAO {
    public List<Car> getAllCars();
    public List<Car> lotCars(int carSize);

}
