class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(!map.getOrDefault(c1,0).equals(map1.getOrDefault(c2,0))){
                return false;
            }
            map.put(c1,i+1);
            map1.put(c2,i+1);
        }
        return true;
    }
}