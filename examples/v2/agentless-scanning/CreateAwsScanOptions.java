// Create AWS scan options returns "Agentless scan options enabled successfully." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AwsScanOptionsCreateAttributes;
import com.datadog.api.client.v2.model.AwsScanOptionsCreateData;
import com.datadog.api.client.v2.model.AwsScanOptionsCreateRequest;
import com.datadog.api.client.v2.model.AwsScanOptionsResponse;
import com.datadog.api.client.v2.model.AwsScanOptionsType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    AwsScanOptionsCreateRequest body =
        new AwsScanOptionsCreateRequest()
            .data(
                new AwsScanOptionsCreateData()
                    .id("000000000003")
                    .type(AwsScanOptionsType.AWS_SCAN_OPTIONS)
                    .attributes(
                        new AwsScanOptionsCreateAttributes()
                            .lambda(true)
                            .sensitiveData(false)
                            .vulnContainersOs(true)
                            .vulnHostOs(true)));

    try {
      AwsScanOptionsResponse result = apiInstance.createAwsScanOptions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#createAwsScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
