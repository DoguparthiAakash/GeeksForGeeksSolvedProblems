class Solution {
    public int convertFive(int n) {
        String s = String.valueOf(n);   
        s = s.replace('0', '5');        
        return Integer.parseInt(s);
        
    }
}