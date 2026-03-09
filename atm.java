import java.util.*;
public class atm 
{
    void display()
    {
        System.out.println("\n\n1.Deposit\n2.WithDraw\n3.CheckBalanace\n4.Cancel");
    }
    public static void main(String[] args) 
    {
        System.out.println("\t\t\t\t\t\tATM");
        Scanner scan = new Scanner(System.in);
        atm mon = new atm();
        int bank = 500;
        while(true)
        {
            mon.display();
            System.out.print("\n\n\t\tEnter Your choice:");
            int choice = scan.nextInt();
                switch (choice) 
                {
                    case 1:
                        System.out.print("\n\t\tEnter your ammount to Deposit:");
                        int amm = scan.nextInt();
                        bank += amm;
                        break;

                    case 2:
                        System.out.print("\n\t\tEnter your ammount to WithDraw:");
                        int with = scan.nextInt();
                        if(with > bank)
                        {
                            System.out.print("\t\t--Check your Balance Ammount--");
                        }
                        else
                        {
                            bank = bank - with;
                        }
                        break;

                    case 3:
                        System.out.print("\n\t\tYour Account Balance Is:"+bank);
                        break;
                
                    case 4:
                        System.out.println("\\nt\t--Thank You!--");
                        scan.close();
                        return;
        
            
                }   
        }
       
        
            
           
    }
    
}
