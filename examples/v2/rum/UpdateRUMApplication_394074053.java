// Update a RUM application with Product Scales returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMApplicationResponse;
import com.datadog.api.client.v2.model.RUMApplicationUpdate;
import com.datadog.api.client.v2.model.RUMApplicationUpdateAttributes;
import com.datadog.api.client.v2.model.RUMApplicationUpdateRequest;
import com.datadog.api.client.v2.model.RUMApplicationUpdateType;
import com.datadog.api.client.v2.model.RUMEventProcessingState;
import com.datadog.api.client.v2.model.RUMProductAnalyticsRetentionState;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    // there is a valid "rum_application" in the system
    String RUM_APPLICATION_DATA_ID = System.getenv("RUM_APPLICATION_DATA_ID");

    RUMApplicationUpdateRequest body =
        new RUMApplicationUpdateRequest()
            .data(
                new RUMApplicationUpdate()
                    .attributes(
                        new RUMApplicationUpdateAttributes()
                            .name("updated_rum_with_product_scales")
                            .rumEventProcessingState(RUMEventProcessingState.ALL)
                            .productAnalyticsRetentionState(RUMProductAnalyticsRetentionState.MAX))
                    .id(RUM_APPLICATION_DATA_ID)
                    .type(RUMApplicationUpdateType.RUM_APPLICATION_UPDATE));

    try {
      RUMApplicationResponse result =
          apiInstance.updateRUMApplication(RUM_APPLICATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#updateRUMApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
