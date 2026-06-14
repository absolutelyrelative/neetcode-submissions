class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();

        //ABAA, k = 0
        for(right = 0; right < s.length(); right++) {
            freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) + 1);

            Character mostFrequent = null;
            for(Character c : freqMap.keySet()) {
                if(mostFrequent == null ||
                    freqMap.get(c) >= freqMap.getOrDefault(mostFrequent, 0)) {
                    mostFrequent = c;
                }
            }

            if((right - left + 1) - freqMap.get(mostFrequent) <= k) {
                maxLength = Math.max(maxLength, (right - left + 1));
            } else {
                freqMap.put(s.charAt(left), freqMap.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
        }

        return maxLength;
    }
}
