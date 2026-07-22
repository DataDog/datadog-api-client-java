// Update custom attribute config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementAttributeApi;
import com.datadog.api.client.v2.model.CustomAttributeConfigResourceType;
import com.datadog.api.client.v2.model.CustomAttributeConfigResponse;
import com.datadog.api.client.v2.model.CustomAttributeConfigUpdate;
import com.datadog.api.client.v2.model.CustomAttributeConfigUpdateAttributes;
import com.datadog.api.client.v2.model.CustomAttributeConfigUpdateRequest;
import com.datadog.api.client.v2.model.CustomAttributeSelectOption;
import com.datadog.api.client.v2.model.CustomAttributeType;
import com.datadog.api.client.v2.model.CustomAttributeTypeData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementAttributeApi apiInstance = new CaseManagementAttributeApi(defaultClient);

    CustomAttributeConfigUpdateRequest body =
        new CustomAttributeConfigUpdateRequest()
            .data(
                new CustomAttributeConfigUpdate()
                    .attributes(
                        new CustomAttributeConfigUpdateAttributes()
                            .description("Updated description.")
                            .displayName("AWS Region")
                            .type(CustomAttributeType.NUMBER)
                            .typeData(
                                new CustomAttributeTypeData()
                                    .options(
                                        Collections.singletonList(
                                            new CustomAttributeSelectOption().value("us-east-1")))))
                    .type(CustomAttributeConfigResourceType.CUSTOM_ATTRIBUTE));

    try {
      CustomAttributeConfigResponse result =
          apiInstance.updateCustomAttributeConfig(
              "f98a5a5b-e0ff-45d4-b2f5-afe6e74de505", "f98a5a5b-e0ff-45d4-b2f5-afe6e74de505", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CaseManagementAttributeApi#updateCustomAttributeConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
