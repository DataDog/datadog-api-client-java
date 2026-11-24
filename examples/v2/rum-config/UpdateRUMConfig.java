// Update the RUM configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumConfigApi;
import com.datadog.api.client.v2.model.RUMConfigResponse;
import com.datadog.api.client.v2.model.RUMConfigType;
import com.datadog.api.client.v2.model.RUMConfigUpdateAttributes;
import com.datadog.api.client.v2.model.RUMConfigUpdateData;
import com.datadog.api.client.v2.model.RUMConfigUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateRUMConfig", true);
    RumConfigApi apiInstance = new RumConfigApi(defaultClient);

    RUMConfigUpdateRequest body =
        new RUMConfigUpdateRequest()
            .data(
                new RUMConfigUpdateData()
                    .attributes(new RUMConfigUpdateAttributes().enforcedApplicationTags(true))
                    .type(RUMConfigType.RUM_CONFIG));

    try {
      RUMConfigResponse result = apiInstance.updateRUMConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumConfigApi#updateRUMConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
