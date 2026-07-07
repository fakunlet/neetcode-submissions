class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> table = new HashMap<>();
        List <String> codes = new ArrayList<>();
        List<List<String>> toReturn = new ArrayList<>();
       
        


        for (int i = 0; i < strs.length;  i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String wordCode = new String(chars);

            if (table.containsKey(wordCode)){
                List<String> words = table.get(wordCode);
                words.add(strs[i]);
                table.put(wordCode, words);
                
            }else{
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                table.put(wordCode, words);
                codes.add(wordCode);
            }

        }

        for (int i = 0; i < codes.size();  i++){
            toReturn.add(table.get(codes.get(i)));
        }

        return toReturn;
    }
}