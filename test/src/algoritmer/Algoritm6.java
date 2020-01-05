package algoritmer;

public class Algoritm6 extends Algoritm {

    private final char output = '*';

    @Override
    public void execute(int input) {
        for (int n = (input-1); n >= 0; n--) {
            char[] out = new char[input];
            for (int i = 0; i <= n; i++) {
                out[i] = output;
            }
            System.out.println(new String(out));
        }
    }

}
