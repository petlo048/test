package algoritmer;

public class Algoritm10 extends Algoritm {
    private final char output = '*';
    private final char space = ' ';

    @Override
    public void execute(int input) {
        int totLenght = input + (input - 1 );
        int middle = input - 1;

        for (int n = 0; n <= input - 1 ; n++) {
            char[] out = new char[totLenght];

            char iEvenOut = space;
            char iOddOut = output;

            if ((n % 2) == 0) {
                iEvenOut = output;
                iOddOut = space;
            }

            for (int i = 0; i <= (middle - n) ; i++) {
                int p = middle + i;
                int q = middle - i;

                if ((i % 2) == 0) {
                   out[p] = iEvenOut;
                   out[q] = iEvenOut;
                }
                else {
                    out[p] = iOddOut;
                    out[q] = iOddOut;
                }
            }
            System.out.println(new String(out));
        }
    }


}
