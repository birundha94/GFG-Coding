//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(read.readLine().trim());
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            int ans = obj.getPairsCount(nums, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int sum) {
        // code here
      //  HashMap<Integer,Integer> map=new HashMap<>();
        /*
        k = 6, arr[] = [1, 5, 7, 1]
        c 2
        
        */
       /*int count=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i+1;j<arr.length;j++){
                s=arr[i]+arr[j];
                if(s==sum){
                    count++;
                }
            }
        }
        return count;
    }*/
    HashMap<Integer,Integer> ans=new HashMap<>();
    int n=arr.length;
    int c = 0;
        for (int i = 0 ;i<n;i++){
            if (ans.containsKey(sum-arr[i])){
                c+=ans.get(sum-arr[i]);
            }
            if(ans.containsKey(arr[i])){
            int v = ans.get(arr[i]);
            ans.put(arr[i],++v);}
        
        else{
            ans.put(arr[i],1);
        }
        }
        return c;
}
}
/*
k = 2, arr[] = [1, 1, 1, 1]

tar=sum-arr[i]

*/

















