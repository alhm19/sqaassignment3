package assignment;

public class StringOperations {

	public String getReverse(String word)
	{
		String toReturn = "";
		char[] alphabets = word.toCharArray(); 
		  
        for (int i = alphabets.length-1; i>=0; i--) 
        {
        	toReturn += alphabets[i];
        }
        return toReturn;
	}
	public String getLower(String word)
	{
        return word.toLowerCase();
	}
	public String getUpper(String word)
	{
        return word.toUpperCase();
	}
}
