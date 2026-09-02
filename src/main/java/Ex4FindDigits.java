import org.apache.commons.lang.StringUtils;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ex4FindDigits {
    public static void main(String[] args) {
        int[] arr = {21, 9, 5734, 32423, 323};
        int count = findEvenDigits(arr);
        System.out.println(count);
    }

    private static int findEvenDigits(int[] arr) {
        int evenCount = 0;
        for (int num : arr) {
            int digitsCount = countDigits3(num);
            if (digitsCount % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    private static int countDigits(int num) {
        if (num == 0) { return 1;}
        else if(num < 0) { num = num * -1;}
        int count = 0;
        while(num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

    // Approach 2
    private static int countDigits2(int num) {
        if (num == 0) { return 1;}
        else if(num < 0) { num = num * -1;}

        return (int) (Math.log10(num)) + 1;
    }

    // Approach 3
    private static int countDigits3(int num) {
        if (num == 0) { return 1;}
        else if(num < 0) { num = num * -1;}
        String str = String.valueOf(num);
        return str.length();
    }
}
