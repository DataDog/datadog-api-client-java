package com.datadog.api.v1.client;

import java.util.function.BooleanSupplier;

public class TestUtils {
    public static class RetryException extends Exception {
        public RetryException(String message){
            super(message);
        }
    }

    public static void retry(int interval, int count, BooleanSupplier call) throws RetryException {
        for(int i = 0; i < count; i++) {
            if(call.getAsBoolean()) {
                return;
            }
            try {
                Thread.sleep(interval * 1000);
            } catch(InterruptedException e) {
                return;
            }
        }
        throw new RetryException(String.format("Retry error: failed to satisfy the condition after %d times", count));
    }
}
