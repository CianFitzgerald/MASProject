import astra.core.Module;

public class perceptGather extends Module{
    boolean Henry = false;
    boolean Decco = false;
    boolean Harry = false;
    boolean Lloyd = false;

    @ACTION
    public boolean setPercept(String bot, boolean bool){
        if(bot == "Henry"){
            Henry = bool;
        }
        else if(bot == "Decco"){
            Decco = bool;
        }
        else if(bot == "Harry"){
            Harry = bool;
        }
        else{
            Lloyd = bool;
        }
        return true;

    }
    @TERM
    public boolean getPercept(String bot){
        if(bot == "Henry"){
            return Henry;
        }
        else if(bot == "Decco"){
            return Decco;
        }
        else if(bot == "Harry"){
            return Harry;
        }
        else{
            return Lloyd ;
        }

    }
}
