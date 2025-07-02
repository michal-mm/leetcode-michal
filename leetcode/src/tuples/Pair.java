package tuples;

public record Pair (int a, int b) {


    public int getA() { return a; }
    public int getB() { return b; }
    public int multiply() { return a*b; }

    @Override
    public boolean equals (Object o) {
        return switch (o) {
            case Pair other when (this.a == other.a || 
                                    this.a == other.b || 
                                    this.b == other.a || 
                                    this.b == other.b) -> true;
            case Pair other -> false;
            case null, default -> false;
        };
    }

    @Override
    public int hashCode () {
        return Integer.valueOf(a*b).hashCode();
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + ")";
    }
}
