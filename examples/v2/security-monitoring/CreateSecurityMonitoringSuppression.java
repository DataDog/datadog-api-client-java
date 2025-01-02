// Create a suppression rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSuppressionCreateRequest body =
        new SecurityMonitoringSuppressionCreateRequest()
            .data(
                new SecurityMonitoringSuppressionCreateData()
                    .attributes(
                        new SecurityMonitoringSuppressionCreateAttributes()
                            .description(
                                "This rule suppresses low-severity signals in staging"
                                    + " environments.")
                            .enabled(true)
                            .startDate(1637493071000L)
                            .expirationDate(1638443471000L)
                            .name("Example-Security-Monitoring")
                            .ruleQuery("type:log_detection source:cloudtrail")
                            .suppressionQuery("env:staging status:low"))
                    .type(SecurityMonitoringSuppressionType.SUPPRESSIONS));

    try {
      SecurityMonitoringSuppressionResponse result =
          apiInstance.createSecurityMonitoringSuppression(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityMonitoringSuppression");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
