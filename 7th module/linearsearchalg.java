public class linearsearchalg{
    //linear search is performed on both sorted and unsorted array
    //time-> 0(n) space-> 0(n)
    public static void main(String[] args){
        int[] arr={10,7,45,77,17,1};
        int target=10;
        boolean found=false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if(found){
            System.out.println("element "+target+ " found at index "+index);
        }
        else{
            System.out.println("Element"+target+"not found");
        }
    }
}