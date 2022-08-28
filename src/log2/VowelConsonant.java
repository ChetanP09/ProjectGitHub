package log2;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Happpy Independant Day";
		System.out.println(s);
		s=s.toLowerCase();
		System.out.println(s);
		int vowel=0;
		int consonant=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if (ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') 
			{
				vowel=vowel+1;
			} 
			else if(s.charAt(i)>='a' &s.charAt(i)<='z')
			{
				consonant=consonant+1;

			}
	
		}
		System.out.println("Vowel  "+vowel);
		System.out.println("Consonant  "+consonant);
	}
	

}
