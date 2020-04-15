public class Eulerian {
    public static int euler(int n, int m)
    {
        if (m >= n || n == 0)
            return 0;

        if (m == 0)
            return 1;

        return (n - m) * euler(n - 1, m - 1) +
                (m + 1) * euler(n - 1, m);
    }
    public static void main(String[] args)
    {
        int n = 3, m = 1;
        System.out.print( euler(n, m) );
    }
}
