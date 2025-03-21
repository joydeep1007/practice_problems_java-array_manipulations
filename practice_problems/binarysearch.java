import java.util.*;
public class binarysearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in ascending  order");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int low = 0, high = n-1, mid;
        int flag = 0;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid] == key)
            {
                System.out.println("Element found at position "+(mid+1));
                flag = 1;
                break;
            }
            else if(arr[mid] < key)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
                sc.close();
            }
        }
        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}