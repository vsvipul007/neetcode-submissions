class Solution {
    public boolean isPalindrome(String s) {

        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;

        while (left < right) {

            while (left < right && !isAlphaNumeric(str[left])) {
                left++;
            }

            while (left < right && !isAlphaNumeric(str[right])) {
                right--;
            }

            if (Character.toLowerCase(str[left]) !=
                Character.toLowerCase(str[right])) {

                System.out.println(
                    "Left element = " + str[left] +
                    " - Right element = " + str[right]
                );

                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphaNumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= '0' && ch <= '9');
    }
}