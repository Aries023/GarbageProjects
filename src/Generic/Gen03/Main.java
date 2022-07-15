package Generic.Gen03;

public class Main {
    public static void main(String[] args) {
        SuperMan<Guy> ironman = new SuperMan<>();
        ironman.setObject(new Guy());

        SuperMan<DifGuy> ironman2 = new SuperMan<>();
        ironman2.setObject(new DifGuy());
        ironman.getObject().message();
        ironman2.getObject().message();

    }
}
