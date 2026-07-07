class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> table = new HashMap<>();
        List<List<Integer>> codes = new ArrayList<>();
        List<List<String>> toReturn = new ArrayList<>();
       
        


        for (int i = 0; i < strs.length;  i++){
            List <Integer> key = new ArrayList<>(Collections.nCopies(26, 0));
           
            for (int j = 0; j < (strs[i]).length(); j++){
                char letter = strs[i].charAt(j);
                int temp = key.get( letter - 'a');
                temp++;
                key.set(letter - 'a', temp); 
            }
       
            if (table.containsKey(key)){
                List<String> words = table.get(key);
                words.add(strs[i]);
                table.put(key, words);
            }else{
                List<String> words = new ArrayList<>();
                words.add(strs[i]);
                table.put(key, words);
                codes.add(key);
            }

        }

        for (int i = 0; i < codes.size();  i++){
            toReturn.add(table.get(codes.get(i)));
        }

        return toReturn;
    }
}