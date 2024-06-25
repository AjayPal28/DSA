public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int arr[]={10,20,0,0,1,0,3,4,53,0,0};
        //10, 20, 53, 4, 3, 1, 0, 0, 0, 0, 0
        //int length=zerosAtEnd(arr);
        int length=zerosAtEndSecond(arr);
        for (int i=0;i<length;i++){
            if(i==length-1) System.out.print(arr[i]);
            else System.out.print(arr[i]+", ");

        }
    }
    public  static int zerosAtEnd(int array[]){

        if(array.length==0 || array.length==1)
            return array.length;

        int length=array.length;

        for (int i=0;i< length;i++){
            if(array[i]==0){
                for (int j = i+1; j < length; j++) {
                    if(array[j]!=0){
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }
            }
        }
        return array.length;
    }

    //second method
    public  static int zerosAtEndSecond(int array[]){

        if(array.length==0 || array.length==1)
            return array.length;

        int length=array.length;
        int count=0;
        for (int i=0;i< length;i++){
            if(array[i]!=0){
                int temp=array[count];
                array[count]=array[i];
                array[i]=temp;

                count++;
            }
        }
        return array.length;
    }

}
