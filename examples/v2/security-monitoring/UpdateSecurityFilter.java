// Update a security filter returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;
import com.datadog.api.v2.client.model.SecurityFilterFilteredDataType;
import com.datadog.api.v2.client.model.SecurityFilterResponse;
import com.datadog.api.v2.client.model.SecurityFilterType;
import com.datadog.api.v2.client.model.SecurityFilterUpdateAttributes;
import com.datadog.api.v2.client.model.SecurityFilterUpdateData;
import com.datadog.api.v2.client.model.SecurityFilterUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "security_filter" in the system
    String SECURITY_FILTER_DATA_ID = System.getenv("SECURITY_FILTER_DATA_ID");

    SecurityFilterUpdateRequest body =
        new SecurityFilterUpdateRequest()
            .data(
                new SecurityFilterUpdateData()
                    .attributes(
                        new SecurityFilterUpdateAttributes()
                            .filteredDataType(SecurityFilterFilteredDataType.LOGS)
                            .isEnabled(true)
                            .name("Example-Update_a_security_filter_returns_OK_response")
                            .query("service:ExampleUpdateasecurityfilterreturnsOKresponse")
                            .version(1))
                    .type(SecurityFilterType.SECURITY_FILTERS));

    try {
      SecurityFilterResponse result =
          apiInstance.updateSecurityFilter(SECURITY_FILTER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateSecurityFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
