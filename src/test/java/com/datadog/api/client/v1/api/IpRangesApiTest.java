/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.datadog.api.TestUtils;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.model.IPRanges;
import java.io.IOException;
import org.junit.Test;

/** API tests for IpRangesApi */
public class IpRangesApiTest extends V1ApiTest {

  private static IpRangesApi api;

  @Override
  public String getTracingEndpoint() {
    return "ip-ranges";
  }

  @Test
  public void getIPRangesTest() throws ApiException {
    api = new IpRangesApi(generalApiClient);

    // Get IP ranges
    IPRanges ipRanges = api.getIPRanges();
    assertTrue(ipRanges.getAgents().getPrefixesIpv4().size() > 0);
    assertTrue(ipRanges.getApi().getPrefixesIpv4().size() > 0);
    assertTrue(ipRanges.getApm().getPrefixesIpv4().size() > 0);
    assertTrue(ipRanges.getLogs().getPrefixesIpv4().size() > 0);
    assertTrue(ipRanges.getProcess().getPrefixesIpv4().size() > 0);
    assertTrue(ipRanges.getSynthetics().getPrefixesIpv4().size() > 0);
    assertTrue(ipRanges.getWebhooks().getPrefixesIpv4().size() > 0);
  }

  @Test
  public void getIPRangesTestMocked() throws ApiException, IOException {
    api = new IpRangesApi(generalApiUnitTestClient);

    stubFor(
        get(urlPathEqualTo("/"))
            .willReturn(okJson(TestUtils.getFixture("client/v1/api/ip_ranges/ip_ranges.json"))));

    // Get IP ranges
    IPRanges ipRanges = api.getIPRanges();
    assertEquals(new Long(11), ipRanges.getVersion());
    assertEquals("2019-07-29-11-48-00", ipRanges.getModified());
    assertEquals("ipv4", ipRanges.getAgents().getPrefixesIpv4().get(0));
    assertEquals("ipv4", ipRanges.getApi().getPrefixesIpv4().get(0));
    assertEquals("ipv4", ipRanges.getApm().getPrefixesIpv4().get(0));
    assertEquals("ipv4", ipRanges.getLogs().getPrefixesIpv4().get(0));
    assertEquals("ipv4", ipRanges.getProcess().getPrefixesIpv4().get(0));
    assertEquals("ipv4", ipRanges.getSynthetics().getPrefixesIpv4().get(0));
    assertEquals("ipv4", ipRanges.getWebhooks().getPrefixesIpv4().get(0));
    assertEquals("ipv6", ipRanges.getAgents().getPrefixesIpv6().get(0));
    assertEquals("ipv6", ipRanges.getApi().getPrefixesIpv6().get(0));
    assertEquals("ipv6", ipRanges.getApm().getPrefixesIpv6().get(0));
    assertEquals("ipv6", ipRanges.getLogs().getPrefixesIpv6().get(0));
    assertEquals("ipv6", ipRanges.getProcess().getPrefixesIpv6().get(0));
    assertEquals("ipv6", ipRanges.getSynthetics().getPrefixesIpv6().get(0));
    assertEquals("ipv6", ipRanges.getWebhooks().getPrefixesIpv6().get(0));
  }
}
