package SuanFa;
import edu.princeton.cs.algs4.StdIn;
//互质的实现
//用欧几里得算法更快
public class day12_3_1
{
    public static void relatively_prime(boolean[][] a)
    {
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[0].length; j++)
                a[i][j] = true;
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[0].length; j++)
                for(int k = 2; k <= i +1; k++)//z 注意4 2与 2 4的区别
                {
                    if((i+1) % k == 0)
                    {
                        if((j+1) % k == 0)
                            a[i][j] = false;
                    }
                    else
                        continue;
                }
    }
    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        relatively_prime(a);
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
