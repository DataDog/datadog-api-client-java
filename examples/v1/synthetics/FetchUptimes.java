// Fetch uptime for multiple tests returns "OK." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsTestUptime;
import com.datadog.api.client.v1.model.SyntheticsFetchUptimesPayload;
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
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsFetchUptimesPayload body = new SyntheticsFetchUptimesPayload()
.fromTs(1726041488L)
.publicIds(Collections.singletonList("p8m-9gw-nte"))
.toTs(1726055954L);

    try {
      List<SyntheticsTestUptime> result = apiInstance.fetchUptimes(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#fetchUptimes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}