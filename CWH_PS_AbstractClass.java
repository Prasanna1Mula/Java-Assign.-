/*abstract class pen{
   abstract void write();
   abstract void refill();
}

abstract class FountainPen extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("CHANGING THE Nib");
    }
    }

 */
class Monkey {
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hlooo sir...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class CWH_PS_AbstractClass {
    public static void main(String[] args) {
     /*  FountainPen pen = new FountainPen() {
           @Override
           void changeNib() {
               super.changeNib();
           }
       };
       pen.changeNib();
    }

      */
        //QUESTION 3
        Human Pratz = new Human();
        Pratz.sleep();
        Pratz.eat();

        //Question 5
        Monkey m1 = new Human();
        m1.bite();

        BasicAnimal Monna = new Human();
        Monna.eat();
    }
}
