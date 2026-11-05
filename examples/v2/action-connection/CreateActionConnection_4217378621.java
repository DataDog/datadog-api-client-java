// Create an HTTP Action Connection with an AWS Secrets Manager token

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManager;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManagerReference;
import com.datadog.api.client.v2.model.ActionConnectionAWSSecretsManagerType;
import com.datadog.api.client.v2.model.ActionConnectionAttributes;
import com.datadog.api.client.v2.model.ActionConnectionData;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionIntegration;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.HTTPBody;
import com.datadog.api.client.v2.model.HTTPCredentials;
import com.datadog.api.client.v2.model.HTTPHeader;
import com.datadog.api.client.v2.model.HTTPIntegration;
import com.datadog.api.client.v2.model.HTTPIntegrationType;
import com.datadog.api.client.v2.model.HTTPToken;
import com.datadog.api.client.v2.model.HTTPTokenAuth;
import com.datadog.api.client.v2.model.HTTPTokenAuthType;
import com.datadog.api.client.v2.model.HTTPTokenValue;
import com.datadog.api.client.v2.model.TokenType;
import com.datadog.api.client.v2.model.UrlParam;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    // there is a valid "action_connection" in the system
    String ACTION_CONNECTION_DATA_ID = System.getenv("ACTION_CONNECTION_DATA_ID");

    CreateActionConnectionRequest body =
        new CreateActionConnectionRequest()
            .data(
                new ActionConnectionData()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributes()
                            .name("HTTP Secrets Manager Connection exampleactionconnection")
                            .externalSecretsManager(
                                new ActionConnectionAWSSecretsManager()
                                    .type(ActionConnectionAWSSecretsManagerType.AWS_SECRETS_MANAGER)
                                    .connectionId(ACTION_CONNECTION_DATA_ID)
                                    .region("us-east-1"))
                            .integration(
                                new ActionConnectionIntegration(
                                    new HTTPIntegration()
                                        .type(HTTPIntegrationType.HTTP)
                                        .baseUrl("https://example.com")
                                        .credentials(
                                            new HTTPCredentials(
                                                new HTTPTokenAuth()
                                                    .type(HTTPTokenAuthType.HTTPTOKENAUTH)
                                                    .tokens(
                                                        Collections.singletonList(
                                                            new HTTPToken()
                                                                .name("token")
                                                                .type(TokenType.SECRET)
                                                                .value(
                                                                    new HTTPTokenValue(
                                                                        new ActionConnectionAWSSecretsManagerReference()
                                                                            .type(
                                                                                ActionConnectionAWSSecretsManagerType
                                                                                    .AWS_SECRETS_MANAGER)
                                                                            .secretId(
                                                                                "example/http")
                                                                            .key("token")))))
                                                    .headers(
                                                        Collections.singletonList(
                                                            new HTTPHeader()
                                                                .name("ApiKey")
                                                                .value("literal-value")))
                                                    .urlParameters(
                                                        Collections.singletonList(
                                                            new UrlParam()
                                                                .name("apiKey")
                                                                .value("literal-value")))
                                                    .body(
                                                        new HTTPBody()
                                                            .contentType("application/json")
                                                            .content(
                                                                """
{"example":"literal"}
"""))))))));

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
