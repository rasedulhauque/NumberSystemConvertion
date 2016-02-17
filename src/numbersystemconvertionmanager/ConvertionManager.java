package numbersystemconvertionmanager;
public class ConvertionManager {
    private String strToModify;
    private int fromBase;
    private int toBase;
    private String decimalNumber="";
    private NumberSystemCasting _castVal;
public ConvertionManager(String strValue,int baseOfNumber){
    decimalConvertion(strValue,baseOfNumber);
}
private void decimalConvertion(String number,int base){
    int decimalValue=convertToNumberFormat(number,base);
    if(decimalValue<0)
            decimalNumber="Invalid Identifier";
    else
            decimalNumber=Integer.toString(decimalValue);
}
public ConvertionManager(String strValue,int fromBase,int toBase){
    strToModify=strValue;
    this.fromBase=fromBase;
    this.toBase=toBase;
    int digit=convertToNumberFormat(strToModify,this.fromBase);
    if(digit<0)
        System.out.println("Invalid Identifier");
    else
        _castVal=new NumberSystemCasting(digit,this.toBase);        
}
    
private int convertToNumberFormat(String number,int base){
    if(numberValidation(number,base)){
    if(base<2 || (base>10 && base!=16))  return -1;
    int value=0;
    for(int i=number.length()-1;i>=0;i--){
        int digit=convertStringToDigit(number.charAt(i));
        int exp=number.length()-1-i;
        value+=digit*Math.pow(base, exp);
    }
    return value;
    }else{ return -1;
    }
}
private int convertStringToDigit(char ch){
    if(ch>='0' && ch<='9') return ch -'0';
    else if(ch>='a' && ch<='f') return 10+ch -'a';
    else if(ch>='A' && ch<='F') return 10+ch -'A';
    else return -1;
}
private boolean numberValidation(String number,int base){
        for(int i=0;i<number.length();i++){
        int digit=convertStringToDigit(number.charAt(i));
        switch(base){
            case 2:
                if(digit>=0 && digit<=1)    continue;
                else    return false;
            case 8:
                if(digit>=0 && digit<=8)    continue;
                else return false;
            case 16:
                if(digit>=0 && digit<=16)    continue;
                else return false;
            case 10:
                if(digit>=0 && digit<=9)    continue;
                else return false;
        }
       }
        return true;
}

public String getConvertedValue(){
    return _castVal.getStringFormat();
}
public String getDecimal(){
    return decimalNumber;
}

}

