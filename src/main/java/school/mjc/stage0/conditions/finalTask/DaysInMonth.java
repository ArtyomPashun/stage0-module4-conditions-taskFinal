package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else if (month == 2 && year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("28");
            } else {
                System.out.println("29");
            }
        } else if (month == 2) {
            System.out.println("28");
        } else if (month == 4 || month == 6 || month == 9 || month == 10) {
            System.out.println("30");
        } else {
            System.out.println("31");
        }
    }
}
