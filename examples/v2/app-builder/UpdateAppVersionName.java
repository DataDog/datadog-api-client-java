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

    UpdateAppVersionNameRequest body =
        new UpdateAppVersionNameRequest()
            .data(
                new UpdateAppVersionNameRequestData()
                    .attributes(
                        new UpdateAppVersionNameRequestDataAttributes()
                            .name("v1.2.0 - bug fix release"))
                    .type(AppVersionNameType.VERSIONNAMES));

    try {
      apiInstance.updateAppVersionName(
          UUID.fromString("65bb1f25-52e1-4510-9f8d-22d1516ed693"), "3", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#updateAppVersionName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
