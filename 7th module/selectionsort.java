import java.util.Arrays; 
public class selectionsort{ //  minIndex value with the assumed value
    public static void selectionsort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] arr={77,18,45,17,10,65};
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}