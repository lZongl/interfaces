public class Boat implements Vehicle{
    @Override
    public void start() { //сделал на уроке
        System.out.println("Лодка заводиться");
    }

    @Override
    public void stop() {
        System.out.println("Лодка остановилась");

    }
}
