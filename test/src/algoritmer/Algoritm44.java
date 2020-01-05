package algoritmer;

import java.util.HashMap;
import java.util.Map;

public class Algoritm44 extends Algoritm {

    private final String divider = " ";

    private Map<Integer, String> myMap = new HashMap<>();

    @Override
    public void execute(int input) {

        int totSize = (input + input) ;

        for (int n = 1; n < totSize ; n++) {

            if (n <= input) {

                int start = input - n;
                String blankStartString = new String();
                for (int s = 0; s < start; s++) {
                    blankStartString = divider + blankStartString;
                }

                String outPutString = blankStartString;
                for (int i = 1; i <= n; i++) {
                    outPutString = outPutString + (i + divider);
                }

                myMap.put(n, outPutString);
                System.out.println(outPutString);
            }

            else {
                System.out.println(myMap.get(totSize - n));
            }
        }
    }


}
