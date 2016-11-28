
/**
 * Write a description of class TestGrid here.
 *
 * @author Islam
 * @version (a version number or a date)
 */
public class GridPlot
{
    char[][] grid;
    static final int GRIDSIZE = 8;

    public GridPlot()
    {
        grid = new char[GRIDSIZE][GRIDSIZE];
        resetGrid();
    }

    public void fillVegetable(int row, int col, char vegetable)
    {
        grid[row-1][col-1] = vegetable;
    }

        public void fillVegetableIfEmpty(int row, int col, char vegetable)
    {
        if(0<row && row<= GRIDSIZE && 0<col && col<=GRIDSIZE)
        if(grid[row-1][col-1] == '_')
            grid[row-1][col-1] = vegetable;
    }

    public char getCell(int row, int col)
    {
        return grid[row-1][col-1];
    }

    public void showGrid()
    {
        System.out.println("\n            1   2   3   4   5   6   7   8");

        for (int row=1; row<=8;row++)
        {
           System.out.print("       "+row + " ");

            for(int col=1;col<=8;col++)
            {
                System.out.print("   "+ grid[row-1][col-1]);
            }

            System.out.println();
        }
    }

    public void resetGrid()
    {
        for(int i =0; i<GRIDSIZE; i++)
        {
            for(int j=0; j<GRIDSIZE; j++)
            {
                grid[i][j] = '_';
            }
        }
    }
}
