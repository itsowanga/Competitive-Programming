package leetcode;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/
public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);

        if(xString.length() % 2 == 0){

            int left = 0;
            int right = xString.length()-1;



            while(left<right){

                char leftPart = xString.charAt(left);
                char rightPart = xString.charAt(right);

                if(leftPart == rightPart){
                    left = left + 1 ;
                    right = right - 1;
                    continue;
                }
                else{
                    return false;
                }
                
                }
            }
            else{
                int left = (xString.length()-1)/2;
                int right = (xString.length()-1)/2;

                while(left >= 0 && right <=  xString.length()-1) {
                    
                    char leftPart = xString.charAt(left);
                    char rightPart = xString.charAt(right);

                    if (leftPart == rightPart){
                        left = left - 1 ;
                        right = right + 1;
                        continue;
                    }

                    else{
                        return false;
                    }
                }
            }

            return true;

        }
    }

