// Create or update service definition using schema v2-2 returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceDefinitionApi;
import com.datadog.api.client.v2.model.ServiceDefinitionCreateResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionsCreateRequest;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Contact;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Integrations;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Link;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Opsgenie;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2OpsgenieRegion;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Pagerduty;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Dot2Version;
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
    ServiceDefinitionApi apiInstance = new ServiceDefinitionApi(defaultClient);

    ServiceDefinitionsCreateRequest body = new ServiceDefinitionsCreateRequest(
new ServiceDefinitionV2Dot2()
.contacts(Collections.singletonList(new ServiceDefinitionV2Dot2Contact()
.contact("contact@datadoghq.com")
.name("Team Email")
.type("email")))
.ddService("service-exampleservicedefinition")
.extensions(Map.ofEntries(Map.entry("myorgextension", "extensionvalue")))
.integrations(new ServiceDefinitionV2Dot2Integrations()
.opsgenie(new ServiceDefinitionV2Dot2Opsgenie()
.region(ServiceDefinitionV2Dot2OpsgenieRegion.US)
.serviceUrl("https://my-org.opsgenie.com/service/123e4567-e89b-12d3-a456-426614174000"))
.pagerduty(new ServiceDefinitionV2Dot2Pagerduty()
.serviceUrl("https://my-org.pagerduty.com/service-directory/PMyService")))
.links(Arrays.asList(new ServiceDefinitionV2Dot2Link()
.name("Runbook")
.type("runbook")
.url("https://my-runbook"), new ServiceDefinitionV2Dot2Link()
.name("Source Code")
.type("repo")
.provider("GitHub")
.url("https://github.com/DataDog/schema"), new ServiceDefinitionV2Dot2Link()
.name("Architecture")
.type("doc")
.provider("Gigoogle drivetHub")
.url("https://my-runbook")))
.schemaVersion(ServiceDefinitionV2Dot2Version.V2_2)
.tags(Arrays.asList("my:tag", "service:tag"))
.team("my-team"));

    try {
      ServiceDefinitionCreateResponse result = apiInstance.createOrUpdateServiceDefinitions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#createOrUpdateServiceDefinitions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}