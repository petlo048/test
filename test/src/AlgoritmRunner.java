import algoritmer.*;

import java.util.Scanner;

public class AlgoritmRunner {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean done = true;

        while (done) {

            AlgoritmContext algoritmContext = new AlgoritmContext();

            System.out.println("******* Hello! *******");
            System.out.print("Select algo (0 to exit): ");
            int val = input.nextInt();

            if (val == 0) {
                return;
            }

            if (algoritmContext.setAlgoritm(AlgoritmFactory.createAlgoritm(val))){
                System.out.print("Välj inputparameter: ");
                int inputValue = input.nextInt();
                System.out.println(String.format("======= %s =======", algoritmContext.getName() ));
                algoritmContext.execute(inputValue);
                System.out.println("DONE");
            }

        }
    }
}
