import java.util.Scanner;

public class DateConverter {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter date in YYYY-MM-DD format: ");
    String shortDate = scanner.nextLine();
    
    String[] dateParts = shortDate.split("-");
    
    int year = Integer.parseInt(dateParts[0]);
    int month = Integer.parseInt(dateParts[1]);
    int day = Integer.parseInt(dateParts[2]);
    
    String monthName = "";
    
    if(month == 1) {
      monthName = "January";
    } else if(month == 2) {
      monthName = "February";
    } else if(month == 3) {
      monthName = "March";
    } else if(month == 4) {
      monthName = "April";
    } else if(month == 5) {  
      monthName = "May";
    } else if(month == 6) {
      monthName = "June";
    } else if(month == 7) {
      monthName = "July";
    } else if(month == 8) {
      monthName = "August";
    } else if(month == 9) {
      monthName = "September";
    } else if(month == 10) {
      monthName = "October";
    } else if(month == 11) { 
      monthName = "November";
    } else {
      monthName = "December";
    }
    
    System.out.println(monthName + " " + day + ", " + year);
  }
}
