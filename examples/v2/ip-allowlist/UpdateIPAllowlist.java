// Update IP Allowlist returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IpAllowlistApi;
import com.datadog.api.client.v2.model.IPAllowlistAttributes;
import com.datadog.api.client.v2.model.IPAllowlistData;
import com.datadog.api.client.v2.model.IPAllowlistEntry;
import com.datadog.api.client.v2.model.IPAllowlistEntryAttributes;
import com.datadog.api.client.v2.model.IPAllowlistEntryData;
import com.datadog.api.client.v2.model.IPAllowlistEntryType;
import com.datadog.api.client.v2.model.IPAllowlistResponse;
import com.datadog.api.client.v2.model.IPAllowlistType;
import com.datadog.api.client.v2.model.IPAllowlistUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IpAllowlistApi apiInstance = new IpAllowlistApi(defaultClient);

    IPAllowlistUpdateRequest body =
        new IPAllowlistUpdateRequest()
            .data(
                new IPAllowlistData()
                    .attributes(
                        new IPAllowlistAttributes()
                            .entries(
                                Collections.singletonList(
                                    new IPAllowlistEntry()
                                        .data(
                                            new IPAllowlistEntryData()
                                                .attributes(
                                                    new IPAllowlistEntryAttributes()
                                                        .note(
                                                            "Example-Update_IP_Allowlist_returns_OK_response")
                                                        .cidrBlock("127.0.0.1"))
                                                .type(IPAllowlistEntryType.IP_ALLOWLIST_ENTRY))))
                            .enabled(false))
                    .type(IPAllowlistType.IP_ALLOWLIST));

    try {
      IPAllowlistResponse result = apiInstance.updateIPAllowlist(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpAllowlistApi#updateIPAllowlist");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
