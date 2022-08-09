// Update a RUM application returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMApplicationResponse;
import com.datadog.api.client.v2.model.RUMApplicationUpdate;
import com.datadog.api.client.v2.model.RUMApplicationUpdateAttributes;
import com.datadog.api.client.v2.model.RUMApplicationUpdateRequest;
import com.datadog.api.client.v2.model.RUMApplicationUpdateType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    RUMApplicationUpdateRequest body =
        new RUMApplicationUpdateRequest()
            .data(
                new RUMApplicationUpdate()
                    .attributes(
                        new RUMApplicationUpdateAttributes()
                            .name("updated_name_for_my_existing_rum_application")
                            .type("browser|ios|android|react-native|flutter"))
                    .id("abcd1234-0000-0000-abcd-1234abcd5678")
                    .type(RUMApplicationUpdateType.RUM_APPLICATION_UPDATE));

    try {
      RUMApplicationResponse result = apiInstance.updateRUMApplication("id", body);
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
