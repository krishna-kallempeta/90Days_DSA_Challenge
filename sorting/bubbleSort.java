package sorting;

public class bubbleSort {
    public static void main(String args[]){
        int arr [] = {4,2,5,78,45,23,9};
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("bubble sort is" + arr[i]);
        }
    }
}
