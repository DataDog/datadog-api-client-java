// Update status page returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.PatchStatusPageRequest;
import com.datadog.api.client.v2.model.PatchStatusPageRequestData;
import com.datadog.api.client.v2.model.PatchStatusPageRequestDataAttributes;
import com.datadog.api.client.v2.model.StatusPage;
import com.datadog.api.client.v2.model.StatusPageDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    String STATUS_PAGE_DATA_ID = System.getenv("STATUS_PAGE_DATA_ID");

    PatchStatusPageRequest body =
        new PatchStatusPageRequest()
            .data(
                new PatchStatusPageRequestData()
                    .attributes(
                        new PatchStatusPageRequestDataAttributes()
                            .name("[DD Integration Tests] 5e2fd69be33e79aa"))
                    .id(STATUS_PAGE_DATA_ID)
                    .type(StatusPageDataType.STATUS_PAGES));

    try {
      StatusPage result = apiInstance.updateStatusPage(STATUS_PAGE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#updateStatusPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
