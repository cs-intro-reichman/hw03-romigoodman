/** String processing exercise 2. */
public class UniqueChars
{
    public static void main(String[] args)
    {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) 

    {
        String str = inputFromUser;
        String emptyString = "";

        for(int i = 0; i < str.length(); i++)
        {
            char toRemove = str.charAt(i);

            if(emptyString.indexOf(toRemove) == -1)
            {
            emptyString = emptyString + toRemove;
            }

            else if(toRemove == ' ')
                {
                    toRemove += " ";
                }
        }

        return emptyString; 

    }
}