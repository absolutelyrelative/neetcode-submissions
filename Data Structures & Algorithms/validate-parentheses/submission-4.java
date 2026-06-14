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

        for(char c : sArray) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // Now the item pushed is a closing bracket.
                // You have to check that the last item is of the same type
                if(stack.size() != 0) {
                    char firstInStack = stack.peekFirst(); //   ( [ {
                    if(firstInStack == '(' && c == ')') {stack.pop();}
                    else if(firstInStack == '[' && c == ']') {stack.pop();}
                    else if(firstInStack == '{' && c == '}') {stack.pop();}
                    else { return false; }
                } else {
                    return false;
                }
            }
        }

        if(stack.size() != 0) return false;
        return true;
    }
}
