// Create an archive returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsArchivesApi;
import com.datadog.api.client.v2.model.LogsArchive;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequest;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequestAttributes;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequestDefinition;
import com.datadog.api.client.v2.model.LogsArchiveCreateRequestDestination;
import com.datadog.api.client.v2.model.LogsArchiveDestinationAzure;
import com.datadog.api.client.v2.model.LogsArchiveDestinationAzureType;
import com.datadog.api.client.v2.model.LogsArchiveIntegrationAzure;
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
    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);

    LogsArchiveCreateRequest body = new LogsArchiveCreateRequest()
.data(new LogsArchiveCreateRequestDefinition()
.attributes(new LogsArchiveCreateRequestAttributes()
.destination(new LogsArchiveCreateRequestDestination(
new LogsArchiveDestinationAzure()
.container("container-name")
.integration(new LogsArchiveIntegrationAzure()
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
      LogsArchive result = apiInstance.createLogsArchive(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchivesApi#createLogsArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}