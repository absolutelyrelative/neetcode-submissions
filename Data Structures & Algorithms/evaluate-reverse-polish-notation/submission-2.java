class Solution {
    public static final int lowerBound = -100;
    public static final int upperBound = +100;
    // Returns true if the string is numerical and between -100 and 100
    public boolean isNumerical(String s){
        try{
            Integer number = Integer.parseInt(s);
            if(number >= lowerBound && number <= upperBound) {
                return true;
            }
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public int evalRPN(String[] tokens) {
        // The 2 numbers in an expression evaluate with the operators
        // to produce a 3rd number that, with the fourth, evaluates with
        // the next operator.
        LinkedList<String> stack = new LinkedList<String>();
        
        // Iterate over the list
        // I am assuming that the input will always be well formed
        for(String s : tokens) {
            if(isNumerical(s)) {
                // We need to make sure that after computing, the stack has the result inside
                stack.push(s);
            }
            if(!isNumerical(s)) {
                // With the 2 numbers in the stack, perform this operation
                // and put the result back in the stack
                Integer num2 = Integer.parseInt(stack.pop());
                Integer num1 = Integer.parseInt(stack.pop());
                if(s.equals("+")) {
                    Integer res = num1 + num2;
                    stack.push(String.valueOf(res));
                }
                if(s.equals("-")) {
                    Integer res = num1 - num2;
                    stack.push(String.valueOf(res));
                }
                if(s.equals("*")) {
                    Integer res = num1 * num2;
                    stack.push(String.valueOf(res));
                }
                if(s.equals("/")) {
                    Integer res = num1 / num2;
                    stack.push(String.valueOf(res));
                }
            }
            
        }

        if(!stack.isEmpty()) return Integer.parseInt(stack.pop());
        return 0;
        
    }
}
