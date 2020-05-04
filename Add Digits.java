class Solution {
    public int addDigits(int n) {
        return 1 + (n - 1) % 9;
    }
}

/*Using Congruence Formula

This is a standard digital-root problem. The digital-root of a non-negative integer is the single digit value obtained by an iterative process of summing digits, on each iteration using the result from the previous iteration to compute a digit sum. The process continues until a single-digit number is reached.
For example, the digital-root of 65,536 is 7, since 6 + 5 + 5 + 3 + 6 = 25 and 2 + 5 = 7.
Digital roots can also be calculated with congruences in modular arithmetic rather than by adding up all the digits, a procedure that can save time in the case of very large numbers.
digital_root(n) = 0 		if n == 0
digital_root(n) = 9 		if n != 0 and n % 9 == 0
digital_root(n) = n % 9 	if n % 9 != 0
OR

digital_root(n) = 1 + (n - 1) % 9
To generalize the concept of digital roots to other bases b, we can simply change the 9 in the formula to b - 1.
Output sequence for decimals (b = 10):

Input:  0  1  2  3  4  . . .
Output: 0  1  2  3  4  5  6  7  8  9  1  2  3  4  5  6  7  8  9  1  2  3  . . . .
Time complexity : O(1)
Space complexity : O(1)
*/
