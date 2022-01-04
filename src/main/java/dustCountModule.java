import astra.core.Module;

public class dustCountModule extends Module {
    // intializing the dust count value as zero 
    public int count = 0;
    // method which adds one to the dust count  
    @ACTION 
    public boolean plus(){
        count = count + 1;
        return true;
    } 
    // method which gets the current dust count  
    @TERM
    public int getCount() {
        return count;
    }
}