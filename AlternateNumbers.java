// Problem is similar to 'Reaarange Array Elements By Sign', but this doesn't necessarily have equal number of positives and negatives
public class AlternateNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,-4,-5,3,6};
        int[] rearranged = alternateNumbers(nums);
        for(int element:rearranged) System.out.println(element);
    }
    public static int[] alternateNumbers(int[] nums) {
        int countPos=0, countNeg=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) countPos++;
            else countNeg++;
        }
        int[] pos = new int[countPos];
        int[] neg = new int[countNeg];
        int posIndex=0, negIndex=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) {
                pos[posIndex] = nums[i];
                posIndex++;
            }
            else {
                neg[negIndex] = nums[i];
                negIndex++;
            }
        }
        if(countPos>countNeg) {
            for(int i=0; i<neg.length; i++) {
                nums[2*i] = pos[i];
                nums[2*i+1] = neg[i];
            }
            int index = neg.length*2;
            for(int i=neg.length; i<pos.length; i++) {
                nums[index] = pos[i];
                index++;
            }
        }
        else {
            for(int i=0; i<pos.length; i++) {
                nums[2*i] = pos[i];
                nums[2*i+1] = neg[i];
            }
            int index = pos.length*2;
            for(int i=pos.length; i<neg.length; i++) {
                nums[index] = neg[i];
                index++;
            }
        }
        return nums;
    }
}
