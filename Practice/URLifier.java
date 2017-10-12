public class URLIfier{


	public void replace(String url, int length, char target, String replacement){

		int noOfSpaces = 0;
		for(char c:url){
			if(c == target){
				noOfSpaces++;
			}
		}

		int newLength = url.length() + (replacement.length() - 1) * noOfSpaces;

		int j = newLength - 1;
		int i =  length - 1;
		int repLength = replacement.length();

		while(j >= 0){

			if(url.charAt(j)!= target){
				url.charAt(j--) = url.charAt(i--);
			}else{
				
				for(int k = repLength - 1; k>=0; k--){
					url.charAt(j--) = replacement.charAt(k);
				}
				i--;
				
			}
		}
	}

	public static void main(String args[]){

		URLIfier urlifier = new URLIfier();
		String url = "thomas_binu        ";
		urlifier.replace(url, 11,  '_', "%20");
		System.out.println(url);

	}
}