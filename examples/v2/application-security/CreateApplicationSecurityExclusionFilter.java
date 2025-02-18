// Create an Application Security exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterOnMatch;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterResource;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterRulesTarget;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterRulesTargetTags;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterScope;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    ApplicationSecurityExclusionFilterRequest body =
        new ApplicationSecurityExclusionFilterRequest()
            .data(
                new ApplicationSecurityExclusionFilterResource()
                    .attributes(
                        new ApplicationSecurityExclusionFilterAttributes()
                            .description("Exclude false positives on a path")
                            .enabled(true)
                            .ipList(Collections.singletonList("198.51.100.72"))
                            .onMatch(ApplicationSecurityExclusionFilterOnMatch.MONITOR)
                            .parameters(Collections.singletonList("list.search.query"))
                            .pathGlob("/accounts/*")
                            .rulesTarget(
                                Collections.singletonList(
                                    new ApplicationSecurityExclusionFilterRulesTarget()
                                        .ruleId("dog-913-009")
                                        .tags(
                                            new ApplicationSecurityExclusionFilterRulesTargetTags()
                                                .category("attack_attempt")
                                                .type("lfi"))))
                            .scope(
                                Collections.singletonList(
                                    new ApplicationSecurityExclusionFilterScope()
                                        .env("www")
                                        .service("prod"))))
                    .type(ApplicationSecurityExclusionFilterType.EXCLUSION_FILTER));

    try {
      ApplicationSecurityExclusionFilterResponse result =
          apiInstance.createApplicationSecurityExclusionFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ApplicationSecurityApi#createApplicationSecurityExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
