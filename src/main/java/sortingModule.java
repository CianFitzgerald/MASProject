import astra.core.Module;

public class sortingModule extends Module {
	// Method which takes the surrounding square values and finds the one with the lowest value
	// returns the string value of the direction with the lowest corresponding value

    @TERM
    public String sort(int forward, int left, int right, int back) {

		// finding the lowest value using the math module

        int lowest = Math.min(Math.min(forward, left), Math.min(right, back));
        if (lowest == forward) {
			return "forward";
		}
		else if (lowest == left) {
			return "left";
		}
		else if (lowest == right) {
			return "right";
		}
		else  {
			return "back";
		}
    }
}

