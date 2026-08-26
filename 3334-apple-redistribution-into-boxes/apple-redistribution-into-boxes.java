class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalapples=0;
        for(int apples:apple){
            totalapples+=apples;
        }
        Arrays.sort(capacity);
        int boxes=0;
        for(int i=capacity.length-1;i>=0;i--){
            totalapples-=capacity[i];
            boxes++;
            if(totalapples<=0){
                return boxes;
            }
        }
        return boxes;
    }
}