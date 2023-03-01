// Update Scanning Rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SensitiveDataScannerApi;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleUpdateResponse;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroup;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupData;
import com.datadog.api.client.v2.model.SensitiveDataScannerGroupType;
import com.datadog.api.client.v2.model.SensitiveDataScannerMetaVersionOnly;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleAttributes;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleRelationships;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleType;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleUpdate;
import com.datadog.api.client.v2.model.SensitiveDataScannerRuleUpdateRequest;
import com.datadog.api.client.v2.model.SensitiveDataScannerTextReplacement;
import com.datadog.api.client.v2.model.SensitiveDataScannerTextReplacementType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SensitiveDataScannerApi apiInstance = new SensitiveDataScannerApi(defaultClient);

    // the "scanning_group" has a "scanning_rule"
    String RULE_DATA_ID = System.getenv("RULE_DATA_ID");

    // there is a valid "scanning_group" in the system
    String GROUP_DATA_ID = System.getenv("GROUP_DATA_ID");

    SensitiveDataScannerRuleUpdateRequest body = new SensitiveDataScannerRuleUpdateRequest()
.meta(new SensitiveDataScannerMetaVersionOnly())
.data(new SensitiveDataScannerRuleUpdate()
.id(RULE_DATA_ID)
.type(SensitiveDataScannerRuleType.SENSITIVE_DATA_SCANNER_RULE)
.attributes(new SensitiveDataScannerRuleAttributes()
.name("Example-Update_Scanning_Rule_returns_OK_response")
.pattern("pattern")
.textReplacement(new SensitiveDataScannerTextReplacement()
.type(SensitiveDataScannerTextReplacementType.NONE))
.tags(Collections.singletonList("sensitive_data:true"))
.isEnabled(true))
.relationships(new SensitiveDataScannerRuleRelationships()
.group(new SensitiveDataScannerGroupData()
.data(new SensitiveDataScannerGroup()
.type(SensitiveDataScannerGroupType.SENSITIVE_DATA_SCANNER_GROUP)
.id(GROUP_DATA_ID)))));

    try {
      SensitiveDataScannerRuleUpdateResponse result = apiInstance.updateScanningRule(RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataScannerApi#updateScanningRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}