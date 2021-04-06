public class QuickSort {
    public void sort(int[] arr, int start, int end){
        if(start>=end) return;
        int left = start;
        int right = end;
        boolean flag = false;
        // int num = arr[start];
        int key = arr[left];
        while(left<right){
            if(flag){
                if(arr[left]>key){
                    arr[right] = arr[left];
                    right--;
                    flag=false;
                }
                else 
                    left++;
            }
            else{
                if(arr[right]<key){
                    arr[left] = arr[right];
                    left++;
                    flag=true;
                }
                else right--;
            }
        }
        arr[left] = key;
        sort(arr, start, left-1);
        sort(arr, left+1, end);
    }
}
