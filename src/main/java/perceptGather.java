import astra.core.Module;

public class perceptGather extends Module{
    boolean initialHenry = false;
    boolean initialDecco = false;
    boolean initialHarry = false;
    boolean initialLloyd = false;
    @ACTION
    public boolean setPercept(String bot, boolean bool){
        if(bot == "Henry"){
            initialHenry = bool;
        }
        else if(bot == "Decco"){
            initialDecco = bool;
        }
        else if(bot == "Harry"){
            initialHarry = bool;
        }
        else{
            initialLloyd = bool;
        }
        return true;

    }
    @TERM
    public boolean getPercept(String bot){
        if(bot == "Henry"){
            return initialHenry;
        }
        else if(bot == "Decco"){
            return initialDecco;
        }
        else if(bot == "Harry"){
            return initialHarry;
        }
        else{
            return initialLloyd ;
        }

    }
}
