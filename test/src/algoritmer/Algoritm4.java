package algoritmer;

public class Algoritm4 extends Algoritm {

    private final char output = '*';

    @Override
    public void execute(int input) {

        for (int n = 0; n < input; n++) {
            char[] out = new char[input];

            for (int i = 0; i < input; i++) {
               out[i] = output;
            }
            System.out.println(new String (out));
        }
    }

}
