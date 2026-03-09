//package javacode;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;


class bus {
    void display()
    {
        System.out.println("\t\t1.List of bus");
        System.out.println("\t\t2.Bus booking");
        System.out.println("\t\t3.Booked buses");
        System.out.println("\t\t4.Exit");
        System.out.println(" ");
    }

    void listOfBus()
    {
        System.out.println(" ");
        System.out.println("\nBUS\t\t\t\tRATE");
        System.out.println("-------------------------------------");
        System.out.println("1.Trichy TO Thanjai\t\t200");
        System.out.println("2.Thanjai TO Trichy\t\t250");
        System.out.println("3.Kumbakonam TO Chennai\t\t500");
        System.out.println("4.Trichy TO Chennai\t\t400");
        System.out.println("-------------------------------------");
        System.out.println(" ");
    }

    void busBooking(int value)
    {
        switch(value)
        {
            case 1: System.out.println("Trichy TO Thanjai"); break;
            case 2: System.out.println("Thanjai TO Trichy"); break;
            case 3: System.out.println("Kumbakonam TO Chennai"); break;
            case 4: System.out.println("Trichy TO Chennai"); break;
            default: System.out.println("Invalid Bus ID");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        bus ab = new bus();

        HashMap<Integer,Integer> li = new HashMap<>();
        li.put(1,200);
        li.put(2,250);
        li.put(3,500);
        li.put(4,400);

        ArrayList<Integer> bookedBuses = new ArrayList<>();
        System.out.println("\n\t\t\t\t\t\tBUS RESERVATION SYSTEM");
        System.out.println("\n\t\t1.ADMIN LOGIN\t\t\t2.USER LOGIN");
        System.out.print("\n\t\tIdentification");
        int entry = scan.nextInt();
        switch(entry)
        {
            case 1:
            case 2:
                scan.nextLine();
                System.out.print("\n\t\tUser Name:");
                String user = scan.nextLine();
                System.out.print("\n\t\tPassword:");
                int pass = scan.nextInt();
                String us = "sakthivel";
                int pa = 123;
                if(user.equals(us) && pass == pa)
                {    
                    while(true)  
                    {
                            ab.display();
                            System.out.println(" ");
                            System.out.print("Enter your choice: ");
                            int choice = scan.nextInt();
                            System.out.println(" ");

                            switch(choice)
                            {
                                case 1:
                                    ab.listOfBus();
                                    break;

                                case 2:
                                    System.out.print("Enter Bus ID to book: ");
                                    int value = scan.nextInt();
                                    System.out.println(" ");

                                    ab.busBooking(value);
                                    System.out.println("Ticket price: " + li.get(value));

                                    bookedBuses.add(value);
                                    break;

                                case 3:
                                    if(bookedBuses.isEmpty())
                                    {
                                        System.out.println("NO BOOKING YET!");
                                        System.out.println(" ");
                                    }
                                    else
                                    {
                                        System.out.println("----------------------------");
                                        System.out.println("\nBooked Buses:");
                                        for(int busId : bookedBuses)   
                                        {
                                            ab.busBooking(busId);
                                            System.out.println("Price: " + li.get(busId));
                                            System.out.println("----------------------------");
                                        }
                                    }
                                break;

                                case 4:
                                    System.out.println(" ");
                                    System.out.println("Thank you! Exiting...");
                                    System.out.println(" ");
                                    
                                return; 

                            default:
                                System.out.println("Invalid choice!");
                            }
                
                    }
                }
            else
            {

                System.out.println("\n\tInvalid Entry Check Your UserName and  Password");
            }

        }
        
            scan.close();
    }
        
}

