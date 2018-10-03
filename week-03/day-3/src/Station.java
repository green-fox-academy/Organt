public class Station {
    int gasAmount = 1000;

    public void refill(Car car){
        gasAmount -= (car.capacity - car.gasAmount);
        car.gasAmount = car.capacity;
    }

    public static void main(String[] args) {
        Car car = new Car();
        Station station = new Station();
        System.out.println(car.capacity);
        System.out.println(car.gasAmount);
        station.refill(car);
        System.out.println(car.gasAmount);
        System.out.println(station.gasAmount);
    }
}
