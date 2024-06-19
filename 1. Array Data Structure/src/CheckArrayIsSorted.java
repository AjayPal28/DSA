public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={10,20,39,49,52};



        System.out.println(checkArrayIsSorted(arr)==true?"Sorted":"UnSorted");
        System.out.println(checkArrayIsSortedSecond(arr)==true?"Sorted":"UnSorted");
    }

    public static boolean checkArrayIsSorted(int arr[]){
        boolean flag=true;
        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[i])
                    return false;
            }
        }
        return flag;
    }

    public static boolean checkArrayIsSortedSecond(int arr[]){
        boolean flag=true;
        for (int i=1; i<arr.length;i++){

                if (arr[i]<arr[i-1])
                    return false;

        }
        return flag;
    }
}
