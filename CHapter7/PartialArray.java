
public class PartialArray
{
    private int[] values;
    private int[] currentSize;
    
    public PartialArray ()
    {
        //initialise instance variables
        values = new int[100];
        
        for ( this.currentSize = 0; this.currentSize < 10; this.currentSize++)
        {
           this.values[this.currentSize] = this.currentSize * this.currentSize; 
        }
        
        
    }
}
    