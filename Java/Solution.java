public class Solution {
        int nums[]=[3,2,2,3];
        int val=3;
        int n= nums.length;
        int a=0 ;
        int index = 0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
              nums[i]=0;
              a++;
               }
        }
        System.out.println(a);
    }

