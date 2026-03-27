// Create a WAF exclusion filter returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterCreateAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterCreateData;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterRulesTarget;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterRulesTargetTags;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterScope;
import com.datadog.api.client.v2.model.ApplicationSecurityWafExclusionFilterType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    ApplicationSecurityWafExclusionFilterCreateRequest body = new ApplicationSecurityWafExclusionFilterCreateRequest()
.data(new ApplicationSecurityWafExclusionFilterCreateData()
.attributes(new ApplicationSecurityWafExclusionFilterCreateAttributes()
.description("Exclude false positives on a path")
.enabled(true)
.parameters(Collections.singletonList("list.search.query"))
.pathGlob("/accounts/*")
.rulesTarget(Collections.singletonList(new ApplicationSecurityWafExclusionFilterRulesTarget()
.tags(new ApplicationSecurityWafExclusionFilterRulesTargetTags()
.category("attack_attempt")
.type("lfi"))))
.scope(Collections.singletonList(new ApplicationSecurityWafExclusionFilterScope()
.env("www")
.service("prod"))))
.type(ApplicationSecurityWafExclusionFilterType.EXCLUSION_FILTER));

    try {
      ApplicationSecurityWafExclusionFilterResponse result = apiInstance.createApplicationSecurityWafExclusionFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSecurityApi#createApplicationSecurityWafExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}