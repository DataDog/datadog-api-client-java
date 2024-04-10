// Create an AWS integration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.model.AWSAccount;
import com.datadog.api.client.v1.model.AWSAccountCreateResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSAccount body =
        new AWSAccount()
            .accountId("163662907100")
            .accountSpecificNamespaceRules(Map.ofEntries(Map.entry("auto_scaling", false)))
            .cspmResourceCollectionEnabled(true)
            .excludedRegions(Arrays.asList("us-east-1", "us-west-2"))
            .extendedResourceCollectionEnabled(true)
            .filterTags(Collections.singletonList("$KEY:$VALUE"))
            .hostTags(Collections.singletonList("$KEY:$VALUE"))
            .metricsCollectionEnabled(false)
            .roleName("DatadogAWSIntegrationRole");

    try {
      AWSAccountCreateResponse result = apiInstance.createAWSAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
