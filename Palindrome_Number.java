class Palindrome_Number {
    
    public static boolean isPalindrome(int x) {
        int temp=x;
        boolean isPalindrome=false;
        int reversed=0;
        while (x > 0) {
 
            // Finding the remainder (Last Digit)
            int remainder = x % 10;
 
            // Printing the remainder/current last digit
            reversed=reversed*10+remainder;
           // System.out.println(remainder);
 
            // Removing the last digit/current last digit
            x = x / 10;}
        System.out.println(reversed);
        if(reversed==temp){
            isPalindrome=true;
        }
        
        
        
        return isPalindrome;
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }
}