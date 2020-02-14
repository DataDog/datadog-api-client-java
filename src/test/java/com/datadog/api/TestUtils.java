/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;

import java.io.IOException;
import java.util.HashMap;
import java.util.function.BooleanSupplier;

import static com.github.tomakehurst.wiremock.client.WireMock.reset;

public class TestUtils {
    public static void retry(int interval, int count, BooleanSupplier call) throws RetryException {
        for (int i = 0; i < count; i++) {
            if (call.getAsBoolean()) {
                return;
            }
            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                return;
            }
        }
        throw new RetryException(String.format("Retry error: failed to satisfy the condition after %d times", count));
    }

    public static String getFixture(String path) throws IOException {
        return IOUtils.toString(TestUtils.class.getResourceAsStream(path), "UTF-8");
    }

    public static class RetryException extends Exception {
        public RetryException(String message) {
            super(message);
        }
    }

    public static class APITest {

        protected static final String TEST_API_KEY_NAME = "DD_TEST_CLIENT_API_KEY";
        protected static final String TEST_APP_KEY_NAME = "DD_TEST_CLIENT_APP_KEY";

        protected static String TEST_API_KEY;
        protected static String TEST_APP_KEY;

        @Rule
        public WireMockRule wireMockRule = new WireMockRule();

        @BeforeClass
        public static void getSecretsFromEnv() {
            HashMap<String, String> secrets = new HashMap<String, String>();

            // Get API key
            TEST_API_KEY = System.getenv(TEST_API_KEY_NAME);
            if (TEST_API_KEY == null) {
                System.err.printf("%s not set, exiting", TEST_API_KEY_NAME);
                System.exit(1);
            }

            // Get application key
            TEST_APP_KEY = System.getenv(TEST_APP_KEY_NAME);
            if (TEST_APP_KEY == null) {
                System.err.printf("%s not set, exiting", TEST_APP_KEY_NAME);
                System.exit(1);
            }
        }

        @After
        public void resetWiremock() {
            reset();
        }
    }
}
