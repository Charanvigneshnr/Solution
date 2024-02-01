package Charan.Practice.ZohoPrep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OneShotPrep {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime = format.parse(scanner.nextLine());
        Date endTime = format.parse(scanner.nextLine());
        long diffInMilliseconds = endTime.getTime() - startTime.getTime();
        long diffInSeconds = diffInMilliseconds / 1000 % 60;
        long diffInMinutes = diffInMilliseconds / (60 * 1000) % 60;
        long diffInHours = diffInMilliseconds / (60 * 60 * 1000);
        System.out.printf("%02d:%02d:%02d", diffInHours, diffInMinutes, diffInSeconds);
    }

}
