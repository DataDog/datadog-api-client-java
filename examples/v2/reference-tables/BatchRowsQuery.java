// Batch rows query returns "Successfully retrieved rows. Some or all requested rows were found. Response includes found
// rows in the included section." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.BatchRowsQueryResponse;
import com.datadog.api.client.v2.model.BatchRowsQueryDataType;
import com.datadog.api.client.v2.model.BatchRowsQueryRequest;
import com.datadog.api.client.v2.model.BatchRowsQueryRequestData;
import com.datadog.api.client.v2.model.BatchRowsQueryRequestDataAttributes;
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

    BatchRowsQueryRequest body = new BatchRowsQueryRequest()
.data(new BatchRowsQueryRequestData()
.attributes(new BatchRowsQueryRequestDataAttributes()
.rowIds(Arrays.asList("row_id_1", "row_id_2"))
.tableId("00000000-0000-0000-0000-000000000000"))
.type(BatchRowsQueryDataType.REFERENCE_TABLES_BATCH_ROWS_QUERY));

    try {
      BatchRowsQueryResponse result = apiInstance.batchRowsQuery(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceTablesApi#batchRowsQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}