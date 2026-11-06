// List archive configurations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumManagedArchivesApi;
import com.datadog.api.client.v2.api.RumManagedArchivesApi.ListRUMArchiveConfigsOptionalParameters;
import com.datadog.api.client.v2.model.RumArchiveConfigListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumManagedArchivesApi apiInstance = new RumManagedArchivesApi(defaultClient);

    try {
      RumArchiveConfigListResponse result =
          apiInstance.listRUMArchiveConfigs(
              new ListRUMArchiveConfigsOptionalParameters().pageNumber(0).pageSize(1));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumManagedArchivesApi#listRUMArchiveConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
