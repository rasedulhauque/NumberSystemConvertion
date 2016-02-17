package numbersystemconvertionmanager;
import java.util.*;

public class NumberConvertion {
    public static void main(String[] args){
        Scanner entry=new Scanner(System.in);
//        System.out.print("Enter the Number you want to convert: ");
//        String number=entry.nextLine();
//        System.out.print("What is the Base of your number: ");
//        int base=entry.nextInt();
        
//        ConvertionManager convert=new ConvertionManager("ACC",16,10);
//        System.out.println(convert.getConvertedValue());
        int n;
        do{
            System.out.println("0. Exit");
            System.out.println("1. Convert Any Number System to Decimal.");
            System.out.println("2. Convert Any Number System to Another Number System.");
            System.out.print("Your Choice: ");
            n=entry.nextInt();
            operation(n);
        }while(n!=0);
    }
    public static void operation(int _n){
        Scanner entry=new Scanner(System.in);
        switch(_n){
            case 1:
                System.out.print("Enter the Number you want to convert: ");
                String number=entry.nextLine();
                System.out.print("What is the Base of your number: ");
                int base=entry.nextInt();
                ConvertionManager convert=new ConvertionManager(number,base);
                System.out.println();
                System.out.println("Decimal Value: "+convert.getDecimal());
                System.out.println();
                break;
            case 2:
                System.out.print("Enter the Number you want to convert: ");
                String number101=entry.nextLine();
                System.out.print("What is the Base of your number: ");
                int base101=entry.nextInt();
                System.out.print("What is the Base of you want to convert: ");
                int base201=entry.nextInt();
                ConvertionManager convert101=new ConvertionManager(number101,base101,base201);
                System.out.println();
                System.out.println("Converted Value: "+convert101.getConvertedValue());
                System.out.println();
                break;
            default:
                break;
        }
    }
}
