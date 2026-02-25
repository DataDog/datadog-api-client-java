// Create Google Cloud Usage Cost config returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.GCPUsageCostConfigResponse;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPostData;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPostRequest;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPostRequestAttributes;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPostRequestType;
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
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    GCPUsageCostConfigPostRequest body = new GCPUsageCostConfigPostRequest()
.data(new GCPUsageCostConfigPostData()
.attributes(new GCPUsageCostConfigPostRequestAttributes()
.billingAccountId("123456_A123BC_12AB34")
.bucketName("dd-cost-bucket")
.exportDatasetName("billing")
.exportPrefix("datadog_cloud_cost_usage_export")
.exportProjectName("dd-cloud-cost-report")
.serviceAccount("dd-ccm-gcp-integration@my-environment.iam.gserviceaccount.com"))
.type(GCPUsageCostConfigPostRequestType.GCP_USAGE_COST_CONFIG_POST_REQUEST));

    try {
      GCPUsageCostConfigResponse result = apiInstance.createCostGCPUsageCostConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#createCostGCPUsageCostConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}