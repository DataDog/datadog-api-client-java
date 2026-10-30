// Create a temporary grant request returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.TemporaryGrantRequestCreateAttributes;
import com.datadog.api.client.v2.model.TemporaryGrantRequestCreateData;
import com.datadog.api.client.v2.model.TemporaryGrantRequestCreateRequest;
import com.datadog.api.client.v2.model.TemporaryGrantRequestResponse;
import com.datadog.api.client.v2.model.TemporaryGrantRequestType;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createTemporaryGrantRequest", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    TemporaryGrantRequestCreateRequest body =
        new TemporaryGrantRequestCreateRequest()
            .data(
                new TemporaryGrantRequestCreateData()
                    .attributes(
                        new TemporaryGrantRequestCreateAttributes()
                            .expiresAt(OffsetDateTime.parse("2028-02-16T00:00:00Z"))
                            .justification("Credits needed to finish the incident investigation.")
                            .total(200L))
                    .type(TemporaryGrantRequestType.TEMPORARY_GRANT_REQUESTS));

    try {
      TemporaryGrantRequestResponse result = apiInstance.createTemporaryGrantRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#createTemporaryGrantRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
