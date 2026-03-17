import java.util.Scanner;

public class magic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1-100.");
        System.out.println("Type '0' when are you done.");
        int num = scanner.nextInt();


        if(num==0){
            System.out.println("Now take same number from god and add it.");
            System.out.println("Are you done?");
            String done=scanner.next();
            
        }else{
            System.out.println("TYPE 0!");
        }

        System.out.println("Processing...............");
        double num2= (Math.random())*101;
        int numD= (int)num2;


        if((numD%2)==0){
            System.out.println("Next add "+numD+" number.");
            System.out.println("Are you done?");
            String n1 = scanner.next();
        }else{
            numD+=1;
            System.out.println("Next add "+numD+" number.");
            System.out.println("Are you done?");
            String n2 = scanner.next();
        }


        System.out.println("Now remove your resulted number half and sent god's number back to him.");
        System.out.println("Are you done?");
        String n3 = scanner.next();

        System.out.println("#*#*#*#*#*MAGIC*#*#*#*#*#");
        System.out.println("Now you have "+(numD/2)+" left.");
        System.out.println("#*#*#*#*#*MAGIC*#*#*#*#*#");
        
        scanner.close();
    }    
}