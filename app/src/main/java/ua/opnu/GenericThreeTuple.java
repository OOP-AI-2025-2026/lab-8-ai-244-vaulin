package ua.opnu;

class GenericThreeTuple<T, V, S> {
    public final ua.opnu.GenericTwoTuple<T, V> base;
    public final S third;

    public GenericThreeTuple(T first, V second, S third) {
        this.base = new ua.opnu.GenericTwoTuple<>(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + base.first + ", " + base.second + ", " + third + ")";
    }
}