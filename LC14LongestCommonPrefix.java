class Solution {
    public boolean anagramCheck(String str1, String str2)
    {
        //System.out.println("Str1 lenght, Str2 lenght = "+str1.length()+ str2.length());
        if(str1.length()!=str2.length())
            return false;
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public boolean checkSameIndexValues(String )
    public String longestCommonPrefix(String[] strs) {
        StringBuilder strResult = new StringBuilder();
        int m = strs[0].length();
        String shortestString = strs[0];
        for(String s:strs)
            if(s.length() < m)
            {
                shortestString = s;
                m=s.length();
            }
        //System.out.println(shortestString);
        int count = 0;
        for(int j=0;j<strs.length;j++)
        {
            if(strs[j].contains(shortestString))
                count++;
            else if(count == strs.length)
                return shortestString;
            else
            {
                for(int i=0;i<shortestString.length();i++)
                {
                    shortestString = shortestString.substring(0,shortestString.length()-1);
                    j=0;
                }
            }
        }

        return shortestString;



        /*int count,i=0,j=1,n=strs[0].length();
        Set<Character> set = new HashSet<>();
        if(strs.length==1)
        {
            return strs[0];
        }
        for(String s : strs)
        {
            if(s.length() < n)
            {
                n=s.length();
            }
        }
        for(i=0;i<n;i++)
        {
            count = 0;
            for(j=1;j<strs.length;j++)
            {
                if(strs[0].charAt(i)==strs[j].charAt(i))
                {
                    count++;
                    if(count==strs.length-1)
                    {
                        set.add(strs[0].charAt(i));
                        count = 0;
                    }
                }
                else
                {
                    for(Character c : set)
                        strResult.append(c).toString();
                    boolean anagramString = anagramCheck(strResult.toString(), strs[0]);
                    if(anagramString == true)
                        return strs[0];
                    else
                        return strResult.toString();
                }
            }
        }
        for(Character c : set)
            strResult.append(c).toString();
        //System.out.println("Set value = "+strResult.toString());
        boolean anagramString = anagramCheck(strResult.toString(), strs[0]);
        //System.out.println(anagramString);
        if(anagramString == true)
            return strs[0];
        else
            return strResult.toString();
        //return strResult.toString();*/
    }
}
