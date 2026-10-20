// Create a temporary grant request with a justification

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.TemporaryGrantRequestCreateAttributes;
import com.datadog.api.client.v2.model.TemporaryGrantRequestCreateData;
import com.datadog.api.client.v2.model.TemporaryGrantRequestCreateRequest;
import com.datadog.api.client.v2.model.TemporaryGrantRequestResponse;
import com.datadog.api.client.v2.model.TemporaryGrantRequestType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.publicCreateTemporaryGrantRequest", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    TemporaryGrantRequestCreateRequest body =
        new TemporaryGrantRequestCreateRequest()
            .data(
                new TemporaryGrantRequestCreateData()
                    .type(TemporaryGrantRequestType.TEMPORARY_GRANT_REQUESTS)
                    .attributes(
                        new TemporaryGrantRequestCreateAttributes()
                            .total(200L)
                            .justification("SDK temporary grant request test")));

    try {
      TemporaryGrantRequestResponse result = apiInstance.publicCreateTemporaryGrantRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UsageMeteringApi#publicCreateTemporaryGrantRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
