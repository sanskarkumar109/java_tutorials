public class binary_search {
    public static int binarysearch(int num[],int target){
        int left=0,right=num.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(num[mid]==target){
            return mid;
            }
            else if(num[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,};
        int target=5;
        int index=binarysearch(num,target);
        if(index==-1){
            System.out.println("number not found ");
        }
        else{
            System.out.println("number found at index : "+index);
        }
    }
}
