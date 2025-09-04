// Create Org Connection returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgConnectionsApi;
import com.datadog.api.client.v2.model.OrgConnectionCreate;
import com.datadog.api.client.v2.model.OrgConnectionCreateAttributes;
import com.datadog.api.client.v2.model.OrgConnectionCreateRelationships;
import com.datadog.api.client.v2.model.OrgConnectionCreateRequest;
import com.datadog.api.client.v2.model.OrgConnectionOrgRelationship;
import com.datadog.api.client.v2.model.OrgConnectionOrgRelationshipData;
import com.datadog.api.client.v2.model.OrgConnectionOrgRelationshipDataType;
import com.datadog.api.client.v2.model.OrgConnectionResponse;
import com.datadog.api.client.v2.model.OrgConnectionType;
import com.datadog.api.client.v2.model.OrgConnectionTypeEnum;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgConnectionsApi apiInstance = new OrgConnectionsApi(defaultClient);

    OrgConnectionCreateRequest body =
        new OrgConnectionCreateRequest()
            .data(
                new OrgConnectionCreate()
                    .type(OrgConnectionType.ORG_CONNECTION)
                    .relationships(
                        new OrgConnectionCreateRelationships()
                            .sinkOrg(
                                new OrgConnectionOrgRelationship()
                                    .data(
                                        new OrgConnectionOrgRelationshipData()
                                            .type(OrgConnectionOrgRelationshipDataType.ORGS)
                                            .id("83999dcd-7f97-11f0-8de1-1ecf66f1aa85"))))
                    .attributes(
                        new OrgConnectionCreateAttributes()
                            .connectionTypes(
                                Collections.singletonList(OrgConnectionTypeEnum.LOGS))));

    try {
      OrgConnectionResponse result = apiInstance.createOrgConnections(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgConnectionsApi#createOrgConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
