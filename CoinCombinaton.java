 public class CoinCombination{

 	public void checkCombination(int total, int[] coins){

 		int count = 0;
 		int length = coins.length;
 		
 		while(count < length){

 			String combination = Integer.toBinaryString(count);
 			int combintionLength = combination.length;
 			for(int i = 0; i < length - combintionLength; i++){
 				combination = '0' + combination;
 			}
 			System.out.println(combination);

 		}
 	}

 	public static void main(String args[]){

 		int coins[] = {2, 3, 4, 5, 10, 12};
 		int total = 30;

 		CoinCombination coinCombination = new CoinCombination();
 		coinCombination.checkCombination(total , coins);

 	}
 }