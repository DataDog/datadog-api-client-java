// Name App Version returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.AppVersionNameType;
import com.datadog.api.client.v2.model.UpdateAppVersionNameRequest;
import com.datadog.api.client.v2.model.UpdateAppVersionNameRequestData;
import com.datadog.api.client.v2.model.UpdateAppVersionNameRequestDataAttributes;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    // there is a valid "app" in the system
    UUID APP_DATA_ID = null;
    try {
      APP_DATA_ID = UUID.fromString(System.getenv("APP_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateAppVersionNameRequest body =
        new UpdateAppVersionNameRequest()
            .data(
                new UpdateAppVersionNameRequestData()
                    .attributes(
                        new UpdateAppVersionNameRequestDataAttributes()
                            .name("v1.2.0 - bug fix release"))
                    .type(AppVersionNameType.VERSIONNAMES));

    try {
      apiInstance.updateAppVersionName(APP_DATA_ID, "latest", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#updateAppVersionName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
