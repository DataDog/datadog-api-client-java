# MetricVolumes

Possible response objects for a metric's volume.

## oneOf schemas

- [MetricDistinctVolume](MetricDistinctVolume.md)
- [MetricIngestedIndexedVolume](MetricIngestedIndexedVolume.md)

## Example

```java
// Import classes:
import com.datadog.api.v2.client.model.MetricDistinctVolume;
import com.datadog.api.v2.client.model.MetricIngestedIndexedVolume;
import com.datadog.api.v2.client.model.MetricVolumes;

public class Example {

  public static void main(String[] args) {
    MetricVolumes exampleMetricVolumes = new MetricVolumes();

    // create a new MetricDistinctVolume
    MetricDistinctVolume exampleMetricDistinctVolume = new MetricDistinctVolume();
    // set MetricVolumes to MetricDistinctVolume
    exampleMetricVolumes.setActualInstance(exampleMetricDistinctVolume);
    // to get back the MetricDistinctVolume set earlier
    MetricDistinctVolume testMetricDistinctVolume = (MetricDistinctVolume) exampleMetricVolumes.getActualInstance();

    // create a new MetricIngestedIndexedVolume
    MetricIngestedIndexedVolume exampleMetricIngestedIndexedVolume = new MetricIngestedIndexedVolume();
    // set MetricVolumes to MetricIngestedIndexedVolume
    exampleMetricVolumes.setActualInstance(exampleMetricIngestedIndexedVolume);
    // to get back the MetricIngestedIndexedVolume set earlier
    MetricIngestedIndexedVolume testMetricIngestedIndexedVolume = (MetricIngestedIndexedVolume) exampleMetricVolumes.getActualInstance();
  }
}

```
