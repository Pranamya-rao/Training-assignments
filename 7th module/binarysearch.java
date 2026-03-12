
public class binarysearch{
    public static void main(String[] args){
        int[] arr={2,4,6,8,10,12,14,16,18};
        int target=10;
        int low=0;
        int high=arr.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(index!=-1){
            System.out.println("element "+target+" found at "+index);
        }
        else{
            System.out.println("target not found");
        }
    }
}