//Ticket Number
//Description 
// Severity - Low , Med , High 
// State , open , closed & resolved or closed & unresolved
import java.util.Scanner;   
public class Ticket 
{   
public static void main(String args[])   
{   
int ticket;   
String Description;
String Severity;
String State;
int i;

Scanner sc=new Scanner(System.in);   

System.out.print("Enter the ticket number");   
 
ticket = sc.nextInt();   


System.out.print("Enter the Description of the issue: ");     


Description = sc.nextLine();   
 

System.out.print("Enter the Severity of the issue: ");     

Severity = sc.nextLine();  


System.out.print("Enter the State of the issue: ");     

State = sc.nextLine(); 

//Conversion of Int to String 
String ticketstr = String.valueOf(ticket);

//Array
String[] TicketArray = {ticketstr,Description,Severity,State};

//for (i = 0; i < ticket; i++) 
	//System.out.println("Ticket is: " + ticket);
	//System.out.println("Description is: " + Description);
	//System.out.println("Severity is: " + Severity);
	//System.out.println("State is: " + State);
	//System.out.println("StringInt: " + ticketstr);
	
	for (i = 0; i < TicketArray.length; i++) 
		System.out.print(TicketArray[i]);  
	
  }
}
