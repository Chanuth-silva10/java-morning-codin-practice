package OtherInterviewQuestions.p20;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println(str + " is not a palindrome.");
                return;
            }
            i++;
            j--;
        }
        System.out.println(str + " is a palindrome.");
    }
}