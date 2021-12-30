import astra.core.Module;

public class dustCountModule extends Module {

    public int count = 0;

    @ACTION 
    public boolean plus(){
        count = count + 1;
        return true;
    } 

    @TERM
    public int getCount() {
        return count;
    }

}