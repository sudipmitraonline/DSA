
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i :nums){
            int digitCount = 0;
            while (i!=0){
                i = i / 10;
                digitCount++;
            }
            if(digitCount%2==0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555,901777,48,1771};
        Solution a = new Solution();
        System.out.println(a.findNumbers(nums));
    }
}
