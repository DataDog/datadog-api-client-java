// Search widgets returns "Successful Response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WidgetsApi;
import com.datadog.api.client.v2.model.WidgetExperienceType;
import com.datadog.api.client.v2.model.WidgetSchemaJSONAPIListDocument;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WidgetsApi apiInstance = new WidgetsApi(defaultClient);

    try {
      WidgetSchemaJSONAPIListDocument result =
          apiInstance.searchWidgetsApiV2WidgetsExperienceTypeGet(WidgetExperienceType.CCM_REPORTS);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling WidgetsApi#searchWidgetsApiV2WidgetsExperienceTypeGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
