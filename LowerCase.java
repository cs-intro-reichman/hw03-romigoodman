

public class LowerCase 
{
    public static void main(String[] args) 
    {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    public static String lowerCase(String str) 
    {
    
        String conversToLowerCase = "";

        for (int i=0; i<str.length(); i++) 
        {
            char isUpperCase = str.charAt(i);
            
            if ((isUpperCase>= 'A') && (isUpperCase<='Z'))         
            {
            conversToLowerCase = conversToLowerCase + (char)(str.charAt(i) + 32); 
            }

            else
            {
                conversToLowerCase = conversToLowerCase + isUpperCase;
            }

        }
        return conversToLowerCase;
    }
}