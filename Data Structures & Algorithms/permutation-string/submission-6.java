class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> firstMap = new HashMap<>();
        for(char c : s1.toCharArray())
            firstMap.put(c, firstMap.getOrDefault(c, 0) + 1);
        
        // adc, dcda
        for(int i = 0; i < s2.length(); i++) {
            if(!firstMap.containsKey(s2.charAt(i)))
                continue;
            
            int left = i;
            int right = i;
            HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>(firstMap);

            for(right = i; right < s1.length() + i && right < s2.length(); right++) {
                if(tempMap.containsKey(s2.charAt(right)) && tempMap.get(s2.charAt(right)) > 0) {
                    tempMap.put(s2.charAt(right), tempMap.get(s2.charAt(right)) - 1);
                    if(right == (s1.length() + i - 1))
                        return true;
                } else {
                    break;
                }
            }
            
        }

        return false;
        
    }
}
