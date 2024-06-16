import java.util.Scanner;

//Condition for multiplication

//The number of columns of the first matrix in the multiplication process must equal the number of rows of the second matrix.
//The result (product) will have the same number of rows as in the first matrix, and the same number of columns as in the second matrix


public class Multi_matrix {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows and column of matrix1");
       int row1 = sc.nextInt();
       int column1 = sc.nextInt();
       System.out.println("Enter the number of rows and column of matrix2");
       int row2 = sc.nextInt();
       int column2 = sc.nextInt();
       int mat1[][]= new int[row1][column1];
       int mat2[][]= new int[row2][column2]; 
       int result[][] = new int[row1][column2];
       int sum = 0 ;

       if(column1 == row2 )
       {
        System.out.println("......Multiplication of matrix is possible......");
       }
       else{
        System.out.println("......Multiplication is not possible......");
       }


       System.out.println("Enter the elements of matrix1");

       for(int i=0 ; i<row1 ; i++)
       {
        for(int j=0 ; j<column1 ; j++)
        {
            mat1[i][j] = sc.nextInt();
        }
       }
       System.out.println("Enter the elements of matrix2");
       for(int i=0 ; i<row2 ; i++)
       {
        for(int j=0 ; j<column2 ; j++)
        {
            mat2[i][j] = sc.nextInt();
        }
       }
       System.out.println("The matrix 1 is given by ");
       for(int i=0 ; i<row1 ; i++)
       {
        for(int j=0 ; j<column1 ; j++)
        {
            System.out.print(mat1[i][j]+" ");
        }
        System.out.println(" ");
       }

       System.out.println("The matrix 2 is given by ");
       for(int i=0 ; i<row2 ; i++)
       {
        for(int j=0 ; j<column2 ; j++)
        {
            System.out.print(mat2[i][j]+" ");
        }
        System.out.println(" ");
       }

       System.out.println("The resultant matrix is ");
       for(int i=0 ; i<row1 ; i++ )
       {
        for(int j=0 ; j<column2 ;j++)
        {
            for(int k=0 ; k<column1 ; k++ )
            {
                sum += mat1[i][k]*mat2[k][j];
            }
            
          result[i][j] = sum ;
          sum = 0 ;

        }
       }
       for(int i=0 ; i<row1 ; i++)
       {
        for(int j=0 ; j<column1 ; j++)
        {
            System.out.print(result[i][j]+" ");
        }
        System.out.println(" ");
       }

        sc.close();
        
       
    }
    
}
