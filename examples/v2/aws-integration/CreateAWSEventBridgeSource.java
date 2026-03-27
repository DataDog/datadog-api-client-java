// Create an Amazon EventBridge source returns "Amazon EventBridge source created." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSEventBridgeCreateResponse;
import com.datadog.api.client.v2.model.AWSEventBridgeCreateRequest;
import com.datadog.api.client.v2.model.AWSEventBridgeCreateRequestAttributes;
import com.datadog.api.client.v2.model.AWSEventBridgeCreateRequestData;
import com.datadog.api.client.v2.model.AWSEventBridgeType;
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
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSEventBridgeCreateRequest body = new AWSEventBridgeCreateRequest()
.data(new AWSEventBridgeCreateRequestData()
.attributes(new AWSEventBridgeCreateRequestAttributes()
.accountId("123456789012")
.createEventBus(true)
.eventGeneratorName("app-alerts")
.region("us-east-1"))
.type(AWSEventBridgeType.EVENT_BRIDGE));

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