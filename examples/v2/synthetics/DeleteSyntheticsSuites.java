// Synthetics: Bulk delete suites returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.DeletedSuitesRequestDelete;
import com.datadog.api.client.v2.model.DeletedSuitesRequestDeleteAttributes;
import com.datadog.api.client.v2.model.DeletedSuitesRequestDeleteRequest;
import com.datadog.api.client.v2.model.DeletedSuitesRequestType;
import com.datadog.api.client.v2.model.DeletedSuitesResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    DeletedSuitesRequestDeleteRequest body =
        new DeletedSuitesRequestDeleteRequest()
            .data(
                new DeletedSuitesRequestDelete()
                    .attributes(
                        new DeletedSuitesRequestDeleteAttributes()
                            .publicIds(Collections.singletonList("")))
                    .type(DeletedSuitesRequestType.DELETE_SUITES_REQUEST));

    try {
      DeletedSuitesResponse result = apiInstance.deleteSyntheticsSuites(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#deleteSyntheticsSuites");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
