import algoritmer.Algoritm;

public class AlgoritmContext {

    public boolean setAlgoritm(Algoritm algoritm) {
        boolean ok = false;
        if (algoritm != null) {
            this.algoritm = algoritm;
            ok = true;
        }
        return ok;
    }

    private Algoritm algoritm;

    public void execute(int i ){
        algoritm.execute(i);
    }

    public String getName() {
        return algoritm.getName();
    }
}
