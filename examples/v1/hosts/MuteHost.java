// Mute a host returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.HostsApi;
import com.datadog.api.v1.client.model.HostMuteResponse;
import com.datadog.api.v1.client.model.HostMuteSettings;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HostsApi apiInstance = new HostsApi(defaultClient);

    HostMuteSettings body =
        new HostMuteSettings()
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
