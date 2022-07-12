package Generic.gen02;

public class Main {
    public static void main(String[] args) {
       // GenericTester<Osoba> os = new GenericTester<Osoba>; nepojde lebo Osoba neExtenduje Dog

        GenericTester<Dog> pes = new GenericTester<>(); // vytvorim objekt do ktoreho vlozim classu
        pes.setObject(new Dog()); // vlozim (new Dog..) objekt do objektu pes a na zaklade neho mozem pouzit jeho metody

        GenericTester<DifDog> inyPes = new GenericTester<>(); // vytvorim objekt do ktoreho vlozim classu
        inyPes.setObject(new DifDog()); // vlozim (new DifDog..) objekt do objektu inyPes a na zaklade neho mozem pouzit jeho metody

        pes.getObject().bark();
        inyPes.getObject().setName("Truhlik");
        System.out.println(inyPes.getObject().name);
    }
}
