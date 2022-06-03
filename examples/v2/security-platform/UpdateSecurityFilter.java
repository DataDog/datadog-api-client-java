// Update a security filter returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityPlatformApi;
import com.datadog.api.v2.client.model.SecurityFilterFilteredDataType;
import com.datadog.api.v2.client.model.SecurityFilterResponse;
import com.datadog.api.v2.client.model.SecurityFilterType;
import com.datadog.api.v2.client.model.SecurityFilterUpdateAttributes;
import com.datadog.api.v2.client.model.SecurityFilterUpdateData;
import com.datadog.api.v2.client.model.SecurityFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityPlatformApi apiInstance = new SecurityPlatformApi(defaultClient);

    SecurityFilterUpdateRequest body =
        new SecurityFilterUpdateRequest()
            .data(
                new SecurityFilterUpdateData()
                    .attributes(
                        new SecurityFilterUpdateAttributes()
                            .filteredDataType(SecurityFilterFilteredDataType.LOGS)
                            .isEnabled(true)
                            .name("Custom security filter")
                            .query("service:api")
                            .version(1))
                    .type(SecurityFilterType.SECURITY_FILTERS));

    try {
      SecurityFilterResponse result = apiInstance.updateSecurityFilter("security_filter_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityPlatformApi#updateSecurityFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
