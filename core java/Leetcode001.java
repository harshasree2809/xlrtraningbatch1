package leetcode;
public class Leetcode001 {
        public boolean isPalindrome(int x) {
            String st = Integer.toString(x);
            for(int i=0;i<st.length();i++ ){
                char start = st.charAt(i);
                char end = st.charAt(st.length() - 1 - i);
                if (start != end) {
                    return false;
                }
            }
    
            return true;
        
        }
        public static void main(String[] args) {
            Leetcode001 leetcode001 = new Leetcode001();
            System.out.println(leetcode001.isPalindrome(12321)); 
        }
    }

