import java.util.*;
/**
 * Write a description of class TestRadish here.
 * 
 * @group_d
 * @version (a version number or a date)
 */

public class Potato
{
    GridPlot grid;
    
    public Potato(GridPlot grid)
    {
        this.grid = grid;
    }
   
    public void replaceOWithX()
    {
          for(int i=1; i <= grid.GRIDSIZE; i++)
            {
               for(int j=1; j<= grid.GRIDSIZE;j++)
               {
                       if (grid.getCell(i, j) == 'o')
                            grid.fillVegetable(i, j, 'x');
                }
            }      
    }
    
    public void plantPotatoes()
    {
          System.out.println( );
          System.out.println( );
          System.out.println("        << Planting 6 Potatoes >>");
          System.out.println( );
          
          grid.showGrid();
          
          System.out.println( );
          System.out.println("        This is the grid.");
          System.out.println("        You will plant 2 adjacent potato cells up to 3 times.");
          System.out.println("        1 set of potato is not allowed to touch any other.");
          System.out.println("        Enter each row and column number.");
          System.out.println( );
          System.out.println("------------------------------------------------------------------------------------------");
          
          Scanner input = new Scanner(System.in);
        
      
        for(int count=1; count<4; count++)
        {        
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

           grid.fillVegetable(row, col, 'P');
           grid.showGrid(); 
           
           System.out.println( );
           System.out.println("\t1 potato planted.");
           System.out.println("\tYou can plant one more potato on 'o' mark.");
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

            for(int i=row-1; i <= row+1; i++)
            {
               for(int j=col-1; j<= col+1;j++)
               {
                   if (0 < i && i<=grid.GRIDSIZE && 0 < j && j<=grid.GRIDSIZE)
                   {
                       if (grid.getCell(i, j) != 'P')
                            grid.fillVegetable(i, j, 'x');
                    }     

                }
            }            
           
           grid.fillVegetable(row, col, 'P');
           replaceOWithX();
           grid.showGrid(); 
           
          System.out.println( );
          System.out.println("\t2 potato planted.");
          System.out.println("\t" + count + " set of potato planted.");  
         }          
    
          System.out.println( );
          System.out.println("        All potatoes are planted!");
          System.out.println( );
          System.out.println( );
     }
 }

