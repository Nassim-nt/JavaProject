package randomNumbers;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SimpleRandomNumbers {
	

	int smallest;
	int greatest;
	int randomInt;
	
	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);

		System.out.println("Enter nth smallest number:");
		int nth = ui.nextInt();
		
		int start = nth;
		int end = nth + 501;
		
		Set<Integer> set = new LinkedHashSet<Integer>();

		Random rn = new Random();
		
		

		while (set.size() != 500) {

			set.add(rn.nextInt(end - start + 1) + start);
		}

		System.out.println(set.size());
		System.out.println(set);
		System.out.println("Smallest number is nth = "+ start);
		
	}
	}
		



