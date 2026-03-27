// Update postmortem template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.PostmortemTemplateAttributesRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateDataRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateResponse;
import com.datadog.api.client.v2.model.PostmortemTemplateType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentPostmortemTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    PostmortemTemplateRequest body =
        new PostmortemTemplateRequest()
            .data(
                new PostmortemTemplateDataRequest()
                    .attributes(
                        new PostmortemTemplateAttributesRequest()
                            .name("Standard Postmortem Template"))
                    .type(PostmortemTemplateType.POSTMORTEM_TEMPLATE));

    try {
      PostmortemTemplateResponse result =
          apiInstance.updateIncidentPostmortemTemplate("template-456", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentPostmortemTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
