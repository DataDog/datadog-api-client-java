// Delete rows returns "Rows deleted successfully" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.BatchDeleteRowsRequestArray;
import com.datadog.api.client.v2.model.BatchDeleteRowsRequestData;
import com.datadog.api.client.v2.model.TableRowResourceDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReferenceTablesApi apiInstance = new ReferenceTablesApi(defaultClient);

    BatchDeleteRowsRequestArray body =
        new BatchDeleteRowsRequestArray()
            .data(
                Collections.singletonList(
                    new BatchDeleteRowsRequestData()
                        .id("primary_key_value")
                        .type(TableRowResourceDataType.ROW)));

    try {
      apiInstance.deleteRows("id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceTablesApi#deleteRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
