 public class CoinCombination{

 	public boolean checkCombination(int total, int[] coins){

 		int count = 0;
 		int length = coins.length;
 		
 		while(count < length){

 			String combination = Integer.toBinaryString(count);
 			int combinationLength = combination.length();
 			for(int i = 0; i < length - combinationLength; i++){
 				combination = '0' + combination;
 			}
 			System.out.println(combination);
 			count++;

 			int checkSum = 0;
 			for(int i = 0; i < length; i++){
 				if(combination.charAt(i) == '1'){
 					checkSum += coins[i];
 				}
 			}

 			if(checkSum == total){
 				return true;
 			}
 		}
 		return false;
 	}

 	public static void main(String args[]){

 		int coins[] = {2, 3, 4, 5, 10, 12};
 		int total = 10;

 		CoinCombination coinCombination = new CoinCombination();
 		if(coinCombination.checkCombination(total , coins)){
 			System.out.println("True");
 		}else{
 			System.out.println("False");
 		}

 	}
 }