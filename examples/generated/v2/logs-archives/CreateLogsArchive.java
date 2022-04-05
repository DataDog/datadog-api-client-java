import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);
        LogsArchiveCreateRequest body = new LogsArchiveCreateRequest(); // LogsArchiveCreateRequest | The definition of the new archive.
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
