class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count[] =new int[26];
        for(char ch: s.toCharArray()){
            count[ch - 'a']++;
        }
        for(char ch:t.toCharArray()){
            count[ch - 'a']--;
        }
        for(int value:count){
            if(value!=0) return false;
        }
        return true;
        
    }
}