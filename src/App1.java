public class App1 {
    public static void main(String[] args) {
        Klient k = new Klient();
        k.imie = "Mateusz";
        k.nazwisko = "Bereda";
        k.pesel = 3425634;
        k.wiek = 45;

        Klient k2 = new Klient();
        k2.imie = "Janusz";
        k2.nazwisko = "Kowalski";
        k2.wiek = 65;
        k2.pesel = 4356345;

        String s1 = "OK";
        String s2 = s1;

        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);

        s1 = s1 + "ABC";

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
