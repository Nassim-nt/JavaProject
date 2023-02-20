package randomNumbers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomNumbers {

	public static void main(String[] args) {

	Scanner ui = new Scanner(System.in);

		System.out.println("Enter nth smallest number:");
		int nth = ui.nextInt();

		int start = nth;
		int end = nth + 501;
		int counter;

		int smallest;
		int greatest;
		int randomInt;
		
		
		
		
		int numbers[] = new int[500];
		Random random = new Random();

		randomInt = random.nextInt(end - start) + start;

		numbers[0] = randomInt;

		smallest = numbers[0];
		greatest = numbers[499];

		for (counter = 1; counter < 500; counter++) {

			numbers[counter] = random.nextInt(end - start) + start;

			smallest = Math.min(smallest, numbers[counter]);
			greatest = Math.max(greatest, numbers[counter]);

			System.out.println("Random numbers: " + Arrays.toString(numbers));

			System.out.println("int nth ="+ smallest);
			System.out.println("int greatestNumber = " + greatest);
			System.out.println("The lenght = "+ numbers.length);

		}
		
		
	}

		
		
		
		
	}
	
	

