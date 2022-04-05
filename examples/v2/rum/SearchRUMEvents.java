// Search RUM events returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RumApi;
import com.datadog.api.v2.client.model.RUMEventsResponse;
import com.datadog.api.v2.client.model.RUMQueryFilter;
import com.datadog.api.v2.client.model.RUMQueryOptions;
import com.datadog.api.v2.client.model.RUMQueryPageOptions;
import com.datadog.api.v2.client.model.RUMSearchEventsRequest;
import com.datadog.api.v2.client.model.RUMSort;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    RUMSearchEventsRequest body =
        new RUMSearchEventsRequest()
            .filter(
                new RUMQueryFilter()
                    .from("now-15m")
                    .query("@type:session AND @session.type:user")
                    .to("now"))
            .options(new RUMQueryOptions().timeOffset(0L).timezone("GMT"))
            .page(new RUMQueryPageOptions().limit(25))
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
