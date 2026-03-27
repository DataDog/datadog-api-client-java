// Create connection returns "Connection created successfully" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.CreateConnectionRequest;
import com.datadog.api.client.v2.model.CreateConnectionRequestData;
import com.datadog.api.client.v2.model.CreateConnectionRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateConnectionRequestDataAttributesFieldsItems;
import com.datadog.api.client.v2.model.UpdateConnectionRequestDataType;
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
    defaultClient.setUnstableOperationEnabled("v2.createConnection", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    CreateConnectionRequest body = new CreateConnectionRequest()
.data(new CreateConnectionRequestData()
.attributes(new CreateConnectionRequestDataAttributes()
.fields(Arrays.asList(new CreateConnectionRequestDataAttributesFieldsItems()
.description("Customer subscription tier from `CRM`")
.displayName("Customer Tier")
.id("customer_tier")
.sourceName("subscription_tier")
.type("string"), new CreateConnectionRequestDataAttributesFieldsItems()
.description("Customer lifetime value in `USD`")
.displayName("Lifetime Value")
.id("lifetime_value")
.sourceName("ltv")
.type("number")))
.joinAttribute("user_email")
.joinType("email")
.type("ref_table"))
.id("crm-integration")
.type(UpdateConnectionRequestDataType.CONNECTION_ID));

    try {
      apiInstance.createConnection("users", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#createConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}