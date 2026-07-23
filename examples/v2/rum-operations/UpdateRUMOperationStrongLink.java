// Update a RUM operation strong link returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkResponse;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkType;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkUpdateRequest;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkUpdateRequestAttributes;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkUpdateRequestData;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkUpdateStatus;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateRUMOperationStrongLink", true);
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    RUMOperationStrongLinkUpdateRequest body =
        new RUMOperationStrongLinkUpdateRequest()
            .data(
                new RUMOperationStrongLinkUpdateRequestData()
                    .attributes(
                        new RUMOperationStrongLinkUpdateRequestAttributes()
                            .status(RUMOperationStrongLinkUpdateStatus.CONFIRMED))
                    .type(RUMOperationStrongLinkType.STRONG_LINKS));

    try {
      RUMOperationStrongLinkResponse result =
          apiInstance.updateRUMOperationStrongLink("operation_id", "feature_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#updateRUMOperationStrongLink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
