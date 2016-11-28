import java.util.*;
/**
 * Write a description of class TestTurnip here.
 * 
 * @group_d
 * @version (a version number or a date)
 */
public class Turnip
{
    GridPlot grid;
    int row, col;

    public Turnip(GridPlot grid)
    {
       this.grid = grid;
    }  
    
    public boolean isAdjacent(int row, int col, int row2, int col2)
    {
        return (row-1<=row2 && row2 <= row+1 && col-1 <= col2 && col2 <= col+1);
    }

    public void clearNonAdjacentO(int row, int col)
    {
        for(int i=1; i <= grid.GRIDSIZE; i++)
        {
           for(int j=1; j<= grid.GRIDSIZE;j++)
           {
                   if (grid.getCell(i, j) == 'o' && !isAdjacent(row, col, i, j))
                        grid.fillVegetable(i ,j , '_');
            }
        }  
    }
     
    public void replaceX()
    {
        for(int i=row-2; i <= row+2; i++)
        {
           for(int j=col-2; j<= col+2;j++)
           {
                   if (grid.getCell(i, j) == 'x')
                        grid.fillVegetable(i, j, '_');
            }
        }      
    }  
    
    public void plantTurnip()
    {
          System.out.println( );
          System.out.println( );
          System.out.println("        << Planting 4 Turnips >>");
          System.out.println( );
          
          grid.showGrid();
          
          System.out.println( );
          System.out.println("        This is the grid.");
          System.out.println("        You will plant 4 adjacent turnip cells in a square.");
          System.out.println("        1 set of turnip is not allowed to touch any other.");
          System.out.println("        Enter each row and column number.");
          System.out.println( );
          System.out.println("------------------------------------------------------------------------------------------");
          
          int minRow = grid.GRIDSIZE+1;
          int minCol = grid.GRIDSIZE+1;
          
          Scanner input = new Scanner(System.in);
 
          System.out.println( );
          System.out.print("        Enter row number: ");
          int row = input.nextInt();
       
          System.out.print("        Enter column number: ");
          int col = input.nextInt();
          
          while((grid.getCell(row, col) == 'x') || (grid.getCell(row, col) == 'C') || (grid.getCell(row, col) == 'P') 
                    || (grid.getCell(row, col) == 'T') || (grid.getCell(row, col) == 'R'))
            {
               System.out.println( );
               System.out.print("        Invalid cell.");
               System.out.println( );
       
               System.out.println( );
               System.out.print("        Enter row number: ");
               row = input.nextInt();
           
               System.out.print("        Enter column number: ");
               col = input.nextInt();
            }          
            
            if (row < minRow)
               { minRow = row;}
            if (col < minCol)
               {minCol = col;}
    
          for(int i=row-1; i <= row+1; i++)
           {
               for(int j=col-1; j<= col+1;j++)
               {
                   if (0 < i && i<=grid.GRIDSIZE && 0 < j && j<=grid.GRIDSIZE)
                   {
                       if(grid.getCell(i,j) == '_')
                        grid.fillVegetable(i, j, 'o');
                    }     
    
                }
            } 
    
               grid.fillVegetable(row, col, 'T');
               grid.showGrid(); 
             
               System.out.println( );
               System.out.println("\t1 turnip planted.");
               System.out.println("\tYou can plant three more turnip on 'o' mark.");
               System.out.println( );      
               
               System.out.println( );
               System.out.print("        Enter row number: ");
               row = input.nextInt();
           
               System.out.print("        Enter column number: ");
               col = input.nextInt();                 
               
           while(grid.getCell(row, col) != 'o' )
            {
               System.out.println( );
               System.out.print("        Invalid cell. Please select an 'o' cell");
               System.out.println( );
       
               System.out.println( );
               System.out.print("        Enter row number: ");
               row = input.nextInt();
           
               System.out.print("        Enter column number: ");
               col = input.nextInt();
            }   
            
            if (row < minRow)
               { minRow = row;}
            if (col < minCol)
               {minCol = col;}
    
                
               grid.fillVegetable(row, col, 'T');
               clearNonAdjacentO(row, col);
               grid.showGrid(); 
             
               System.out.println( );
               System.out.println("\t2 turnip planted.");
               System.out.println("\tYou can plant two more turnips.");
               System.out.println( );      
               
               System.out.println( );
               System.out.print("        Enter row number: ");
               row = input.nextInt();
           
               System.out.print("        Enter column number: ");
               col = input.nextInt();                

           while(grid.getCell(row, col) != 'o' )
            {
               System.out.println( );
               System.out.print("        Invalid cell. Please select an 'o' cell");
               System.out.println( );
       
               System.out.println( );
               System.out.print("        Enter row number: ");
               row = input.nextInt();
           
               System.out.print("        Enter column number: ");
               col = input.nextInt();
            }     
                 
            
            if (row < minRow)
               { minRow = row;}
            if (col < minCol)
               {minCol = col;}
    
            
               grid.fillVegetable(row, col, 'T');
               grid.showGrid(); 
               
               System.out.println( );
               System.out.println("\t3 turnip planted.");
               System.out.println("\tYou can plant one more turnip.");
               System.out.println( );      
               
               System.out.println( );
               System.out.print("        Enter row number: ");
               row = input.nextInt();
           
               System.out.print("        Enter column number: ");
               col = input.nextInt(); 
               
           while(grid.getCell(row, col) != 'o' )
            {
               System.out.println( );
               System.out.print("        Invalid cell. Please select an 'o' cell");
               System.out.println( );
       
               System.out.println( );
               System.out.print("        Enter row number: ");
               row = input.nextInt();
           
               System.out.print("        Enter column number: ");
               col = input.nextInt();
            }       
         
            
            if (row < minRow)
               { minRow = row;}
            if (col < minCol)
               {minCol = col;}
    
                grid.fillVegetableIfEmpty(minRow-1, minCol-1, 'x');
                grid.fillVegetableIfEmpty(minRow-1, minCol, 'x');
                grid.fillVegetableIfEmpty(minRow-1, minCol+1, 'x');
                grid.fillVegetableIfEmpty(minRow-1, minCol+2, 'x');
                grid.fillVegetableIfEmpty(minRow, minCol-1, 'x');
                grid.fillVegetableIfEmpty(minRow, minCol+2, 'x');
                grid.fillVegetableIfEmpty(minRow+1, minCol-1, 'x');
                grid.fillVegetableIfEmpty(minRow+1, minCol+2, 'x');
                grid.fillVegetableIfEmpty(minRow+2, minCol-1, 'x');
                grid.fillVegetableIfEmpty(minRow+2, minCol, 'x');
                grid.fillVegetableIfEmpty(minRow+2, minCol+1, 'x');
                grid.fillVegetableIfEmpty(minRow+2, minCol+2, 'x');
 
            
               grid.fillVegetable(row, col, 'T');
               grid.showGrid(); 
               
               System.out.println( );
               System.out.println("\t 4th turnip cell planted.");

              System.out.println( );
              System.out.println("        All turnips are planted!");
              System.out.println( );
              System.out.println( );
    }
}

