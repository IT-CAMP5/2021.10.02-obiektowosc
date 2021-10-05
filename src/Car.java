public class Car {
    String brand = "Toyota";
    String model;
    int year;
    Engine engine = new Engine();

    int add(int a, int b) {
        return a + b;
    }

    void drive() {
        int i = 0;
        while(true) {
            System.out.println("Jadę !!");
            i++;

            if(i == 10) {
                return;
            }
        }

        // ????
    }
}
