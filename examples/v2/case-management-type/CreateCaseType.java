// Create a case type returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementTypeApi;
import com.datadog.api.client.v2.model.CaseTypeResponse;
import com.datadog.api.client.v2.model.CaseTypeCreate;
import com.datadog.api.client.v2.model.CaseTypeCreateRequest;
import com.datadog.api.client.v2.model.CaseTypeResourceAttributes;
import com.datadog.api.client.v2.model.CaseTypeResourceType;
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
    CaseManagementTypeApi apiInstance = new CaseManagementTypeApi(defaultClient);

    CaseTypeCreateRequest body = new CaseTypeCreateRequest()
.data(new CaseTypeCreate()
.attributes(new CaseTypeResourceAttributes()
.description("Investigations done in case management")
.emoji("👑")
.name("Investigation"))
.type(CaseTypeResourceType.CASE_TYPE));

    try {
      CaseTypeResponse result = apiInstance.createCaseType(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementTypeApi#createCaseType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}