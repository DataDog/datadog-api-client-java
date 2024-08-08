// Search RUM events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMEventsResponse;
import com.datadog.api.client.v2.model.RUMQueryFilter;
import com.datadog.api.client.v2.model.RUMQueryOptions;
import com.datadog.api.client.v2.model.RUMQueryPageOptions;
import com.datadog.api.client.v2.model.RUMSearchEventsRequest;
import com.datadog.api.client.v2.model.RUMSort;
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
    RumApi apiInstance = new RumApi(defaultClient);

    RUMSearchEventsRequest body = new RUMSearchEventsRequest()
.filter(new RUMQueryFilter()
.from("now-15m")
.query("@type:session AND @session.type:user")
.to("now"))
.options(new RUMQueryOptions()
.timeOffset(0L)
.timezone("GMT"))
.page(new RUMQueryPageOptions()
.limit(25))
.sort(RUMSort.TIMESTAMP_ASCENDING);

    try {
      RUMEventsResponse result = apiInstance.searchRUMEvents(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#searchRUMEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}