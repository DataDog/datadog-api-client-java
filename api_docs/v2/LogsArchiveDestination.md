# LogsArchiveDestination

An archive's destination.

## oneOf schemas

- [LogsArchiveDestinationAzure](LogsArchiveDestinationAzure.md)
- [LogsArchiveDestinationGCS](LogsArchiveDestinationGCS.md)
- [LogsArchiveDestinationS3](LogsArchiveDestinationS3.md)

NOTE: this class is nullable.

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.LogsArchiveDestination;
import com.datadog.api.v2.client.model.LogsArchiveDestinationAzure;
import com.datadog.api.v2.client.model.LogsArchiveDestinationGCS;
import com.datadog.api.v2.client.model.LogsArchiveDestinationS3;

public class Example {

  public static void main(String[] args) {
    LogsArchiveDestination exampleLogsArchiveDestination = new LogsArchiveDestination();

    // create a new LogsArchiveDestinationAzure
    LogsArchiveDestinationAzure exampleLogsArchiveDestinationAzure = new LogsArchiveDestinationAzure();
    // set LogsArchiveDestination to LogsArchiveDestinationAzure
    exampleLogsArchiveDestination.setActualInstance(
      exampleLogsArchiveDestinationAzure
    );
    // to get back the LogsArchiveDestinationAzure set earlier
    LogsArchiveDestinationAzure testLogsArchiveDestinationAzure = (LogsArchiveDestinationAzure) exampleLogsArchiveDestination.getActualInstance();

    // create a new LogsArchiveDestinationGCS
    LogsArchiveDestinationGCS exampleLogsArchiveDestinationGCS = new LogsArchiveDestinationGCS();
    // set LogsArchiveDestination to LogsArchiveDestinationGCS
    exampleLogsArchiveDestination.setActualInstance(
      exampleLogsArchiveDestinationGCS
    );
    // to get back the LogsArchiveDestinationGCS set earlier
    LogsArchiveDestinationGCS testLogsArchiveDestinationGCS = (LogsArchiveDestinationGCS) exampleLogsArchiveDestination.getActualInstance();

    // create a new LogsArchiveDestinationS3
    LogsArchiveDestinationS3 exampleLogsArchiveDestinationS3 = new LogsArchiveDestinationS3();
    // set LogsArchiveDestination to LogsArchiveDestinationS3
    exampleLogsArchiveDestination.setActualInstance(
      exampleLogsArchiveDestinationS3
    );
    // to get back the LogsArchiveDestinationS3 set earlier
    LogsArchiveDestinationS3 testLogsArchiveDestinationS3 = (LogsArchiveDestinationS3) exampleLogsArchiveDestination.getActualInstance();
  }
}

```
