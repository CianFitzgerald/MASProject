import astra.core.Module;

public class directionsModule extends Module {
    // initializing the stored direction values for each bot 
    public String dirHen = "north";
    public String dirDec = "south";
    public String dirLlo = "east";
    public String dirHar = "west";
    // method which sets the direction value for a specified bot
    @ACTION
    public boolean setDir (String input, String botname) {
        if(botname == "Henry"){
            dirHen = input;
        }
        else if(botname == "Decco"){
            dirDec = input;
        }
        else if(botname == "Harry"){
            dirHar = input;
        }
        else{
            dirLlo = input;
        }
        return true;
    }
    // method which gets the direction value for a specified bot
    @TERM
    public String getDir (String botname) {
        if(botname == "Henry"){
            return dirHen;
        }
        else if(botname == "Decco"){
            return dirDec;
        }
        else if(botname == "Harry"){
            return dirHar;
        }
        else{
            return dirLlo;
        }
    }

}