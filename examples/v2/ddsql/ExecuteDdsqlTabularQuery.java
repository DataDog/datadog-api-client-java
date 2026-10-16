// Execute a tabular DDSQL query returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DdsqlApi;
import com.datadog.api.client.v2.model.DdsqlTabularQueryRequest;
import com.datadog.api.client.v2.model.DdsqlTabularQueryRequestAttributes;
import com.datadog.api.client.v2.model.DdsqlTabularQueryRequestData;
import com.datadog.api.client.v2.model.DdsqlTabularQueryRequestType;
import com.datadog.api.client.v2.model.DdsqlTabularQueryResponse;
import com.datadog.api.client.v2.model.DdsqlTabularQueryTimeWindow;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DdsqlApi apiInstance = new DdsqlApi(defaultClient);

    DdsqlTabularQueryRequest body =
        new DdsqlTabularQueryRequest()
            .data(
                new DdsqlTabularQueryRequestData()
                    .attributes(
                        new DdsqlTabularQueryRequestAttributes()
                            .query(
                                "SELECT cloud_provider, count(*) FROM dd.hosts group by"
                                    + " cloud_provider")
                            .rowLimit(1000L)
                            .time(
                                new DdsqlTabularQueryTimeWindow()
                                    .fromTimestamp(1736942400000L)
                                    .toTimestamp(1736946000000L)))
                    .type(DdsqlTabularQueryRequestType.DDSQL_QUERY_REQUEST));

    try {
      DdsqlTabularQueryResponse result = apiInstance.executeDdsqlTabularQuery(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DdsqlApi#executeDdsqlTabularQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
