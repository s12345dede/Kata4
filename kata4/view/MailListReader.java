package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String fileName){
        
        List<Mail> mailList = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if (Mail.isMail(line)) mailList.add(new Mail(line));
            }  
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return mailList;
        
    }
}
    

