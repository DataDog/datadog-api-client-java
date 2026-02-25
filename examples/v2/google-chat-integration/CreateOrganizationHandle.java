// Create organization handle returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.GoogleChatIntegrationApi;
import com.datadog.api.client.v2.model.GoogleChatOrganizationHandleResponse;
import com.datadog.api.client.v2.model.GoogleChatCreateOrganizationHandleRequest;
import com.datadog.api.client.v2.model.GoogleChatCreateOrganizationHandleRequestAttributes;
import com.datadog.api.client.v2.model.GoogleChatCreateOrganizationHandleRequestData;
import com.datadog.api.client.v2.model.GoogleChatOrganizationHandleType;
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
    GoogleChatIntegrationApi apiInstance = new GoogleChatIntegrationApi(defaultClient);

    GoogleChatCreateOrganizationHandleRequest body = new GoogleChatCreateOrganizationHandleRequest()
.data(new GoogleChatCreateOrganizationHandleRequestData()
.attributes(new GoogleChatCreateOrganizationHandleRequestAttributes()
.name("Example-Google-Chat-Integration")
.spaceResourceName("spaces/AAQA-zFIks8")))
.type(GoogleChatOrganizationHandleType.GOOGLE_CHAT_ORGANIZATION_HANDLE_TYPE);

    try {
      GoogleChatOrganizationHandleResponse result = apiInstance.createOrganizationHandle("e54cb570-c674-529c-769d-84b312288ed7", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoogleChatIntegrationApi#createOrganizationHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}