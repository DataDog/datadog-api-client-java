// Create or update service definition using schema v2 returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceDefinitionApi;
import com.datadog.api.client.v2.model.ServiceDefinitionCreateResponse;
import com.datadog.api.client.v2.model.ServiceDefinitionsCreateRequest;
import com.datadog.api.client.v2.model.ServiceDefinitionV2;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Contact;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Doc;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Email;
import com.datadog.api.client.v2.model.ServiceDefinitionV2EmailType;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Integrations;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Link;
import com.datadog.api.client.v2.model.ServiceDefinitionV2LinkType;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Opsgenie;
import com.datadog.api.client.v2.model.ServiceDefinitionV2OpsgenieRegion;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Repo;
import com.datadog.api.client.v2.model.ServiceDefinitionV2Version;
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
new ServiceDefinitionV2()
.contacts(Collections.singletonList(new ServiceDefinitionV2Contact(
new ServiceDefinitionV2Email()
.contact("contact@datadoghq.com")
.name("Team Email")
.type(ServiceDefinitionV2EmailType.EMAIL))))
.ddService("service-exampleservicedefinition")
.ddTeam("my-team")
.docs(Collections.singletonList(new ServiceDefinitionV2Doc()
.name("Architecture")
.provider("google drive")
.url("https://gdrive/mydoc")))
.extensions(Map.ofEntries(Map.entry("myorgextension", "extensionvalue")))
.integrations(new ServiceDefinitionV2Integrations()
.opsgenie(new ServiceDefinitionV2Opsgenie()
.region(ServiceDefinitionV2OpsgenieRegion.US)
.serviceUrl("https://my-org.opsgenie.com/service/123e4567-e89b-12d3-a456-426614174000"))
.pagerduty("https://my-org.pagerduty.com/service-directory/PMyService"))
.links(Collections.singletonList(new ServiceDefinitionV2Link()
.name("Runbook")
.type(ServiceDefinitionV2LinkType.RUNBOOK)
.url("https://my-runbook")))
.repos(Collections.singletonList(new ServiceDefinitionV2Repo()
.name("Source Code")
.provider("GitHub")
.url("https://github.com/DataDog/schema")))
.schemaVersion(ServiceDefinitionV2Version.V2)
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