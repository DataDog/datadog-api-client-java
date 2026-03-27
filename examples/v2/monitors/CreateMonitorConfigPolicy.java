// Create a monitor configuration policy returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorConfigPolicyResponse;
import com.datadog.api.client.v2.model.MonitorConfigPolicyAttributeCreateRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyCreateData;
import com.datadog.api.client.v2.model.MonitorConfigPolicyCreateRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyPolicyCreateRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyResourceType;
import com.datadog.api.client.v2.model.MonitorConfigPolicyTagPolicyCreateRequest;
import com.datadog.api.client.v2.model.MonitorConfigPolicyType;
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
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    MonitorConfigPolicyCreateRequest body = new MonitorConfigPolicyCreateRequest()
.data(new MonitorConfigPolicyCreateData()
.attributes(new MonitorConfigPolicyAttributeCreateRequest()
.policyType(MonitorConfigPolicyType.TAG)
.policy(new MonitorConfigPolicyPolicyCreateRequest(
new MonitorConfigPolicyTagPolicyCreateRequest()
.tagKey("examplemonitor")
.tagKeyRequired(false)
.validTagValues(Arrays.asList("prod", "staging")))))
.type(MonitorConfigPolicyResourceType.MONITOR_CONFIG_POLICY));

    try {
      MonitorConfigPolicyResponse result = apiInstance.createMonitorConfigPolicy(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#createMonitorConfigPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}