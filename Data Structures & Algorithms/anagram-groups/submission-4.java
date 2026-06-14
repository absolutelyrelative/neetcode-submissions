class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        // I want to use character frequency as key
        for(String s : strs) {
            // a-z, initialised to 0
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                // your int array will have frequency of characters
                // array index identifies a character
                count[c - 'a']++;
            }
            // Now your int array has character frequency for String s
            // You can use it as a key
            // You want to associate to this key each string that matches this key
            // Let's begin by adding this one string
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<String>());
            //Retrieve the list!!!
            result.get(key).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
