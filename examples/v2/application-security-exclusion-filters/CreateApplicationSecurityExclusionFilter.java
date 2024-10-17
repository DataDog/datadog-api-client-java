// Create an ASM Exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityExclusionFiltersApi;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterCreateAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterCreateData;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterRulesTarget;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterScope;
import com.datadog.api.client.v2.model.ApplicationSecurityExclusionFilterType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityExclusionFiltersApi apiInstance =
        new ApplicationSecurityExclusionFiltersApi(defaultClient);

    ApplicationSecurityExclusionFilterCreateRequest body =
        new ApplicationSecurityExclusionFilterCreateRequest()
            .data(
                new ApplicationSecurityExclusionFilterCreateData()
                    .type(ApplicationSecurityExclusionFilterType.EXCLUSION_FILTER)
                    .attributes(
                        new ApplicationSecurityExclusionFilterCreateAttributes()
                            .description("my description")
                            .enabled(true)
                            .pathGlob("*")
                            .rulesTarget(
                                Collections.singletonList(
                                    new ApplicationSecurityExclusionFilterRulesTarget()))
                            .scope(
                                Collections.singletonList(
                                    new ApplicationSecurityExclusionFilterScope()
                                        .env("staging")
                                        .service("container-resolver")))));

    try {
      ApplicationSecurityExclusionFilterResponse result =
          apiInstance.createApplicationSecurityExclusionFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ApplicationSecurityExclusionFiltersApi#createApplicationSecurityExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
