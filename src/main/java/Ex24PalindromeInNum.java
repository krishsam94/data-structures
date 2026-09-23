public class Ex24PalindromeInNum {
    public static void main(String[] args) {
      System.out.println(isPalindrome(121));
    }
    /* static boolean isPalindrome(int x) {
        String str = x + "";
        for(int i=str.length()-1; i>=str.length()/2; i--) {
            int idx = (str.length()-1) - i;
            if(str.charAt(idx) != str.charAt(i))
                return false;
        }
        return true;
    } */
    // Optimized
    static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        // if x%10 is 0, then its not palindrome because numbers will not start with 0
        if(x % 10 == 0) return false;
        int res = 0;
        // if x < res, then more than half digits are iterated so break the loop
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        // even number of digits: x == res - compare first half & second half
        // odd number of digits: middle digit is in res, so drop it with res/10
        return x == res || x == res / 10;
    }
}
