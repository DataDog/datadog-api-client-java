// Update an archive returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsArchivesApi;
import com.datadog.api.v2.client.model.LogsArchive;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequest;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestAttributes;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestDefinition;
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestDestination;
import com.datadog.api.v2.client.model.LogsArchiveDestinationAzure;
import com.datadog.api.v2.client.model.LogsArchiveDestinationAzureType;
import com.datadog.api.v2.client.model.LogsArchiveIntegrationAzure;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);

    LogsArchiveCreateRequest body =
        new LogsArchiveCreateRequest()
            .data(
                new LogsArchiveCreateRequestDefinition()
                    .attributes(
                        new LogsArchiveCreateRequestAttributes()
                            .destination(
                                new LogsArchiveCreateRequestDestination(
                                    new LogsArchiveDestinationAzure()
                                        .container("container-name")
                                        .integration(
                                            new LogsArchiveIntegrationAzure()
                                                .clientId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa")
                                                .tenantId("aaaaaaaa-1a1a-1a1a-1a1a-aaaaaaaaaaaa"))
                                        .storageAccount("account-name")
                                        .type(LogsArchiveDestinationAzureType.AZURE)))
                            .includeTags(false)
                            .name("Nginx Archive")
                            .query("source:nginx")
                            .rehydrationMaxScanSizeInGb(100L)
                            .rehydrationTags(Arrays.asList("team:intake", "team:app")))
                    .type("archives"));

    try {
      LogsArchive result = apiInstance.updateLogsArchive("archive_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchivesApi#updateLogsArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
