// Validate a suppression rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionType;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSuppressionUpdateRequest body =
        new SecurityMonitoringSuppressionUpdateRequest()
            .data(
                new SecurityMonitoringSuppressionUpdateData()
                    .attributes(
                        new SecurityMonitoringSuppressionUpdateAttributes()
                            .dataExclusionQuery("source:cloudtrail account_id:12345")
                            .description(
                                "This rule suppresses low-severity signals in staging"
                                    + " environments.")
                            .enabled(true)
                            .name("Custom suppression")
                            .ruleQuery("type:log_detection source:cloudtrail"))
                    .type(SecurityMonitoringSuppressionType.SUPPRESSIONS));

    try {
      apiInstance.validateSecurityMonitoringSuppression(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#validateSecurityMonitoringSuppression");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
