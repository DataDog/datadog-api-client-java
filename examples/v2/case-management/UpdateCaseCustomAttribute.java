// Update case custom attribute returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseUpdateCustomAttribute;
import com.datadog.api.client.v2.model.CaseUpdateCustomAttributeRequest;
import com.datadog.api.client.v2.model.CustomAttributeType;
import com.datadog.api.client.v2.model.CustomAttributeValue;
import com.datadog.api.client.v2.model.CustomAttributeValuesUnion;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    // there is a valid "case" with a custom "case_type" in the system
    String CASE_WITH_TYPE_ID = System.getenv("CASE_WITH_TYPE_ID");

    // there is a valid "custom_attribute" in the system
    String CUSTOM_ATTRIBUTE_ATTRIBUTES_KEY = System.getenv("CUSTOM_ATTRIBUTE_ATTRIBUTES_KEY");

    CaseUpdateCustomAttributeRequest body =
        new CaseUpdateCustomAttributeRequest()
            .data(
                new CaseUpdateCustomAttribute()
                    .attributes(
                        new CustomAttributeValue()
                            .type(CustomAttributeType.TEXT)
                            .isMulti(true)
                            .value(
                                CustomAttributeValuesUnion.fromStringList(
                                    Arrays.asList("Abba", "The Cure"))))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result =
          apiInstance.updateCaseCustomAttribute(
              CASE_WITH_TYPE_ID, CUSTOM_ATTRIBUTE_ATTRIBUTES_KEY, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCaseCustomAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
