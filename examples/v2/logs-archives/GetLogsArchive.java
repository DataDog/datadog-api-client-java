// Get an archive returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsArchivesApi;
import com.datadog.api.client.v2.model.LogsArchive;

public class GetLogsArchive {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);

    try {
      LogsArchive result = apiInstance.getLogsArchive("archive_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchivesApi#getLogsArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
