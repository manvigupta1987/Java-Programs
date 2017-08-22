
public class ParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimalExample = ConvertStringToInt("20");
		System.out.println(decimalExample);
	}
	
	
	public static int ConvertStringToInt(String s) throws NumberFormatException
    { 
        int num =0;
        for(int i =0; i<s.length();i++)
        { 
            if(((int)s.charAt(i)>=48)&&((int)s.charAt(i)<=59))
            { 
                num = num*10+ ((int)s.charAt(i)-48);
            }  
        } 
        return num; 
    } 
}
