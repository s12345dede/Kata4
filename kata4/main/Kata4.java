package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    
    public static void main(String[] args) {
        execute();
    }
    
    private static void execute() {
        input();
        process();
        output();
    }
        
    private static void input() {
        mailList = MailListReader.read("email.txt");
    }
        
    private static void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
        
    private static void output() {
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAMA", histogram);
        histogramDisplay.execute();
    }
}
