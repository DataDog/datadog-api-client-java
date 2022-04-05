import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);
    String ruleId = "ruleId_example"; // String | The ID of the rule.
    try {
      apiInstance.deleteSecurityMonitoringRule(ruleId);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#deleteSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
