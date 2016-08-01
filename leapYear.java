//Write a program that calculates the leap years in the next 20 years!


public class LeapYear {
    public static void main(String[] args) {
       int year = 2016;
       for (int i=0;i<20;i++){
           int newYear = year +=4;
           System.out.println(newYear);
       }
    }
}
