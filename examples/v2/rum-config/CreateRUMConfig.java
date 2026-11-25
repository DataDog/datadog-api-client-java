// Create the RUM configuration returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumConfigApi;
import com.datadog.api.client.v2.model.RUMConfigCreateAttributes;
import com.datadog.api.client.v2.model.RUMConfigCreateData;
import com.datadog.api.client.v2.model.RUMConfigCreateRequest;
import com.datadog.api.client.v2.model.RUMConfigResponse;
import com.datadog.api.client.v2.model.RUMConfigType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createRUMConfig", true);
    RumConfigApi apiInstance = new RumConfigApi(defaultClient);

    RUMConfigCreateRequest body =
        new RUMConfigCreateRequest()
            .data(
                new RUMConfigCreateData()
                    .attributes(new RUMConfigCreateAttributes().enforcedApplicationTags(true))
                    .type(RUMConfigType.RUM_CONFIG));

    try {
      RUMConfigResponse result = apiInstance.createRUMConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumConfigApi#createRUMConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
