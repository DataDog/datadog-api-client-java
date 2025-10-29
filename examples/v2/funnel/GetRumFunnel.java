// Get rum funnel returns "Successful response with funnel analysis data" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FunnelApi;
import com.datadog.api.client.v2.model.FunnelRequest;
import com.datadog.api.client.v2.model.FunnelRequestData;
import com.datadog.api.client.v2.model.FunnelRequestDataAttributes;
import com.datadog.api.client.v2.model.FunnelRequestDataAttributesSearch;
import com.datadog.api.client.v2.model.FunnelRequestDataAttributesSearchStepsItems;
import com.datadog.api.client.v2.model.FunnelRequestDataAttributesTime;
import com.datadog.api.client.v2.model.FunnelRequestDataType;
import com.datadog.api.client.v2.model.FunnelResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getRumFunnel", true);
    FunnelApi apiInstance = new FunnelApi(defaultClient);

    FunnelRequest body =
        new FunnelRequest()
            .data(
                new FunnelRequestData()
                    .attributes(
                        new FunnelRequestDataAttributes()
                            .dataSource("rum")
                            .enforcedExecutionType("")
                            .requestId("")
                            .search(
                                new FunnelRequestDataAttributesSearch()
                                    .crossSessionFilter("")
                                    .queryString("@type:view")
                                    .steps(
                                        Arrays.asList(
                                            new FunnelRequestDataAttributesSearchStepsItems()
                                                .facet("@view.name")
                                                .stepFilter("")
                                                .value("/apm/home"),
                                            new FunnelRequestDataAttributesSearchStepsItems()
                                                .facet("@view.name")
                                                .stepFilter("")
                                                .value("/apm/traces")))
                                    .subqueryId(""))
                            .time(
                                new FunnelRequestDataAttributesTime()
                                    .from(1756425600000L)
                                    .to(1756857600000L)))
                    .id("funnel_request")
                    .type(FunnelRequestDataType.FUNNEL_REQUEST));

    try {
      FunnelResponse result = apiInstance.getRumFunnel(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunnelApi#getRumFunnel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
