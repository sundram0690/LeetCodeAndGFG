package LeetCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");

        return str[str.length-1].length();
    }
}
