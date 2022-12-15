// Reorder Groups returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SensitiveDataScannerApi;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigurationRelationships;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigurationType;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupItem;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupList;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupType;
import com.datadog.api.client.v2.model.SensitiveDataScannerMetaVersionOnly;
import com.datadog.api.client.v2.model.SensitiveDataScannerReorderConfig;
import com.datadog.api.client.v2.model.SensitiveDataScannerReorderGroupsResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SensitiveDataScannerApi apiInstance = new SensitiveDataScannerApi(defaultClient);

    // there is a valid "scanning_group" in the system
    String GROUP_DATA_ID = System.getenv("GROUP_DATA_ID");

    // a valid "configuration" in the system
    String CONFIGURATION_DATA_ID = System.getenv("CONFIGURATION_DATA_ID");

    SensitiveDataScannerConfigRequest body =
        new SensitiveDataScannerConfigRequest()
            .data(
                new SensitiveDataScannerReorderConfig()
                    .relationships(
                        new SensitiveDataScannerConfigurationRelationships()
                            .groups(
                                new SensitiveDataScannerGroupList()
                                    .data(
                                        Collections.singletonList(
                                            new SensitiveDataScannerGroupItem()
                                                .type(
                                                    SensitiveDataScannerGroupType
                                                        .SENSITIVE_DATA_SCANNER_GROUP)
                                                .id(GROUP_DATA_ID)))))
                    .type(
                        SensitiveDataScannerConfigurationType.SENSITIVE_DATA_SCANNER_CONFIGURATIONS)
                    .id(CONFIGURATION_DATA_ID))
            .meta(new SensitiveDataScannerMetaVersionOnly());

    try {
      SensitiveDataScannerReorderGroupsResponse result = apiInstance.reorderScanningGroups(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataScannerApi#reorderScanningGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
