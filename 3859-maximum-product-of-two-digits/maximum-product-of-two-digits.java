class Solution {
    public int maxProduct(int n) {
        int largest = -1;
        int second = -1;
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second) {
                second = digit;
            }
            n /= 10;
        }
        return largest * second;
    }
}