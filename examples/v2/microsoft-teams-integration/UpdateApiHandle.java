// Update handle returns "OK" response

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

    MicrosoftTeamsUpdateApiHandleRequest body =
        new MicrosoftTeamsUpdateApiHandleRequest()
            .data(
                new MicrosoftTeamsUpdateApiHandleRequestData()
                    .attributes(
                        new MicrosoftTeamsApiHandleAttributes()
                            .channelId("fake-channel-id")
                            .name("fake-handle-name")
                            .teamId("00000000-0000-0000-0000-000000000000")
                            .tenantId("00000000-0000-0000-0000-000000000001"))
                    .type(MicrosoftTeamsApiHandleType.HANDLE));

    try {
      MicrosoftTeamsApiHandleInfoResponse result = apiInstance.updateApiHandle("handle_id", body);
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
