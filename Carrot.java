import java.util.*;
/**
 * Write a description of class TestRadish here.
 * 
 * @group_d
 * @version (a version number or a date)
 */

public class Carrot
{
    GridPlot grid;

    public Carrot(GridPlot grid)
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
    
    public void plantCarrots()
    {
          System.out.println( );
          System.out.println( );
          System.out.println("        << Planting 6 Carrots >>");
          System.out.println( );
          
          grid.showGrid();
          
          System.out.println( );
          System.out.println("        This is the grid.");
          System.out.println("        You will plant 3 adjacent carrot cells up to 2 times.");
          System.out.println("        1 set of carrot is not allowed to touch any other.");
          System.out.println("        Enter each row and column number.");
          System.out.println( );
          System.out.println("------------------------------------------------------------------------------------------");
          
          Scanner input = new Scanner(System.in);
        
      
        for(int count=1; count<3; count++)
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
    
               grid.fillVegetable(row, col, 'C');
               grid.showGrid(); 
               
               System.out.println( );
               System.out.println("\t1 carrot planted.");
               System.out.println("\tYou can plant one more carrot on 'o' mark.");
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
                           if(grid.getCell(i,j) == '_')
                            grid.fillVegetable(i, j, 'o');
                        }     
    
                    }
                } 
                
                grid.fillVegetable(row, col, 'C');
                grid.showGrid();
                
               System.out.println( );
               System.out.println("\t2 carrot planted.");
               System.out.println("\tYou can plant one more carrot on 'o' mark.");
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
                           if (grid.getCell(i, j) != 'C')
                                grid.fillVegetable(i, j, 'x');
                        }     
    
                    }
                }            
           
           grid.fillVegetable(row, col, 'C');
           replaceOWithX();
           grid.showGrid(); 
           
          System.out.println( );
          System.out.println("\t3 carrot planted.");
          System.out.println("\t" + count + " set of carrot planted.");  
         }          
         
          System.out.println( );
          System.out.println("        All carrots are planted!");
          System.out.println( );
          System.out.println( );
    }
}
