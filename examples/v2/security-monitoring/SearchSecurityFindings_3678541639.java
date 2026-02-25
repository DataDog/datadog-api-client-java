// Search security findings returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ListSecurityFindingsResponse;
import com.datadog.api.client.v2.model.SecurityFindingsSearchRequest;
import com.datadog.api.client.v2.model.SecurityFindingsSearchRequestData;
import com.datadog.api.client.v2.model.SecurityFindingsSearchRequestDataAttributes;
import com.datadog.api.client.v2.model.SecurityFindingsSearchRequestPage;
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

    SecurityFindingsSearchRequest body = new SecurityFindingsSearchRequest()
.data(new SecurityFindingsSearchRequestData()
.attributes(new SecurityFindingsSearchRequestDataAttributes()
.filter("@severity:(critical OR high)")
.page(new SecurityFindingsSearchRequestPage()
.limit(1L))));

    try {
      ListSecurityFindingsResponse result = apiInstance.searchSecurityFindings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#searchSecurityFindings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}