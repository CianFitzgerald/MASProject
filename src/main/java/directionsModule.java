import astra.core.Module;

public class directionsModule extends Module {

    public String tempDir = "north";
    public String dirHen = "north";
    public String dirDec = "north";
    public String dirLlo = "north";
    public String dirHar = "north";

    @ACTION
    public boolean setTemp (String input) {
        tempDir = input;
        return true;
    }

    @TERM
    public String getTemp(){
        return tempDir;
    }

    @ACTION
    public boolean setHenry () {
        dirHen = tempDir;
        return true;
    }

    @TERM
    public String getHenry(){
        return dirHen;
    }

    @ACTION
    public boolean setDecco () {
        dirDec = tempDir;
        return true;
    }

    @TERM
    public String getDecco(){
        return dirDec;
    }

    @ACTION
    public boolean setLloyd() {
        dirLlo = tempDir;
        return true;
    }

    @TERM
    public String getLloyd(){
        return dirLlo;
    }

    @ACTION
    public boolean setHarry() {
        dirHar = tempDir;
        return true;
    }

    @TERM
    public String getHarry(){
        return dirHar;
    }
}