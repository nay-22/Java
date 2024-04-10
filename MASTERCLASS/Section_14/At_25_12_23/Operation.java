package MASTERCLASS.Section_14.At_25_12_23;

@FunctionalInterface
public interface Operation<T> {
    T operate(T v1, T v2);
}
