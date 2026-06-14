class Solution {
    public boolean isValid(String s) {
        // An open bracket may be followed by:
        //  An open bracket
        //  A closed bracket of the same type
        // Hp. 1: A stack, in which i insert the open brackets
        //      And pop the item if closed brackets
        //      If the item popped is not of the same bracket type
        //      Then the type is not valid.

        char[] sArray = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<Character>();
        Map<Character, Character> validPairs = new HashMap<Character, Character>();
        validPairs.put(')','(');
        validPairs.put(']','[');
        validPairs.put('}','{');

        for(char c : sArray) {
            if(validPairs.containsKey(c)){ // Check if it is a closure
                // Now the item pushed is a closing bracket.
                // You have to check that the last item is of the same type
                if(stack.size() != 0 && validPairs.get(c) == stack.peekFirst()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        if(stack.size() != 0) return false;
        return true;
    }
}
