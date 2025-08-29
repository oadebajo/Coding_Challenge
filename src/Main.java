///Fake client: SwiftBike Share needs a kiosk estimator.
/// Goal: Calculate trip cost from minutes ridden.
/// Requirements
/// Prompt for trip minutes (int) and unlock fee and per-minute rate (double).
///
///
/// Total = unlockFee + minutes * perMinute.
///
///
/// Add a device fee computed as €0.01 per minute (use a constant), then add 21% VAT.
///
///
/// Output a clean breakdown: minutes, per-minute cost, device fee, VAT, grand total.
///
///
/// Demonstrate casting at least once (e.g., when turning cents into euros with Math.round approach, or casting minute math).
///
///
/// Bonus extensions (choose any)
/// Quarter-hour rounding: billable minutes are rounded up to the next 15 (use Math.ceil(minutes / 15.0) * 15).
///
///
/// Input guard: if the user enters negative minutes, treat them as 0 (one simple if).
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many minutes are you on the kiosk");
        int tripMinutes = scanner.nextInt();
        System.out.println("Whats the minute rate");
        double minuteRate = scanner.nextInt();
        System.out.println("What is the unlock fee?");
        int unlockFee = scanner.nextInt();
        double total = (unlockFee + (tripMinutes * minuteRate));
        double deviceFee = 0.01 * tripMinutes;
        double subTotal = total*0.21;
        double grand = subTotal + total + deviceFee;
        System.out.println("Minutes =" + tripMinutes);
        System.out.println("Per minute cost =" + minuteRate);
        System.out.println("Unlock Fee =" + unlockFee);
        System.out.println("VAT = " + subTotal);
        System.out.println("Grand Total =" + grand);
    }
}