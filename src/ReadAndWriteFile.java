import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File k ton tai hoac noi dung co loi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter=new FileWriter(filePath,true);
            BufferedWriter bw=new BufferedWriter(fileWriter);
            bw.write("Gia tri lon nhat la " +max);
            bw.close();
        } catch (IOException ioException) {
            ioException.getMessage();
        }
    }
}
