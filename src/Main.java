import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("number.txt");
        int maxValue = FindMaxValue.findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);

    }
}