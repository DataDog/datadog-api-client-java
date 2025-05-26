// Create On-Call Page returns "OK." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallPagingApi;
import com.datadog.api.client.v2.model.CreatePageRequest;
import com.datadog.api.client.v2.model.CreatePageRequestData;
import com.datadog.api.client.v2.model.CreatePageRequestDataAttributes;
import com.datadog.api.client.v2.model.CreatePageRequestDataAttributesTarget;
import com.datadog.api.client.v2.model.CreatePageRequestDataType;
import com.datadog.api.client.v2.model.CreatePageResponse;
import com.datadog.api.client.v2.model.OnCallPageTargetType;
import com.datadog.api.client.v2.model.PageUrgency;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallPagingApi apiInstance = new OnCallPagingApi(defaultClient);

    CreatePageRequest body =
        new CreatePageRequest()
            .data(
                new CreatePageRequestData()
                    .attributes(
                        new CreatePageRequestDataAttributes()
                            .description("Page details.")
                            .tags(Collections.singletonList("service:test"))
                            .target(
                                new CreatePageRequestDataAttributesTarget()
                                    .identifier("my-team")
                                    .type(OnCallPageTargetType.TEAM_HANDLE))
                            .title("Page title")
                            .urgency(PageUrgency.LOW))
                    .type(CreatePageRequestDataType.PAGES));

    try {
      CreatePageResponse result = apiInstance.createOnCallPage(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallPagingApi#createOnCallPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
