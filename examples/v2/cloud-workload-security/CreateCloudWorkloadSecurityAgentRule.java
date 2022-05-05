// Create a Cloud Workload Security Agent rule returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleCreateAttributes;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleCreateData;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleCreateRequest;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleResponse;
import com.datadog.api.v2.client.model.CloudWorkloadSecurityAgentRuleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);

    CloudWorkloadSecurityAgentRuleCreateRequest body =
        new CloudWorkloadSecurityAgentRuleCreateRequest()
            .data(
                new CloudWorkloadSecurityAgentRuleCreateData()
                    .attributes(
                        new CloudWorkloadSecurityAgentRuleCreateAttributes()
                            .description("Test Agent rule")
                            .enabled(true)
                            .expression("""
exec.file.name == "sh"
""")
                            .name("examplecreateacloudworkloadsecurityagentrulereturnsokresponse"))
                    .type(CloudWorkloadSecurityAgentRuleType.AGENT_RULE));

    try {
      CloudWorkloadSecurityAgentRuleResponse result =
          apiInstance.createCloudWorkloadSecurityAgentRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudWorkloadSecurityApi#createCloudWorkloadSecurityAgentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
