// Create or update IDP configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.model.IDPConfigRequest;
import com.datadog.api.client.v2.model.IDPConfigRequestAttributes;
import com.datadog.api.client.v2.model.IDPConfigRequestData;
import com.datadog.api.client.v2.model.IDPConfigType;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.upsertIDPConfigValue", true);
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    IDPConfigRequest body =
        new IDPConfigRequest()
            .data(
                new IDPConfigRequestData()
                    .attributes(
                        new IDPConfigRequestAttributes()
                            .value(
                                Collections.singletonList(
                                    Map.ofEntries(
                                        Map.entry("displayName", "My Dashboard"),
                                        Map.entry("id", "dashboard-1")))))
                    .type(IDPConfigType.IDP_CONFIG));

    try {
      apiInstance.upsertIDPConfigValue("idp_pinned_dashboards", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#upsertIDPConfigValue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
