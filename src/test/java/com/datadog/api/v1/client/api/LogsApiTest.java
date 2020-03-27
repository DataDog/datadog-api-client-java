/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeFalse;

/**
 * API tests for LogsApi
 */
public class LogsApiTest extends V1ApiTest {

    private static LogsApi api;

    @BeforeClass
    public static void initAPI() {
        api = new LogsApi(generalApiClient);
    }

    @Test
    public void sendLogsTest() throws ApiException {
        HTTPLog body = new HTTPLog()
                .ddsource("source")
                .ddtags("tags")
                .hostname("datadog-api-client-java-test")
                .message("testing message");
        api.sendLog().body(body).execute();
    }

    @Test
    public void listLogTest() throws ApiException, TestUtils.RetryException, InterruptedException {
        long nowNano = now.toEpochSecond() * 1000000 + now.getNano();
        String source = String.format("go-client-test-%d", nowNano);
        String message = String.format("test-log-list-%d", nowNano);
        String hostname = String.format("datadog-api-client-java-test-%d", nowNano);

        HTTPLog httpLog = new HTTPLog()
            .ddsource(source)
            .ddtags("java,test,list")
            .hostname(hostname)
            .message(String.format("{\"timestamp\": %d, \"message\": \"%s\"}", (now.toEpochSecond() - 1) * 1000, message));

        api.sendLog().body(httpLog).execute();

        Thread.sleep(500);

        String secondMessage = "second-" + message;
        httpLog.setMessage(String.format("{\"timestamp\": %d, \"message\": \"%s\"}", now.toEpochSecond() * 1000, secondMessage));

        api.sendLog().body(httpLog).execute();

        final LogsListRequest request = new LogsListRequest()
                .query(String.format("source:%s", source))
                .time(new LogsListRequestTime()
                        .from(now.minusHours(1))
                        .to(now.plusHours(1)))
                .limit(2)
                .sort(LogsSort.TIME_ASCENDING);

        // Make sure that both log items are indexed
        TestUtils.retry(5, 10, () -> {
            try {
                LogsListResponse response = api.listLogs().body(request).execute();
                return 2 == response.getLogs().size();
            } catch (ApiException e) {
                return false;
            }
        });

        LogsListResponse logsResponse;

        // Find first log item
        LogsListRequest logsRequest = request.limit(1);
        logsResponse = api.listLogs().body(logsRequest).execute();
        assertEquals(1, logsResponse.getLogs().size());

        Log log = logsResponse.getLogs().get(0);
        assertEquals(hostname, log.getContent().getHost());
        assertEquals(message, log.getContent().getMessage());

        // Find second log item
        assertNotNull(logsResponse.getNextLogId());

        logsRequest = logsRequest.startAt(logsResponse.getNextLogId());
        logsResponse = api.listLogs().body(logsRequest).execute();
        assertEquals(1, logsResponse.getLogs().size());

        log = logsResponse.getLogs().get(0);
        assertEquals(hostname, log.getContent().getHost());
        assertEquals(secondMessage, log.getContent().getMessage());
    }

}
