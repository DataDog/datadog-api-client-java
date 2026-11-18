// Create a fleet access scope returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetAccessScopeAttributes;
import com.datadog.api.client.v2.model.FleetAccessScopeFeatures;
import com.datadog.api.client.v2.model.FleetAccessScopeResourceType;
import com.datadog.api.client.v2.model.FleetAccessScopeResponse;
import com.datadog.api.client.v2.model.FleetAccessScopeWrite;
import com.datadog.api.client.v2.model.FleetAccessScopeWriteRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createFleetAccessScope", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    FleetAccessScopeWriteRequest body =
        new FleetAccessScopeWriteRequest()
            .data(
                new FleetAccessScopeWrite()
                    .type(FleetAccessScopeResourceType.ACCESS_SCOPE)
                    .attributes(
                        new FleetAccessScopeAttributes()
                            .description("Example-Fleet-Automation")
                            .query("env:prod")
                            .features(
                                new FleetAccessScopeFeatures()
                                    .install(false)
                                    .upgrade(true)
                                    .configure(false))));

    try {
      FleetAccessScopeResponse result = apiInstance.createFleetAccessScope(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#createFleetAccessScope");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
