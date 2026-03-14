1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode s=head;
15        ListNode f=head;
16        while(f!=null&&f.next!=null){
17            s=s.next;
18            f=f.next.next;
19        
20            if(s==f){
21                s=head;
22                while(s!=f){
23               
24                s=s.next;
25                f=f.next;
26                }
27                return s;
28            }
29        
30        }
31        return null;
32    }
33}