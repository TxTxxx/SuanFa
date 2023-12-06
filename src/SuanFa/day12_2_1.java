package SuanFa;
//斐波那契数列的优化实现(取消递归的使用)
public class day12_2_1
{
    public static void main(String[] argv)
    {
        int[] a = new int[100];
        a[0] = 1;
        a[1] = 1;
        for(int i = 0; i<98 ; i++)
        {
            a[i+2] = a[i] + a[i+1];
        }
        for(int i = 0; i<100; i++)
        {
            System.out.println( i+a[i]+"");
        }
    }
}
