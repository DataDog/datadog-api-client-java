import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsArchivesApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
    String archiveId = "archiveId_example"; // String | The ID of the archive.
    LogsArchiveCreateRequest body =
        new LogsArchiveCreateRequest(); // LogsArchiveCreateRequest | New definition of the archive.
    try {
      LogsArchive result = apiInstance.updateLogsArchive(archiveId, body);
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
