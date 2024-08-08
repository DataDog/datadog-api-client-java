// Update a powerpack returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.PowerpackApi;
import com.datadog.api.client.v2.model.PowerpackResponse;
import com.datadog.api.client.v2.model.Powerpack;
import com.datadog.api.client.v2.model.PowerpackAttributes;
import com.datadog.api.client.v2.model.PowerpackData;
import com.datadog.api.client.v2.model.PowerpackGroupWidget;
import com.datadog.api.client.v2.model.PowerpackGroupWidgetDefinition;
import com.datadog.api.client.v2.model.PowerpackGroupWidgetLayout;
import com.datadog.api.client.v2.model.PowerpackInnerWidgets;
import com.datadog.api.client.v2.model.PowerpackTemplateVariable;
import com.datadog.api.client.v2.model.WidgetLiveSpan;
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
    PowerpackApi apiInstance = new PowerpackApi(defaultClient);

    // there is a valid "powerpack" in the system
    String POWERPACK_DATA_ID = System.getenv("POWERPACK_DATA_ID");

    Powerpack body = new Powerpack()
.data(new PowerpackData()
.attributes(new PowerpackAttributes()
.description("Sample powerpack")
.groupWidget(new PowerpackGroupWidget()
.definition(new PowerpackGroupWidgetDefinition()
.layoutType("ordered")
.showTitle(true)
.title("Sample Powerpack")
.type("group")
.widgets(Collections.singletonList(new PowerpackInnerWidgets()
.definition(Map.ofEntries(Map.entry("content", "test"),Map.entry("type", "note"))))))
.layout(new PowerpackGroupWidgetLayout()
.height(3L)
.width(12L)
.x(0L)
.y(0L))
.liveSpan(WidgetLiveSpan.PAST_ONE_HOUR))
.name("Example-Powerpack")
.tags(Collections.singletonList("tag:sample"))
.templateVariables(Collections.singletonList(new PowerpackTemplateVariable()
.defaults(Collections.singletonList("*"))
.name("sample"))))
.type("powerpack"));

    try {
      PowerpackResponse result = apiInstance.updatePowerpack(POWERPACK_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PowerpackApi#updatePowerpack");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}