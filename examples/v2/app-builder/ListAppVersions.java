// List App Versions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.ListAppVersionsResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    try {
      ListAppVersionsResponse result =
          apiInstance.listAppVersions(UUID.fromString("65bb1f25-52e1-4510-9f8d-22d1516ed693"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#listAppVersions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
