// Get rum sankey returns "Successful response with Sankey diagram data" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UserFlowApi;
import com.datadog.api.client.v2.model.SankeyRequest;
import com.datadog.api.client.v2.model.SankeyRequestData;
import com.datadog.api.client.v2.model.SankeyRequestDataAttributes;
import com.datadog.api.client.v2.model.SankeyRequestDataAttributesDefinition;
import com.datadog.api.client.v2.model.SankeyRequestDataAttributesSampling;
import com.datadog.api.client.v2.model.SankeyRequestDataAttributesSearch;
import com.datadog.api.client.v2.model.SankeyRequestDataAttributesSearchAudienceFilters;
import com.datadog.api.client.v2.model.SankeyRequestDataAttributesTime;
import com.datadog.api.client.v2.model.SankeyRequestDataType;
import com.datadog.api.client.v2.model.SankeyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRumSankey", true);
    UserFlowApi apiInstance = new UserFlowApi(defaultClient);

    SankeyRequest body =
        new SankeyRequest()
            .data(
                new SankeyRequestData()
                    .attributes(
                        new SankeyRequestDataAttributes()
                            .dataSource("")
                            .definition(
                                new SankeyRequestDataAttributesDefinition()
                                    .entriesPerStep(10L)
                                    .numberOfSteps(5L)
                                    .source("@view.name")
                                    .target("@view.name"))
                            .enforcedExecutionType("")
                            .requestId("")
                            .sampling(new SankeyRequestDataAttributesSampling().enabled(true))
                            .search(
                                new SankeyRequestDataAttributesSearch()
                                    .audienceFilters(
                                        new SankeyRequestDataAttributesSearchAudienceFilters())
                                    .query("@type:view @application.id:*")
                                    .subqueryId(""))
                            .time(
                                new SankeyRequestDataAttributesTime()
                                    .from(1756425600000L)
                                    .to(1756857600000L)))
                    .id("sankey_request")
                    .type(SankeyRequestDataType.SANKEY_REQUEST));

    try {
      SankeyResponse result = apiInstance.getRumSankey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserFlowApi#getRumSankey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
