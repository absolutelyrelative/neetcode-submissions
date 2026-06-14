class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // 2, 1, 1, 3
        // Every time i get a temperature greater than the rest, i pop everything
        // Every time the temperature is smaller, i push everything

        // I cycle through the array until i find either condition
        Stack<int[]> tempStack = new Stack<int[]>(); // <temperature, index>
        // 2, 1, 1, 3
        // 0, 1, 2, 3
        int[] res = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            // Case 1: Temperature already present. Check stack.
            while(!tempStack.isEmpty() && t > tempStack.peek()[0]) {
                int location = tempStack.pop()[1];
                res[location] = i - location;
            }
            // Case 2: Add temperature
            tempStack.push(new int[]{t, i});
        }

        return res;


    }
}
