// Edit an application key for this service account returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.ServiceAccountsApi;
import com.datadog.api.v2.client.model.ApplicationKeyUpdateAttributes;
import com.datadog.api.v2.client.model.ApplicationKeyUpdateData;
import com.datadog.api.v2.client.model.ApplicationKeyUpdateRequest;
import com.datadog.api.v2.client.model.ApplicationKeysType;
import com.datadog.api.v2.client.model.PartialApplicationKeyResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);

    ApplicationKeyUpdateRequest body =
        new ApplicationKeyUpdateRequest()
            .data(
                new ApplicationKeyUpdateData()
                    .attributes(
                        new ApplicationKeyUpdateAttributes()
                            .name("Application Key for managing dashboards")
                            .scopes(
                                Arrays.asList(
                                    "dashboards_read",
                                    "dashboards_write",
                                    "dashboards_public_share")))
                    .id("00112233-4455-6677-8899-aabbccddeeff")
                    .type(ApplicationKeysType.APPLICATION_KEYS));

    try {
      PartialApplicationKeyResponse result =
          apiInstance.updateServiceAccountApplicationKey(
              "00000000-0000-1234-0000-000000000000", "app_key_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceAccountsApi#updateServiceAccountApplicationKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
