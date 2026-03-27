// Create or update HAMR organization connection returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.HighAvailabilityMultiRegionApi;
import com.datadog.api.client.v2.model.HamrOrgConnectionResponse;
import com.datadog.api.client.v2.model.HamrOrgConnectionAttributesRequest;
import com.datadog.api.client.v2.model.HamrOrgConnectionDataRequest;
import com.datadog.api.client.v2.model.HamrOrgConnectionRequest;
import com.datadog.api.client.v2.model.HamrOrgConnectionStatus;
import com.datadog.api.client.v2.model.HamrOrgConnectionType;
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
    defaultClient.setUnstableOperationEnabled("v2.createHamrOrgConnection", true);
    HighAvailabilityMultiRegionApi apiInstance = new HighAvailabilityMultiRegionApi(defaultClient);

    HamrOrgConnectionRequest body = new HamrOrgConnectionRequest()
.data(new HamrOrgConnectionDataRequest()
.attributes(new HamrOrgConnectionAttributesRequest()
.hamrStatus(HamrOrgConnectionStatus.ACTIVE)
.isPrimary(true)
.modifiedBy("admin@example.com")
.targetOrgDatacenter("us1")
.targetOrgName("Production Backup Org")
.targetOrgUuid("660f9511-f3ac-52e5-b827-557766551111"))
.id("550e8400-e29b-41d4-a716-446655440000")
.type(HamrOrgConnectionType.HAMR_ORG_CONNECTIONS));

    try {
      HamrOrgConnectionResponse result = apiInstance.createHamrOrgConnection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HighAvailabilityMultiRegionApi#createHamrOrgConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}