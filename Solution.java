public class Solution {
    public boolean isValid(String s) {
        int norm = 0;
        int curly = 0;
        int straight = 0;

        if (s.length()%2 != 0)
            return false;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> norm++;
                case '[' -> straight++;
                case '{' -> curly++;
                case ')' -> norm--;
                case ']' -> straight--;
                case '}' -> curly--;
            }
        }

        return norm==0&&curly==0&straight==0;
    }
}
