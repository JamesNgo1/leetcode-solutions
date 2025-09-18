package TwoPointers;

public class TrapRainWater {
      public int trap(int[] height) {

        // on each index 
        
        // for neighborrs on left and right 

        // find the max on each side 

            // then find the min

            // determine how much hold
            // max(min - elevation , 0)



        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];

        int maxLeft = 0;
        int maxRight = 0;

        for(int i = 0; i < height.length;i++){
            prefix[i] = maxLeft;
            int num = height[i];
            maxLeft = Math.max(maxLeft,num);
        }

        for(int i = height.length - 1; i >= 0;i--){
            suffix[i] = maxRight;
            int num = height[i];
            maxRight = Math.max(maxRight,num);
        }

        int total = 0;
        for(int i = 0; i < height.length;i++){
            int leftHigh = prefix[i];
            int rightHigh = suffix[i];

            int minHeight = Math.min(leftHigh,rightHigh);

            int elevation = Math.max(minHeight - height[i],0);
            total += elevation;
        }

        return total;

    }
    
}
