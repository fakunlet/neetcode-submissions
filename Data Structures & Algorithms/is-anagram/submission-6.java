class Solution {
    public boolean isAnagram(String s, String t) {
        boolean istrue = true;
        Map <Character, Integer> sletters = new HashMap<>();
        Map <Character, Integer> tletters = new HashMap<>();
        int frequency = 1;

        if (s.length() !=  t.length()){
            istrue = false;
            return istrue;
        }

        for (int i = 0; i < s.length(); i++){
            if (sletters.containsKey(s.charAt(i))){
                Integer count = sletters.get(s.charAt(i));
                sletters.put(s.charAt(i), count + 1);

            }else{
                 sletters.put(s.charAt(i), frequency);
            }
          
        }

        for (int i = 0; i < t.length(); i++){
            if (tletters.containsKey(t.charAt(i))){
                Integer count = tletters.get(t.charAt(i));
                tletters.put(t.charAt(i), count + 1);
            }else{
                 tletters.put(t.charAt(i), frequency);
            }
          
        }

        for (int i = 0; i < s.length(); i++){
             if ((tletters.containsKey(s.charAt(i))) && (Objects.equals(sletters.get(s.charAt(i)), tletters.get(s.charAt(i))))){
                istrue = true;
             }else{
                istrue = false;
                break;
             }
        }

       
        return istrue;
    }
}