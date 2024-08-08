// Mute a host returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.HostsApi;
import com.datadog.api.client.v1.model.HostMuteResponse;
import com.datadog.api.client.v1.model.HostMuteSettings;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    HostsApi apiInstance = new HostsApi(defaultClient);

    HostMuteSettings body = new HostMuteSettings()
.end(1579098130L)
.message("Muting this host for a test!")
.override(false);

    try {
      HostMuteResponse result = apiInstance.muteHost("host_name", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostsApi#muteHost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}