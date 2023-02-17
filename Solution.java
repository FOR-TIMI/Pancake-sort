/*
 To install and run
 Run Command in terminal: git clone https://github.com/FOR-TIMI/Pancake-sort.git
*/

class Solution {
    public static void pancakeSort(int[] inputArray) {
        //find the index of the largest number
        int n = inputArray.length;
        int largest = n;

        for(int i =0; i < n; i++){
            int index = find(inputArray, largest);
             flip(inputArray,index);
             flip(inputArray, largest-1);

             System.out.print(index + 1+ " , " );
             System.out.print(largest--);

             if(i != -1 ){
                 System.out.print(" , ");
             }
        }

    }
    
    private static int find(int[] A, int target) {
      //To the index of the target
      for(int i =0; i < A.length; i++){
          if(A[i] == target){
              return i;
          }
      }

      return -1;
    }

    //To flip 
    private static void flip(int[] A, int index) {
        int i = 0, j = index;

        while(i < j){
            int temp = A[i];
            A[i++] = A[j];
            A[j--] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {3,2,4,1};
        pancakeSort(arr);
    }
}
