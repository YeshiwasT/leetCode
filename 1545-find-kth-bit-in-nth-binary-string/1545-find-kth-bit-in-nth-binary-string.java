class Solution {
    public char findKthBit(int n, int k) {
         int count = 0;
        int size =(int)Math.pow(2,n)  - 1;
        while (k > 1) {
            if (k == size / 2 + 1)
                return count % 2 == 0 ? '1' : '0';
            if (k > size / 2) {
                k = size + 1 - k;
                count++;
            }
            size =size/ 2;
        }
        return count % 2 == 0 ? '0' : '1';
    }
}