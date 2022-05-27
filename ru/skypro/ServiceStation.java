package ru.skypro;

public class ServiceStation {

    public void check(Car car, Truck truck, Bicycle bicycle) {
        checkCar(car);
        checkTruck(truck);
        checkBicycle(bicycle);
    }

    public void checkCar(Car car) {
        if (car.getWheelsCount() != 4) {
            System.out.println("Обслуживаем " + car.getModelName());
                 car.updateTyre();
            }
        car.checkEngine();
        System.out.println(car.getModelName() + " может ехать");
        }


        public void checkTruck(Truck truck) {
            if (truck.getWheelsCount() != 4 || truck.getWheelsCount() != 6 || truck.getWheelsCount() != 8) {
                System.out.println("Обслуживаем " + truck.getModelName());
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println(truck.getModelName() + " может ехать");

            }

    public void checkBicycle(Bicycle bicycle) {
        if (bicycle.getWheelsCount() != 2){
            System.out.println("Обслуживаем " + bicycle.getModelName());
            bicycle.updateTyre();
        }
        System.out.println(bicycle.getModelName() + " может ехать");
    }
    public void updateTyre() {
        System.out.println("Меняем покрышки");
    }

}
