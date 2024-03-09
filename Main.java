import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException {
        String csv = readFileToString("./file.csv");
        
        AppData appData = new AppData();
        try {
            appData.fromCsv(csv);
        } catch (Exception ex) {
            System.out.println("Exception occured while reading csv data: " + ex.toString());
            return;
        }
        
        System.out.println(appData);
        
        writeStringToFile("./file2.csv", appData.toCsv());
    }
    
    public static void writeStringToFile(String filename, String data) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
        }
    }
    
    public static String readFileToString(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new IOException("File " + filename + " does not exist");
        }
        
        String result = new String();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
            while((s = reader.readLine()) != null) {
                result += s + "\n";
            }
        }
        if(result.length() > 0 && result.charAt(result.length() - 1) == '\n') {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }
}
