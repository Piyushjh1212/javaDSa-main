// find the element that appears only once 

package Date17Mar2026;

public class Question_18 {
    static void findSingle(int[] arr){
        int result = 0;
        for (int i=0; i <arr.length; i++){
            if (arr[i] == 1){
                result ^= arr[i];
            }else{
                result ^= 0;
        }
    }

        System.out.println(result);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,5,5,4,4,5,6,5,5,8,8,9,9};
        findSingle(arr);

    }    
}
