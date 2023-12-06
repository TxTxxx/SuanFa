package SuanFa;
//log
import edu.princeton.cs.algs4.StdIn;
public class day11_29_1
{
    public static int logN(int a)
    {
        int time = -1;
        for(int temp = 1; temp <= a; time++)
        {
            temp *= 2;
        }
        return time;
    }
    public static void main(String[] args)
    {
        int a = StdIn.readInt();
        System.out.println(logN(a));
    }
}
