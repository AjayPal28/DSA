public class RemoveDuplicateElementInArray {
    static int arr[]={10,20,30,30,20,10,10,33,35,33,55,231,44,35};
    public static void main(String[] args) {

        //10,20,30,33,35,55,231,44
        //10,20,30,33,35,55,231,44
        int size=removeDuplicateElement(arr);

        for (int i=0;i<size;i++){
            if(i==size-1) System.out.print(arr[i]);
            else System.out.print(arr[i]+", ");

        }




    }

    public static int removeDuplicateElement(int array[]) {
        if (array.length == 0 || array.length == 1) {
            return array.length;
        }
        int length=array.length;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<length;j++){
                if (array[i]==array[j]){
                    int temp=array[j];
                    array[j]=array[length-1];
                    array[length-1]=temp;
                    length--;
                }
            }
        }


        return length;
    }

}
