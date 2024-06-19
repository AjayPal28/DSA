public class DeletionInFixedSizeArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};

        int arr1[]=deleteAtPosition(arr,arr.length-1,20);

        for (int i=0;i< arr1.length-1;i++){
            System.out.println(arr1[i]);
        }

    }
    public static int[] deleteAtPosition(int arr[],int sizeOfArray, int elementToDelete){

        int i;
        for(i=0; i< sizeOfArray-1;i++){
            if(arr[i]==elementToDelete)
                break;
        }

        for (int j=i;i<sizeOfArray-1;i++){
                    arr[i]=arr[i+1];
        }

        return arr;
    }
}
