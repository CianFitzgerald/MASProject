import astra.core.Module;

public class sortingModule extends Module {

    @TERM
    public int sort(int n1, int n2, int n3) {
        int lowest = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;
        return lowest;
    }
}