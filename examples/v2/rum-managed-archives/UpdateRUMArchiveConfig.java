// Create or update an archive configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumManagedArchivesApi;
import com.datadog.api.client.v2.model.RumArchiveConfigResponse;
import com.datadog.api.client.v2.model.RumArchiveConfigType;
import com.datadog.api.client.v2.model.RumArchiveConfigUpsertAttributes;
import com.datadog.api.client.v2.model.RumArchiveConfigUpsertData;
import com.datadog.api.client.v2.model.RumArchiveConfigUpsertRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumManagedArchivesApi apiInstance = new RumManagedArchivesApi(defaultClient);

    RumArchiveConfigUpsertRequest body =
        new RumArchiveConfigUpsertRequest()
            .data(
                new RumArchiveConfigUpsertData()
                    .attributes(
                        new RumArchiveConfigUpsertAttributes().enabled(true).retentionDays(90))
                    .id("a33671aa-24fd-4dcd-ba4b-5bbdbafe7690")
                    .type(RumArchiveConfigType.RUM_ARCHIVE_CONFIG));

    try {
      RumArchiveConfigResponse result =
          apiInstance.updateRUMArchiveConfig(
              UUID.fromString("a33671aa-24fd-4dcd-ba4b-5bbdbafe7690"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumManagedArchivesApi#updateRUMArchiveConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
