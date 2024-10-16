public class Bicycle implements Vehicle{
    @Override
    public void start() { //сделал на уроке
        System.out.println("Мотоцикл заводиться");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл остановился");
    }
}
