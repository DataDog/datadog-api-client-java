// Create status page returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateStatusPageRequest;
import com.datadog.api.client.v2.model.CreateStatusPageRequestData;
import com.datadog.api.client.v2.model.CreateStatusPageRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateStatusPageRequestDataAttributesType;
import com.datadog.api.client.v2.model.CreateStatusPageRequestDataAttributesVisualizationType;
import com.datadog.api.client.v2.model.StatusPage;
import com.datadog.api.client.v2.model.StatusPageDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    CreateStatusPageRequest body =
        new CreateStatusPageRequest()
            .data(
                new CreateStatusPageRequestData()
                    .attributes(
                        new CreateStatusPageRequestDataAttributes()
                            .name("[DD Integration Tests] 5e2fd69be33e79aa")
                            .domainPrefix("dd-integrations-tests-5e2fd69be33e79aa")
                            .enabled(true)
                            .type(CreateStatusPageRequestDataAttributesType.INTERNAL)
                            .visualizationType(
                                CreateStatusPageRequestDataAttributesVisualizationType
                                    .BARS_AND_UPTIME_PERCENTAGE))
                    .type(StatusPageDataType.STATUS_PAGES));

    try {
      StatusPage result = apiInstance.createStatusPage(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createStatusPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
