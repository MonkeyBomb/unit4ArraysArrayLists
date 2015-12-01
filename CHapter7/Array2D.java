
public class Array2D
{
    final int countries = 7;
    final int medal = 3;
     int [][] counts = {
                  {1,0,1},
                  {1,1,0},
                  {0,0,1},
                  {0,1,1},
                  {0,1,1},
                  {1,1,0},
                  };
   
    
    public void displayElements()
    {
        for (int i= 0; i <counts.length; i++)
        {
             for (int j = 0; j < counts [i].length; j++)
             {
                 System.out.print(counts[i][j] + "\t");
             
                }
             System.out.println();
      }
      
    }
    public int totalMedalsForCountry(int countryIndex )
    {
        //sum th elements in the specified row
        int total = 0;
        for (int j = 0; j < counts[countryIndex].length; j++)
        {
            total += counts[countryIndex][j];
        }
        return total;
    }
    public int totalMedals(int medalIndex)
    {
        //sum the elements int the specified column
        int total = 0;
        
        for (int i = 0; i <counts.length; i++)
        {
            total += counts[medalIndex][i];
        }
        return total;
    }
}