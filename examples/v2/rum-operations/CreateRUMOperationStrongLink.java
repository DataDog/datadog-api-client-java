// Create a RUM operation link returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkCreateRequest;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkCreateRequestAttributes;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkCreateRequestData;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkResponse;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkStatus;
import com.datadog.api.client.v2.model.RUMOperationStrongLinkType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    // there is a valid "rum_operation" in the system
    String RUM_OPERATION_DATA_ID = System.getenv("RUM_OPERATION_DATA_ID");

    RUMOperationStrongLinkCreateRequest body =
        new RUMOperationStrongLinkCreateRequest()
            .data(
                new RUMOperationStrongLinkCreateRequestData()
                    .type(RUMOperationStrongLinkType.STRONG_LINKS)
                    .attributes(
                        new RUMOperationStrongLinkCreateRequestAttributes()
                            .operationId(RUM_OPERATION_DATA_ID)
                            .featureId("bdd-examplerumoperation")
                            .status(RUMOperationStrongLinkStatus.DRAFT)
                            .tags(Collections.singletonList("team:rum-backend"))));

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
