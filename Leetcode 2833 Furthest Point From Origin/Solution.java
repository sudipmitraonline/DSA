class Solution {
    public static int furthestDistanceFromOrigin(String moves) {
        int countof_ = 0;
        int lorRCount = 0;
        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'R'){
                lorRCount++;
            }
            if(moves.charAt(i) == 'L'){
                lorRCount--;
            }
            if(moves.charAt(i) == '_'){
                countof_++;
            }
        }
        return Math.max(Math.abs(lorRCount) + countof_, Math.abs(lorRCount) - countof_);
    }

    public static void main(String[] args) {
        String moves = "_R__LL_";
        System.out.println(furthestDistanceFromOrigin(moves));
    }
}
