import astra.core.Module;

public class sortingModule extends Module {

    @TERM
    public String sort(int forward, int left, int right, int back) {
        int lowest = forward < left && forward < right && forward < back ? forward : left < forward && left < right && left < back ? left : right < forward && right < left && right < back ? right : back;
        if (lowest == forward) {
			return "forward";
		}
		else if (lowest == left) {
			return "left";
		}
		else if (lowest == right) {
			return "right";
		}
		else {
			return "back";
		}

    }
}

