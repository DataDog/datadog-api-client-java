// Update Cloud Cost Management Azure config returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.AzureUCConfigPairsResponse;
import com.datadog.api.client.v2.model.AzureUCConfigPatchData;
import com.datadog.api.client.v2.model.AzureUCConfigPatchRequest;
import com.datadog.api.client.v2.model.AzureUCConfigPatchRequestAttributes;
import com.datadog.api.client.v2.model.AzureUCConfigPatchRequestType;
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

    AzureUCConfigPatchRequest body = new AzureUCConfigPatchRequest()
.data(new AzureUCConfigPatchData()
.attributes(new AzureUCConfigPatchRequestAttributes()
.isEnabled(true))
.type(AzureUCConfigPatchRequestType.AZURE_UC_CONFIG_PATCH_REQUEST));

    try {
      AzureUCConfigPairsResponse result = apiInstance.updateCostAzureUCConfigs(100L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateCostAzureUCConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}