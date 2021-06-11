class CountLetters
{
	public static void main(String[] args) {
		String input = "Hi my name is Vikas, and my age is 10";
		int len = input.length();
		int space = 0;	
		System.out.println(len);

		input.toCharArray();
		for(int i = 0; i<len; i++)
		{
			String s = input.charAt(i);
			if(s == " ")
			{
				space++;
			}
		}
		System.out.println("NUmber of spaces:"+space);
	}
}