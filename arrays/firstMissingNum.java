package arrays;

public class firstMissingNum {

    // time :o(n) and space : o(1)
    public int findMissingNum(int[] array) {

        // first loop is if negative numbers neutralized them with zero
        for(int i = 0; i < array.length;i++){
            int num = array[i];
            if(num < 0){
                array[i] = 0;
            }
        }

        //second loop mark down number presented using the input data structure
        // so negative num mean that num is there existing 
        // possible numbers from 1 - len(array) + 1
        for(int i = 0; i < array.length;i++){
            int value = Math.abs(array[i]);
            if(value >= 1 && value <= array.length){

                // now check the value itself 
                int numItself = array[i];
                if(array[numItself - 1] > 0){
                    array[numItself - 1] *= -1; //mark as the num is presetny 
                }else if(array[numItself - 1] == 0){
                    array[numItself - 1] = -1 * array.length + 1; // edge case 
                }
            }
        }

        // third loop to figure out the number itself 
        for(int i = 1; i < array.length;i++){
            if(array[i-1] >= 0){
                return i;
            }
        }

        //edge case where all 1 to n(exist) so go for next number


        return array.length + 1;
    }

    
}
