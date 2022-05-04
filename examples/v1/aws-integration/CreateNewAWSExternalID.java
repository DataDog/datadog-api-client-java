// Generate a new external ID returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsIntegrationApi;
import com.datadog.api.v1.client.model.AWSAccount;
import com.datadog.api.v1.client.model.AWSAccountCreateResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSAccount body =
        new AWSAccount()
            .accountId("1234567")
            .accountSpecificNamespaceRules(
                Map.ofEntries(Map.entry("auto_scaling", false), Map.entry("opswork", false)))
            .cspmResourceCollectionEnabled(true)
            .excludedRegions(Arrays.asList("us-east-1", "us-west-2"))
            .filterTags(Collections.singletonList("$KEY:$VALUE"))
            .hostTags(Collections.singletonList("$KEY:$VALUE"))
            .metricsCollectionEnabled(false)
            .resourceCollectionEnabled(true)
            .roleName("DatadogAWSIntegrationRole");

    try {
      AWSAccountCreateResponse result = apiInstance.createNewAWSExternalID(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createNewAWSExternalID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
