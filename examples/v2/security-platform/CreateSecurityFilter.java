// Create a security filter returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityPlatformApi;
import com.datadog.api.v2.client.model.SecurityFilterCreateAttributes;
import com.datadog.api.v2.client.model.SecurityFilterCreateData;
import com.datadog.api.v2.client.model.SecurityFilterCreateRequest;
import com.datadog.api.v2.client.model.SecurityFilterExclusionFilter;
import com.datadog.api.v2.client.model.SecurityFilterFilteredDataType;
import com.datadog.api.v2.client.model.SecurityFilterResponse;
import com.datadog.api.v2.client.model.SecurityFilterType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityPlatformApi apiInstance = new SecurityPlatformApi(defaultClient);

    SecurityFilterCreateRequest body =
        new SecurityFilterCreateRequest()
            .data(
                new SecurityFilterCreateData()
                    .attributes(
                        new SecurityFilterCreateAttributes()
                            .exclusionFilters(
                                Collections.singletonList(
                                    new SecurityFilterExclusionFilter()
                                        .name("Exclude staging")
                                        .query("source:staging")))
                            .filteredDataType(SecurityFilterFilteredDataType.LOGS)
                            .isEnabled(true)
                            .name("Custom security filter")
                            .query("service:api"))
                    .type(SecurityFilterType.SECURITY_FILTERS));

    try {
      SecurityFilterResponse result = apiInstance.createSecurityFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityPlatformApi#createSecurityFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
