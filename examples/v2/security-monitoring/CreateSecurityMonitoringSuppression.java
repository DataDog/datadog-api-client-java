// Create a suppression rule returns "OK" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionType;
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

    SecurityMonitoringSuppressionCreateRequest body = new SecurityMonitoringSuppressionCreateRequest()
.data(new SecurityMonitoringSuppressionCreateData()
.attributes(new SecurityMonitoringSuppressionCreateAttributes()
.description("This rule suppresses low-severity signals in staging environments.")
.enabled(true)
.startDate(1637493071000L)
.expirationDate(1638443471000L)
.name("Example-Security-Monitoring")
.ruleQuery("type:log_detection source:cloudtrail")
.suppressionQuery("env:staging status:low")
.tags(Arrays.asList("technique:T1110-brute-force", "source:cloudtrail")))
.type(SecurityMonitoringSuppressionType.SUPPRESSIONS));

    try {
      SecurityMonitoringSuppressionResponse result = apiInstance.createSecurityMonitoringSuppression(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createSecurityMonitoringSuppression");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}