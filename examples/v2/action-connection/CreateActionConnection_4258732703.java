// Create an Anthropic Action Connection with an AWS Secrets Manager API token

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
import com.datadog.api.client.v2.model.AnthropicAPIKey;
import com.datadog.api.client.v2.model.AnthropicAPIKeyApiToken;
import com.datadog.api.client.v2.model.AnthropicAPIKeyType;
import com.datadog.api.client.v2.model.AnthropicCredentials;
import com.datadog.api.client.v2.model.AnthropicIntegration;
import com.datadog.api.client.v2.model.AnthropicIntegrationType;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;

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
                            .name("Anthropic Secrets Manager Connection exampleactionconnection")
                            .externalSecretsManager(
                                new ActionConnectionAWSSecretsManager()
                                    .type(ActionConnectionAWSSecretsManagerType.AWS_SECRETS_MANAGER)
                                    .connectionId(ACTION_CONNECTION_DATA_ID)
                                    .region("us-east-1"))
                            .integration(
                                new ActionConnectionIntegration(
                                    new AnthropicIntegration()
                                        .type(AnthropicIntegrationType.ANTHROPIC)
                                        .credentials(
                                            new AnthropicCredentials(
                                                new AnthropicAPIKey()
                                                    .type(AnthropicAPIKeyType.ANTHROPICAPIKEY)
                                                    .apiToken(
                                                        new AnthropicAPIKeyApiToken(
                                                            new ActionConnectionAWSSecretsManagerReference()
                                                                .type(
                                                                    ActionConnectionAWSSecretsManagerType
                                                                        .AWS_SECRETS_MANAGER)
                                                                .secretId("example/anthropic")
                                                                .key("api_token")))))))));

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
