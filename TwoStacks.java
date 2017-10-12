import java.util.*;

public class TwoStacks{

	int size;
	public int[] arr;
	int s1;
	int s2;

	public TwoStacks(int size){
		arr = new int[size];
		s1 = 0;
		s2 = arr.length - 1;
	}

	public void push1(int x){

		if(s1 + 1 < s2){
			arr[s1] = x;
			s1++;
		}else
			System.out.println("Stack1 is full");
	}

	public void push2(int x){

		if(s2 - 1 > s1){
			arr[s2] = x;
			s2--;
		}else
			System.out.println("Stack2 is full");
	}

	public int pop1(){

		if(s1 > 0){
			int temp = arr[s1];
			arr[s1] = 0;
			s1--;
			return temp;
		}else{
			System.out.println("Stack1 is empty");
			return 0;
		}
	}

	public int pop2(){

		if(s2 < arr.length - 1){

			int temp = arr[s2];
			arr[s2] = 0;
			s2++;
			return temp;
		}else{
			System.out.println("Stack2 is empty");
			return 0;
		}

	}

	public void print(){
		System.out.println(Arrays.toString(arr));
	}


	public static void main(String args[]){

		TwoStacks twoStacks = new TwoStacks(10);
		twoStacks.push1(1);
		twoStacks.push1(4);
		twoStacks.push1(6);
		twoStacks.pop1();
		twoStacks.pop1();
		twoStacks.pop1();
		twoStacks.push1(2);
		twoStacks.push2(3);
		twoStacks.push2(9);
		twoStacks.push2(8);
		twoStacks.pop2();
		twoStacks.print();

	}
}