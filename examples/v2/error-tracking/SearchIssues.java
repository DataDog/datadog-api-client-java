// Search error tracking issues returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ErrorTrackingApi;
import com.datadog.api.client.v2.model.IssuesSearchRequest;
import com.datadog.api.client.v2.model.IssuesSearchRequestData;
import com.datadog.api.client.v2.model.IssuesSearchRequestDataAttributes;
import com.datadog.api.client.v2.model.IssuesSearchRequestDataAttributesTrack;
import com.datadog.api.client.v2.model.IssuesSearchRequestDataType;
import com.datadog.api.client.v2.model.IssuesSearchResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ErrorTrackingApi apiInstance = new ErrorTrackingApi(defaultClient);

    IssuesSearchRequest body =
        new IssuesSearchRequest()
            .data(
                new IssuesSearchRequestData()
                    .attributes(
                        new IssuesSearchRequestDataAttributes()
                            .query("service:orders-* AND @language:go")
                            .from(1671612804000L)
                            .to(1671620004000L)
                            .track(IssuesSearchRequestDataAttributesTrack.TRACE))
                    .type(IssuesSearchRequestDataType.SEARCH_REQUEST));

    try {
      IssuesSearchResponse result = apiInstance.searchIssues(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ErrorTrackingApi#searchIssues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
