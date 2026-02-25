// Update Google Cloud Usage Cost config returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.GCPUsageCostConfigResponse;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPatchData;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPatchRequest;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPatchRequestAttributes;
import com.datadog.api.client.v2.model.GCPUsageCostConfigPatchRequestType;
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

    GCPUsageCostConfigPatchRequest body = new GCPUsageCostConfigPatchRequest()
.data(new GCPUsageCostConfigPatchData()
.attributes(new GCPUsageCostConfigPatchRequestAttributes()
.isEnabled(true))
.type(GCPUsageCostConfigPatchRequestType.GCP_USAGE_COST_CONFIG_PATCH_REQUEST));

    try {
      GCPUsageCostConfigResponse result = apiInstance.updateCostGCPUsageCostConfig(100L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateCostGCPUsageCostConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}