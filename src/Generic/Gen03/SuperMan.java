package Generic.Gen03;

public class SuperMan <T extends Guy & SuperPower>{
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
