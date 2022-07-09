package Generic.Gen01Itnro;

public class Intro  {
    public static void main(String[] args) {
        IntroGenerica<String> test = new IntroGenerica<>();
        test.setObj("test numero one");
        System.out.println("String: " + test.getObj());

        IntroGenerica<Integer> intTest = new IntroGenerica<>();
        intTest.setObj(88);
        System.out.println("Integer: " + intTest.getObj());
    }
}
