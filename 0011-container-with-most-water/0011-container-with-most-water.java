class Solution {
    public int maxArea(int[] arr) {
        // int n = arr.length;
        // int maxWater = 0;
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         int water = Math.min(arr[i],arr[j])*Math.max((i-j),(j-i));
        //         if(maxWater < water){
        //             maxWater = water;
        //         }

        //     }
        // }
        // return maxWater;

        int n = arr.length;
        int maxWater = 0;
        int i = 0 , j = n-1;
        while(i<j){
            int water = Math.min(arr[i],arr[j])*Math.max((i-j),(j-i));
            if(water > maxWater){
                maxWater = water;
            }
            if(arr[i]<arr[j]){
                i++;
            }
            else{j--;}
        }
        return maxWater;
        
    }
}