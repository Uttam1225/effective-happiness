class Solution {
    public String palindromeCheck(String str)
    {
        StringBuilder strBuilder = new StringBuilder(str);
        String reversedStr = strBuilder.reverse().toString();
        if(str.equals(reversedStr))
            return str;
        return "0";
    }
    public String longestPalindrome(String s) {
        Map<String, Integer> map = new HashMap<>();
        int minValue = 0;
        String resultStr = null, ss = null;
        for(int i=0;i<s.length();i++)
            for(int j=i+1;j<=s.length();j++)
            {
                //System.out.println("SubStr = "+s.substring(i,j));
                ss = palindromeCheck((s.substring(i,j)));
                //System.out.println(ss);
                if(!ss.equals("0"))
                    map.put(ss, ss.length());
            }
        for(Map.Entry<String, Integer> entry : map.entrySet())
            if(minValue < entry.getValue())
                minValue = entry.getValue();
            System.out.println(minValue);
        for(Map.Entry<String, Integer> entry : map.entrySet())
            if(minValue == entry.getValue())
            { 
                //System.out.println(entry.getKey());
                resultStr = entry.getKey();
            }
        return resultStr;
    }
}
