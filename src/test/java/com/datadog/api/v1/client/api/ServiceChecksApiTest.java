/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2020-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import java.time.OffsetDateTime;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.IntakePayloadAccepted;
import com.datadog.api.v1.client.model.ServiceCheck;
import com.datadog.api.v1.client.model.ServiceCheckStatus;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * API tests for ServiceChecksApi
 */
public class ServiceChecksApiTest extends V1ApiTest {

    private static ServiceChecksApi api;

    @BeforeClass
    public static void initApi() {
        api = new ServiceChecksApi(generalApiClient);
    }

    private ServiceCheck createServiceCheck() {
        String name = Thread.currentThread().getStackTrace()[2].getMethodName();
        OffsetDateTime now = OffsetDateTime.now();
        return new ServiceCheck()
            .check(name)
            .hostName(String.format("java-client-test-host-%d", now.toEpochSecond()))
            .message("Java client integration test is running")
            .status(ServiceCheckStatus.OK)
            .tags(Arrays.asList("test", "client:java", name))
            .timestamp(now.toEpochSecond());
    }

    /**
     * Submit a Service Check
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitServiceCheckTest() throws ApiException {
        ServiceCheck serviceCheck = createServiceCheck();
        IntakePayloadAccepted response = api.submitServiceCheck()
                .body(Arrays.asList(serviceCheck))
                .execute();

        assertEquals("ok", response.getStatus());
    }

}
