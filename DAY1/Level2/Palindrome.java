public class Palindrome {
	public static void main(String[] args) {
		// Creating the object of PalindromeChecker class
		PalindromeChecker checker = new PalindromeChecker("shivamkumar");
        checker.displayPalindromeResult();
	}
}

class PalindromeChecker {
	// Attribute of PalindromeChecker class
	private String text;
	
	// Constructor of the PalindromeChecker class, used for the initialization of the variables
	PalindromeChecker(String text) {
		this.text = text;
	}

    private boolean isPalindrome() {
        for(int i=0; i<text.length()/2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)) return false;
        }

        return true;
    }

    public void displayPalindromeResult() {
        System.out.println("\"" + text + "\" is a palindrome?: " + isPalindrome());
    }
}