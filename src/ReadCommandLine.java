import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCommandLine {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String result;

    public String keyboardInput(){
        try {
            result = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
