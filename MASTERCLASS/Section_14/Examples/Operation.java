package MASTERCLASS.Section_14.Examples;

@FunctionalInterface
public interface Operation<T> {
    T operate(T v1, T v2);
}
