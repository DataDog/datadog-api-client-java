// Create a GitHub cloud auth persona mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudAuthenticationApi;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingCreateAttributes;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingCreateData;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingResponse;
import com.datadog.api.client.v2.model.GitHubCloudAuthPersonaMappingType;
import com.datadog.api.client.v2.model.GitHubOIDCClaimPatterns;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createGitHubCloudAuthPersonaMapping", true);
    CloudAuthenticationApi apiInstance = new CloudAuthenticationApi(defaultClient);

    GitHubCloudAuthPersonaMappingCreateRequest body =
        new GitHubCloudAuthPersonaMappingCreateRequest()
            .data(
                new GitHubCloudAuthPersonaMappingCreateData()
                    .attributes(
                        new GitHubCloudAuthPersonaMappingCreateAttributes()
                            .accountIdentifier("test@example.com")
                            .claimMatchers(
                                new GitHubOIDCClaimPatterns()
                                    .actor("octocat")
                                    .actorId("1234567")
                                    .enterprise("test_enterprise")
                                    .enterpriseId("42")
                                    .environment("production")
                                    .eventName("push")
                                    .jobWorkflowRef(
                                        "test_owner/test_repo/.github/workflows/jobs.yml@refs/heads/main")
                                    .ref("refs/heads/main")
                                    .refType("branch")
                                    .repository("test_owner/test_repo")
                                    .repositoryId("123456789")
                                    .repositoryOwner("test_owner")
                                    .repositoryOwnerId("987654321")
                                    .repositoryVisibility("public")
                                    .runnerEnvironment("github-hosted")
                                    .sub(
                                        "repo:test_owner/test_repo:(ref:refs/heads/main|pull_request)")
                                    .workflow("CI")
                                    .workflowRef(
                                        "test_owner/test_repo/.github/workflows/ci.yml@refs/heads/main")))
                    .type(GitHubCloudAuthPersonaMappingType.GITHUB_OIDC_AUTH_CONFIG));

    try {
      GitHubCloudAuthPersonaMappingResponse result =
          apiInstance.createGitHubCloudAuthPersonaMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudAuthenticationApi#createGitHubCloudAuthPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
