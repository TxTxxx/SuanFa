package SuanFa;
//print the matrix

public class day11_27_1
{
    public static void print_bool_array(boolean[][] a)
    {
        System.out.print(" ");
        for(int i = 0; i < a[0].length; i++)
            System.out.print(i+1 +" ");
        System.out.println();
        for(int j = 0; j < a.length; j++)
        {
            System.out.print(j+1);
            for(int i = 0; i<a[0].length;i++)
                System.out.print((a[j][i]?'*':' ') +" " );
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        boolean[][] a ={{true,false,true},{false,false,true},{false,true,true}};
        print_bool_array(a);
    }
}