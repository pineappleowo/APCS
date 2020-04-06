public class FriendPairing {
    static int count(int n)
    {
        int ar[] = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if (i <= 2)
                ar[i] = i;
            else
                ar[i] = ar[i - 1] + (i - 1) * ar[i - 2];
        }
        return ar[n];
    }
    public static void main(String[] args)
    {
        int n = 12;
        System.out.println(count(n));
    }
}
