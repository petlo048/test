package algoritmer;

public abstract class Algoritm {

    public abstract void execute(int i);

    public String getName() {
        return this.getClass().getName();
    }
}
