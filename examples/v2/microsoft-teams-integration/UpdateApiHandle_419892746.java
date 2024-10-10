// Update api handle returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleInfoResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleType;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateApiHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateApiHandleRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    // there is a valid "api_handle" in the system
    String API_HANDLE_DATA_ATTRIBUTES_NAME = System.getenv("API_HANDLE_DATA_ATTRIBUTES_NAME");
    String API_HANDLE_DATA_ID = System.getenv("API_HANDLE_DATA_ID");

    MicrosoftTeamsUpdateApiHandleRequest body =
        new MicrosoftTeamsUpdateApiHandleRequest()
            .data(
                new MicrosoftTeamsUpdateApiHandleRequestData()
                    .attributes(
                        new MicrosoftTeamsApiHandleAttributes().name("fake-handle-name--updated"))
                    .type(MicrosoftTeamsApiHandleType.HANDLE));

    try {
      MicrosoftTeamsApiHandleInfoResponse result =
          apiInstance.updateApiHandle(API_HANDLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#updateApiHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
