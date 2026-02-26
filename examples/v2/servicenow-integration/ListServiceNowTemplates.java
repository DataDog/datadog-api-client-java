// List ServiceNow templates returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceNowIntegrationApi;
import com.datadog.api.client.v2.model.ServiceNowTemplatesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listServiceNowTemplates", true);
    ServiceNowIntegrationApi apiInstance = new ServiceNowIntegrationApi(defaultClient);

    try {
      ServiceNowTemplatesResponse result = apiInstance.listServiceNowTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceNowIntegrationApi#listServiceNowTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
