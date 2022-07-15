package Generic.Gen02;

public class GenericTester <O extends Dog>{
    private O object;

    public O getObject() {
        return object;
    }

    public void setObject(O object) {
        this.object = object;
    }
}
