// Create a geomap widget using an event_list request

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DashboardReflowType;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.GeomapWidgetDefinition;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionStyle;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionType;
import com.datadog.api.client.v1.model.GeomapWidgetDefinitionView;
import com.datadog.api.client.v1.model.GeomapWidgetRequest;
import com.datadog.api.client.v1.model.ListStreamColumn;
import com.datadog.api.client.v1.model.ListStreamColumnWidth;
import com.datadog.api.client.v1.model.ListStreamQuery;
import com.datadog.api.client.v1.model.ListStreamSource;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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

    Dashboard body = new Dashboard()
.title("Example-Dashboard")
.description("Example-Dashboard")
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new GeomapWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.type(GeomapWidgetDefinitionType.GEOMAP)
.requests(Collections.singletonList(new GeomapWidgetRequest()
.responseFormat(FormulaAndFunctionResponseFormat.EVENT_LIST)
.query(new ListStreamQuery()
.dataSource(ListStreamSource.LOGS_STREAM)
.queryString(""))
.columns(Arrays.asList(new ListStreamColumn()
.field("@network.client.geoip.location.latitude")
.width(ListStreamColumnWidth.AUTO), new ListStreamColumn()
.field("@network.client.geoip.location.longitude")
.width(ListStreamColumnWidth.AUTO), new ListStreamColumn()
.field("@network.client.geoip.country.iso_code")
.width(ListStreamColumnWidth.AUTO), new ListStreamColumn()
.field("@network.client.geoip.subdivision.name")
.width(ListStreamColumnWidth.AUTO), new ListStreamColumn()
.field("classic")
.width(ListStreamColumnWidth.AUTO), new ListStreamColumn()
.field("")
.width(ListStreamColumnWidth.AUTO)))))
.style(new GeomapWidgetDefinitionStyle()
.palette("hostmap_blues")
.paletteFlip(false))
.view(new GeomapWidgetDefinitionView()
.focus("WORLD"))))
.layout(new WidgetLayout()
.x(0L)
.y(0L)
.width(12L)
.height(6L))))
.layoutType(DashboardLayoutType.ORDERED)
.reflowType(DashboardReflowType.FIXED);

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