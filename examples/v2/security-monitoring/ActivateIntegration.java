// Activate an entity context sync integration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ActivateIntegrationOptionalParameters;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationActivateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationActivateData;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationActivateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationActivateResourceType;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResponse;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.activateIntegration", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringIntegrationActivateRequest body =
        new SecurityMonitoringIntegrationActivateRequest()
            .data(
                new SecurityMonitoringIntegrationActivateData()
                    .attributes(
                        new SecurityMonitoringIntegrationActivateAttributes()
                            .domain("default")
                            .name("My Entra ID Integration")
                            .settings(Map.ofEntries(Map.entry("setting1", "value1"))))
                    .type(
                        SecurityMonitoringIntegrationActivateResourceType
                            .ACTIVATE_ENTRA_ID_REQUEST));

    try {
      SecurityMonitoringIntegrationConfigResponse result =
          apiInstance.activateIntegration(
              "entra_id", new ActivateIntegrationOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#activateIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
