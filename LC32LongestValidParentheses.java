class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); int count = 0;
        if(s.length()>0)
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='(')
                    stack.push(i);
                else
                {
                    stack.pop();

                    if(stack.empty())
                        stack.push(i);
                    else
                        count = Math.max(count,i-stack.peek());
                }
            }
        }
        else
        {
            return 0;
        }
        return count;  
    }
}
