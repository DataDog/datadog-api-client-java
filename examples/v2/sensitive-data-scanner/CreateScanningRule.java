// Create Scanning Rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SensitiveDataScannerApi;
import com.datadog.api.client.v2.model.SensitiveDataScannerCreateRuleResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroup;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupData;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupType;
import com.datadog.api.client.v2.model.SensitiveDataScannerIncludedKeywordConfiguration;
import com.datadog.api.client.v2.model.SensitiveDataScannerMetaVersionOnly;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleAttributes;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleCreate;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleCreateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleRelationships;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleType;
import com.datadog.api.client.v2.model.SensitiveDataScannerTextReplacement;
import com.datadog.api.client.v2.model.SensitiveDataScannerTextReplacementType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SensitiveDataScannerApi apiInstance = new SensitiveDataScannerApi(defaultClient);

    // there is a valid "scanning_group" in the system
    String GROUP_DATA_ID = System.getenv("GROUP_DATA_ID");

    SensitiveDataScannerRuleCreateRequest body =
        new SensitiveDataScannerRuleCreateRequest()
            .meta(new SensitiveDataScannerMetaVersionOnly())
            .data(
                new SensitiveDataScannerRuleCreate()
                    .type(SensitiveDataScannerRuleType.SENSITIVE_DATA_SCANNER_RULE)
                    .attributes(
                        new SensitiveDataScannerRuleAttributes()
                            .name("Example-Sensitive-Data-Scanner")
                            .pattern("pattern")
                            .namespaces(Collections.singletonList("admin"))
                            .excludedNamespaces(Collections.singletonList("admin.name"))
                            .textReplacement(
                                new SensitiveDataScannerTextReplacement()
                                    .type(SensitiveDataScannerTextReplacementType.NONE))
                            .tags(Collections.singletonList("sensitive_data:true"))
                            .isEnabled(true)
                            .priority(1L)
                            .includedKeywordConfiguration(
                                new SensitiveDataScannerIncludedKeywordConfiguration()
                                    .keywords(Collections.singletonList("credit card"))
                                    .characterCount(35L)))
                    .relationships(
                        new SensitiveDataScannerRuleRelationships()
                            .group(
                                new SensitiveDataScannerGroupData()
                                    .data(
                                        new SensitiveDataScannerGroup()
                                            .type(
                                                SensitiveDataScannerGroupType
                                                    .SENSITIVE_DATA_SCANNER_GROUP)
                                            .id(GROUP_DATA_ID)))));

    try {
      SensitiveDataScannerCreateRuleResponse result = apiInstance.createScanningRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataScannerApi#createScanningRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
