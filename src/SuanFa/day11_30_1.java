package SuanFa;
//fibonacci的递归经典实现
import edu.princeton.cs.algs4.StdOut;

public class  day11_30_1
{
    public static long F(int N)
    {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return F(N-1) + F(N -2);
    }
    public static void main(String[] argv)
    {
        for(int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }

}