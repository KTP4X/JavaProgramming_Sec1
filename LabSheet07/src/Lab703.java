import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nums[] = {78,36,58,41,25,92,75};
		int inputNumber;
		System.out.print("Input index of array : ");
		inputNumber = scan.nextInt();
		while(inputNumber<0||inputNumber>=nums.length) {
			System.out.print("Input index of array, again : ");
			inputNumber = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+nums[inputNumber]);
		if(inputNumber==(nums.length-1)) {
			System.out.println("Sorry, "+inputNumber+" is the last index in array.");
		}
		else System.out.println("Value in next    index is "+nums[inputNumber+1]);

	}

}
