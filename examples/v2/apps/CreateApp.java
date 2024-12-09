// Create App returns "App Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppsApi;
import com.datadog.api.client.v2.model.Component;
import com.datadog.api.client.v2.model.ComponentGrid;
import com.datadog.api.client.v2.model.ComponentGridProperties;
import com.datadog.api.client.v2.model.ComponentGridType;
import com.datadog.api.client.v2.model.ComponentProperties;
import com.datadog.api.client.v2.model.ComponentPropertiesIsVisible;
import com.datadog.api.client.v2.model.ComponentType;
import com.datadog.api.client.v2.model.CreateAppRequest;
import com.datadog.api.client.v2.model.CreateAppRequestData;
import com.datadog.api.client.v2.model.CreateAppRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateAppRequestDataType;
import com.datadog.api.client.v2.model.CreateAppResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createApp", true);
    AppsApi apiInstance = new AppsApi(defaultClient);

    CreateAppRequest body =
        new CreateAppRequest()
            .data(
                new CreateAppRequestData()
                    .attributes(
                        new CreateAppRequestDataAttributes()
                            .components(
                                Collections.singletonList(
                                    new ComponentGrid()
                                        .name("grid0")
                                        .properties(
                                            new ComponentGridProperties()
                                                .children(
                                                    Collections.singletonList(
                                                        new Component()
                                                            .name("gridCell0")
                                                            .properties(
                                                                new ComponentProperties()
                                                                    .children(
                                                                        Collections.singletonList(
                                                                            new Component()
                                                                                .name(
                                                                                    "calloutValue0")
                                                                                .properties(
                                                                                    new ComponentProperties()
                                                                                        .isVisible(
                                                                                            new ComponentPropertiesIsVisible(
                                                                                                true)))
                                                                                .type(
                                                                                    ComponentType
                                                                                        .CALLOUTVALUE)))
                                                                    .isVisible(
                                                                        new ComponentPropertiesIsVisible(
                                                                            "true")))
                                                            .type(ComponentType.GRIDCELL))))
                                        .type(ComponentGridType.GRID)))
                            .description("This is a simple example app")
                            .name("Example App")
                            .rootInstanceName("grid0"))
                    .type(CreateAppRequestDataType.APPDEFINITIONS));

    try {
      CreateAppResponse result = apiInstance.createApp(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#createApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
