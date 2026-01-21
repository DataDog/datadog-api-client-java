// Preview a rule query with applied filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleLivetailRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleLivetailResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeRead;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleLivetailRequest body =
        new SecurityMonitoringRuleLivetailRequest()
            .query("source:cloudtrail")
            .queryIndex(0)
            .type(SecurityMonitoringRuleTypeRead.LOG_DETECTION)
            .detectionMethod(SecurityMonitoringRuleDetectionMethod.THRESHOLD)
            .dataSource("logs");

    try {
      SecurityMonitoringRuleLivetailResponse result =
          apiInstance.previewSecurityMonitoringRuleQuery(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#previewSecurityMonitoringRuleQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
