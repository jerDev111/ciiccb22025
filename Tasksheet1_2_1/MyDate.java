package Tasksheet1_2_1;


class MyDateTask {
    private int day;
    private int month;
    private int year;

    public MyDateTask() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDateTask(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class MyDate {
    public static void main(String[] args) {
        MyDateTask date1 = new MyDateTask();
        MyDateTask date2 = new MyDateTask();
        System.out.println(date1.toString());
        System.out.println(date2.toString());
       

        //  (date1 = January 1 1978) & (date2 = to September 21 1984)
        
        date1.setDate(1, 1, 1978);

        date2.setDate(21, 9, 1984);



        // Display and inspect if there is a leap year
        
        System.out.println("Date 1: " + date1.toString() + " - Leap Year: " + date1.isLeapYear());

        System.out.println("Date 2: " + date2.toString() + " - Leap Year: " + date2.isLeapYear());
    }
}