// Update an ASM Exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityExclusionFiltersApi;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterRulesTarget;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterScope;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterType;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterUpdateData;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityExclusionFiltersApi apiInstance =
        new ApplicationSecurityExclusionFiltersApi(defaultClient);

    ApplicationSecurityExclusionFilterUpdateRequest body =
        new ApplicationSecurityExclusionFilterUpdateRequest()
            .data(
                new ApplicationSecurityExclusionFilterUpdateData()
                    .attributes(
                        new ApplicationSecurityExclusionFilterUpdateAttributes()
                            .description("My Exclusion filter")
                            .enabled(true)
                            .ipList(Collections.singletonList("127.0.0.1"))
                            .parameters(Collections.singletonList("list.search.query"))
                            .pathGlob("/lfi_include/*")
                            .rulesTarget(
                                Collections.singletonList(
                                    new ApplicationSecurityExclusionFilterRulesTarget()
                                        .ruleId("dog-913-009")))
                            .scope(
                                Collections.singletonList(
                                    new ApplicationSecurityExclusionFilterScope()
                                        .env("dd-appsec-php-support")
                                        .service("anil-php-weblog"))))
                    .id("3dd-0uc-h1s")
                    .type(ApplicationSecurityExclusionFilterType.EXCLUSION_FILTER));

    try {
      ApplicationSecurityExclusionFilterResponse result =
          apiInstance.updateApplicationSecurityExclusionFilter("exclusion_filter_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ApplicationSecurityExclusionFiltersApi#updateApplicationSecurityExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
