// Update a ASM Exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AsmExclusionFiltersApi;
import com.datadog.api.client.v2.model.ASMExclusionFilterResponse;
import com.datadog.api.client.v2.model.ASMExclusionFilterRulesTarget;
import com.datadog.api.client.v2.model.ASMExclusionFilterScope;
import com.datadog.api.client.v2.model.ASMExclusionFilterType;
import com.datadog.api.client.v2.model.ASMExclusionFilterUpdateAttributes;
import com.datadog.api.client.v2.model.ASMExclusionFilterUpdateData;
import com.datadog.api.client.v2.model.ASMExclusionFilterUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AsmExclusionFiltersApi apiInstance = new AsmExclusionFiltersApi(defaultClient);

    ASMExclusionFilterUpdateRequest body =
        new ASMExclusionFilterUpdateRequest()
            .data(
                new ASMExclusionFilterUpdateData()
                    .attributes(
                        new ASMExclusionFilterUpdateAttributes()
                            .description("My Exclusion filter")
                            .enabled(true)
                            .ipList(Collections.singletonList("127.0.0.1"))
                            .parameters(Collections.singletonList("list.search.query"))
                            .pathGlob("/lfi_include/*")
                            .rulesTarget(
                                Collections.singletonList(
                                    new ASMExclusionFilterRulesTarget().ruleId("dog-913-009")))
                            .scope(
                                Collections.singletonList(
                                    new ASMExclusionFilterScope()
                                        .env("dd-appsec-php-support")
                                        .service("anil-php-weblog"))))
                    .id("3dd-0uc-h1s")
                    .type(ASMExclusionFilterType.EXCLUSION_FILTER));

    try {
      ASMExclusionFilterResponse result =
          apiInstance.updateASMExclusionFilter("exclusion_filter_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsmExclusionFiltersApi#updateASMExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
