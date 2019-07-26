 

package car;

public class CarTest {
   
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1= 1999;
        String nickName1 = "Beddy";
        String color1 = "purple";
        int yearsOwned1 = 4;
        double miles1 = 52952.92;
       Car car1= new Car(make1, model1, year1, nickName1, color1, yearsOwned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear());
       System.out.println("Car 1's Nickname: " + car1.getNickName() + ".");
       System.out.println("Car 1 is a " + car1.getColor() + " car that is " + car1.getYearsOwned() + " years old and has " + car1.getMiles() + " miles on it.");
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
    
}
