// Update App Self-Service Status returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.AppSelfServiceType;
import com.datadog.api.client.v2.model.UpdateAppSelfServiceRequest;
import com.datadog.api.client.v2.model.UpdateAppSelfServiceRequestData;
import com.datadog.api.client.v2.model.UpdateAppSelfServiceRequestDataAttributes;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    UpdateAppSelfServiceRequest body =
        new UpdateAppSelfServiceRequest()
            .data(
                new UpdateAppSelfServiceRequestData()
                    .attributes(new UpdateAppSelfServiceRequestDataAttributes().selfService(true))
                    .type(AppSelfServiceType.SELFSERVICE));

    try {
      apiInstance.updateAppSelfService(
          UUID.fromString("65bb1f25-52e1-4510-9f8d-22d1516ed693"), body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#updateAppSelfService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
