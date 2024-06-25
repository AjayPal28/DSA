public class LeftRotateArrayByoneAndD {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 323, 323, 3};

//        int length = leftRotate(arr);
//        int i = 0;
//        while (i < arr.length) {
//            System.out.println(arr[i]);
//            i++;
//        }


        int d = 2;
        while (d > 0) {
            leftRotate(arr);
            d--;
        }

        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;

        }
    }

    private static int leftRotate(int[] arr) {
        if (arr.length == 1)
            return arr.length;

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++)
            arr[i - 1] = arr[i];

        arr[arr.length - 1] = temp;
        return arr.length;
    }
}
