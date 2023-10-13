// Get all Container Images returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ContainerImagesApi;
import com.datadog.api.client.v2.model.ContainerImagesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listContainerImages", true);
    ContainerImagesApi apiInstance = new ContainerImagesApi(defaultClient);

    try {
      ContainerImagesResponse result = apiInstance.listContainerImages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerImagesApi#listContainerImages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
