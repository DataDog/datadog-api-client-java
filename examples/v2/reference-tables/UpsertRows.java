// Upsert rows returns "Rows created or updated successfully" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.BatchUpsertRowsRequestArray;
import com.datadog.api.client.v2.model.BatchUpsertRowsRequestData;
import com.datadog.api.client.v2.model.BatchUpsertRowsRequestDataAttributes;
import com.datadog.api.client.v2.model.TableRowResourceDataType;
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
    ReferenceTablesApi apiInstance = new ReferenceTablesApi(defaultClient);

    BatchUpsertRowsRequestArray body = new BatchUpsertRowsRequestArray()
.data(Collections.singletonList(new BatchUpsertRowsRequestData()
.attributes(new BatchUpsertRowsRequestDataAttributes()
.values(Map.ofEntries()))
.id("primary_key_value")
.type(TableRowResourceDataType.ROW)));

    try {
      apiInstance.upsertRows("id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceTablesApi#upsertRows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}