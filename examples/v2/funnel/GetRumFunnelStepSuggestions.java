// Get rum funnel step suggestions returns "Successful response with funnel step suggestions"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FunnelApi;
import com.datadog.api.client.v2.model.FunnelSuggestionRequest;
import com.datadog.api.client.v2.model.FunnelSuggestionRequestData;
import com.datadog.api.client.v2.model.FunnelSuggestionRequestDataAttributes;
import com.datadog.api.client.v2.model.FunnelSuggestionRequestDataAttributesSearch;
import com.datadog.api.client.v2.model.FunnelSuggestionRequestDataAttributesSearchStepsItems;
import com.datadog.api.client.v2.model.FunnelSuggestionRequestDataAttributesTermSearch;
import com.datadog.api.client.v2.model.FunnelSuggestionRequestDataAttributesTime;
import com.datadog.api.client.v2.model.FunnelSuggestionRequestDataType;
import com.datadog.api.client.v2.model.FunnelSuggestionResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRumFunnelStepSuggestions", true);
    FunnelApi apiInstance = new FunnelApi(defaultClient);

    FunnelSuggestionRequest body =
        new FunnelSuggestionRequest()
            .data(
                new FunnelSuggestionRequestData()
                    .attributes(
                        new FunnelSuggestionRequestDataAttributes()
                            .dataSource("")
                            .search(
                                new FunnelSuggestionRequestDataAttributesSearch()
                                    .crossSessionFilter("")
                                    .queryString("@type:view")
                                    .steps(
                                        Collections.singletonList(
                                            new FunnelSuggestionRequestDataAttributesSearchStepsItems()
                                                .facet("@view.name")
                                                .stepFilter("")
                                                .value("/apm/home")))
                                    .subqueryId(""))
                            .termSearch(
                                new FunnelSuggestionRequestDataAttributesTermSearch().query("apm"))
                            .time(
                                new FunnelSuggestionRequestDataAttributesTime()
                                    .from(1756425600000L)
                                    .to(1756857600000L)))
                    .id("funnel_suggestion_request")
                    .type(FunnelSuggestionRequestDataType.FUNNEL_SUGGESTION_REQUEST));

    try {
      FunnelSuggestionResponse result = apiInstance.getRumFunnelStepSuggestions(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunnelApi#getRumFunnelStepSuggestions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
