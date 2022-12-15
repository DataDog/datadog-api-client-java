// Create Scanning Group returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SensitiveDataScannerApi;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfiguration;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigurationData;
import com.datadog.api.client.v2.model.SensitiveDataScannerConfigurationType;
import com.datadog.api.client.v2.model.SensitiveDataScannerCreateGroupResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerFilter;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupAttributes;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupCreate;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupCreateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupRelationships;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupType;
import com.datadog.api.client.v2.model.SensitiveDataScannerMetaVersionOnly;
import com.datadog.api.client.v2.model.SensitiveDataScannerProduct;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SensitiveDataScannerApi apiInstance = new SensitiveDataScannerApi(defaultClient);

    // a valid "configuration" in the system
    String CONFIGURATION_DATA_ID = System.getenv("CONFIGURATION_DATA_ID");

    SensitiveDataScannerGroupCreateRequest body =
        new SensitiveDataScannerGroupCreateRequest()
            .meta(new SensitiveDataScannerMetaVersionOnly())
            .data(
                new SensitiveDataScannerGroupCreate()
                    .type(SensitiveDataScannerGroupType.SENSITIVE_DATA_SCANNER_GROUP)
                    .attributes(
                        new SensitiveDataScannerGroupAttributes()
                            .name("Example-Create_Scanning_Group_returns_OK_response")
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
      SensitiveDataScannerCreateGroupResponse result = apiInstance.createScanningGroup(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataScannerApi#createScanningGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
