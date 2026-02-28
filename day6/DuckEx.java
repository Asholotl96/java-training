
import java.io.*;

/*
Ducking/Propagation:
Throwing back an exception to the caller/main without handling is called ducking.
MULTILEVEL DUCKING
*/

public class DuckEx {
    static void readFile() throws IOException{
        FileReader fr=new FileReader("file.txt");
    }
    static void processFile() throws IOException{
        readFile();
    }
    static void handleFile() throws IOException{
        processFile();
    }
    public static void main(String[] args) {
        try {
            handleFile();
        } catch (IOException e) {
            System.out.println("Caught exception in main: "+e.getMessage());
        }
        finally{
            System.out.println("Program executed");
        }
    }
}
