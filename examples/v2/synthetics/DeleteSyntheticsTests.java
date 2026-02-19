// Synthetics: Bulk delete tests returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.DeletedTestsRequestDelete;
import com.datadog.api.client.v2.model.DeletedTestsRequestDeleteAttributes;
import com.datadog.api.client.v2.model.DeletedTestsRequestDeleteRequest;
import com.datadog.api.client.v2.model.DeletedTestsRequestType;
import com.datadog.api.client.v2.model.DeletedTestsResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    DeletedTestsRequestDeleteRequest body =
        new DeletedTestsRequestDeleteRequest()
            .data(
                new DeletedTestsRequestDelete()
                    .attributes(
                        new DeletedTestsRequestDeleteAttributes()
                            .publicIds(Collections.singletonList("")))
                    .type(DeletedTestsRequestType.DELETE_TESTS_REQUEST));

    try {
      DeletedTestsResponse result = apiInstance.deleteSyntheticsTests(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#deleteSyntheticsTests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
