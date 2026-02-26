// Get space information by display name returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GoogleChatIntegrationApi;
import com.datadog.api.client.v2.model.GoogleChatAppNamedSpaceResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GoogleChatIntegrationApi apiInstance = new GoogleChatIntegrationApi(defaultClient);

    try {
      GoogleChatAppNamedSpaceResponse result =
          apiInstance.getSpaceByDisplayName("datadog.ninja", "api-test-space");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoogleChatIntegrationApi#getSpaceByDisplayName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
