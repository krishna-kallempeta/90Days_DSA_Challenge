package arrays;

public class leaders {
    public static void main(String args[]){
        int arr[] = {4,7,1,0};
        a.leader(arr);

    }
    class a{
        public static void leader(int[] arr){
            int greatest = arr[arr.length-1];
            int i = arr.length-1;
            while(i>=0){
                if(arr[i] > greatest){
                    System.out.println(greatest);
                    greatest = arr[i];
                    i--;
                }
                else{
                    i--;
                }
            }
            System.out.println(greatest);

        }

    }

}
