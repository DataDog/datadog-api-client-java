// Update a security filter returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityFilterResponse;
import com.datadog.api.client.v2.model.SecurityFilterFilteredDataType;
import com.datadog.api.client.v2.model.SecurityFilterType;
import com.datadog.api.client.v2.model.SecurityFilterUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityFilterUpdateData;
import com.datadog.api.client.v2.model.SecurityFilterUpdateRequest;
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

    // there is a valid "security_filter" in the system
    String SECURITY_FILTER_DATA_ID = System.getenv("SECURITY_FILTER_DATA_ID");

    SecurityFilterUpdateRequest body = new SecurityFilterUpdateRequest()
.data(new SecurityFilterUpdateData()
.attributes(new SecurityFilterUpdateAttributes()
.filteredDataType(SecurityFilterFilteredDataType.LOGS)
.isEnabled(true)
.name("Example-Security-Monitoring")
.query("service:ExampleSecurityMonitoring")
.version(1))
.type(SecurityFilterType.SECURITY_FILTERS));

    try {
      SecurityFilterResponse result = apiInstance.updateSecurityFilter(SECURITY_FILTER_DATA_ID, body);
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