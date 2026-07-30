// Create a RUM operation strong link returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkCreateRequest;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkCreateRequestAttributes;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkCreateRequestData;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkResponse;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkStatus;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createRUMOperationStrongLink", true);
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    RUMOperationStrongLinkCreateRequest body =
        new RUMOperationStrongLinkCreateRequest()
            .data(
                new RUMOperationStrongLinkCreateRequestData()
                    .attributes(
                        new RUMOperationStrongLinkCreateRequestAttributes()
                            .description(null)
                            .featureId("feature-123")
                            .operationId("abc12345-1234-5678-abcd-ef1234567890")
                            .status(RUMOperationStrongLinkStatus.CONFIRMED))
                    .type(RUMOperationStrongLinkType.STRONG_LINKS));

    try {
      RUMOperationStrongLinkResponse result = apiInstance.createRUMOperationStrongLink(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#createRUMOperationStrongLink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
