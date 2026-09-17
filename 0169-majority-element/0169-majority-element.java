class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        if(arr.length == 1) return arr[0];
        for(int i = 0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
        }
        int max = 0;
        for(int key : map.keySet()){
            int value = map.get(key);
        
            if(value > (n/2)){
                return key;
            }
        }
        return -1;
    }
}