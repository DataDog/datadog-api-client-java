// Reroute On-Call Page returns "No Content." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallPagingApi;
import com.datadog.api.client.v2.model.CreatePageRequestDataAttributesTarget;
import com.datadog.api.client.v2.model.OnCallPageTargetType;
import com.datadog.api.client.v2.model.RerouteOnCallPageRequest;
import com.datadog.api.client.v2.model.RerouteOnCallPageRequestData;
import com.datadog.api.client.v2.model.RerouteOnCallPageRequestDataAttributes;
import com.datadog.api.client.v2.model.RerouteOnCallPageRequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    OnCallPagingApi apiInstance = new OnCallPagingApi(defaultClient);

    RerouteOnCallPageRequest body =
        new RerouteOnCallPageRequest()
            .data(
                new RerouteOnCallPageRequestData()
                    .attributes(
                        new RerouteOnCallPageRequestDataAttributes()
                            .comment("Rerouting to the database team.")
                            .target(
                                new CreatePageRequestDataAttributesTarget()
                                    .identifier("my-team")
                                    .type(OnCallPageTargetType.TEAM_HANDLE)))
                    .type(RerouteOnCallPageRequestDataType.REROUTE));

    try {
      apiInstance.rerouteOnCallPage(UUID.fromString("15e74b8b-f865-48d0-bcc5-453323ed2c8f"), body);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallPagingApi#rerouteOnCallPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
