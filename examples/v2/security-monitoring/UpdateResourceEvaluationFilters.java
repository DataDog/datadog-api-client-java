// Update resource filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ResourceFilterAttributes;
import com.datadog.api.client.v2.model.ResourceFilterRequestType;
import com.datadog.api.client.v2.model.UpdateResourceEvaluationFiltersRequest;
import com.datadog.api.client.v2.model.UpdateResourceEvaluationFiltersRequestData;
import com.datadog.api.client.v2.model.UpdateResourceEvaluationFiltersResponse;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    UpdateResourceEvaluationFiltersRequest body =
        new UpdateResourceEvaluationFiltersRequest()
            .data(
                new UpdateResourceEvaluationFiltersRequestData()
                    .attributes(
                        new ResourceFilterAttributes()
                            .cloudProvider(
                                Map.ofEntries(
                                    Map.entry(
                                        "aws",
                                        Map.ofEntries(
                                            Map.entry(
                                                "aws_account_id",
                                                Collections.singletonList("tag1:v1")))))))
                    .id("csm_resource_filter")
                    .type(ResourceFilterRequestType.CSM_RESOURCE_FILTER));

    try {
      UpdateResourceEvaluationFiltersResponse result =
          apiInstance.updateResourceEvaluationFilters(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateResourceEvaluationFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
