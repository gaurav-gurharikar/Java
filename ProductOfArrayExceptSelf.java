public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] answer = productExceptSelf(nums);
        for(int element:answer) System.out.println(element);
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix=1, postfix=1;
        for(int i=0; i<nums.length; i++) {
            if(i==0) answer[i] = prefix;
            else {
                prefix = prefix*nums[i-1];
                answer[i] = prefix;
            }
        }
        for(int i=nums.length-1; i>=0; i--) {
            if(i==nums.length-1) answer[i] *= postfix;
            else {
                postfix = postfix*nums[i+1];
                answer[i] *= postfix;
            }
        }
        return answer;


        // int[] prefix = new int[nums.length];
        // int[] postfix = new int[nums.length];
        // int[] answer = new int[nums.length];
        // int j=0, k=nums.length-1;
        // for(int i=0; i<nums.length; i++) {
        //     if(i==0) {
        //         prefix[j] = nums[j];
        //         j++;
        //         postfix[k] = nums[k];
        //         k--;
        //     }
        //     else {
        //         prefix[j] = prefix[j-1]*nums[j];
        //         j++;
        //         postfix[k] = postfix[k+1]*nums[k];
        //         k--; 
        //     }
        // }
        // answer[0] = postfix[1];
        // answer[nums.length-1] = prefix[nums.length-1-1];
        // for(int i=1; i<nums.length-1; i++) {
        //     answer[i] = prefix[i-1]*postfix[i+1];
        // }
        // return answer;


        // int totalProduct = 1, countZeroes=0;
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i]==0) {
        //         countZeroes++;
        //         continue;
        //     }
        //     totalProduct*=nums[i];
        // }
        // int[] answer = new int[nums.length];
        // if(countZeroes>1) return answer;
        // for(int i=0; i<nums.length; i++) {
        //     answer[i] = 1;
        //     if(nums[i]==0) answer[i] = totalProduct;
        //     else if(countZeroes>0) answer[i] = 0;
        //     else answer[i] = totalProduct/nums[i];
        // }
        // return answer;


        // int[] answer = new int[nums.length];
        // for(int i=0; i<nums.length; i++) {
        //     answer[i] = 1;
        //     for(int j=0; j<nums.length; j++) {
        //         if(i==j) continue;
        //         if(answer[i]==0) continue;
        //         answer[i] *= nums[j]; 
        //     }
        // }
        // return answer;
    }
}
