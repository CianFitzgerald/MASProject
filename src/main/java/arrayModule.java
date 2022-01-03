import astra.core.Module;

public class arrayModule extends Module {

    int[][] array = new int[16][8];

    @TERM
    public int check(int xcord, int ycord) {
        try {
            int x = array[xcord][ycord];
            return x;
        } catch (Exception e) {
            int x = 1000;
            return x;
        } 
    }

    @ACTION
    public boolean add(int xcord, int ycord){
        array[xcord][ycord] += 1;
        return true;
    }

    @ACTION
    public boolean addObstacle(int xcord, int ycord){
        try{
            array[xcord][ycord] += 1000;
            return true;
        } catch (Exception e){
            return true;
        }
    }

    @ACTION
    public boolean ObstacleCheck(String dir, int xcord, int ycord, String square, String contents){
        if(dir=="north"){
            if(square=="forward" & contents=="obstacle"){
                addObstacle(xcord, ycord -1);
            }if(square=="left" & contents=="obstacle"){
                addObstacle(xcord+1, ycord);
            }if(square=="right" & contents=="obstacle"){
                addObstacle(xcord-1, ycord);
            }if(square=="back" & contents=="obstacle"){
                addObstacle(xcord, ycord +1);
            }
        }

        else if(dir=="south"){
            if(square=="forward" & contents=="obstacle"){
                addObstacle(xcord, ycord +1);
            }if(square=="left" & contents=="obstacle"){
                addObstacle(xcord-1, ycord);
            }if(square=="right" & contents=="obstacle"){
                addObstacle(xcord+1, ycord);
            }if(square=="back" & contents=="obstacle"){
                addObstacle(xcord, ycord -1);
            }
        }

        else if (dir=="east"){
            if(square=="forward" & contents=="obstacle"){
                addObstacle(xcord+1, ycord);
            }if(square=="left" & contents=="obstacle"){
                addObstacle(xcord, ycord-1);
            }if(square=="right" & contents=="obstacle"){
                addObstacle(xcord, ycord+1);
            }if(square=="back" & contents=="obstacle"){
                addObstacle(xcord-1, ycord);
            }
        }

        else{
            if(square=="forward" & contents=="obstacle"){
                addObstacle(xcord-1, ycord);
            }if(square=="left" & contents=="obstacle"){
                addObstacle(xcord, ycord+1);
            }if(square=="right" & contents=="obstacle"){
                addObstacle(xcord, ycord-1);
            }if(square=="back" & contents=="obstacle"){
                addObstacle(xcord+1, ycord);
            }
        }
        return true;
    }

}

