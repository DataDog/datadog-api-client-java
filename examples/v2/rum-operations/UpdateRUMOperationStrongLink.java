// Update a RUM operation link returns "OK" response

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
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    // there is a valid "rum_operation_strong_link" in the system
    String RUM_OPERATION_STRONG_LINK_DATA_ATTRIBUTES_FEATURE_ID =
        System.getenv("RUM_OPERATION_STRONG_LINK_DATA_ATTRIBUTES_FEATURE_ID");
    String RUM_OPERATION_STRONG_LINK_DATA_ATTRIBUTES_OPERATION_ID =
        System.getenv("RUM_OPERATION_STRONG_LINK_DATA_ATTRIBUTES_OPERATION_ID");

    RUMOperationStrongLinkUpdateRequest body =
        new RUMOperationStrongLinkUpdateRequest()
            .data(
                new RUMOperationStrongLinkUpdateRequestData()
                    .type(RUMOperationStrongLinkType.STRONG_LINKS)
                    .attributes(
                        new RUMOperationStrongLinkUpdateRequestAttributes()
                            .status(RUMOperationStrongLinkUpdateStatus.REJECTED)));

    try {
      RUMOperationStrongLinkResponse result =
          apiInstance.updateRUMOperationStrongLink(
              RUM_OPERATION_STRONG_LINK_DATA_ATTRIBUTES_OPERATION_ID,
              RUM_OPERATION_STRONG_LINK_DATA_ATTRIBUTES_FEATURE_ID,
              body);
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
