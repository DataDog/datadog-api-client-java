// Get All Containers returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ContainersApi;
import com.datadog.api.client.v2.model.ContainersResponse;
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
    ContainersApi apiInstance = new ContainersApi(defaultClient);

    try {
      ContainersResponse result = apiInstance.listContainers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainersApi#listContainers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}