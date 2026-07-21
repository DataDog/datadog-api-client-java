// Remove insights from a case returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseInsight;
import com.datadog.api.client.v2.model.CaseInsightType;
import com.datadog.api.client.v2.model.CaseInsightsAttributes;
import com.datadog.api.client.v2.model.CaseInsightsData;
import com.datadog.api.client.v2.model.CaseInsightsRequest;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseInsightsRequest body =
        new CaseInsightsRequest()
            .data(
                new CaseInsightsData()
                    .attributes(
                        new CaseInsightsAttributes()
                            .insights(
                                Collections.singletonList(
                                    new CaseInsight()
                                        .ref("/monitors/12345?q=total")
                                        .resourceId("12345")
                                        .type(CaseInsightType.SECURITY_SIGNAL))))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result =
          apiInstance.removeCaseInsights("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#removeCaseInsights");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
