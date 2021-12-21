// Cancel downtimes by scope returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DowntimesApi;
import com.datadog.api.v1.client.model.CancelDowntimesByScopeRequest;
import com.datadog.api.v1.client.model.CanceledDowntimesIds;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    // there is a valid "downtime" in the system
    String DOWNTIME_SCOPE_0 = System.getenv("DOWNTIME_SCOPE_0");

    CancelDowntimesByScopeRequest body =
        new CancelDowntimesByScopeRequest().scope(DOWNTIME_SCOPE_0);

    try {
      CanceledDowntimesIds result = apiInstance.cancelDowntimesByScope(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
