package ru.itmo;

import java.util.function.Supplier;
import org.jspecify.annotations.NonNull;

public interface ThreadPool extends AutoCloseable {
    <R> @NonNull LightFuture<R> submit(Supplier<? extends R> supplier);

    void shutdown();

    int getNumberOfThreads();

    @Override
    default void close() {
        shutdown();
    }
}
