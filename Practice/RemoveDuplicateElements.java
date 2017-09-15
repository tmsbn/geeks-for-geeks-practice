public class RemoveDuplicateElements{

	public static void main(String args[]){

		String string = "abcfg";
		int i = 1;
		int w = 0;

		char[] s = string.toCharArray();

		while(i < s.length){

			if(s[w] != s[i]){
				s[++w] = s[i];
			}
			i++;
		}


		String s2 = new String(s, 0, w + 1);
		System.out.println(s2);
	}
}