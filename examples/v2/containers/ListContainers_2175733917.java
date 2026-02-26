// Get All Container groups returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ContainersApi;
import com.datadog.api.client.v2.api.ContainersApi.ListContainersOptionalParameters;
import com.datadog.api.client.v2.model.ContainersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ContainersApi apiInstance = new ContainersApi(defaultClient);

    try {
      ContainersResponse result =
          apiInstance.listContainers(new ListContainersOptionalParameters().groupBy("short_image"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#listContainers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
