// Delete a security filter returns "No Content" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.CloudSiemApi;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    CloudSiemApi apiInstance = new CloudSiemApi(defaultClient);

    // there is a valid "security_filter" in the system
    String SECURITY_FILTER_DATA_ID = System.getenv("SECURITY_FILTER_DATA_ID");

    try {
      apiInstance.deleteSecurityFilter(SECURITY_FILTER_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudSiemApi#deleteSecurityFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
