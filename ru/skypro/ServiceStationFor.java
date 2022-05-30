package ru.skypro;

public class ServiceStationFor implements ServiceStation {


    @Override
    public void checkCar(Car[] car) {
        for (int i = 0; i < car.length; i++) {


            if (car[i].getWheelsCount() != 4) {
                System.out.println("Обслуживаем " + car[i].getModelName());
                car[i].updateTyre();
            }
            car[i].checkEngine();
            System.out.println(car[i].getModelName() + " может ехать");
        }
    }


    @Override
    public void checkTruck(Truck[] truck) {
        for (int i = 0; i < truck.length; i++) {


            if (truck[i].getWheelsCount() != 4 || truck[i].getWheelsCount() != 6 || truck[i].getWheelsCount() != 8) {
                System.out.println("Обслуживаем " + truck[i].getModelName());
                truck[i].updateTyre();
            }
            truck[i].checkEngine();
            truck[i].checkTrailer();
            System.out.println(truck[i].getModelName() + " может ехать");

        }
    }

    @Override
    public void checkBicycle(Bicycle[] bicycle) {
        for (int i = 0; i < bicycle.length; i++) {
            if (bicycle[i].getWheelsCount() != 2) {
                System.out.println("Обслуживаем " + bicycle[i].getModelName());
                bicycle[i].updateTyre();
            }
            System.out.println(bicycle[i].getModelName() + " может ехать");
        }
    }
}
