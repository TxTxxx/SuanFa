package SuanFa;
//transpose of the matrix


public class day11_27_2
{
    public static  void transpose_matrix(int[][] a)
    {
        for (int i = 0;i < a[0].length; i++)
        {
            for(int j = 0; j < a.length; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] a = {{1,3,4}, {2,5,9},{3,32,1}};
        transpose_matrix(a);
    }

}
