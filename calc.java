import java.util.Scanner;

class calc {

    void display() {
        System.out.println("\n\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.Exit");
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\tCALCULATOR");

        calc dis = new calc();
        int choice;  

        do {
            System.out.print("\nEnter your A value: ");
            int a = scan.nextInt();

            System.out.print("\nEnter your B value: ");
            int b = scan.nextInt();

            dis.display();

            System.out.print("\nEnter your choice: ");
            choice = scan.nextInt();   

            switch(choice) {

                case 1:
                    System.out.println("\nAddition of " + a + " and " + b + " value is: " + (a + b));
                    break;

                case 2:
                    System.out.println("\nSubtraction of " + a + " and " + b + " value is: " + (a - b));
                    break;

                case 3:
                    System.out.println("\nMultiplication of " + a + " and " + b + " value is: " + (a * b));
                    break;

                case 4:
                    System.out.println("\nDivision of " + a + " and " + b + " value is: " + (a / b));
                    break;

                case 5:
                    System.out.println("===Calculation Ending===");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);   
        scan.close();   
    }
}