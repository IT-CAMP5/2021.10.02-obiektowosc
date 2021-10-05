public class App3 {
    public static void main(String[] args) {
        Car c = new Car();
        int liczba1 = 2;
        int liczba2 = 5;
        int wynik = c.add(liczba1,liczba2);

        System.out.println(c.add(2,4));
        System.out.println();

        c.add(c.add(3,4), c.add(4,6));

        c.drive();
    }
}
