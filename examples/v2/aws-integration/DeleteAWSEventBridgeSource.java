// Delete an Amazon EventBridge source returns "Amazon EventBridge source deleted." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSEventBridgeDeleteRequest;
import com.datadog.api.client.v2.model.AWSEventBridgeDeleteRequestAttributes;
import com.datadog.api.client.v2.model.AWSEventBridgeDeleteRequestData;
import com.datadog.api.client.v2.model.AWSEventBridgeDeleteResponse;
import com.datadog.api.client.v2.model.AWSEventBridgeType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSEventBridgeDeleteRequest body =
        new AWSEventBridgeDeleteRequest()
            .data(
                new AWSEventBridgeDeleteRequestData()
                    .attributes(
                        new AWSEventBridgeDeleteRequestAttributes()
                            .accountId("123456789012")
                            .eventGeneratorName("app-alerts-zyxw3210")
                            .region("us-east-1"))
                    .type(AWSEventBridgeType.EVENT_BRIDGE));

    try {
      AWSEventBridgeDeleteResponse result = apiInstance.deleteAWSEventBridgeSource(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#deleteAWSEventBridgeSource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
