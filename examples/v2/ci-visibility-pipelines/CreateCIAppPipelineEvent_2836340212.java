// Send several pipeline events returns "Request accepted for processing" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequest;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestAttributes;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestAttributesResource;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestData;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestDataSingleOrArray;
import com.datadog.api.client.v2.model.CIAppCreatePipelineEventRequestDataType;
import com.datadog.api.client.v2.model.CIAppGitInfo;
import com.datadog.api.client.v2.model.CIAppPipelineEventFinishedPipeline;
import com.datadog.api.client.v2.model.CIAppPipelineEventPipeline;
import com.datadog.api.client.v2.model.CIAppPipelineEventPipelineLevel;
import com.datadog.api.client.v2.model.CIAppPipelineEventPipelineStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityPipelinesApi apiInstance = new CiVisibilityPipelinesApi(defaultClient);

    CIAppCreatePipelineEventRequest body =
        new CIAppCreatePipelineEventRequest()
            .data(
                new CIAppCreatePipelineEventRequestDataSingleOrArray(
                    Arrays.asList(
                        new CIAppCreatePipelineEventRequestData()
                            .attributes(
                                new CIAppCreatePipelineEventRequestAttributes()
                                    .providerName("example-provider")
                                    .resource(
                                        new CIAppCreatePipelineEventRequestAttributesResource(
                                            new CIAppPipelineEventPipeline(
                                                new CIAppPipelineEventFinishedPipeline()
                                                    .level(CIAppPipelineEventPipelineLevel.PIPELINE)
                                                    .uniqueId(
                                                        "3eacb6f3-ff04-4e10-8a9c-46e6d054024a")
                                                    .name("Deploy to AWS")
                                                    .url(
                                                        "https://my-ci-provider.example/pipelines/my-pipeline/run/1")
                                                    .start(OffsetDateTime.now().plusSeconds(-120))
                                                    .end(OffsetDateTime.now().plusSeconds(-30))
                                                    .status(
                                                        CIAppPipelineEventPipelineStatus.SUCCESS)
                                                    .partialRetry(false)
                                                    .git(
                                                        new CIAppGitInfo()
                                                            .repositoryUrl(
                                                                "https://github.com/DataDog/datadog-agent")
                                                            .sha(
                                                                "7f263865994b76066c4612fd1965215e7dcb4cd2")
                                                            .authorEmail("john.doe@email.com"))))))
                            .type(
                                CIAppCreatePipelineEventRequestDataType
                                    .CIPIPELINE_RESOURCE_REQUEST),
                        new CIAppCreatePipelineEventRequestData()
                            .attributes(
                                new CIAppCreatePipelineEventRequestAttributes()
                                    .providerName("example-provider")
                                    .resource(
                                        new CIAppCreatePipelineEventRequestAttributesResource(
                                            new CIAppPipelineEventPipeline(
                                                new CIAppPipelineEventFinishedPipeline()
                                                    .level(CIAppPipelineEventPipelineLevel.PIPELINE)
                                                    .uniqueId(
                                                        "7b2c8f9e-aa15-4d22-9c7d-83f4e065138b")
                                                    .name("Deploy to Production")
                                                    .url(
                                                        "https://my-ci-provider.example/pipelines/prod-pipeline/run/2")
                                                    .start(OffsetDateTime.now().plusSeconds(-180))
                                                    .end(OffsetDateTime.now().plusSeconds(-45))
                                                    .status(
                                                        CIAppPipelineEventPipelineStatus.SUCCESS)
                                                    .partialRetry(false)
                                                    .git(
                                                        new CIAppGitInfo()
                                                            .repositoryUrl(
                                                                "https://github.com/DataDog/datadog-agent")
                                                            .sha(
                                                                "9a4f7c28b3e5d12f8e6c9b2a5d8f3e1c7b4a6d9e")
                                                            .authorEmail(
                                                                "jane.smith@email.com"))))))
                            .type(
                                CIAppCreatePipelineEventRequestDataType
                                    .CIPIPELINE_RESOURCE_REQUEST))));

    try {
      apiInstance.createCIAppPipelineEvent(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CiVisibilityPipelinesApi#createCIAppPipelineEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
