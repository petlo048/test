package algoritmer;

public class Algoritm3 extends Algoritm {


    private final String output = "* ";
    @Override
    public void execute(int input) {

        for (int i = 1 ;  i <= input ; i++){
            System.out.print(output);
        }
    }


}
