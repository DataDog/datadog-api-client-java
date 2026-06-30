// Create a tag indexing rule exemption returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionCreateAttributes;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionCreateData;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionCreateRequest;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionResponse;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTagIndexingRuleExemption", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    TagIndexingRuleExemptionCreateRequest body =
        new TagIndexingRuleExemptionCreateRequest()
            .data(
                new TagIndexingRuleExemptionCreateData()
                    .attributes(
                        new TagIndexingRuleExemptionCreateAttributes()
                            .reason("This metric has a pre-existing tag configuration."))
                    .type(TagIndexingRuleExemptionType.TAG_INDEXING_RULE_EXEMPTIONS));

    try {
      TagIndexingRuleExemptionResponse result =
          apiInstance.createTagIndexingRuleExemption("dist.http.endpoint.request", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#createTagIndexingRuleExemption");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
