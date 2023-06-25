import java.util.Arrays;
import java.util.stream.Collectors;

public class A_125_Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {

        String str = Arrays.stream(s.trim().toLowerCase().split(""))
                .filter(x->Character.isLetterOrDigit ( x.charAt(0)))
                .collect(Collectors.joining());

        int left = 0;
        int right = str.length() - 1;

        System.out.println(str);
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}