import java.util.HashSet;
import java.util.Set;

public class Belive {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
             set.add(num);
        }
        ListNode ref = new ListNode(-1);
        ref.next = head;

        ListNode prev = ref;
        ListNode curr = head;
        while (curr != null) {
           if(set.contains(curr.val)){
               prev.next = curr.next ;
               curr = curr.next ;
           }else{
                prev = curr ;
                curr = curr.next ;
           }
        }

        return ref.next ;
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