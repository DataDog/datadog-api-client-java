// Revert a form to a prior version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FormsApi;
import com.datadog.api.client.v2.model.FormVersionResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.revertFormVersion", true);
    FormsApi apiInstance = new FormsApi(defaultClient);

    try {
      FormVersionResponse result =
          apiInstance.revertFormVersion(
              UUID.fromString("22f6006a-2302-4926-9396-d2dfcf7b0b34"), 1L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#revertFormVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
