import java.util.*;
/**
 * Write a description of class TestRadish here.
 * 
 * @group_d
 * @version (a version number or a date)
 */
 
public class Radish
{
    GridPlot grid;

    public Radish(GridPlot grid)
    {
        this.grid = grid;
    }
    
    public void plantRadish()
    {
          System.out.println( );
          System.out.println( );
          System.out.println("        << Planting 4 Radishes >>");
          System.out.println( );
          
          grid.showGrid();
          
          System.out.println( );
          System.out.println("        This is the grid.");
          System.out.println("        You will plant one cell of radish up to 4 times.");
          System.out.println("        No Radish is allowed to touch any other.");
          System.out.println("        Enter each row and column number.");
          System.out.println( );
          System.out.println("------------------------------------------------------------------------------------------");
          
          Scanner input = new Scanner(System.in);
        
         for(int count=1; count <5; count++)
         {
        
           System.out.println( );
           System.out.print("        Enter row number: ");
           int row = input.nextInt();
               
           System.out.print("        Enter column number: ");
           int col = input.nextInt();
           
              while(grid.getCell(row, col) != '_')
                {
                   System.out.print("        Invalid cell.");
                   System.out.println( );
           
                   System.out.println( );
                   System.out.print("        Enter row number: ");
                   row = input.nextInt();
               
                   System.out.print("        Enter column number: ");
                   col = input.nextInt();
                }
    
              for(int i=row-1; i <= row+1; i++)
               {
                   for(int j=col-1; j<= col+1;j++)
                   {
                       if (0 < i && i<=grid.GRIDSIZE && 0 < j && j<=grid.GRIDSIZE)
                       {
                           grid.fillVegetable(i, j, 'x');
                        }     
    
                    }
                }            
    
           grid.fillVegetable(row, col, 'R');    
           grid.showGrid(); 
           
           System.out.println( );
           System.out.println("\t" + count + " radish planted.");  
           System.out.println( );
        }
        
          System.out.println( );
          System.out.println("        All radishes are planted!");
          System.out.println( );
     

    }
    
}
