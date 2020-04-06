public class AssemblyLine {
    static int l = 2;
    static int s = 4;
    static int min(int a, int b)
    {
        if(a>b){
            return b;
        }
        return a;
    }
    static int car(int arr1[][], int arr2[][], int arr3[], int arr4[])
    {
        int a1[]= new int [s];
        int a2[] =new int[s] ;
        int i;
        a1[0] = arr3[0] + arr1[0][0];
        a2[0] = arr3[1] + arr1[1][0];
        for (i = 1; i < s; ++i)
        {
            a1[i] = min(a1[i - 1] + arr1[0][i],
                    a2[i - 1] + arr2[1][i] + arr1[0][i]);
            a2[i] = min(a2[i - 1] + arr1[1][i],
                    a1[i - 1] + arr2[0][i] + arr1[1][i]);
        }
        return min(a1[s-1] + arr4[0],
                a2[s-1] + arr4[1]);
    }
    public static void main (String[] args)
    {
        int arr1[][] = {{4, 5, 3, 2},
                {2, 10, 1, 4}};
        int arr2[][] = {{0, 7, 4, 5},
                {0, 9, 2, 8}};
        int arr3[] = {10, 12}, arr4[] = {18, 7};

        System.out.println(car(arr1, arr2, arr3, arr4));

    }
}
