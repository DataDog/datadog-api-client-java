// Generate a new external ID returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.model.AWSAccountCreateResponse;
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
.accountId("123456789012")
.accountSpecificNamespaceRules(Map.ofEntries(Map.entry("auto_scaling", false),Map.entry("opswork", false)))
.cspmResourceCollectionEnabled(true)
.excludedRegions(Arrays.asList("us-east-1", "us-west-2"))
.extendedResourceCollectionEnabled(true)
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