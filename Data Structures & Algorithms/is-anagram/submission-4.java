class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> sTable = new Hashtable<Character, Integer>();
        Hashtable<Character, Integer> tTable = new Hashtable<Character, Integer>();
        
        for(int ctr = 0; ctr < s.length(); ctr++) {
            if(sTable.get(s.charAt(ctr)) != null) {
                sTable.put(s.charAt(ctr), sTable.get(s.charAt(ctr)) + 1);
            } else {
                sTable.put(s.charAt(ctr), 1);
            }
        }
        for(int ctr = 0; ctr < t.length(); ctr++) {
            if(tTable.get(t.charAt(ctr)) != null) {
                tTable.put(t.charAt(ctr), tTable.get(t.charAt(ctr)) + 1);
            } else {
                tTable.put(t.charAt(ctr), 1);
            }
        }
        
        if(!sTable.equals(tTable)) return false;
        return true;
    }
}
