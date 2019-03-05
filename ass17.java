import java.util.Scanner;
class ass17{
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int l = scan.nextInt();
        int arr[] = new int[l];
        System.out.println("enter array Elements");
        for(int i=0; i<l; i++)
            {arr[i] = scan.nextInt();}
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}

class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}