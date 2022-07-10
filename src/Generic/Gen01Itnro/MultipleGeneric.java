package Generic.Gen01Itnro;

public class MultipleGeneric <S,I>{
    private S arg01;
    private I arg02;

    public void add(S arg1, I arg2){
        arg01 = arg1;
        arg02 = arg2;
    }
    public void get(){
        System.out.println(arg01 +" " + arg02);
    }
}
