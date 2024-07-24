//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line1 = read.readLine().trim();
            String[] numsStr1 = line1.split(" ");
            int[] arr1 = new int[numsStr1.length];
            for (int i = 0; i < numsStr1.length; i++) {
                arr1[i] = Integer.parseInt(numsStr1[i]);
            }

            String line2 = read.readLine().trim();
            String[] numsStr2 = line2.split(" ");
            int[] arr2 = new int[numsStr2.length];
            for (int i = 0; i < numsStr2.length; i++) {
                arr2[i] = Integer.parseInt(numsStr2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.check(arr1, arr2) ? "true" : "false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
       /* int count =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0;i<arr1.length;i++){
            if (arr1[i]==arr2[i]){
  (              count++;}
        }
        if (count==arr1.length){
            return true;
        }
        return false;
    }
}*/
/* 
arr1[] = [1, 2, 5], arr2[] = [2, 4, 15]
a=2,1
b=2,1

Hm
arr1[] = [1, 2, 5, 4, 0], arr2[] = [2, 4, 5, 0, 1]
a->
1->2
2->1
5->1
4->1
0->1


*/

HashMap<Integer,Integer> hm=new HashMap<>();
for(int i=0;i<arr1.length;i++){
    hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
}
for(int i=0;i<arr2.length;i++){
if(hm.containsKey(arr2[i])){
    hm.put(arr2[i],hm.get(arr2[i])-1);
    if(hm.get(arr2[i])==0)
{
    hm.remove(arr2[i]);
}
}

}
if(hm.isEmpty())
{
    return true;
}
return false;
}
}
















