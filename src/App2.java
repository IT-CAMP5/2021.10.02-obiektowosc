import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        Car c = new Car();
        /*c.brand = "Toyota";
        c.model = "Corolla";
        c.year = 2005;*/

        Random random = new Random();

        int i = random.nextInt(101);

        /*Engine e = new Engine();
        e.engineModel = "JS101";
        e.engineCapacity = 2000;
        e.numberOfPistons = 6;

        c.engine = e;*/

        /*c.engine = new Engine();
        c.engine.engineModel = "???";
        c.engine.engineCapacity = 2000;
        c.engine.numberOfPistons = 6;*/

        System.out.println(c.brand);
        System.out.println(c.model);
        System.out.println(c.year);
        System.out.println(c.engine);
        System.out.println();
        System.out.println(c.engine.engineCapacity);
        System.out.println(c.engine.engineModel);
        System.out.println(c.engine.numberOfPistons);

        Car c2 = new Car();
        c2.brand = "Mazda";
        System.out.println(c2.brand);
    }
}
