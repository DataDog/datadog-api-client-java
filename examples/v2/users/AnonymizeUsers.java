// Anonymize users returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsersApi;
import com.datadog.api.client.v2.model.AnonymizeUsersRequest;
import com.datadog.api.client.v2.model.AnonymizeUsersRequestAttributes;
import com.datadog.api.client.v2.model.AnonymizeUsersRequestData;
import com.datadog.api.client.v2.model.AnonymizeUsersRequestType;
import com.datadog.api.client.v2.model.AnonymizeUsersResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.anonymizeUsers", true);
    UsersApi apiInstance = new UsersApi(defaultClient);

    AnonymizeUsersRequest body =
        new AnonymizeUsersRequest()
            .data(
                new AnonymizeUsersRequestData()
                    .attributes(
                        new AnonymizeUsersRequestAttributes()
                            .userIds(
                                Collections.singletonList("00000000-0000-0000-0000-000000000000")))
                    .id("00000000-0000-0000-0000-000000000000")
                    .type(AnonymizeUsersRequestType.ANONYMIZE_USERS_REQUEST));

    try {
      AnonymizeUsersResponse result = apiInstance.anonymizeUsers(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#anonymizeUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
