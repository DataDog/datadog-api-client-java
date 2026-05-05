// Enable Storage Management for a bucket returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudInventorySyncConfigsApi;
import com.datadog.api.client.v2.model.CloudInventoryCloudProviderId;
import com.datadog.api.client.v2.model.CloudInventoryCloudProviderRequestType;
import com.datadog.api.client.v2.model.CloudInventorySyncConfigAWSRequestAttributes;
import com.datadog.api.client.v2.model.CloudInventorySyncConfigAzureRequestAttributes;
import com.datadog.api.client.v2.model.CloudInventorySyncConfigGCPRequestAttributes;
import com.datadog.api.client.v2.model.CloudInventorySyncConfigResponse;
import com.datadog.api.client.v2.model.UpsertCloudInventorySyncConfigRequest;
import com.datadog.api.client.v2.model.UpsertCloudInventorySyncConfigRequestAttributes;
import com.datadog.api.client.v2.model.UpsertCloudInventorySyncConfigRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.upsertSyncConfig", true);
    CloudInventorySyncConfigsApi apiInstance = new CloudInventorySyncConfigsApi(defaultClient);

    UpsertCloudInventorySyncConfigRequest body =
        new UpsertCloudInventorySyncConfigRequest()
            .data(
                new UpsertCloudInventorySyncConfigRequestData()
                    .attributes(
                        new UpsertCloudInventorySyncConfigRequestAttributes()
                            .aws(
                                new CloudInventorySyncConfigAWSRequestAttributes()
                                    .awsAccountId("123456789012")
                                    .destinationBucketName("my-inventory-bucket")
                                    .destinationBucketRegion("us-east-1")
                                    .destinationPrefix("logs/"))
                            .azure(
                                new CloudInventorySyncConfigAzureRequestAttributes()
                                    .clientId("11111111-1111-1111-1111-111111111111")
                                    .container("inventory-container")
                                    .resourceGroup("my-resource-group")
                                    .storageAccount("mystorageaccount")
                                    .subscriptionId("33333333-3333-3333-3333-333333333333")
                                    .tenantId("22222222-2222-2222-2222-222222222222"))
                            .gcp(
                                new CloudInventorySyncConfigGCPRequestAttributes()
                                    .destinationBucketName("my-inventory-reports")
                                    .projectId("my-gcp-project")
                                    .serviceAccountEmail(
                                        "reader@my-gcp-project.iam.gserviceaccount.com")
                                    .sourceBucketName("my-monitored-bucket")))
                    .id(CloudInventoryCloudProviderId.AWS)
                    .type(CloudInventoryCloudProviderRequestType.CLOUD_PROVIDER));

    try {
      CloudInventorySyncConfigResponse result = apiInstance.upsertSyncConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudInventorySyncConfigsApi#upsertSyncConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
