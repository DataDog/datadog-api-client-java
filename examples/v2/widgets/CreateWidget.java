// Create a widget returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.WidgetsApi;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequest;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestAttributes;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestData;
import com.datadog.api.client.v2.model.WidgetDefinition;
import com.datadog.api.client.v2.model.WidgetExperienceType;
import com.datadog.api.client.v2.model.WidgetResponse;
import com.datadog.api.client.v2.model.WidgetType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WidgetsApi apiInstance = new WidgetsApi(defaultClient);

    CreateOrUpdateWidgetRequest body =
        new CreateOrUpdateWidgetRequest()
            .data(
                new CreateOrUpdateWidgetRequestData()
                    .attributes(
                        new CreateOrUpdateWidgetRequestAttributes()
                            .definition(
                                new WidgetDefinition()
                                    .title("My Widget")
                                    .type(WidgetType.BAR_CHART)))
                    .type("widgets"));

    try {
      WidgetResponse result = apiInstance.createWidget(WidgetExperienceType.CCM_REPORTS, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WidgetsApi#createWidget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
