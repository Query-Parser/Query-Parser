package edu.gatech.parser;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
public class LazySupplier<T> implements Supplier<T> {
    @NonNull final private Supplier<T> supplier;
    private volatile T value;

    @Override
    public T get() {
        if (value == null) {
            synchronized (this) {
                if (value == null) {
                    value = supplier.get();
                }
            }
        }
        return value;
    }
}
