import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class DateAndTimeEx1 {

    public static void main(String[] args) {
        Instant start;
        Instant end ;
        Scanner scan = new Scanner(System.in);

        System.out.println("To start time measurment, please press Enter");
        scan.nextLine();
        start = Instant.now();
        System.out.println("To end time measurment, please press Enter");
        scan.nextLine();
        end = Instant.now();

        System.out.println("Time between Start and stop: " + Duration.between(start,end).getSeconds());

    }
}