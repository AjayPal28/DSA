public class InsetionFixedSizeArray {

    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Integer arr1[]=insertInArrayAtAnyPosition(arr, arr.length-1, 2,1,4);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
    public static Integer[] insertInArrayAtAnyPosition(Integer arr[], int sizeOfArray, int elementToStore,
                                                int capacityOfArrayToHold, int positionToInsert) {

        if (capacityOfArrayToHold==0)
            return arr;

        int index = positionToInsert - 1;
        for (int i = sizeOfArray - 1; i >= index; i--){
            arr[i+1]=arr[i];
        }
        arr[index]=elementToStore;

        return arr;
    }
}
