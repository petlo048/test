package algoritmer;

public class Algoritm8 extends Algoritm {

    private final char output = '*';


    @Override
    public void execute(int input) {

        for (int n = 0; n <= input - 1; n++) {

            char[] out = new char[input];
            for (int i = 0; i <= input - 1; i++) {
                if (n <= i){
                out[i] = output;}

            }
            System.out.println(new String(out));
        }
    }

}
