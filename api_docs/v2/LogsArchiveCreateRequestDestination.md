

# LogsArchiveCreateRequestDestination

An archive's destination.

## oneOf schemas
* [LogsArchiveDestinationAzure](LogsArchiveDestinationAzure.md)
* [LogsArchiveDestinationGCS](LogsArchiveDestinationGCS.md)
* [LogsArchiveDestinationS3](LogsArchiveDestinationS3.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.LogsArchiveCreateRequestDestination;
import com.datadog.api.v2.client.model.LogsArchiveDestinationAzure;
import com.datadog.api.v2.client.model.LogsArchiveDestinationGCS;
import com.datadog.api.v2.client.model.LogsArchiveDestinationS3;

public class Example {
    public static void main(String[] args) {
        LogsArchiveCreateRequestDestination exampleLogsArchiveCreateRequestDestination = new LogsArchiveCreateRequestDestination();

        // create a new LogsArchiveDestinationAzure
        LogsArchiveDestinationAzure exampleLogsArchiveDestinationAzure = new LogsArchiveDestinationAzure();
        // set LogsArchiveCreateRequestDestination to LogsArchiveDestinationAzure
        exampleLogsArchiveCreateRequestDestination.setActualInstance(exampleLogsArchiveDestinationAzure);
        // to get back the LogsArchiveDestinationAzure set earlier
        LogsArchiveDestinationAzure testLogsArchiveDestinationAzure = (LogsArchiveDestinationAzure) exampleLogsArchiveCreateRequestDestination.getActualInstance();

        // create a new LogsArchiveDestinationGCS
        LogsArchiveDestinationGCS exampleLogsArchiveDestinationGCS = new LogsArchiveDestinationGCS();
        // set LogsArchiveCreateRequestDestination to LogsArchiveDestinationGCS
        exampleLogsArchiveCreateRequestDestination.setActualInstance(exampleLogsArchiveDestinationGCS);
        // to get back the LogsArchiveDestinationGCS set earlier
        LogsArchiveDestinationGCS testLogsArchiveDestinationGCS = (LogsArchiveDestinationGCS) exampleLogsArchiveCreateRequestDestination.getActualInstance();

        // create a new LogsArchiveDestinationS3
        LogsArchiveDestinationS3 exampleLogsArchiveDestinationS3 = new LogsArchiveDestinationS3();
        // set LogsArchiveCreateRequestDestination to LogsArchiveDestinationS3
        exampleLogsArchiveCreateRequestDestination.setActualInstance(exampleLogsArchiveDestinationS3);
        // to get back the LogsArchiveDestinationS3 set earlier
        LogsArchiveDestinationS3 testLogsArchiveDestinationS3 = (LogsArchiveDestinationS3) exampleLogsArchiveCreateRequestDestination.getActualInstance();
    }
}
```


