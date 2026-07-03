class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        
        Map<String,List<String>> map = new HashMap<>(); //used string so that generated key concatenate int would have been added

        for(String s: strs){  // iterating over each string in input strs
            int freq[] = new int[26];
            for(char ch: s.toCharArray()){
                freq[ch-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i:freq){
                sb.append(i).append("-");
            }

            //without appending "-"
            // a-1 b-11    key- 111
            // a-1 b-1 c-1  key - 111
            // it would be considered anagram 

            String key = sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                List<String> li = new ArrayList();
                li.add(s);
                map.put(key,li);
            }
        }

        return new ArrayList(map.values());
    }
}
