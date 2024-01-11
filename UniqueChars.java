
public class UniqueChars
{
    public static void main(String[] args)
    {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

   
    public static String uniqueChars(String str) 

    {
        String buildingString = "";

        for(int i = 0; i < str.length(); i++)
        {
            char toRemove = str.charAt(i);

            if(buildingString.indexOf(toRemove) == -1)
            {
            buildingString = buildingString + toRemove;
            }

            else if(toRemove == ' ')
                {
                buildingString =+" ";
                }
        }

        return buildingString; 

    }
}