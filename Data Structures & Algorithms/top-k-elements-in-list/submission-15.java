class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int count = 1;
      Map<Integer,Integer> table = new HashMap<>(); 
      List<Integer>[] bucket = new LinkedList[nums.length + 1];
      int[] toReturn = new int[k];
      int index = 0;
      List<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < nums.length; i++){
            int freq = 1;
            if(table.containsKey(nums[i])){
               freq = table.get(nums[i]);
                freq++;
              table.put(nums[i],freq);
            }else{
                table.put(nums[i], freq);
                numbers.add(nums[i]);
            }
        
        }

        for (int i = 0; i < nums.length + 1; i++){
          bucket[i] = new LinkedList<>();

        }

        for (int i = 0; i < numbers.size(); i++){
           //System.out.println(numbers.get(i));
           int freq = table.get(numbers.get(i));
          // System.out.println(freq);
           bucket[freq].add(numbers.get(i));
           //System.out.println(bucket[freq]);
        }

        
        for (int i = nums.length; i >= 0; i--){ 

            //System.out.println(cp;
          System.out.println("count: " + count); 
            if (count <= k){
               //System.out.println("entered");  
               //System.out.println(i);

                if (bucket[i] != null && !bucket[i].isEmpty()) {
                    System.out.println(bucket[i]); 
                    for(int num : bucket[i]){
                    // System.out.println("entered");  
                    
                    toReturn[index++] = num;
                    //System.out.println(num);
                    count++;
                    }
                    
                }
                System.out.println(index); 
            }else{
                break;
            }

                    
        }

        return toReturn;

    }
}
