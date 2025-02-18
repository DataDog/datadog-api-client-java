// Create or update entities returns "ACCEPTED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.model.EntityV3;
import com.datadog.api.client.v2.model.EntityV3APIVersion;
import com.datadog.api.client.v2.model.EntityV3DatadogCodeLocationItem;
import com.datadog.api.client.v2.model.EntityV3DatadogEventItem;
import com.datadog.api.client.v2.model.EntityV3DatadogIntegrationOpsgenie;
import com.datadog.api.client.v2.model.EntityV3DatadogIntegrationPagerduty;
import com.datadog.api.client.v2.model.EntityV3DatadogLogItem;
import com.datadog.api.client.v2.model.EntityV3DatadogPerformance;
import com.datadog.api.client.v2.model.EntityV3DatadogPipelines;
import com.datadog.api.client.v2.model.EntityV3Integrations;
import com.datadog.api.client.v2.model.EntityV3Metadata;
import com.datadog.api.client.v2.model.EntityV3MetadataAdditionalOwnersItems;
import com.datadog.api.client.v2.model.EntityV3MetadataContactsItems;
import com.datadog.api.client.v2.model.EntityV3MetadataLinksItems;
import com.datadog.api.client.v2.model.EntityV3Service;
import com.datadog.api.client.v2.model.EntityV3ServiceDatadog;
import com.datadog.api.client.v2.model.EntityV3ServiceKind;
import com.datadog.api.client.v2.model.EntityV3ServiceSpec;
import com.datadog.api.client.v2.model.UpsertCatalogEntityRequest;
import com.datadog.api.client.v2.model.UpsertCatalogEntityResponse;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    UpsertCatalogEntityRequest body =
        new UpsertCatalogEntityRequest(
            new EntityV3(
                new EntityV3Service()
                    .apiVersion(EntityV3APIVersion.V3)
                    .datadog(
                        new EntityV3ServiceDatadog()
                            .codeLocations(
                                Collections.singletonList(new EntityV3DatadogCodeLocationItem()))
                            .events(Collections.singletonList(new EntityV3DatadogEventItem()))
                            .logs(Collections.singletonList(new EntityV3DatadogLogItem()))
                            .performanceData(new EntityV3DatadogPerformance())
                            .pipelines(new EntityV3DatadogPipelines()))
                    .integrations(
                        new EntityV3Integrations()
                            .opsgenie(
                                new EntityV3DatadogIntegrationOpsgenie()
                                    .serviceUrl("https://www.opsgenie.com/service/shopping-cart"))
                            .pagerduty(
                                new EntityV3DatadogIntegrationPagerduty()
                                    .serviceUrl(
                                        "https://www.pagerduty.com/service-directory/Pshopping-cart")))
                    .kind(EntityV3ServiceKind.SERVICE)
                    .metadata(
                        new EntityV3Metadata()
                            .additionalOwners(
                                Collections.singletonList(
                                    new EntityV3MetadataAdditionalOwnersItems().name("")))
                            .contacts(
                                Collections.singletonList(
                                    new EntityV3MetadataContactsItems()
                                        .contact("https://slack/")
                                        .type("slack")))
                            .id("4b163705-23c0-4573-b2fb-f6cea2163fcb")
                            .inheritFrom("application:default/myapp")
                            .links(
                                Collections.singletonList(
                                    new EntityV3MetadataLinksItems()
                                        .name("mylink")
                                        .type("link")
                                        .url("https://mylink")))
                            .name("myService")
                            .namespace("default")
                            .tags(Arrays.asList("this:tag", "that:tag")))
                    .spec(new EntityV3ServiceSpec())));

    try {
      UpsertCatalogEntityResponse result = apiInstance.upsertCatalogEntity(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#upsertCatalogEntity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
