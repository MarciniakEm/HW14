
public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hello";
		String s2 = "elephant";
		System.out.println(Driver.removeVowels(s));
		System.out.println(Driver.removeConsonants(s));
		System.out.println(Driver.removeDigits(s2));
	}
	
	//returns a new String with all of the vowels
	//removed form the parameter String
	//"hello" -> hll
	static String removeVowels(String s)
	{
		return "";
		String removeVowelsList = "aAeEiIoOuU";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(removeVowelsList.indexOf(s.charAt(i)) == -1)
			{
		answer = returnString(s, removeVowelsList);
		return answer;
		
	}
	
	//returns a new String with all of the consonants
	//removed form the parameter String
	//"hello" -> eo
	static String removeConsonants(String s)
	{
		return "";
		String removeConsonantsList = "bBcCdDfFgGhHjJkKlLmMnNpPqQrRsStTvVwWxXyYzZ";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(removeConsonantList.indexOf(s.charAt(i)) == -1)
			{
		answer = returnString(s, removeConsonantsList);
		return answer;
	}
		
	//returns a new String with all of the numbers
	//removed form the parameter String
	//"he11o" -> heo
	static String removeDigits(String s)
	{
		return "";
		String removeDigitsList = "0123456789";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(removeDigitsList.indexOf(s.charAt(i)) == -1)
			{
		answer = returnString(s, removeDigitsList);
		return answer;
	}
		
	//return the first occurence in s where c is found or -1 if 
	//it was not found - we can't use the String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still kicking....
		return -1;
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	