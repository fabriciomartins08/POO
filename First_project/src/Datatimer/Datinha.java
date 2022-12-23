package Datatimer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Datinha {

    public static void main(String[] args) throws ParseException {
        String date_s = "04/25/1994";  
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy");
        Locale.setDefault(new Locale("en", "US"));
        Date date = dt.parse(date_s);
        SimpleDateFormat dt1 = new SimpleDateFormat("MMMM d, yyyy");
        System.out.println(dt1.format(date));
    }

}