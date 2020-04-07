public class MaxProduct {
    static int product(int[] arr, int n)
    {
        int[] ar = new int[n];
        int max = -1;
        for (int i = 0; i < n; i++)
            ar[i] = arr[i];
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (arr[i] > arr[j] && ar[i]
                        < (ar[j] * arr[i]))
                    ar[i] = ar[j] * arr[i];
        for (int k = 0; k < ar.length; k++)
        {
            if (ar[k] > max) {
                max = ar[k];
            }
        }
        return max;
    }
    static public void main(String[] args)
    {

        int[] arr = { 3, 100, 4, 5, 150, 6 };
        int n = arr.length;

        System.out.println(product(arr, n));
    }
}
