package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    /*
    *   A happy number is a number defined by the following process:

        Starting with any positive integer, replace the number by the sum of the squares of its digits.
        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
        Those numbers for which this process ends in 1 are happy.

        Return true if n is a happy number, and false if not.
    * * */

    public static boolean isHappy(int n) {

        Set<Integer> checkedNumbers = new HashSet();
        // Step one get all digits
        ArrayList<Integer> digits = new ArrayList();
        int curr = n;
        while(curr>0){
            digits.add(curr%10);
            curr = curr/10;
        }

        int sum = 0;
        for(int digit : digits){
            sum += (digit * digit);
        }

        if(sum == 1){
            return true;
        }
        if(checkedNumbers.contains(sum)){
            return false;
        }
        checkedNumbers.add(sum);
        return checkNext(sum, checkedNumbers);
    }

    private static boolean checkNext(int n, Set checkedNumbers){
        if(checkedNumbers == null){
            checkedNumbers = new HashSet<Integer>();
        }
        // Step one get all digits
        ArrayList<Integer> digits = new ArrayList();
        int curr = n;
        while(curr>0){
            digits.add(curr%10);
            curr = curr/10;
        }

        int sum = 0;
        for(int digit : digits){
            sum += (digit * digit);
        }

        if(sum == 1){
            return true;
        }
        if(checkedNumbers.contains(sum)){
            return false;
        }
        checkedNumbers.add(sum);
        return checkNext(sum, checkedNumbers);
    }
}
