/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.*;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * API tests for TagsApi
 */
public class TagsApiTest extends V1ApiTest {

    private static TagsApi api;
    private static MetricsApi metricsAPI;


    @BeforeClass
    public static void initAPI() {
        api = new TagsApi(generalApiClient);
        metricsAPI = new MetricsApi(generalApiClient);
    }


    @Test
    public void tagsTest() throws ApiException, TestUtils.RetryException {
        String commonHostTag = "test:client_java";
        long now = System.currentTimeMillis()/1000;
        String hostname = String.format("java-client-test-host-%d", now);
        List<Double> p1 = new ArrayList<>();
        p1.add((double) now);
        p1.add(0.);

        // create host by sending a metric
        MetricsPayload metricsPayload= new MetricsPayload()
                .addSeriesItem(new Series()
                        .addPointsItem(p1)
                        .host(hostname)
                        .metric("java.client.test.metric"));
        IntakePayloadAccepted response = metricsAPI.submitMetrics().body(metricsPayload).execute();
        assertEquals("ok", response.getStatus());

        // wait for host to appear
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                HostTags hostTagsResp = api.getHostTags(hostname).execute();
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of host tags: %s", e));
                return false;
            }
            return true;
        });

        // test methods
        HostTags hostTags = new HostTags().tags(new ArrayList<String>());
        hostTags.addTagsItem(commonHostTag);
        HostTags addTagsResp = api.addToHostTags(hostname).body(hostTags).source("datadog").execute();

        // Confirm we can add host tags
        assertEquals(hostname, addTagsResp.getHost());
        assertEquals(hostTags.getTags(), addTagsResp.getTags());

        // Confirm we can get host tags
        HostTags getTagsResp = api.getHostTags(hostname).source("datadog").execute();
        assertEquals(hostTags.getTags(), getTagsResp.getTags());

        // Test getting tags for an unknown source
        getTagsResp = api.getHostTags(hostname).source("users").execute();
        assertEquals(0, getTagsResp.getTags().size());

        // wait for host to appear
        TestUtils.retry(10, 10, () -> {
            MetricsListResponse metrics;
            try {
                TagToHosts hostTagsResp = api.getAllHostTags().source("datadog").execute();
                return hostTagsResp.getTags().containsKey(commonHostTag);
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of host tags: %s", e));
                return false;
            }
        });

        // Confirm we don't receive tags under an unknown source
        TagToHosts hostTagsResp = api.getAllHostTags().source("users").execute();
        assertThat(hostTagsResp.getTags().keySet(), not(hasItem(commonHostTag)));

        // Update host tags
        HostTags updatedHostTags = new HostTags().tags(new ArrayList<String>());
        updatedHostTags.addTagsItem("foo:bar");
        updatedHostTags.addTagsItem("toto:tata");
        HostTags updateTagsResp = api.updateHostTags(hostname).body(updatedHostTags).source("datadog").execute();
        assertEquals(updatedHostTags.getTags(), updateTagsResp.getTags());
        assertEquals(hostname, updateTagsResp.getHost());

        // Remove tags
        api.removeHostTags(hostname).source("datadog").execute();
    }
}
