# LogsProcessor

Definition of a logs processor.

## oneOf schemas

- [LogsArithmeticProcessor](LogsArithmeticProcessor.md)
- [LogsAttributeRemapper](LogsAttributeRemapper.md)
- [LogsCategoryProcessor](LogsCategoryProcessor.md)
- [LogsDateRemapper](LogsDateRemapper.md)
- [LogsGeoIPParser](LogsGeoIPParser.md)
- [LogsGrokParser](LogsGrokParser.md)
- [LogsLookupProcessor](LogsLookupProcessor.md)
- [LogsMessageRemapper](LogsMessageRemapper.md)
- [LogsPipelineProcessor](LogsPipelineProcessor.md)
- [LogsServiceRemapper](LogsServiceRemapper.md)
- [LogsStatusRemapper](LogsStatusRemapper.md)
- [LogsStringBuilderProcessor](LogsStringBuilderProcessor.md)
- [LogsTraceRemapper](LogsTraceRemapper.md)
- [LogsURLParser](LogsURLParser.md)
- [LogsUserAgentParser](LogsUserAgentParser.md)

## Example

```java
// Import classes:
import com.datadog.api.v1.client.model.LogsArithmeticProcessor;
import com.datadog.api.v1.client.model.LogsAttributeRemapper;
import com.datadog.api.v1.client.model.LogsCategoryProcessor;
import com.datadog.api.v1.client.model.LogsDateRemapper;
import com.datadog.api.v1.client.model.LogsGeoIPParser;
import com.datadog.api.v1.client.model.LogsGrokParser;
import com.datadog.api.v1.client.model.LogsLookupProcessor;
import com.datadog.api.v1.client.model.LogsMessageRemapper;
import com.datadog.api.v1.client.model.LogsPipelineProcessor;
import com.datadog.api.v1.client.model.LogsProcessor;
import com.datadog.api.v1.client.model.LogsServiceRemapper;
import com.datadog.api.v1.client.model.LogsStatusRemapper;
import com.datadog.api.v1.client.model.LogsStringBuilderProcessor;
import com.datadog.api.v1.client.model.LogsTraceRemapper;
import com.datadog.api.v1.client.model.LogsURLParser;
import com.datadog.api.v1.client.model.LogsUserAgentParser;

public class Example {

  public static void main(String[] args) {
    LogsProcessor exampleLogsProcessor = new LogsProcessor();

    // create a new LogsArithmeticProcessor
    LogsArithmeticProcessor exampleLogsArithmeticProcessor = new LogsArithmeticProcessor();
    // set LogsProcessor to LogsArithmeticProcessor
    exampleLogsProcessor.setActualInstance(exampleLogsArithmeticProcessor);
    // to get back the LogsArithmeticProcessor set earlier
    LogsArithmeticProcessor testLogsArithmeticProcessor = (LogsArithmeticProcessor) exampleLogsProcessor.getActualInstance();

    // create a new LogsAttributeRemapper
    LogsAttributeRemapper exampleLogsAttributeRemapper = new LogsAttributeRemapper();
    // set LogsProcessor to LogsAttributeRemapper
    exampleLogsProcessor.setActualInstance(exampleLogsAttributeRemapper);
    // to get back the LogsAttributeRemapper set earlier
    LogsAttributeRemapper testLogsAttributeRemapper = (LogsAttributeRemapper) exampleLogsProcessor.getActualInstance();

    // create a new LogsCategoryProcessor
    LogsCategoryProcessor exampleLogsCategoryProcessor = new LogsCategoryProcessor();
    // set LogsProcessor to LogsCategoryProcessor
    exampleLogsProcessor.setActualInstance(exampleLogsCategoryProcessor);
    // to get back the LogsCategoryProcessor set earlier
    LogsCategoryProcessor testLogsCategoryProcessor = (LogsCategoryProcessor) exampleLogsProcessor.getActualInstance();

    // create a new LogsDateRemapper
    LogsDateRemapper exampleLogsDateRemapper = new LogsDateRemapper();
    // set LogsProcessor to LogsDateRemapper
    exampleLogsProcessor.setActualInstance(exampleLogsDateRemapper);
    // to get back the LogsDateRemapper set earlier
    LogsDateRemapper testLogsDateRemapper = (LogsDateRemapper) exampleLogsProcessor.getActualInstance();

    // create a new LogsGeoIPParser
    LogsGeoIPParser exampleLogsGeoIPParser = new LogsGeoIPParser();
    // set LogsProcessor to LogsGeoIPParser
    exampleLogsProcessor.setActualInstance(exampleLogsGeoIPParser);
    // to get back the LogsGeoIPParser set earlier
    LogsGeoIPParser testLogsGeoIPParser = (LogsGeoIPParser) exampleLogsProcessor.getActualInstance();

    // create a new LogsGrokParser
    LogsGrokParser exampleLogsGrokParser = new LogsGrokParser();
    // set LogsProcessor to LogsGrokParser
    exampleLogsProcessor.setActualInstance(exampleLogsGrokParser);
    // to get back the LogsGrokParser set earlier
    LogsGrokParser testLogsGrokParser = (LogsGrokParser) exampleLogsProcessor.getActualInstance();

    // create a new LogsLookupProcessor
    LogsLookupProcessor exampleLogsLookupProcessor = new LogsLookupProcessor();
    // set LogsProcessor to LogsLookupProcessor
    exampleLogsProcessor.setActualInstance(exampleLogsLookupProcessor);
    // to get back the LogsLookupProcessor set earlier
    LogsLookupProcessor testLogsLookupProcessor = (LogsLookupProcessor) exampleLogsProcessor.getActualInstance();

    // create a new LogsMessageRemapper
    LogsMessageRemapper exampleLogsMessageRemapper = new LogsMessageRemapper();
    // set LogsProcessor to LogsMessageRemapper
    exampleLogsProcessor.setActualInstance(exampleLogsMessageRemapper);
    // to get back the LogsMessageRemapper set earlier
    LogsMessageRemapper testLogsMessageRemapper = (LogsMessageRemapper) exampleLogsProcessor.getActualInstance();

    // create a new LogsPipelineProcessor
    LogsPipelineProcessor exampleLogsPipelineProcessor = new LogsPipelineProcessor();
    // set LogsProcessor to LogsPipelineProcessor
    exampleLogsProcessor.setActualInstance(exampleLogsPipelineProcessor);
    // to get back the LogsPipelineProcessor set earlier
    LogsPipelineProcessor testLogsPipelineProcessor = (LogsPipelineProcessor) exampleLogsProcessor.getActualInstance();

    // create a new LogsServiceRemapper
    LogsServiceRemapper exampleLogsServiceRemapper = new LogsServiceRemapper();
    // set LogsProcessor to LogsServiceRemapper
    exampleLogsProcessor.setActualInstance(exampleLogsServiceRemapper);
    // to get back the LogsServiceRemapper set earlier
    LogsServiceRemapper testLogsServiceRemapper = (LogsServiceRemapper) exampleLogsProcessor.getActualInstance();

    // create a new LogsStatusRemapper
    LogsStatusRemapper exampleLogsStatusRemapper = new LogsStatusRemapper();
    // set LogsProcessor to LogsStatusRemapper
    exampleLogsProcessor.setActualInstance(exampleLogsStatusRemapper);
    // to get back the LogsStatusRemapper set earlier
    LogsStatusRemapper testLogsStatusRemapper = (LogsStatusRemapper) exampleLogsProcessor.getActualInstance();

    // create a new LogsStringBuilderProcessor
    LogsStringBuilderProcessor exampleLogsStringBuilderProcessor = new LogsStringBuilderProcessor();
    // set LogsProcessor to LogsStringBuilderProcessor
    exampleLogsProcessor.setActualInstance(exampleLogsStringBuilderProcessor);
    // to get back the LogsStringBuilderProcessor set earlier
    LogsStringBuilderProcessor testLogsStringBuilderProcessor = (LogsStringBuilderProcessor) exampleLogsProcessor.getActualInstance();

    // create a new LogsTraceRemapper
    LogsTraceRemapper exampleLogsTraceRemapper = new LogsTraceRemapper();
    // set LogsProcessor to LogsTraceRemapper
    exampleLogsProcessor.setActualInstance(exampleLogsTraceRemapper);
    // to get back the LogsTraceRemapper set earlier
    LogsTraceRemapper testLogsTraceRemapper = (LogsTraceRemapper) exampleLogsProcessor.getActualInstance();

    // create a new LogsURLParser
    LogsURLParser exampleLogsURLParser = new LogsURLParser();
    // set LogsProcessor to LogsURLParser
    exampleLogsProcessor.setActualInstance(exampleLogsURLParser);
    // to get back the LogsURLParser set earlier
    LogsURLParser testLogsURLParser = (LogsURLParser) exampleLogsProcessor.getActualInstance();

    // create a new LogsUserAgentParser
    LogsUserAgentParser exampleLogsUserAgentParser = new LogsUserAgentParser();
    // set LogsProcessor to LogsUserAgentParser
    exampleLogsProcessor.setActualInstance(exampleLogsUserAgentParser);
    // to get back the LogsUserAgentParser set earlier
    LogsUserAgentParser testLogsUserAgentParser = (LogsUserAgentParser) exampleLogsProcessor.getActualInstance();
  }
}

```
