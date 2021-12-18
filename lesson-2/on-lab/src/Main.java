import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LocalDate toDay = LocalDate.now();
//        System.out.println(toDay);
//        System.out.println(toDay.getDayOfMonth());
//        System.out.println(toDay.getDayOfWeek());
//        System.out.println(toDay.getDayOfYear());
//
//        System.out.println("Ngày mai " + toDay.plusDays(1));
//        System.out.println("Hôm qua " + toDay.minusDays(1));
//
//        LocalDate date = LocalDate.of(2021,12,24);
//        System.out.println(date);
//        LocalDate date2 = LocalDate.of(2021, Month.DECEMBER, 24);
//        System.out.println(date2);


//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//
//        LocalTime time2 = LocalTime.of(2,20,20);
//        System.out.println(time2);
//
//        System.out.println(time.getHour());
//        System.out.println(time.getMinute());
//        System.out.println(time.getSecond());
//
//        System.out.println(time.plusSeconds(100));
//        System.out.println(time.plusMinutes(100));
//        System.out.println(time.plusHours(100));
//        System.out.println(time.minusHours(5));


//
//        ScannerLab.usingScanner();


//        System.out.println(Math.random());
//        Random rd = new Random();
//        int rdNumber = rd.nextInt(100-90) + 90;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập số bất kỳ :");
//        int number = sc.nextInt();
////        String rs = rdNumber%2==0 ? rdNumber + "là số Chẵn" : rdNumber + " là sốLẻ";
////        System.out.println(rs);
//
//        Random rd2 = new Random();
//        int rd2Number = rd2.nextInt(20 - 15) + 15;
//        System.out.println(rd2Number);
//
//        String check = number==rd2Number ? number + " và " + rd2Number + " Giống nhau" : number + " và " + rd2Number + " Khác nhau";
//        System.out.println(check);


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        double a = sc.nextInt();
        System.out.println("Nhập cạnh b");
        double b = sc.nextInt();
        double canhA =Math.pow(a.2);
        double canhB =Math.pow(b.2);
        double canhC =canhA+canhB;

        double c = Math.sqrt(canhC );

        System.out.println(c);



    }

    }

