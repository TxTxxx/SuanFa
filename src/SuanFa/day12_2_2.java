package SuanFa;
//二分查找的递归实现
public class day12_2_2
{
    public static int rank(int key, int[] a)
    {
        return rank(key, a, 0, a.length-1, 1);
    }
    public static int rank(int key, int[] a, int lo, int hi, int dep)
    {
        if(lo > hi) return -1;
        System.out.println("lo:" + lo + " hi：" + hi + " 递归深度：" + dep);
        int mid = (lo + hi) / 2;
        if(key > a[mid])  return rank(key, a, mid+1, hi,dep+1);
        else if(key < a[mid])  return rank(key, a, lo,  mid -1, dep+1);
        else
            return mid;
    }
    public static void main(String[] argv)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("下标为：" + rank(10,a));

    }

}
