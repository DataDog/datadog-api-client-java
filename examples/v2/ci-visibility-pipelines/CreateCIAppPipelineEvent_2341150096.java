// Send running pipeline event returns "Request accepted for processing" response
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
import com.datadog.api.client.v2.model.CIAppPipelineEventInProgressPipeline;
import com.datadog.api.client.v2.model.CIAppPipelineEventPipeline;
import com.datadog.api.client.v2.model.CIAppPipelineEventPipelineInProgressStatus;
import com.datadog.api.client.v2.model.CIAppPipelineEventPipelineLevel;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityPipelinesApi apiInstance = new CiVisibilityPipelinesApi(defaultClient);

    CIAppCreatePipelineEventRequest body =
        new CIAppCreatePipelineEventRequest()
            .data(
                new CIAppCreatePipelineEventRequestDataSingleOrArray(
                    new CIAppCreatePipelineEventRequestData()
                        .attributes(
                            new CIAppCreatePipelineEventRequestAttributes()
                                .resource(
                                    new CIAppCreatePipelineEventRequestAttributesResource(
                                        new CIAppPipelineEventPipeline(
                                            new CIAppPipelineEventInProgressPipeline()
                                                .level(CIAppPipelineEventPipelineLevel.PIPELINE)
                                                .uniqueId("3eacb6f3-ff04-4e10-8a9c-46e6d054024a")
                                                .name("Deploy to AWS")
                                                .url(
                                                    "https://my-ci-provider.example/pipelines/my-pipeline/run/1")
                                                .start(OffsetDateTime.now().plusSeconds(-120))
                                                .status(
                                                    CIAppPipelineEventPipelineInProgressStatus
                                                        .RUNNING)
                                                .partialRetry(false)
                                                .git(
                                                    new CIAppGitInfo()
                                                        .repositoryUrl(
                                                            "https://github.com/DataDog/datadog-agent")
                                                        .sha(
                                                            "7f263865994b76066c4612fd1965215e7dcb4cd2")
                                                        .authorEmail("john.doe@email.com"))))))
                        .type(
                            CIAppCreatePipelineEventRequestDataType.CIPIPELINE_RESOURCE_REQUEST)));

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
