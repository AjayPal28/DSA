public class ReverseAnArray {
    static  int arr[]={10,20,30,40,50,3};
    public static void main(String[] args) {
        int low=0;
        int high = arr.length-1;

        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

        for (int a:arr){
            System.out.println(a);
        }
    }
}
