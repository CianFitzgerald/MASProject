import astra.core.Module;

public class arrayModule extends Module {
    // initializing the 2D array of the vaccum world 
    int[][] array = new int[16][8];

    @TERM
    public int check(int xcord, int ycord) {
    // Method which returns the value of element in the array 
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
    // Method which adds one to an element in the array   

        array[xcord][ycord] += 1;
        return true;
    }

    @ACTION
    public boolean addObstacle(int xcord, int ycord){
    // Method which adds large value to an element in the array  

        try{
            array[xcord][ycord] += 1000;
            return true;
        } catch (Exception e){
            return true;
        }
    }
}

