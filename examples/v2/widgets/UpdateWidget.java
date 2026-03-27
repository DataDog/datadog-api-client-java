// Update a widget returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.WidgetsApi;
import com.datadog.api.client.v2.model.WidgetResponse;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequest;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestAttributes;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestData;
import com.datadog.api.client.v2.model.WidgetDefinition;
import com.datadog.api.client.v2.model.WidgetExperienceType;
import com.datadog.api.client.v2.model.WidgetType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WidgetsApi apiInstance = new WidgetsApi(defaultClient);

    CreateOrUpdateWidgetRequest body = new CreateOrUpdateWidgetRequest()
.data(new CreateOrUpdateWidgetRequestData()
.attributes(new CreateOrUpdateWidgetRequestAttributes()
.definition(new WidgetDefinition()
.title("My Widget")
.type(WidgetType.BAR_CHART)))
.type("widgets"));

    try {
      WidgetResponse result = apiInstance.updateWidget(WidgetExperienceType.CCM_REPORTS, UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WidgetsApi#updateWidget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}