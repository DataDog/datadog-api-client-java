// Create Cloud Cost Management Azure configs returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.AzureUCConfigPairsResponse;
import com.datadog.api.client.v2.model.AzureUCConfigPostData;
import com.datadog.api.client.v2.model.AzureUCConfigPostRequest;
import com.datadog.api.client.v2.model.AzureUCConfigPostRequestAttributes;
import com.datadog.api.client.v2.model.AzureUCConfigPostRequestType;
import com.datadog.api.client.v2.model.BillConfig;
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

    AzureUCConfigPostRequest body = new AzureUCConfigPostRequest()
.data(new AzureUCConfigPostData()
.attributes(new AzureUCConfigPostRequestAttributes()
.accountId("1234abcd-1234-abcd-1234-1234abcd1234")
.actualBillConfig(new BillConfig()
.exportName("dd-actual-export")
.exportPath("dd-export-path")
.storageAccount("dd-storage-account")
.storageContainer("dd-storage-container"))
.amortizedBillConfig(new BillConfig()
.exportName("dd-actual-export")
.exportPath("dd-export-path")
.storageAccount("dd-storage-account")
.storageContainer("dd-storage-container"))
.clientId("1234abcd-1234-abcd-1234-1234abcd1234")
.scope("subscriptions/1234abcd-1234-abcd-1234-1234abcd1234"))
.type(AzureUCConfigPostRequestType.AZURE_UC_CONFIG_POST_REQUEST));

    try {
      AzureUCConfigPairsResponse result = apiInstance.createCostAzureUCConfigs(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#createCostAzureUCConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}