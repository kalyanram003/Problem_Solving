class Solution {
    public boolean isPalindrome(String s) {
        String input=s.toLowerCase();
        String cleanstr=input.replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder(cleanstr);
        String rev=sb.reverse().toString();
        return cleanstr.equals(rev);
    }
}