public class Car implements Vehicle{
    @Override
    public void start() { //сделал на уроке
        System.out.println("Машина заводиться");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}
