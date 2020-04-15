public class MinCost {
    static int min(int x, int y, int z)
    {
        if (x < y){
            if(x < z){
                return x;
            }
            return z;
        }
        else
            if(y < z){
                return y;
            }
            return z;
    }
    static int minCost(int cost[][], int m,
                       int n)
    {
        if (n < 0 || m < 0)
            return 999999;
        else if (m == 0 && n == 0)
            return cost[m][n];
        else
            return cost[m][n] +
                    min( minCost(cost, m-1, n-1), minCost(cost, m-1, n), minCost(cost, m, n-1) );
    }
    public static void main(String args[])
    {
        int cost[][] = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };
        System.out.print(minCost(cost, 2, 2));
    }
}
