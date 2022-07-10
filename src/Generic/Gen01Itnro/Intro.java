package Generic.Gen01Itnro;

public class Intro  {
    public static void main(String[] args) {
        IntroGenerica<String> test = new IntroGenerica<>();
        test.setObj("test numero one");
        System.out.println("String: " + test.getObj());

        IntroGenerica<Integer> intTest = new IntroGenerica<>();
        intTest.setObj(88);
        System.out.println("Integer: " + intTest.getObj());

        // Raw test
        MultipleGeneric testRaw = new MultipleGeneric();
        testRaw.add("Peter", 29);
        testRaw.get();

        MultipleGeneric<String,Integer> test2 = new MultipleGeneric<>();
        test2.add("Peter",29);
    }
}
