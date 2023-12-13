import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateInfo {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;

    // Constructor with initial values
    public DateInfo(int day, int month, int year, int hour, int minute) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    // Public getters and setters for all variables
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Method to format the date as "DD-MM-YYYY"
    public String formatDate() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    // Method to create DateInfo object from current date and time
    public static DateInfo getCurrentDateInfo() {
        Calendar calendar = Calendar.getInstance();
        return new DateInfo(
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE)
        );
    }

    // Method to format the date in different patterns using SimpleDateFormat
    public String formatCustomDate(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);
        return sdf.format(calendar.getTime());
    }

    public static void main(String[] args) {
        // Example usage
        DateInfo dateInfo = new DateInfo(15, 3, 2023, 10, 30);

        // Format date as "DD-MM-YYYY"
        System.out.println(dateInfo.formatDate());

        // Get current date and time
        DateInfo currentDateInfo = DateInfo.getCurrentDateInfo();
        System.out.println("Current Date and Time: " + currentDateInfo.formatDate());

        // Format date using a custom pattern
        System.out.println(dateInfo.formatCustomDate("dd-MMM-yyyy"));
        System.out.println(dateInfo.formatCustomDate("EEE, MMM d, yyyy"));
    }
}
