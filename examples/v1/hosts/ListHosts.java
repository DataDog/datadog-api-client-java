// Get all hosts for your organization returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.HostsApi;
import com.datadog.api.v1.client.api.HostsApi.ListHostsOptionalParameters;
import com.datadog.api.v1.client.model.HostListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HostsApi apiInstance = new HostsApi(defaultClient);

    try {
      HostListResponse result =
          apiInstance.listHosts(new ListHostsOptionalParameters().filter("env:ci"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HostsApi#listHosts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
