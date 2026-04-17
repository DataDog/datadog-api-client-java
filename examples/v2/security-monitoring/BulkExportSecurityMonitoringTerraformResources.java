// Export security monitoring resources to Terraform returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformBulkExportAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformBulkExportData;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformBulkExportRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringTerraformResourceType;
import java.io.File;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.bulkExportSecurityMonitoringTerraformResources", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "suppression" in the system
    String SUPPRESSION_DATA_ID = System.getenv("SUPPRESSION_DATA_ID");

    SecurityMonitoringTerraformBulkExportRequest body =
        new SecurityMonitoringTerraformBulkExportRequest()
            .data(
                new SecurityMonitoringTerraformBulkExportData()
                    .attributes(
                        new SecurityMonitoringTerraformBulkExportAttributes()
                            .resourceIds(Collections.singletonList(SUPPRESSION_DATA_ID)))
                    .type("bulk_export_resources"));

    try {
      File result =
          apiInstance.bulkExportSecurityMonitoringTerraformResources(
              SecurityMonitoringTerraformResourceType.SUPPRESSIONS, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#bulkExportSecurityMonitoringTerraformResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
