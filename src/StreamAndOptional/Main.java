package StreamAndOptional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Osoba o = new Osoba("kaly","Retreat", 20); // na skusku .distract (jeden objek zobrazi iba raz)

        List <Osoba> osoby = Arrays.asList(
                new Osoba("Peter", "Poty",29),
                new Osoba("Mato", "Facho",34),
                new Osoba("Kika", "Mlada",18), // 1 Kika..
                new Osoba("Kika", "Mlada",18), // 2 ina Kika.. !
                o, // 1
                o, // 2
                new Osoba("Marek", "keks",60)
        );



        osoby.stream()  // vytvorenie streamu (pruud)
                .filter(os -> os.getAge()<30) // prefiltrovanie (iba pod 30 rokov
                .distinct() // kazdy objekt (osoba) moze byt iba raz
                .sorted(Comparator.comparing(Osoba::getAge)) // zoradenie podla veku
                .forEach(k -> System.out.println(k.getName() + " " +k.getLastName() + " " + k.getAge() + " Kompletna osoba: " + k));
    }
}
