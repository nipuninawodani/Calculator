package v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//this class name will be changed
public class FileReader {

    public Double[]  getNumber()throws IOException {

        //read the numbers from the txt file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("src/java/com.kelaniya.uni/numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1, number2};
   }

}