// Create postmortem template returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.PostmortemTemplateResponse;
import com.datadog.api.client.v2.model.PostmortemTemplateAttributesRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateDataRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateRequest;
import com.datadog.api.client.v2.model.PostmortemTemplateType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentPostmortemTemplate", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    PostmortemTemplateRequest body = new PostmortemTemplateRequest()
.data(new PostmortemTemplateDataRequest()
.attributes(new PostmortemTemplateAttributesRequest()
.name("Standard Postmortem Template"))
.type(PostmortemTemplateType.POSTMORTEM_TEMPLATE));

    try {
      PostmortemTemplateResponse result = apiInstance.createIncidentPostmortemTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentPostmortemTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}