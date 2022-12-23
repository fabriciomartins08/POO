package questaopalavra;

import java.util.Scanner;

public class Alfabetico {


    public static void main(String[] args) {
    	System.out.println("coloque uma palavra de cinco letras"); 
    	try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();

			for (int x = 0; x < input.length(); x++) {             
			    for (int y = 0; y < input.length(); y++)          
			        for (int z = 0; z < input.length(); z++) {     
			            if (x == y || x == z || y == z) continue;  
			            System.out.printf("%s%s%s\n", input.charAt(x), input.charAt(y), input.charAt(z));
			      }
			 }
		}
    }
}