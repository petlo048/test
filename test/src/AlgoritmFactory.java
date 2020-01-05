import algoritmer.*;
import com.sun.xml.internal.ws.server.sei.EndpointResponseMessageBuilder;

public class AlgoritmFactory {

    public static Algoritm createAlgoritm(int i){

        switch (i) {
            case 1:
                return new Algoritm1();
            case 2:
                return new Algoritm2();
            case 3:
                return new Algoritm3();
            case 4:
                return new Algoritm4();
            case 5:
                return new Algoritm5();
            case 6:
                return new Algoritm6();
            case 7:
                return new Algoritm7();
            case 8:
                return new Algoritm8();
            case 9:
                return new Algoritm9();
            case 10:
                return new Algoritm10();
            case 44:
                return new Algoritm44();
            default:
                System.out.println(String.format("Invalid choice %s", i));
                return null;
        }

    }
}
