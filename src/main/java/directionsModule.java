import astra.core.Module;

public class directionsModule extends Module {

    public String dirHen = "north";
    public String dirDec = "north";
    public String dirLlo = "north";
    public String dirHar = "north";

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