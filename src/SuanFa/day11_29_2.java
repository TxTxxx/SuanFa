package SuanFa;
//bucket
public class day11_29_2
{
    public static int[] histogram(int[] a, int m)
    {
        int[] b = new int[m+1];
        for (int j : a)
        {
            if (j > m) continue;
            else if (j > 0 && j <= m) b[j]++;
        }
        return b;
    }

    public static void main(String[] args)
    {
        int[] a ={1,3,4,3,2,42,5,52,1};
        int[] b = histogram(a,4);
        for(int i:b)
            System.out.println(i);
    }
}
