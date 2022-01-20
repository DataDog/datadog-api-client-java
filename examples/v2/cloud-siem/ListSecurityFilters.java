// Get all security filters returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.CloudSiemApi;
import com.datadog.api.v2.client.model.SecurityFiltersResponse;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    CloudSiemApi apiInstance = new CloudSiemApi(defaultClient);

    try {
      SecurityFiltersResponse result = apiInstance.listSecurityFilters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudSiemApi#listSecurityFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
