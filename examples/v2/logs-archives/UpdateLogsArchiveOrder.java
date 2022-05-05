// Update archive order returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsArchivesApi;
import com.datadog.api.v2.client.model.LogsArchiveOrder;
import com.datadog.api.v2.client.model.LogsArchiveOrderAttributes;
import com.datadog.api.v2.client.model.LogsArchiveOrderDefinition;
import com.datadog.api.v2.client.model.LogsArchiveOrderDefinitionType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);

    LogsArchiveOrder body =
        new LogsArchiveOrder()
            .data(
                new LogsArchiveOrderDefinition()
                    .attributes(
                        new LogsArchiveOrderAttributes()
                            .archiveIds(
                                Arrays.asList(
                                    "a2zcMylnM4OCHpYusxIi1g",
                                    "a2zcMylnM4OCHpYusxIi2g",
                                    "a2zcMylnM4OCHpYusxIi3g")))
                    .type(LogsArchiveOrderDefinitionType.ARCHIVE_ORDER));

    try {
      LogsArchiveOrder result = apiInstance.updateLogsArchiveOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchivesApi#updateLogsArchiveOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
