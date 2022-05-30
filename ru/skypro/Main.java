package ru.skypro;


    public class Main {
        public static void main(String[] args) {
            Car[] cars = {
                    new Car("car1", 4),
                    new Car("car2", 3)
            };


            Truck[] trucks = {
                    new Truck("Truck1", 7),
                    new Truck("Truck2", 8),
            };


            Bicycle[] bicycles = {
                    new Bicycle("bicycle1", 2),
                    new Bicycle("bicycle2", 2),
            };


            ServiceStationFor serviceStationFor = new ServiceStationFor();
            printReport(serviceStationFor, cars, trucks, bicycles);
        }

        private static void printReport(ServiceStation serviceStation, Car[] cars, Truck[] trucks, Bicycle[] bicycles) {
            serviceStation.checkCar(cars);
            serviceStation.checkTruck(trucks);
            serviceStation.checkBicycle(bicycles);
        }
    }

