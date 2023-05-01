// Update Scanning Group returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SensitiveDataScannerApi;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfiguration;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigurationData;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigurationType;
import com.datadog.api.client.v2.model.SensitiveDataScannerFilter;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupAttributes;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupRelationships;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupType;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupUpdate;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupUpdateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupUpdateResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerMetaVersionOnly;
import com.datadog.api.client.v2.model.SensitiveDataScannerProduct;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SensitiveDataScannerApi apiInstance = new SensitiveDataScannerApi(defaultClient);

    // there is a valid "scanning_group" in the system
    String GROUP_DATA_ID = System.getenv("GROUP_DATA_ID");

    // a valid "configuration" in the system
    String CONFIGURATION_DATA_ID = System.getenv("CONFIGURATION_DATA_ID");

    SensitiveDataScannerGroupUpdateRequest body =
        new SensitiveDataScannerGroupUpdateRequest()
            .meta(new SensitiveDataScannerMetaVersionOnly())
            .data(
                new SensitiveDataScannerGroupUpdate()
                    .id(GROUP_DATA_ID)
                    .type(SensitiveDataScannerGroupType.SENSITIVE_DATA_SCANNER_GROUP)
                    .attributes(
                        new SensitiveDataScannerGroupAttributes()
                            .name("Example-Sensitive-Data-Scanner")
                            .isEnabled(false)
                            .productList(
                                Collections.singletonList(SensitiveDataScannerProduct.LOGS))
                            .filter(new SensitiveDataScannerFilter().query("*")))
                    .relationships(
                        new SensitiveDataScannerGroupRelationships()
                            .configuration(
                                new SensitiveDataScannerConfigurationData()
                                    .data(
                                        new SensitiveDataScannerConfiguration()
                                            .type(
                                                SensitiveDataScannerConfigurationType
                                                    .SENSITIVE_DATA_SCANNER_CONFIGURATIONS)
                                            .id(CONFIGURATION_DATA_ID)))
                            .rules(new SensitiveDataScannerRuleData())));

    try {
      SensitiveDataScannerGroupUpdateResponse result =
          apiInstance.updateScanningGroup(GROUP_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataScannerApi#updateScanningGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
