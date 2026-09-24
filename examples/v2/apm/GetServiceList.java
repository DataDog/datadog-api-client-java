// Get service list returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApmApi;
import com.datadog.api.client.v2.model.ServiceList;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ApmApi apiInstance = new ApmApi(defaultClient);

    try {
      ServiceList result = apiInstance.getServiceList("filter[env]");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmApi#getServiceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
