// Update an AWS integration returns "AWS Account object" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSAccountResponse;
import com.datadog.api.client.v2.model.AWSAccountPartition;
import com.datadog.api.client.v2.model.AWSAccountType;
import com.datadog.api.client.v2.model.AWSAccountUpdateRequest;
import com.datadog.api.client.v2.model.AWSAccountUpdateRequestAttributes;
import com.datadog.api.client.v2.model.AWSAccountUpdateRequestData;
import com.datadog.api.client.v2.model.AWSAuthConfig;
import com.datadog.api.client.v2.model.AWSAuthConfigRole;
import com.datadog.api.client.v2.model.AWSLambdaForwarderConfig;
import com.datadog.api.client.v2.model.AWSLambdaForwarderConfigLogSourceConfig;
import com.datadog.api.client.v2.model.AWSLogsConfig;
import com.datadog.api.client.v2.model.AWSLogSourceTagFilter;
import com.datadog.api.client.v2.model.AWSMetricsConfig;
import com.datadog.api.client.v2.model.AWSNamespaceTagFilter;
import com.datadog.api.client.v2.model.AWSResourcesConfig;
import com.datadog.api.client.v2.model.AWSTracesConfig;
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

    // there is a valid "aws_account_v2" in the system
    String AWS_ACCOUNT_V2_DATA_ID = System.getenv("AWS_ACCOUNT_V2_DATA_ID");

    AWSAccountUpdateRequest body = new AWSAccountUpdateRequest()
.data(new AWSAccountUpdateRequestData()
.attributes(new AWSAccountUpdateRequestAttributes()
.accountTags(Collections.singletonList("key:value"))
.authConfig(new AWSAuthConfig(
new AWSAuthConfigRole()
.roleName("DatadogIntegrationRole")))
.awsAccountId("123456789012")
.awsPartition(AWSAccountPartition.AWS)
.logsConfig(new AWSLogsConfig()
.lambdaForwarder(new AWSLambdaForwarderConfig()
.lambdas(Collections.singletonList("arn:aws:lambda:us-east-1:123456789012:function:DatadogLambdaLogForwarder"))
.logSourceConfig(new AWSLambdaForwarderConfigLogSourceConfig()
.tagFilters(Collections.singletonList(new AWSLogSourceTagFilter()
.source("s3")
.tags(Collections.singletonList("test:test")))))
.sources(Collections.singletonList("s3"))))
.metricsConfig(new AWSMetricsConfig()
.automuteEnabled(true)
.collectCloudwatchAlarms(true)
.collectCustomMetrics(true)
.enabled(true)
.tagFilters(Collections.singletonList(new AWSNamespaceTagFilter()
.namespace("AWS/EC2")
.tags(Collections.singletonList("key:value")))))
.resourcesConfig(new AWSResourcesConfig()
.cloudSecurityPostureManagementCollection(false)
.extendedCollection(false))
.tracesConfig(new AWSTracesConfig()))
.type(AWSAccountType.ACCOUNT));

    try {
      AWSAccountResponse result = apiInstance.updateAWSAccount(AWS_ACCOUNT_V2_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#updateAWSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}