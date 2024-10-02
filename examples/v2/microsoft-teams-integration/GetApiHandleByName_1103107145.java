// Get api handle information by name returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleInfoResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    // there is a valid "api_handle" in the system
    String API_HANDLE_DATA_ATTRIBUTES_NAME = System.getenv("API_HANDLE_DATA_ATTRIBUTES_NAME");

    try {
      MicrosoftTeamsApiHandleInfoResponse result =
          apiInstance.getApiHandleByName(API_HANDLE_DATA_ATTRIBUTES_NAME);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#getApiHandleByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}