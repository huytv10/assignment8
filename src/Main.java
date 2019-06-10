import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                Calendar calendar = Calendar.getInstance();
                String hour = (calendar.getTime().getHours() > 9) ?
                        "" + calendar.getTime().getHours() + ""
                        : "0" + calendar.getTime().getHours();
                String minute = (calendar.getTime().getMinutes() > 9) ?
                        "" + calendar.getTime().getMinutes() + ""
                        : "0" + calendar.getTime().getMinutes();
                String second = (calendar.getTime().getSeconds() > 9) ?
                        "" + calendar.getTime().getSeconds() + ""
                        : "0" + calendar.getTime().getSeconds();

                Date date = new Date();

                System.out.printf("%1$s %2$td %2$tB %2$tY ", "date:", date);

                System.out.println(hour + ":" + minute + ":" + second);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
