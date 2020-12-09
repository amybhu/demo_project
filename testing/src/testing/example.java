package testing;

public class example {
	public int cube(int x)
	{
		return x*x*x;
	}
	public int count(String word)
	{
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='A')
			{
				count++;
			}
		}
		return count;
	}

}


