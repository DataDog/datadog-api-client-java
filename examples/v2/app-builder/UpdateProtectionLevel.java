// Update App Protection Level returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.AppProtectionLevel;
import com.datadog.api.client.v2.model.AppProtectionLevelType;
import com.datadog.api.client.v2.model.UpdateAppProtectionLevelRequest;
import com.datadog.api.client.v2.model.UpdateAppProtectionLevelRequestData;
import com.datadog.api.client.v2.model.UpdateAppProtectionLevelRequestDataAttributes;
import com.datadog.api.client.v2.model.UpdateAppResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    UpdateAppProtectionLevelRequest body =
        new UpdateAppProtectionLevelRequest()
            .data(
                new UpdateAppProtectionLevelRequestData()
                    .attributes(
                        new UpdateAppProtectionLevelRequestDataAttributes()
                            .protectionLevel(AppProtectionLevel.APPROVAL_REQUIRED))
                    .type(AppProtectionLevelType.PROTECTIONLEVEL));

    try {
      UpdateAppResponse result =
          apiInstance.updateProtectionLevel(
              UUID.fromString("65bb1f25-52e1-4510-9f8d-22d1516ed693"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#updateProtectionLevel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
