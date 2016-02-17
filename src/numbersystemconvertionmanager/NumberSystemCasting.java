package numbersystemconvertionmanager;
import java.util.*;
public class NumberSystemCasting {
    private static String newNumberFormat="";
    public NumberSystemCasting(int decimal,int base){
        DecimalToNumberSystem(decimal,base);
    }
    private void DecimalToNumberSystem(int decimal,int base){
        Stack st=new Stack();
        //String number="";
        while(decimal!=0){
            if(decimal%base<10){
            st.push(decimal%base);
            decimal/=base;
            }else{
                st.push(hexNotation(decimal%base));
                decimal/=base;
            }
        }
        while(!st.empty()){
            newNumberFormat+=st.peek();
            st.pop();
        }
    }
    private String hexNotation(int _hexValue){
        switch (_hexValue) {
            case 10:    return "A";
            case 11:    return "B";
            case 12:    return "C";
            case 13:    return "D";
            case 14:    return "E";
            case 15:    return "F";
            default:    return "";
        }
    }
    public String getStringFormat(){
        return newNumberFormat;
    }
}
