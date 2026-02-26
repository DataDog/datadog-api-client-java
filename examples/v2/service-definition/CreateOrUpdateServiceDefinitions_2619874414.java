// Create or update service definition using schema v2-1 returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceDefinitionApi;
import com.datadog.api.client.v2.model.ServiceDefinitionCreateResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1Contact;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1Email;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1EmailType;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1Integrations;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1Link;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1LinkType;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1Opsgenie;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1OpsgenieRegion;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1Pagerduty;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot1Version;
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
            new ServiceDefinitionV2Dot1()
                .contacts(
                    Collections.singletonList(
                        new ServiceDefinitionV2Dot1Contact(
                            new ServiceDefinitionV2Dot1Email()
                                .contact("contact@datadoghq.com")
                                .name("Team Email")
                                .type(ServiceDefinitionV2Dot1EmailType.EMAIL))))
                .ddService("service-exampleservicedefinition")
                .extensions(Map.ofEntries(Map.entry("myorgextension", "extensionvalue")))
                .integrations(
                    new ServiceDefinitionV2Dot1Integrations()
                        .opsgenie(
                            new ServiceDefinitionV2Dot1Opsgenie()
                                .region(ServiceDefinitionV2Dot1OpsgenieRegion.US)
                                .serviceUrl(
                                    "https://my-org.opsgenie.com/service/123e4567-e89b-12d3-a456-426614174000"))
                        .pagerduty(
                            new ServiceDefinitionV2Dot1Pagerduty()
                                .serviceUrl(
                                    "https://my-org.pagerduty.com/service-directory/PMyService")))
                .links(
                    Arrays.asList(
                        new ServiceDefinitionV2Dot1Link()
                            .name("Runbook")
                            .type(ServiceDefinitionV2Dot1LinkType.RUNBOOK)
                            .url("https://my-runbook"),
                        new ServiceDefinitionV2Dot1Link()
                            .name("Source Code")
                            .type(ServiceDefinitionV2Dot1LinkType.REPO)
                            .provider("GitHub")
                            .url("https://github.com/DataDog/schema"),
                        new ServiceDefinitionV2Dot1Link()
                            .name("Architecture")
                            .type(ServiceDefinitionV2Dot1LinkType.DOC)
                            .provider("Gigoogle drivetHub")
                            .url("https://my-runbook")))
                .schemaVersion(ServiceDefinitionV2Dot1Version.V2_1)
                .tags(Arrays.asList("my:tag", "service:tag"))
                .team("my-team"));

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
