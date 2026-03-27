// Create custom attribute config for a case type returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementAttributeApi;
import com.datadog.api.client.v2.model.CustomAttributeConfigAttributesCreate;
import com.datadog.api.client.v2.model.CustomAttributeConfigCreate;
import com.datadog.api.client.v2.model.CustomAttributeConfigCreateRequest;
import com.datadog.api.client.v2.model.CustomAttributeConfigResourceType;
import com.datadog.api.client.v2.model.CustomAttributeConfigResponse;
import com.datadog.api.client.v2.model.CustomAttributeType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementAttributeApi apiInstance = new CaseManagementAttributeApi(defaultClient);

    // there is a valid "case_type" in the system
    String CASE_TYPE_ID = System.getenv("CASE_TYPE_ID");

    CustomAttributeConfigCreateRequest body =
        new CustomAttributeConfigCreateRequest()
            .data(
                new CustomAttributeConfigCreate()
                    .attributes(
                        new CustomAttributeConfigAttributesCreate()
                            .displayName("AWS Region 9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d")
                            .isMulti(true)
                            .key("region_d9fe56bc9274fbb6")
                            .type(CustomAttributeType.NUMBER))
                    .type(CustomAttributeConfigResourceType.CUSTOM_ATTRIBUTE));

    try {
      CustomAttributeConfigResponse result =
          apiInstance.createCustomAttributeConfig(CASE_TYPE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CaseManagementAttributeApi#createCustomAttributeConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
