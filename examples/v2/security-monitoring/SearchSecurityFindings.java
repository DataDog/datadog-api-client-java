// Search security findings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ListSecurityFindingsResponse;
import com.datadog.api.client.v2.model.SecurityFindingsSearchRequest;
import com.datadog.api.client.v2.model.SecurityFindingsSearchRequestData;
import com.datadog.api.client.v2.model.SecurityFindingsSearchRequestDataAttributes;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityFindingsSearchRequest body =
        new SecurityFindingsSearchRequest()
            .data(
                new SecurityFindingsSearchRequestData()
                    .attributes(
                        new SecurityFindingsSearchRequestDataAttributes()
                            .filter("@severity:(critical OR high)")));

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
