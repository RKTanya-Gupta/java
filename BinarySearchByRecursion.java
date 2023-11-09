import java.util.*;
class BinarySearchByRecursion{
    public static int binary(int []arr,int start,int end,int target)
    {
        int mid = start + (end-start)/2;
        if(start<end)
        {
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(target<arr[mid])
        {
           return binary(arr,start,mid-1,target);
        }
        else if(target>arr[mid])
        {
           return binary(arr,mid+1,end,target);
        }
        }
        return -1;

    }
    public static void main(String args[])
    {
        int arr[]= {1,2,3,4,5,6,7,8};
        int start= 0;
        int end= arr.length-1;
        int target= 5;
        System.out.println(binary(arr,start,end,target));
    }
}