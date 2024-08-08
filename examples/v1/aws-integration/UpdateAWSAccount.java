// Update an AWS integration returns "OK" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.api.AwsIntegrationApi.UpdateAWSAccountOptionalParameters;
import com.datadog.api.client.v1.model.AWSAccount;
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

    AWSAccount body = new AWSAccount()
.accountId("163662907100")
.accountSpecificNamespaceRules(Map.ofEntries(Map.entry("auto_scaling", false)))
.cspmResourceCollectionEnabled(false)
.excludedRegions(Arrays.asList("us-east-1", "us-west-2"))
.extendedResourceCollectionEnabled(true)
.filterTags(Collections.singletonList("$KEY:$VALUE"))
.hostTags(Collections.singletonList("$KEY:$VALUE"))
.metricsCollectionEnabled(true)
.roleName("DatadogAWSIntegrationRole");

    try {
      apiInstance.updateAWSAccount(body,new UpdateAWSAccountOptionalParameters().accountId("163662907100").roleName("DatadogAWSIntegrationRole"));
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#updateAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}