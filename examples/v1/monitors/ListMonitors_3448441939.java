// Get all monitor details with tags

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.api.MonitorsApi.ListMonitorsOptionalParameters;
import com.datadog.api.v1.client.model.Monitor;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    try {
      List<Monitor> result =
          apiInstance.listMonitors(
              new ListMonitorsOptionalParameters()
                  .tags("test:examplegetallmonitordetailswithtags")
                  .pageSize(1));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#listMonitors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
