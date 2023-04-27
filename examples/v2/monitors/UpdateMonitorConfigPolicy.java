// Edit a monitor configuration policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorConfigPolicyAttributeEditRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyEditData;
import com.datadog.api.client.v2.model.MonitorConfigPolicyEditRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyPolicy;
import com.datadog.api.client.v2.model.MonitorConfigPolicyResourceType;
import com.datadog.api.client.v2.model.MonitorConfigPolicyResponse;
import com.datadog.api.client.v2.model.MonitorConfigPolicyTagPolicy;
import com.datadog.api.client.v2.model.MonitorConfigPolicyType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor_configuration_policy" in the system
    String MONITOR_CONFIGURATION_POLICY_DATA_ID =
        System.getenv("MONITOR_CONFIGURATION_POLICY_DATA_ID");

    MonitorConfigPolicyEditRequest body =
        new MonitorConfigPolicyEditRequest()
            .data(
                new MonitorConfigPolicyEditData()
                    .attributes(
                        new MonitorConfigPolicyAttributeEditRequest()
                            .policy(
                                new MonitorConfigPolicyPolicy(
                                    new MonitorConfigPolicyTagPolicy()
                                        .tagKey("examplemonitor")
                                        .tagKeyRequired(false)
                                        .validTagValues(Arrays.asList("prod", "staging"))))
                            .policyType(MonitorConfigPolicyType.TAG))
                    .id(MONITOR_CONFIGURATION_POLICY_DATA_ID)
                    .type(MonitorConfigPolicyResourceType.MONITOR_CONFIG_POLICY));

    try {
      MonitorConfigPolicyResponse result =
          apiInstance.updateMonitorConfigPolicy(MONITOR_CONFIGURATION_POLICY_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#updateMonitorConfigPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
