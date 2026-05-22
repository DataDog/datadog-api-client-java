// Create or update entity integration configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EntityIntegrationConfigsApi;
import com.datadog.api.client.v2.model.EntityIntegrationConfigRequest;
import com.datadog.api.client.v2.model.EntityIntegrationConfigRequestAttributes;
import com.datadog.api.client.v2.model.EntityIntegrationConfigRequestData;
import com.datadog.api.client.v2.model.EntityIntegrationConfigRequestType;
import com.datadog.api.client.v2.model.EntityIntegrationConfigResponse;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateEntityIntegrationConfig", true);
    EntityIntegrationConfigsApi apiInstance = new EntityIntegrationConfigsApi(defaultClient);

    EntityIntegrationConfigRequest body =
        new EntityIntegrationConfigRequest()
            .data(
                new EntityIntegrationConfigRequestData()
                    .attributes(
                        new EntityIntegrationConfigRequestAttributes()
                            .config(
                                Map.ofEntries(
                                    Map.entry(
                                        "enabled_repos",
                                        "[{'github_org_name': 'myorg', 'hostname': 'github.com',"
                                            + " 'repo_name': 'myrepo'}]"))))
                    .type(EntityIntegrationConfigRequestType.ENTITY_INTEGRATION_CONFIG_REQUESTS));

    try {
      EntityIntegrationConfigResponse result =
          apiInstance.updateEntityIntegrationConfig("github", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling EntityIntegrationConfigsApi#updateEntityIntegrationConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
