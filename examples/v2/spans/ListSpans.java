// Search spans returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SpansApi;
import com.datadog.api.client.v2.model.SpansListResponse;
import com.datadog.api.client.v2.model.SpansListRequest;
import com.datadog.api.client.v2.model.SpansListRequestAttributes;
import com.datadog.api.client.v2.model.SpansListRequestData;
import com.datadog.api.client.v2.model.SpansListRequestPage;
import com.datadog.api.client.v2.model.SpansListRequestType;
import com.datadog.api.client.v2.model.SpansQueryFilter;
import com.datadog.api.client.v2.model.SpansQueryOptions;
import com.datadog.api.client.v2.model.SpansSort;
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
    SpansApi apiInstance = new SpansApi(defaultClient);

    SpansListRequest body = new SpansListRequest()
.data(new SpansListRequestData()
.attributes(new SpansListRequestAttributes()
.filter(new SpansQueryFilter()
.from("now-15m")
.query("*")
.to("now"))
.options(new SpansQueryOptions()
.timezone("GMT"))
.page(new SpansListRequestPage()
.limit(25))
.sort(SpansSort.TIMESTAMP_ASCENDING))
.type(SpansListRequestType.SEARCH_REQUEST));

    try {
      SpansListResponse result = apiInstance.listSpans(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpansApi#listSpans");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}