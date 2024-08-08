// Create a security filter returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityFilterResponse;
import com.datadog.api.client.v2.model.SecurityFilterCreateAttributes;
import com.datadog.api.client.v2.model.SecurityFilterCreateData;
import com.datadog.api.client.v2.model.SecurityFilterCreateRequest;
import com.datadog.api.client.v2.model.SecurityFilterExclusionFilter;
import com.datadog.api.client.v2.model.SecurityFilterFilteredDataType;
import com.datadog.api.client.v2.model.SecurityFilterType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityFilterCreateRequest body = new SecurityFilterCreateRequest()
.data(new SecurityFilterCreateData()
.attributes(new SecurityFilterCreateAttributes()
.exclusionFilters(Collections.singletonList(new SecurityFilterExclusionFilter()
.name("Exclude staging")
.query("source:staging")))
.filteredDataType(SecurityFilterFilteredDataType.LOGS)
.isEnabled(true)
.name("Example-Security-Monitoring")
.query("service:ExampleSecurityMonitoring"))
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