// Delete an AWS cloud authentication persona mapping returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteAWSCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    try {
      apiInstance.deleteAWSCloudAuthPersonaMapping("c5c758c6-18c2-4484-ae3f-46b84128404a");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#deleteAWSCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
