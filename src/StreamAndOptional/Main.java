package StreamAndOptional;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Osoba o = new Osoba("kaly","Retreat", 20); // na skusku .distract (jeden objek zobrazi iba raz)

        List <Osoba> osoby = Arrays.asList(
                new Osoba("Peter", "Poty",29),
                new Osoba("Mato", "Facho",34),
                new Osoba("Kika", "Mlada",18), // 1 Kika..
                new Osoba("Kika", "Mlada",18), // 2 ina Kika.. !
                new Osoba(null, null,18), //  null kika
                o, // 1
                o, // 2
                new Osoba("Marek", "keks",60)
        );



        osoby.stream()  // vytvorenie streamu (pruud)
                .filter(os -> os.getAge()<30) // prefiltrovanie (iba pod 30 rokov
                .distinct() // kazdy objekt (osoba) moze byt iba raz
                .sorted(Comparator.comparing(Osoba::getAge)) // zoradenie podla veku
                .forEach(k -> System.out.println(k.getName() + " " +k.getLastName() + " " + k.getAge() + " Kompletna osoba: " + k));

        System.out.println("..................");

        // stream
        osoby.stream()
                // pretypovanie na Optional
                .map(Optional::ofNullable)
                // ak nie je null tak vypis (ak je null vo vnutry tak ho ale vypise *priklad null kika*)ak je null normalne hodi chybu
                .forEach(t -> t.ifPresent(System.out::println));

        System.out.println("..............................");

        //ako sa dostat ku vnutru Optional
        osoby.stream()
                .map(Optional::ofNullable)
                .distinct()
                .forEach(tt -> tt.ifPresent(pr -> System.out.println(pr.getName() +" "+ pr.lastName +" "+ pr.age)));
    }
}
