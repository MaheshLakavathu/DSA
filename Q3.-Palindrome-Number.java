1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0 || (x % 10 == 0 && x != 0)) {
4            return false;
5        }
6
7        int reversedHalf = 0;
8
9        // Only reverse half of the number
10        while (x > reversedHalf) {
11            int digit = x % 10;
12            reversedHalf = reversedHalf * 10 + digit;
13            x /= 10;
14        }
15
16        // x == reversedHalf (even length) or x == reversedHalf/10 (odd length)
17        return x == reversedHalf || x == reversedHalf / 10;
18    }
19}
20