public class MR_triangleTable
{
    public static void main(String[] args)
    {
        triangleTable();
        return;
    }
    public static double triangleTable()
    {
        int height = 4;
        for(int i=0; i<height; i++)
        {
            for (int j = 0; j<i+1; j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println(" ");            
        }
        return height;
    }
}