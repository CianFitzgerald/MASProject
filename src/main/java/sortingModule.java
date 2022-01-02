import astra.core.Module;

public class sortingModule extends Module {

    @TERM
    public String sort(int forward, int left, int right, int back) {
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

