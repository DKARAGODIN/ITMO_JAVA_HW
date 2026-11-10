package ru.itmo;

import java.util.function.Function;
import org.jspecify.annotations.NonNull;

public interface LightFuture<R> {
    boolean isReady();

    @NonNull R get() throws LightExecutionException, InterruptedException;

    <R1> @NonNull LightFuture<R1> thenApply(Function<? super R, ? extends R1> function);
}
