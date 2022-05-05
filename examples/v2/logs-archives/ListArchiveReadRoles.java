// List read roles for an archive returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsArchivesApi;
import com.datadog.api.v2.client.model.RolesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);

    try {
      RolesResponse result = apiInstance.listArchiveReadRoles("archive_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchivesApi#listArchiveReadRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
