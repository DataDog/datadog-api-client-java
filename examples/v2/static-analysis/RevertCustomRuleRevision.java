// Revert Custom Rule Revision returns "Successfully reverted" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.RevertCustomRuleRevisionDataType;
import com.datadog.api.client.v2.model.RevertCustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.RevertCustomRuleRevisionRequestData;
import com.datadog.api.client.v2.model.RevertCustomRuleRevisionRequestDataAttributes;
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
    defaultClient.setUnstableOperationEnabled("v2.revertCustomRuleRevision", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    RevertCustomRuleRevisionRequest body = new RevertCustomRuleRevisionRequest()
.data(new RevertCustomRuleRevisionRequestData()
.attributes(new RevertCustomRuleRevisionRequestDataAttributes())
.type(RevertCustomRuleRevisionDataType.REVERT_CUSTOM_RULE_REVISION_REQUEST));

    try {
      apiInstance.revertCustomRuleRevision("ruleset_name", "rule_name", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#revertCustomRuleRevision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}