// Create or update service definition returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceDefinitionApi;
import com.datadog.api.client.v2.model.ServiceDefinitionCreateResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Contact;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Integrations;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Link;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Opsgenie;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2OpsgenieRegion;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Pagerduty;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Version;
import com.datadog.api.client.v2.model.ServiceDefinitionsCreateRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceDefinitionApi apiInstance = new ServiceDefinitionApi(defaultClient);

    ServiceDefinitionsCreateRequest body =
        new ServiceDefinitionsCreateRequest(
            new ServiceDefinitionV2Dot2()
                .application("my-app")
                .ciPipelineFingerprints(Arrays.asList("j88xdEy0J5lc", "eZ7LMljCk8vo"))
                .contacts(
                    Collections.singletonList(
                        new ServiceDefinitionV2Dot2Contact()
                            .contact("https://teams.microsoft.com/myteam")
                            .name("My team channel")
                            .type("slack")))
                .ddService("my-service")
                .description("My service description")
                .extensions(Map.ofEntries(Map.entry("myorg/extension", "extensionValue")))
                .integrations(
                    new ServiceDefinitionV2Dot2Integrations()
                        .opsgenie(
                            new ServiceDefinitionV2Dot2Opsgenie()
                                .region(ServiceDefinitionV2Dot2OpsgenieRegion.US)
                                .serviceUrl(
                                    "https://my-org.opsgenie.com/service/123e4567-e89b-12d3-a456-426614174000"))
                        .pagerduty(
                            new ServiceDefinitionV2Dot2Pagerduty()
                                .serviceUrl(
                                    "https://my-org.pagerduty.com/service-directory/PMyService")))
                .languages(
                    Arrays.asList("dotnet", "go", "java", "js", "php", "python", "ruby", "c++"))
                .lifecycle("sandbox")
                .links(
                    Collections.singletonList(
                        new ServiceDefinitionV2Dot2Link()
                            .name("Runbook")
                            .provider("Github")
                            .type("runbook")
                            .url("https://my-runbook")))
                .schemaVersion(ServiceDefinitionV2Dot2Version.V2_2)
                .tags(Arrays.asList("my:tag", "service:tag"))
                .team("my-team")
                .tier("High")
                .type("web"));

    try {
      ServiceDefinitionCreateResponse result = apiInstance.createOrUpdateServiceDefinitions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceDefinitionApi#createOrUpdateServiceDefinitions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
