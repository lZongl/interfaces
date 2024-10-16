//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Garage {
    public static void main(String[] args) {
       Vehicle car = new Car(); //cделал на уроке
       Vehicle bicycle = new Bicycle();
       Vehicle boat = new Boat();
       Garage car1 = new Main();
       Garage bicycle1 = new Main();
       Garage boat1 = new Main();


       car1.operateVehicle(car); //сделал на уроке
       bicycle1.operateVehicle(bicycle);
       boat1.operateVehicle(boat);
    }

}