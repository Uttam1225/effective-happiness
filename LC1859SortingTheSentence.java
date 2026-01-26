class Solution {
    public int getNumberFromString(String str)
    {
        return Integer.parseInt(str.substring(str.length()-1, str.length()));
    }
    public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        Map<Integer, String> map = new HashMap<>();
        int counter = 1;
        String resultStr = "";
        for(String str : strArr)
        {
            int n = getNumberFromString(str);
            //System.out.println("N = "+n);
            //System.out.println(str.substring(0, str.length()-1)+" = "+ n);
            map.put(n, str.substring(0, str.length()-1));
        }

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());

        for(Map.Entry<Integer, String> entry : list)
        {
            resultStr = resultStr.concat(entry.getValue()+" ");
        }
        return resultStr.trim();
    }
}
