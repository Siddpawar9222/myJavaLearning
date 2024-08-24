public class Belive {

    class Solution {

        // a should be larger than b(Euclidean algorithm)
        private int calculateGDC(int a, int b) {
            if (b == 0) {
                return a;
            }
            return calculateGDC(b, a % b);
        }

        public String fractionAddition(String expression) {
            int num = 0;
            int den = 1;
            int i = 0;
            int n = expression.length();
            while (i < n) {       // "-10/13" or "10/13"
                int currNum = 0;
                int currDen = 0;
                boolean isNegative = expression.charAt(i) == '-'; // check first character is -ve or not

                // go to next character if there is sign
                if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                    i++;
                }

                // form currNum
                while (i < n && Character.isDigit(expression.charAt(i))) {
                    currNum = (currNum * 10) + (expression.charAt(i) - '0');
                    i++;
                }
                if (isNegative) {
                    currNum *= -1;
                }
                i++;

                // form currden
                while (i < n && Character.isDigit(expression.charAt(i))) {
                    currDen = (currDen * 10) + (expression.charAt(i) - '0');
                    i++;
                }

                num = num * currDen + currNum * den;
                den = currDen * den;
            }

            int gdc = this.calculateGDC(Math.max(Math.abs(num), den), Math.min(Math.abs(num), den));
            num /= gdc;
            den /= gdc;

            return num + "/" + den;
        }
    }

    public static void main(String[] args) {

        // Calendar calendar = Calendar.getInstance();

        // // Set the calendar to 25 April 2024
        // calendar.set(Calendar.YEAR, 2024);
        // calendar.set(Calendar.MONTH, Calendar.MARCH);
        // calendar.set(Calendar.DAY_OF_MONTH, 26);

        // // Get the Date object representing 25 April 2024
        // Date specificDate = calendar.getTime();
        // Date todayDate = new Date();
        // System.out.println(getDifferenceInMonths(specificDate, todayDate));
    }
}
/*
https://leetcode.com/problems/grumpy-bookstore-owner/solutions/
https://leetcode.com/problems/sum-of-square-numbers/description/
https://leetcode.com/problems/most-profit-assigning-work/description/
https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/submissions/1293747751/
https://leetcode.com/problems/count-number-of-nice-subarrays/description/?envType=daily-question&envId=2024-06-22
https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/description/?envType=daily-question&envId=2024-06-23
https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/description/
https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/?envType=daily-question&envId=2024-06-25
https://leetcode.com/problems/balance-a-binary-search-tree/description/?envType=daily-question&envId=2024-06-26
https://leetcode.com/problems/find-center-of-star-graph/description/
https://leetcode.com/problems/maximum-total-importance-of-roads/description/
https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/description/
https://leetcode.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/description/
https://leetcode.com/problems/number-of-atoms/description/
https://leetcode.com/problems/maximum-score-from-removing-substrings/description/
https://leetcode.com/problems/robot-collisions/description/
2096. Step-By-Step Directions From a Binary Tree Node to Another
https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/
 */