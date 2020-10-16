package BOJ.탐색;

public class Pair<I extends Integer, I1 extends Integer> {
    Integer first;
    Integer second;

    public Pair(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public Integer first() {
        return first;
    }

    public Integer second() {
        return second;
    }
}