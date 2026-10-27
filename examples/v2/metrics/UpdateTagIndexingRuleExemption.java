// Update a tag indexing rule exemption returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionResponse;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionType;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionUpdateAttributes;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionUpdateData;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateTagIndexingRuleExemption", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    TagIndexingRuleExemptionUpdateRequest body =
        new TagIndexingRuleExemptionUpdateRequest()
            .data(
                new TagIndexingRuleExemptionUpdateData()
                    .attributes(
                        new TagIndexingRuleExemptionUpdateAttributes()
                            .reason(
                                "This metric must remain exempt because of its query"
                                    + " requirements."))
                    .type(TagIndexingRuleExemptionType.TAG_INDEXING_RULE_EXEMPTIONS));

    try {
      TagIndexingRuleExemptionResponse result =
          apiInstance.updateTagIndexingRuleExemption("dist.http.endpoint.request", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#updateTagIndexingRuleExemption");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
