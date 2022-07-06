// Create a security filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityFilterCreateAttributes;
import com.datadog.api.client.v2.model.SecurityFilterCreateData;
import com.datadog.api.client.v2.model.SecurityFilterCreateRequest;
import com.datadog.api.client.v2.model.SecurityFilterExclusionFilter;
import com.datadog.api.client.v2.model.SecurityFilterFilteredDataType;
import com.datadog.api.client.v2.model.SecurityFilterResponse;
import com.datadog.api.client.v2.model.SecurityFilterType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

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
                            .name("Example-Create_a_security_filter_returns_OK_response")
                            .query("service:ExampleCreateasecurityfilterreturnsOKresponse"))
                    .type(SecurityFilterType.SECURITY_FILTERS));

    try {
      SecurityFilterResponse result = apiInstance.createSecurityFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createSecurityFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
