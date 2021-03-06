import java.util.*;

public class Anagrams{

	public boolean compare(int[] arr1, int[] arr2){

		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}


	public List<Integer> find(String s, String p){

		List<Integer> integerList = new ArrayList<Integer>();

		int[] c1 = new int[256];
		int[] c2 = new int[256];


		//build count array
		for(int i = 0 ; i < p.length(); i++){
			c1[s.charAt(i)]++;
			c2[p.charAt(i)]++;
		}

		int len = s.length() - p.length();
		int plen = p.length();

		//abab
		//ab

		for(int i = 0; i <= len; i++){

			if(compare(c1, c2))
				integerList.add(i);


			if(i < len){
				c1[s.charAt(i)]--;
				c1[s.charAt(i + plen)]++;
			}

		}

		return integerList;

	}


	public static void main(String[] args){

		Anagrams anagrams = new Anagrams();
		List<Integer> integerList = anagrams.find("abc", "bca");
		for(int i:integerList){
			System.out.println(i);
		}


	}
}