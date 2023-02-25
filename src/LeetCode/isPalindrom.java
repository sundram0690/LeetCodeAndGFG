package LeetCode;

public class isPalindrom {
    public boolean isPalindrome(int x) {

        String string = Integer.toString(x);
        char[] str = string.toCharArray();
        int i = 0;
        int j = str.length-1;
        boolean isPalindrome = true;
        while(i<=j){
            if(str[i] != str[j]){
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        return isPalindrome;
    }
}
