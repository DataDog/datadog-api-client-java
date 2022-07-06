// Update an AWS integration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.api.AwsIntegrationApi.UpdateAWSAccountOptionalParameters;
import com.datadog.api.client.v1.model.AWSAccount;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class UpdateAWSAccount {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSAccount body =
        new AWSAccount()
            .accountId("123456789012")
            .accountSpecificNamespaceRules(Map.ofEntries(Map.entry("auto_scaling", false)))
            .cspmResourceCollectionEnabled(true)
            .excludedRegions(Arrays.asList("us-east-1", "us-west-2"))
            .filterTags(Collections.singletonList("$KEY:$VALUE"))
            .hostTags(Collections.singletonList("$KEY:$VALUE"))
            .metricsCollectionEnabled(false)
            .resourceCollectionEnabled(true)
            .roleName("datadog-role");

    try {
      apiInstance.updateAWSAccount(
          body,
          new UpdateAWSAccountOptionalParameters()
              .accountId("123456789012")
              .roleName("datadog-role"));
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#updateAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
