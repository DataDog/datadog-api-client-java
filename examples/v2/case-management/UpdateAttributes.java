// Update case attributes returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseUpdateAttributes;
import com.datadog.api.client.v2.model.CaseUpdateAttributesAttributes;
import com.datadog.api.client.v2.model.CaseUpdateAttributesRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    // there is a valid "case" in the system
    String CASE_ID = System.getenv("CASE_ID");

    CaseUpdateAttributesRequest body =
        new CaseUpdateAttributesRequest()
            .data(
                new CaseUpdateAttributes()
                    .attributes(
                        new CaseUpdateAttributesAttributes()
                            .attributes(
                                Map.ofEntries(
                                    Map.entry("env", Collections.singletonList("test")),
                                    Map.entry("service", Arrays.asList("web-store", "web-api")),
                                    Map.entry("team", Collections.singletonList("engineer")))))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.updateAttributes(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
