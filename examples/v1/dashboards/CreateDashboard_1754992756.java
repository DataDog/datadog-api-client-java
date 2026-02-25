// Create a new dashboard with powerpack widget

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.PowerpackTemplateVariableContents;
import com.datadog.api.client.v1.model.PowerpackTemplateVariables;
import com.datadog.api.client.v1.model.PowerpackWidgetDefinition;
import com.datadog.api.client.v1.model.PowerpackWidgetDefinitionType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
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
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "powerpack" in the system
    String POWERPACK_DATA_ID = System.getenv("POWERPACK_DATA_ID");

    Dashboard body = new Dashboard()
.title("Example-Dashboard with powerpack widget")
.layoutType(DashboardLayoutType.ORDERED)
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new PowerpackWidgetDefinition()
.type(PowerpackWidgetDefinitionType.POWERPACK)
.powerpackId(POWERPACK_DATA_ID)
.templateVariables(new PowerpackTemplateVariables()
.controlledByPowerpack(Collections.singletonList(new PowerpackTemplateVariableContents()
.name("foo")
.prefix("bar")
.values(Arrays.asList("baz", "qux", "quuz")))))))
.layout(new WidgetLayout()
.x(1L)
.y(1L)
.width(2L)
.height(2L)
.isColumnBreak(false))))
.description("description");

    try {
      Dashboard result = apiInstance.createDashboard(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#createDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}