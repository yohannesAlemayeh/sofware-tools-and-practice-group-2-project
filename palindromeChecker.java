package tools;

public class palindromeChecker {
	public String reverse(String s) {
        String reversed = "";
        for(int i = 0; i < s.length(); i++) {
            reversed = s.charAt(i) + reversed;
        }
        return reversed;
    }
    
    public boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
