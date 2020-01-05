package algoritmer;

public class Algoritm5 extends Algoritm {


    private final char output = '*';
    @Override
    public void execute(int input) {

        for (int n = 0; n <= input-1; n++) {
            char[] out = new char[input];
            for (int i = 0; i <= n; i++) {
                out[i] = output;
            }
            System.out.println(new String(out));
        }
    }


}
