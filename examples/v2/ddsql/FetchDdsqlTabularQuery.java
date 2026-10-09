// Fetch the result of a DDSQL query returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DdsqlApi;
import com.datadog.api.client.v2.model.DdsqlTabularQueryFetchRequest;
import com.datadog.api.client.v2.model.DdsqlTabularQueryFetchRequestAttributes;
import com.datadog.api.client.v2.model.DdsqlTabularQueryFetchRequestData;
import com.datadog.api.client.v2.model.DdsqlTabularQueryFetchRequestType;
import com.datadog.api.client.v2.model.DdsqlTabularQueryResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DdsqlApi apiInstance = new DdsqlApi(defaultClient);

    DdsqlTabularQueryFetchRequest body =
        new DdsqlTabularQueryFetchRequest()
            .data(
                new DdsqlTabularQueryFetchRequestData()
                    .attributes(
                        new DdsqlTabularQueryFetchRequestAttributes()
                            .queryId("eyJxdWVyeSI6ICJTRUxFQ1QgKiBGUk9NIGxvZ3MifQ=="))
                    .type(DdsqlTabularQueryFetchRequestType.DDSQL_QUERY_FETCH_REQUEST));

    try {
      DdsqlTabularQueryResponse result = apiInstance.fetchDdsqlTabularQuery(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DdsqlApi#fetchDdsqlTabularQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
