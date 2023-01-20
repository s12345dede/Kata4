package kata4.model;

import java.util.regex.Pattern;

public class Mail {
   
    private static final Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private final String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    public static boolean isMail(String line) {
        return pattern.matcher(line).matches();
    }
}
