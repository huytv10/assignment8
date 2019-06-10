import java.util.Calendar;

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
                System.out.println(hour + ":" + minute + ":" + second);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
