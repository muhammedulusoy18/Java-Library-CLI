import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Logger {
    private static final String LOG_FILE ="log.txt";
    public static void writeToLog(String message){
        try(BufferedWriter writer =new BufferedWriter(new FileWriter(LOG_FILE,true))){
            String timestamp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            writer.write("[ "+timestamp+"]"+message);
            writer.newLine();
        }catch(IOException e){
            System.err.println("Error writing to log file: " + e.getMessage());
        }

    }
}

