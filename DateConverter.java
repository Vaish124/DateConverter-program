package com.vaishnavi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateConverter {
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a date (dd-MM-yyyy): ");
	        String inputDate = scanner.nextLine();

	        
	        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
	        SimpleDateFormat outputFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy");

	        try {
	            
	            Date date = inputFormat.parse(inputDate);

	            
	            String formattedDate = outputFormat.format(date);

	            
	            System.out.println("Formatted Date: " + formattedDate);
	        } catch (ParseException e) {
	           
	            System.out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy.");
	        }

	        scanner.close();
	    }

}
