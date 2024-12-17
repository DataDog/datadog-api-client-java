// Update App returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppsApi;
import com.datadog.api.client.v2.model.UpdateAppRequest;
import com.datadog.api.client.v2.model.UpdateAppRequestData;
import com.datadog.api.client.v2.model.UpdateAppRequestDataAttributes;
import com.datadog.api.client.v2.model.UpdateAppRequestDataType;
import com.datadog.api.client.v2.model.UpdateAppResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateApp", true);
    AppsApi apiInstance = new AppsApi(defaultClient);

    // there is a valid "app" in the system
    String APP_DATA_ID = System.getenv("APP_DATA_ID");

    UpdateAppRequest body =
        new UpdateAppRequest()
            .data(
                new UpdateAppRequestData()
                    .attributes(
                        new UpdateAppRequestDataAttributes()
                            .name("Updated Name")
                            .rootInstanceName("grid0"))
                    .id(APP_DATA_ID)
                    .type(UpdateAppRequestDataType.APPDEFINITIONS));

    try {
      UpdateAppResponse result = apiInstance.updateApp(APP_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#updateApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
