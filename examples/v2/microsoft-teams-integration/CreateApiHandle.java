// Create handle returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleRequestAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleRequestData;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleType;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateApiHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateApiHandleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    MicrosoftTeamsCreateApiHandleRequest body =
        new MicrosoftTeamsCreateApiHandleRequest()
            .data(
                new MicrosoftTeamsApiHandleRequestData()
                    .attributes(
                        new MicrosoftTeamsApiHandleRequestAttributes()
                            .channelId("fake-channel-id")
                            .name("fake-handle-name")
                            .teamId("00000000-0000-0000-0000-000000000000")
                            .tenantId("00000000-0000-0000-0000-000000000001"))
                    .type(MicrosoftTeamsApiHandleType.HANDLE));

    try {
      MicrosoftTeamsCreateApiHandleResponse result = apiInstance.createApiHandle(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#createApiHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
