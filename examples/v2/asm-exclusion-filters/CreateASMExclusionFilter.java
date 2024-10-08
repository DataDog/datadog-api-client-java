// Create a ASM WAF Exclusion filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AsmExclusionFiltersApi;
import com.datadog.api.client.v2.model.ASMExclusionFilterCreateAttributes;
import com.datadog.api.client.v2.model.ASMExclusionFilterCreateData;
import com.datadog.api.client.v2.model.ASMExclusionFilterCreateRequest;
import com.datadog.api.client.v2.model.ASMExclusionFilterResponse;
import com.datadog.api.client.v2.model.ASMExclusionFilterRulesTarget;
import com.datadog.api.client.v2.model.ASMExclusionFilterScope;
import com.datadog.api.client.v2.model.ASMExclusionFilterType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AsmExclusionFiltersApi apiInstance = new AsmExclusionFiltersApi(defaultClient);

    ASMExclusionFilterCreateRequest body =
        new ASMExclusionFilterCreateRequest()
            .data(
                new ASMExclusionFilterCreateData()
                    .type(ASMExclusionFilterType.EXCLUSION_FILTER)
                    .attributes(
                        new ASMExclusionFilterCreateAttributes()
                            .description("my description")
                            .enabled(true)
                            .pathGlob("*")
                            .rulesTarget(
                                Collections.singletonList(new ASMExclusionFilterRulesTarget()))
                            .scope(
                                Collections.singletonList(
                                    new ASMExclusionFilterScope()
                                        .env("staging")
                                        .service("container-resolver")))));

    try {
      ASMExclusionFilterResponse result = apiInstance.createASMExclusionFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsmExclusionFiltersApi#createASMExclusionFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
