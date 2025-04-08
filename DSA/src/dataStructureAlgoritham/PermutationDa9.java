package dataStructureAlgoritham;

public class PermutationDa9 {

	// The display function that generates permutations
	static void display(String str, String res) {

		// Base case: If the string is empty, print the result string
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		// Loop through the string, pick a character, and make a recursive call
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // Pick a character
			// Create a new string by removing the picked character
			String ros = str.substring(0, i) + str.substring(i + 1);
			// Recursively call display with the new string and updated result
			display(ros, res + ch);
		}
	}

	// Main function
	public static void main(String[] args) {
		String s = "ABC"; // String to find permutations of
		display(s, ""); // Call display with the original string and an empty result string
	}
}

//
//Given:
//str = "ABC"
//res = "" (empty string initially)
//Now, for the first iteration of the loop:
//
//ch = 'A': The character at index 0 of "ABC".
//
//ros = "BC": This is the string after removing 'A' from "ABC". We are left with "BC".
//
//res + ch = "" + 'A' = "A": This is the result string after adding 'A' to the current result. Since res was initially an empty string (""), res + ch becomes "A".
//
//Now, the code calls:
//
//java
//Copy code
//display(ros, res + ch);  // display("BC", "A")
//At this point:
//
//ros is "BC", which is the remaining part of the string after removing 'A'.
//res + ch is "A", which is the result we've built so far (just the character 'A').
//This process repeats recursively for the next characters in the string "BC", and the result string (res) keeps getting updated.
//
//In the next recursive call (display("BC", "A")), the process continues:
//Pick 'B' (first character of "BC").
//Create ros = "C" (after removing 'B' from "BC").
//Update res to "AB" (because we are adding 'B' to the existing result "A").
//Now, the next recursive call is:
//
//java
//Copy code
//display(ros, res + ch);  // display("C", "AB")
//And it keeps going until all characters have been used.
//
//Summary:
//ros is the remaining string after removing the character ch from str.
//res + ch is the updated result string with the character ch added to it.
//In the first call, ros = "BC" and res + ch = "A". This keeps happening recursively to build all the permutations of the string.
//
//
//
//
//
//
//You said:
//and after that 
//ChatGPT said:
//ChatGPT
//After the first recursive call (display("BC", "A")), the process continues as follows. Let’s go step by step to understand what happens next.
//
//Initial Setup:
//str = "ABC"
//res = "" (empty initially)
//First Iteration:
//ch = 'A' (First character of "ABC")
//ros = "BC" (Remaining string after removing 'A')
//res + ch = "" + 'A' = "A"
//Now, the recursive call is:
//
//java
//Copy code
//display("BC", "A")
//Second Iteration (display("BC", "A")):
//Pick 'B' (First character of "BC").
//Create ros = "C" (After removing 'B' from "BC").
//Update res to "AB" (Because we add 'B' to "A").
//Now, the next recursive call is:
//
//java
//Copy code
//display("C", "AB")
//Third Iteration (display("C", "AB")):
//Pick 'C' (First character of "C").
//Create ros = "" (After removing 'C' from "C").
//Update res to "ABC" (Because we add 'C' to "AB").
//Now, the next recursive call is:
//
//java
//Copy code
//display("", "ABC")
//Base Case (display("", "ABC")):
//Here, str is empty (str.length() == 0), so the base case is reached.
//We print the result "ABC" because res = "ABC".
//Backtracking:
//Now, the recursion starts to backtrack. The function goes back to where it left off, continuing the iterations for all possible permutations.
//
//Let’s continue with the next iterations:
//
//Second Iteration of display("BC", "A") (i = 1):
//Pick 'C' (Second character of "BC").
//Create ros = "B" (After removing 'C' from "BC").
//Update res to "AC" (Because we add 'C' to "A").
//Now, the next recursive call is:
//
//java
//Copy code
//display("B", "AC")
