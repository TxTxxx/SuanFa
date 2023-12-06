package SuanFa;
//递归实现ln（N！）
import edu.princeton.cs.algs4.StdIn;
public class day12_1_2
{
    public static double ln(int N)
    {
        if(N == 1) return 0;
        return Math.log(N) + ln(N -1);
    }

    public static void main(String[] argv)
    {
        int N = StdIn.readInt();
        System.out.println(ln(N));
    }
}
