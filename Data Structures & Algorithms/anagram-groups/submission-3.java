class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<HashMap<Character, Integer>> stringHmap =
            new ArrayList<HashMap<Character, Integer>>();

        // For each String in the array, map the results
        for(int ctr = 0; ctr < strs.length; ctr++) {
            // Char -> Times it appeared
            HashMap<Character, Integer> charHtable = new HashMap<>();
            String current = strs[ctr];
            char[] charArray = current.toCharArray();

            // Add each char to map
            for(int charctr = 0; charctr < charArray.length; charctr++) {
                if(charHtable.containsKey(charArray[charctr])) {
                    int count = charHtable.get(charArray[charctr]);
                    charHtable.put(charArray[charctr],count + 1);
                } else {
                    charHtable.put(charArray[charctr],1);
                }
            }
            stringHmap.add(charHtable);
        }

        Set<List<String>> setOfStrings = new HashSet<>();

        // Now i have a list of hashmaps containing keys and values,
        // they are ordered in order of strings in input
        // I will cycle through it and check which are equal
        for(int ctr = 0; ctr < stringHmap.size(); ctr++) {
            List<String> listOfString = new ArrayList<>();
            // Get current map to compare to others
            HashMap<Character, Integer> currentMap = stringHmap.get(ctr);
            listOfString.add(strs[ctr]);

            for(int y = 0; y < stringHmap.size(); y++) {
                if(ctr != y) {
                    if( currentMap.equals(stringHmap.get(y)) ) {
                        listOfString.add(strs[y]);
                    }
                }
            }
            Collections.sort(listOfString);
            setOfStrings.add(listOfString);
        }

        return new ArrayList<>(setOfStrings);
    }
}
