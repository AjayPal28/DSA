public class LargestAndMinAndSecondElementInArray {
    public static void main(String[] args) {

        int arr[]={20,10,33,21,33,55,88,77};

        int max=Integer.MIN_VALUE;
        int  min=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max) {
                secondLargest=max;
                max = arr[i];
            } else if (arr[i]>secondLargest && arr[i]!=max)  {
                secondLargest=arr[i];
            }


            if (arr[i]<min)
                min=arr[i];
        }

        System.out.println("largest Element : "+max+"\t Min Value : "+ min +"\t Second Largest Element : "+secondLargest );

    }
}
