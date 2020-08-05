	import java.util.Scanner;
	import java.util.ArrayList;

	public class ImprovedDNA {


		public static void main(String[] args) {
			boolean A = true;
			Scanner keyboard = new Scanner(System.in);
			while (A) {
				System.out.println("Welcome!");
				System.out.println("");
				System.out.println("Please select which program to run.");
				System.out.println("");
				System.out.println("");
				System.out.println("(1): Protein checker");
				System.out.println("(2): Exit interface");
			int program = keyboard.nextInt();
		switch (program) {
		case 1: isProtein();
				break;
		case 2: A = false;
				break;
		}
			}
			
		}
		
		
		
		public static char isProtein() {
			System.out.println("Please input your DNA string.");
			Scanner keyboard = new Scanner(System.in);
			String codon = keyboard.next();
			String codonUpper = codon.toUpperCase();
			for (int i = 1; i < (codonUpper.length() - 1); i++) {
				
				switch (codonUpper.charAt(i)) {
				case 'A': break;
				case 'T': break;
				case 'G': break;
				case 'C': break;
				default: System.out.println(codonUpper.charAt(i));
					System.out.println("This is not a valid DNA structure.");
						return ' ';
				}

			}
			ArrayList<Integer> startCodons = new ArrayList<Integer>();
			ArrayList<Integer> stopCodons = new ArrayList<Integer>();
			ArrayList<Integer> added = new ArrayList<Integer>();
			int startIndex = codonUpper.indexOf("ATG");
			startCodons.add(startIndex);
		while (startIndex != -1) {
			startIndex = codonUpper.indexOf("ATG", startIndex + 1);
		if (startIndex != -1) {
			startCodons.add(startIndex); }
		}
			int stopIndex = codonUpper.indexOf("TGA");
			stopCodons.add(stopIndex);
		while (stopIndex != -1) {
			stopIndex = codonUpper.indexOf("TGA", stopIndex + 1);
		if (stopIndex != -1) {
			stopCodons.add(stopIndex); }
		}
		int counter = 0;
		for (int d : startCodons) {
			for (int e : stopCodons) {
				if ((e - d) % 3 == 0) {
					if (!added.contains(d)) {
					counter += 1;
					added.add(d);
					}
					}
				}
			}
		if (counter == 1) {
			System.out.println("There is 1 protein in this DNA string.");
			return ' ';
		}
		else {
			System.out.println("There are " + counter + " proteins in this DNA string.");
			return ' ';
		}
		
		
		
		
		
		}

		


}
