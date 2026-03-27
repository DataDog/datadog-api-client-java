// Create App returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.ActionQuery;
import com.datadog.api.client.v2.model.ActionQueryProperties;
import com.datadog.api.client.v2.model.ActionQuerySpec;
import com.datadog.api.client.v2.model.ActionQuerySpecInputs;
import com.datadog.api.client.v2.model.ActionQuerySpecObject;
import com.datadog.api.client.v2.model.ActionQueryType;
import com.datadog.api.client.v2.model.AppBuilderEvent;
import com.datadog.api.client.v2.model.AppBuilderEventName;
import com.datadog.api.client.v2.model.AppBuilderEventType;
import com.datadog.api.client.v2.model.AppDefinitionType;
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
import com.datadog.api.client.v2.model.CreateAppResponse;
import com.datadog.api.client.v2.model.DataTransform;
import com.datadog.api.client.v2.model.DataTransformProperties;
import com.datadog.api.client.v2.model.DataTransformType;
import com.datadog.api.client.v2.model.Query;
import com.datadog.api.client.v2.model.StateVariable;
import com.datadog.api.client.v2.model.StateVariableProperties;
import com.datadog.api.client.v2.model.StateVariableType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    CreateAppRequest body =
        new CreateAppRequest()
            .data(
                new CreateAppRequestData()
                    .type(AppDefinitionType.APPDEFINITIONS)
                    .attributes(
                        new CreateAppRequestDataAttributes()
                            .rootInstanceName("grid0")
                            .components(
                                Collections.singletonList(
                                    new ComponentGrid()
                                        .name("grid0")
                                        .type(ComponentGridType.GRID)
                                        .properties(
                                            new ComponentGridProperties()
                                                .children(
                                                    Arrays.asList(
                                                        new Component()
                                                            .type(ComponentType.GRIDCELL)
                                                            .name("gridCell0")
                                                            .properties(
                                                                new ComponentProperties()
                                                                    .children(
                                                                        Collections.singletonList(
                                                                            new Component()
                                                                                .name("text0")
                                                                                .type(
                                                                                    ComponentType
                                                                                        .TEXT)
                                                                                .properties(
                                                                                    new ComponentProperties()
                                                                                        .isVisible(
                                                                                            new ComponentPropertiesIsVisible(
                                                                                                true)))))
                                                                    .isVisible(
                                                                        new ComponentPropertiesIsVisible(
                                                                            "true"))),
                                                        new Component()
                                                            .type(ComponentType.GRIDCELL)
                                                            .name("gridCell2")
                                                            .properties(
                                                                new ComponentProperties()
                                                                    .children(
                                                                        Collections.singletonList(
                                                                            new Component()
                                                                                .name("table0")
                                                                                .type(
                                                                                    ComponentType
                                                                                        .TABLE)
                                                                                .properties(
                                                                                    new ComponentProperties()
                                                                                        .isVisible(
                                                                                            new ComponentPropertiesIsVisible(
                                                                                                true)))))
                                                                    .isVisible(
                                                                        new ComponentPropertiesIsVisible(
                                                                            "true"))),
                                                        new Component()
                                                            .type(ComponentType.GRIDCELL)
                                                            .name("gridCell1")
                                                            .properties(
                                                                new ComponentProperties()
                                                                    .children(
                                                                        Collections.singletonList(
                                                                            new Component()
                                                                                .name("text1")
                                                                                .type(
                                                                                    ComponentType
                                                                                        .TEXT)
                                                                                .properties(
                                                                                    new ComponentProperties()
                                                                                        .isVisible(
                                                                                            new ComponentPropertiesIsVisible(
                                                                                                true)))))
                                                                    .isVisible(
                                                                        new ComponentPropertiesIsVisible(
                                                                            "true"))),
                                                        new Component()
                                                            .type(ComponentType.GRIDCELL)
                                                            .name("gridCell3")
                                                            .properties(
                                                                new ComponentProperties()
                                                                    .children(
                                                                        Collections.singletonList(
                                                                            new Component()
                                                                                .name("button0")
                                                                                .type(
                                                                                    ComponentType
                                                                                        .BUTTON)
                                                                                .properties(
                                                                                    new ComponentProperties()
                                                                                        .isVisible(
                                                                                            new ComponentPropertiesIsVisible(
                                                                                                true)))
                                                                                .events(
                                                                                    Collections
                                                                                        .singletonList(
                                                                                            new AppBuilderEvent()
                                                                                                .name(
                                                                                                    AppBuilderEventName
                                                                                                        .CLICK)
                                                                                                .type(
                                                                                                    AppBuilderEventType
                                                                                                        .SETSTATEVARIABLEVALUE)))))
                                                                    .isVisible(
                                                                        new ComponentPropertiesIsVisible(
                                                                            "true"))),
                                                        new Component()
                                                            .type(ComponentType.GRIDCELL)
                                                            .name("gridCell4")
                                                            .properties(
                                                                new ComponentProperties()
                                                                    .children(
                                                                        Collections.singletonList(
                                                                            new Component()
                                                                                .name("button1")
                                                                                .type(
                                                                                    ComponentType
                                                                                        .BUTTON)
                                                                                .properties(
                                                                                    new ComponentProperties()
                                                                                        .isVisible(
                                                                                            new ComponentPropertiesIsVisible(
                                                                                                true)))
                                                                                .events(
                                                                                    Collections
                                                                                        .singletonList(
                                                                                            new AppBuilderEvent()
                                                                                                .name(
                                                                                                    AppBuilderEventName
                                                                                                        .CLICK)
                                                                                                .type(
                                                                                                    AppBuilderEventType
                                                                                                        .SETSTATEVARIABLEVALUE)))))
                                                                    .isVisible(
                                                                        new ComponentPropertiesIsVisible(
                                                                            "true")))))
                                                .backgroundColor("default"))))
                            .queries(
                                Arrays.asList(
                                    new Query(
                                        new ActionQuery()
                                            .id(
                                                UUID.fromString(
                                                    "92ff0bb8-553b-4f31-87c7-ef5bd16d47d5"))
                                            .type(ActionQueryType.ACTION)
                                            .name("fetchFacts")
                                            .properties(
                                                new ActionQueryProperties()
                                                    .spec(
                                                        new ActionQuerySpec(
                                                            new ActionQuerySpecObject()
                                                                .fqn("com.datadoghq.http.request")
                                                                .connectionId(
                                                                    "5e63f4a8-4ce6-47de-ba11-f6617c1d54f3")
                                                                .inputs(
                                                                    new ActionQuerySpecInputs(
                                                                        Map.ofEntries(
                                                                            Map.entry(
                                                                                "verb", "GET"),
                                                                            Map.entry(
                                                                                "url",
                                                                                "https://catfact.ninja/facts"),
                                                                            Map.entry(
                                                                                "urlParams",
                                                                                "[{'key': 'limit',"
                                                                                    + " 'value':"
                                                                                    + " '${pageSize.value.toString()}'},"
                                                                                    + " {'key':"
                                                                                    + " 'page',"
                                                                                    + " 'value':"
                                                                                    + " '${(table0.pageIndex"
                                                                                    + " + 1).toString()}'}]")))))))),
                                    new Query(
                                        new StateVariable()
                                            .type(StateVariableType.STATEVARIABLE)
                                            .name("pageSize")
                                            .properties(
                                                new StateVariableProperties().defaultValue("${20}"))
                                            .id(
                                                UUID.fromString(
                                                    "afd03c81-4075-4432-8618-ba09d52d2f2d"))),
                                    new Query(
                                        new DataTransform()
                                            .type(DataTransformType.DATATRANSFORM)
                                            .name("randomFact")
                                            .properties(
                                                new DataTransformProperties()
                                                    .outputs(
                                                        """
${(() => {const facts = fetchFacts.outputs.body.data
return facts[Math.floor(Math.random()*facts.length)]
})()}
"""))
                                            .id(
                                                UUID.fromString(
                                                    "0fb22859-47dc-4137-9e41-7b67d04c525c")))))
                            .name("Example Cat Facts Viewer")
                            .description(
                                "This is a slightly complicated example app that fetches and"
                                    + " displays cat facts")));

    try {
      CreateAppResponse result = apiInstance.createApp(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#createApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
