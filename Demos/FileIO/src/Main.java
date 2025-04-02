import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*try {
            writeFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        readFromWeb();

    }

    private static void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sampleFile.txt"));
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void writeFile() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("WriteFile.txt"));
            bw.write("Line#1");
            bw.newLine();
            bw.write("Line#2");
            bw.newLine();
            bw.write("Line#3");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert bw != null;
            bw.close();
        }
    }

    private static void readFromWeb(){
        try {
            URL url = new URL("https://serpent231.tripod.com/beath.txt");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}