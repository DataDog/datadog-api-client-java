// Create or update an archive configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumManagedArchivesApi;
import com.datadog.api.client.v2.model.RUMArchiveConfigResponse;
import com.datadog.api.client.v2.model.RUMArchiveConfigType;
import com.datadog.api.client.v2.model.RUMArchiveConfigUpsertAttributes;
import com.datadog.api.client.v2.model.RUMArchiveConfigUpsertData;
import com.datadog.api.client.v2.model.RUMArchiveConfigUpsertRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumManagedArchivesApi apiInstance = new RumManagedArchivesApi(defaultClient);

    RUMArchiveConfigUpsertRequest body =
        new RUMArchiveConfigUpsertRequest()
            .data(
                new RUMArchiveConfigUpsertData()
                    .attributes(
                        new RUMArchiveConfigUpsertAttributes().enabled(true).retentionDays(90))
                    .id("a33671aa-24fd-4dcd-ba4b-5bbdbafe7690")
                    .type(RUMArchiveConfigType.RUM_ARCHIVE_CONFIG));

    try {
      RUMArchiveConfigResponse result =
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
