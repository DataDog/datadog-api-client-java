// Get a widget returns "Successful Response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WidgetsApi;
import com.datadog.api.client.v2.model.WidgetExperienceType;
import com.datadog.api.client.v2.model.WidgetSchemaJSONAPIDocument;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WidgetsApi apiInstance = new WidgetsApi(defaultClient);

    try {
      WidgetSchemaJSONAPIDocument result =
          apiInstance.getWidgetApiV2WidgetsExperienceTypeUuidGet(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              WidgetExperienceType.CCM_REPORTS);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WidgetsApi#getWidgetApiV2WidgetsExperienceTypeUuidGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
