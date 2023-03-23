public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {3, 5, 11, 27, 13, 23};
        System.out.println(maxRange(arr, 1, 3));
    }
    //imagine that arr is not empty....
//    static int max(int[] arr){
//        int maxVal = arr[0];
//        for(int i = 1; i< arr.length; i++){
//            if(arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;


    //work on edge cases here, like array being null......
        static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for(int i = start; i<= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
