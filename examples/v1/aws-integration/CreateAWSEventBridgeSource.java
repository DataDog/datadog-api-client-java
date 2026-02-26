// Create an Amazon EventBridge source returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.model.AWSEventBridgeCreateRequest;
import com.datadog.api.client.v1.model.AWSEventBridgeCreateResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSEventBridgeCreateRequest body =
        new AWSEventBridgeCreateRequest()
            .accountId("123456789012")
            .createEventBus(true)
            .eventGeneratorName("app-alerts")
            .region("us-east-1");

    try {
      AWSEventBridgeCreateResponse result = apiInstance.createAWSEventBridgeSource(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createAWSEventBridgeSource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
