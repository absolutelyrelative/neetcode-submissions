class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = k - 1;
        int ops = Integer.MAX_VALUE;
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Initialisation
        for(int i = 0; i < k; i++) {
            Character currentChar = blocks.charAt(i);
            if(frequencyMap.containsKey(currentChar)) {
                frequencyMap.put(currentChar, frequencyMap.get(currentChar) + 1);
            } else {
                frequencyMap.put(currentChar, 1);
            }
        }

        // Print debug
        System.out.println(frequencyMap.get('W'));
        System.out.println(frequencyMap.get('B'));

        ops = Math.min(ops, frequencyMap.getOrDefault('W', 0));

        while(right < blocks.length()) {
            //int whites = 0;
            // Count the number of whites
            //for(int i = left; i <= right; i++) {
            //    if(blocks.charAt(i) == 'W') whites++;
            //}
            ops = Math.min(frequencyMap.getOrDefault('W', 0), ops);

            Character currentCharLeft = blocks.charAt(left);
            // Decrease charLeft
            if(frequencyMap.containsKey(currentCharLeft)) {
                frequencyMap.put(currentCharLeft, frequencyMap.get(currentCharLeft) - 1);
            } else {
                frequencyMap.put(currentCharLeft, 0);
            }
            left++;

            right++;
            if(right < blocks.length() ) {
                Character currentCharRight = blocks.charAt(right);
                // Increase charRight
                if(frequencyMap.containsKey(currentCharRight)) {
                    frequencyMap.put(currentCharRight, frequencyMap.get(currentCharRight) + 1);
                } else {
                    frequencyMap.put(currentCharRight, 1);
                }
            }
            //frequencyMap.put(currentCharLeft, frequencyMap.getOrDefault(currentCharLeft, 1) - 1);
            //frequencyMap.put(currentCharRight, frequencyMap.getOrDefault(currentCharRight, 1) - 1);
        }

        return ops;
        
    }
}