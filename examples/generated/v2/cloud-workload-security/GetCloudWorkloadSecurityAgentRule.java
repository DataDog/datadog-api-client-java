import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        String agentRuleId = "3b5-v82-ns6"; // String | The ID of the Agent rule.
        try {
            CloudWorkloadSecurityAgentRuleResponse result = apiInstance.getCloudWorkloadSecurityAgentRule(agentRuleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#getCloudWorkloadSecurityAgentRule");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
