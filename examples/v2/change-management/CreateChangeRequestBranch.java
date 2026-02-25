// Create a change request branch returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ChangeManagementApi;
import com.datadog.api.client.v2.model.ChangeRequestResponse;
import com.datadog.api.client.v2.model.ChangeRequestBranchCreateAttributes;
import com.datadog.api.client.v2.model.ChangeRequestBranchCreateData;
import com.datadog.api.client.v2.model.ChangeRequestBranchCreateRequest;
import com.datadog.api.client.v2.model.ChangeRequestBranchResourceType;
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
    defaultClient.setUnstableOperationEnabled("v2.createChangeRequestBranch", true);
    ChangeManagementApi apiInstance = new ChangeManagementApi(defaultClient);

    ChangeRequestBranchCreateRequest body = new ChangeRequestBranchCreateRequest()
.data(new ChangeRequestBranchCreateData()
.attributes(new ChangeRequestBranchCreateAttributes()
.branchName("chm/CHM-1234")
.repoId("DataDog/dd-source"))
.type(ChangeRequestBranchResourceType.CHANGE_REQUEST_BRANCH));

    try {
      ChangeRequestResponse result = apiInstance.createChangeRequestBranch("CHM-1234", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChangeManagementApi#createChangeRequestBranch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}