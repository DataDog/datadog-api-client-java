// Delete Multiple Apps returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppsApi;
import com.datadog.api.client.v2.model.DeleteAppsRequest;
import com.datadog.api.client.v2.model.DeleteAppsRequestDataItems;
import com.datadog.api.client.v2.model.DeleteAppsRequestDataItemsType;
import com.datadog.api.client.v2.model.DeleteAppsResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteApps", true);
    AppsApi apiInstance = new AppsApi(defaultClient);

    // there is a valid "app" in the system
    String APP_DATA_ID = System.getenv("APP_DATA_ID");

    DeleteAppsRequest body =
        new DeleteAppsRequest()
            .data(
                Collections.singletonList(
                    new DeleteAppsRequestDataItems()
                        .id(APP_DATA_ID)
                        .type(DeleteAppsRequestDataItemsType.APPDEFINITIONS)));

    try {
      DeleteAppsResponse result = apiInstance.deleteApps(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#deleteApps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
