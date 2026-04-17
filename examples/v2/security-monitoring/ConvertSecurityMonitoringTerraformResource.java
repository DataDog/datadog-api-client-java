// Convert security monitoring resource to Terraform returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformConvertAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformConvertData;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformConvertRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformExportResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformResourceType;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.convertSecurityMonitoringTerraformResource", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringTerraformConvertRequest body =
        new SecurityMonitoringTerraformConvertRequest()
            .data(
                new SecurityMonitoringTerraformConvertData()
                    .type("convert_resource")
                    .id("abc-123")
                    .attributes(
                        new SecurityMonitoringTerraformConvertAttributes()
                            .resourceJson(
                                Map.ofEntries(
                                    Map.entry("enabled", "True"),
                                    Map.entry("name", "Example-Security-Monitoring"),
                                    Map.entry("rule_query", "source:cloudtrail"),
                                    Map.entry("suppression_query", "env:test")))));

    try {
      SecurityMonitoringTerraformExportResponse result =
          apiInstance.convertSecurityMonitoringTerraformResource(
              SecurityMonitoringTerraformResourceType.SUPPRESSIONS, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#convertSecurityMonitoringTerraformResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
