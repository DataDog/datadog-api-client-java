

# MetricsAndMetricTagConfigurations

Object for a metrics and metric tag configurations.

## oneOf schemas
* [Metric](Metric.md)
* [MetricTagConfiguration](MetricTagConfiguration.md)

## Example
```java
// Import classes:
import com.datadog.api.v2.client.model.MetricsAndMetricTagConfigurations;
import com.datadog.api.v2.client.model.Metric;
import com.datadog.api.v2.client.model.MetricTagConfiguration;

public class Example {
    public static void main(String[] args) {
        MetricsAndMetricTagConfigurations exampleMetricsAndMetricTagConfigurations = new MetricsAndMetricTagConfigurations();

        // create a new Metric
        Metric exampleMetric = new Metric();
        // set MetricsAndMetricTagConfigurations to Metric
        exampleMetricsAndMetricTagConfigurations.setActualInstance(exampleMetric);
        // to get back the Metric set earlier
        Metric testMetric = (Metric) exampleMetricsAndMetricTagConfigurations.getActualInstance();

        // create a new MetricTagConfiguration
        MetricTagConfiguration exampleMetricTagConfiguration = new MetricTagConfiguration();
        // set MetricsAndMetricTagConfigurations to MetricTagConfiguration
        exampleMetricsAndMetricTagConfigurations.setActualInstance(exampleMetricTagConfiguration);
        // to get back the MetricTagConfiguration set earlier
        MetricTagConfiguration testMetricTagConfiguration = (MetricTagConfiguration) exampleMetricsAndMetricTagConfigurations.getActualInstance();
    }
}
```


