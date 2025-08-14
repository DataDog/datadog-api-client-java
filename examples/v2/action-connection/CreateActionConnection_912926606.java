// Create a new Action Connection with HTTPTokenAuth returns "Successfully created Action
// Connection" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAttributes;
import com.datadog.api.client.v2.model.ActionConnectionData;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionIntegration;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.HTTPCredentials;
import com.datadog.api.client.v2.model.HTTPHeader;
import com.datadog.api.client.v2.model.HTTPIntegration;
import com.datadog.api.client.v2.model.HTTPIntegrationType;
import com.datadog.api.client.v2.model.HTTPToken;
import com.datadog.api.client.v2.model.HTTPTokenAuth;
import com.datadog.api.client.v2.model.HTTPTokenAuthType;
import com.datadog.api.client.v2.model.TokenType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    CreateActionConnectionRequest body =
        new CreateActionConnectionRequest()
            .data(
                new ActionConnectionData()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributes()
                            .name("HTTP Token Connection exampleactionconnection")
                            .integration(
                                new ActionConnectionIntegration(
                                    new HTTPIntegration()
                                        .type(HTTPIntegrationType.HTTP)
                                        .baseUrl("https://api.example.com")
                                        .credentials(
                                            new HTTPCredentials(
                                                new HTTPTokenAuth()
                                                    .type(HTTPTokenAuthType.HTTPTOKENAUTH)
                                                    .tokens(
                                                        Collections.singletonList(
                                                            new HTTPToken()
                                                                .name("ApiKey")
                                                                .type(TokenType.SECRET)
                                                                .value("secret-token-value")))
                                                    .headers(
                                                        Collections.singletonList(
                                                            new HTTPHeader()
                                                                .name("Authorization")
                                                                .value(
                                                                    "Bearer token-value")))))))));

    try {
      CreateActionConnectionResponse result = apiInstance.createActionConnection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#createActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
