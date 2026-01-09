// Update component returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.PatchComponentRequest;
import com.datadog.api.client.v2.model.PatchComponentRequestData;
import com.datadog.api.client.v2.model.PatchComponentRequestDataAttributes;
import com.datadog.api.client.v2.model.StatusPagesComponent;
import com.datadog.api.client.v2.model.StatusPagesComponentGroupType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    String STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID =
        System.getenv("STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID");
    String STATUS_PAGE_DATA_ID = System.getenv("STATUS_PAGE_DATA_ID");

    PatchComponentRequest body =
        new PatchComponentRequest()
            .data(
                new PatchComponentRequestData()
                    .attributes(new PatchComponentRequestDataAttributes().name("5e2fd69be33e79aa"))
                    .id(STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID)
                    .type(StatusPagesComponentGroupType.COMPONENTS));

    try {
      StatusPagesComponent result =
          apiInstance.updateComponent(
              STATUS_PAGE_DATA_ID, STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#updateComponent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
