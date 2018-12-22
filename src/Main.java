import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PapollGenerator passgen = new PapollGenerator();
        int size = Integer.parseInt(reader.readLine());
            System.out.println(passgen.getParoll(size));
    }
}
