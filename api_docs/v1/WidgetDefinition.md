

# WidgetDefinition

[Definition of the widget](https://docs.datadoghq.com/dashboards/widgets/).

## oneOf schemas
* [AlertGraphWidgetDefinition](AlertGraphWidgetDefinition.md)
* [AlertValueWidgetDefinition](AlertValueWidgetDefinition.md)
* [ChangeWidgetDefinition](ChangeWidgetDefinition.md)
* [CheckStatusWidgetDefinition](CheckStatusWidgetDefinition.md)
* [DistributionWidgetDefinition](DistributionWidgetDefinition.md)
* [EventStreamWidgetDefinition](EventStreamWidgetDefinition.md)
* [EventTimelineWidgetDefinition](EventTimelineWidgetDefinition.md)
* [FreeTextWidgetDefinition](FreeTextWidgetDefinition.md)
* [GeomapWidgetDefinition](GeomapWidgetDefinition.md)
* [GroupWidgetDefinition](GroupWidgetDefinition.md)
* [HeatMapWidgetDefinition](HeatMapWidgetDefinition.md)
* [HostMapWidgetDefinition](HostMapWidgetDefinition.md)
* [IFrameWidgetDefinition](IFrameWidgetDefinition.md)
* [ImageWidgetDefinition](ImageWidgetDefinition.md)
* [LogStreamWidgetDefinition](LogStreamWidgetDefinition.md)
* [MonitorSummaryWidgetDefinition](MonitorSummaryWidgetDefinition.md)
* [NoteWidgetDefinition](NoteWidgetDefinition.md)
* [QueryValueWidgetDefinition](QueryValueWidgetDefinition.md)
* [SLOWidgetDefinition](SLOWidgetDefinition.md)
* [ScatterPlotWidgetDefinition](ScatterPlotWidgetDefinition.md)
* [ServiceMapWidgetDefinition](ServiceMapWidgetDefinition.md)
* [ServiceSummaryWidgetDefinition](ServiceSummaryWidgetDefinition.md)
* [TableWidgetDefinition](TableWidgetDefinition.md)
* [TimeseriesWidgetDefinition](TimeseriesWidgetDefinition.md)
* [ToplistWidgetDefinition](ToplistWidgetDefinition.md)

## Example
```java
// Import classes:
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.AlertGraphWidgetDefinition;
import com.datadog.api.v1.client.model.AlertValueWidgetDefinition;
import com.datadog.api.v1.client.model.ChangeWidgetDefinition;
import com.datadog.api.v1.client.model.CheckStatusWidgetDefinition;
import com.datadog.api.v1.client.model.DistributionWidgetDefinition;
import com.datadog.api.v1.client.model.EventStreamWidgetDefinition;
import com.datadog.api.v1.client.model.EventTimelineWidgetDefinition;
import com.datadog.api.v1.client.model.FreeTextWidgetDefinition;
import com.datadog.api.v1.client.model.GeomapWidgetDefinition;
import com.datadog.api.v1.client.model.GroupWidgetDefinition;
import com.datadog.api.v1.client.model.HeatMapWidgetDefinition;
import com.datadog.api.v1.client.model.HostMapWidgetDefinition;
import com.datadog.api.v1.client.model.IFrameWidgetDefinition;
import com.datadog.api.v1.client.model.ImageWidgetDefinition;
import com.datadog.api.v1.client.model.LogStreamWidgetDefinition;
import com.datadog.api.v1.client.model.MonitorSummaryWidgetDefinition;
import com.datadog.api.v1.client.model.NoteWidgetDefinition;
import com.datadog.api.v1.client.model.QueryValueWidgetDefinition;
import com.datadog.api.v1.client.model.SLOWidgetDefinition;
import com.datadog.api.v1.client.model.ScatterPlotWidgetDefinition;
import com.datadog.api.v1.client.model.ServiceMapWidgetDefinition;
import com.datadog.api.v1.client.model.ServiceSummaryWidgetDefinition;
import com.datadog.api.v1.client.model.TableWidgetDefinition;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinition;
import com.datadog.api.v1.client.model.ToplistWidgetDefinition;

public class Example {
    public static void main(String[] args) {
        WidgetDefinition exampleWidgetDefinition = new WidgetDefinition();

        // create a new AlertGraphWidgetDefinition
        AlertGraphWidgetDefinition exampleAlertGraphWidgetDefinition = new AlertGraphWidgetDefinition();
        // set WidgetDefinition to AlertGraphWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleAlertGraphWidgetDefinition);
        // to get back the AlertGraphWidgetDefinition set earlier
        AlertGraphWidgetDefinition testAlertGraphWidgetDefinition = (AlertGraphWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new AlertValueWidgetDefinition
        AlertValueWidgetDefinition exampleAlertValueWidgetDefinition = new AlertValueWidgetDefinition();
        // set WidgetDefinition to AlertValueWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleAlertValueWidgetDefinition);
        // to get back the AlertValueWidgetDefinition set earlier
        AlertValueWidgetDefinition testAlertValueWidgetDefinition = (AlertValueWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new ChangeWidgetDefinition
        ChangeWidgetDefinition exampleChangeWidgetDefinition = new ChangeWidgetDefinition();
        // set WidgetDefinition to ChangeWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleChangeWidgetDefinition);
        // to get back the ChangeWidgetDefinition set earlier
        ChangeWidgetDefinition testChangeWidgetDefinition = (ChangeWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new CheckStatusWidgetDefinition
        CheckStatusWidgetDefinition exampleCheckStatusWidgetDefinition = new CheckStatusWidgetDefinition();
        // set WidgetDefinition to CheckStatusWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleCheckStatusWidgetDefinition);
        // to get back the CheckStatusWidgetDefinition set earlier
        CheckStatusWidgetDefinition testCheckStatusWidgetDefinition = (CheckStatusWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new DistributionWidgetDefinition
        DistributionWidgetDefinition exampleDistributionWidgetDefinition = new DistributionWidgetDefinition();
        // set WidgetDefinition to DistributionWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleDistributionWidgetDefinition);
        // to get back the DistributionWidgetDefinition set earlier
        DistributionWidgetDefinition testDistributionWidgetDefinition = (DistributionWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new EventStreamWidgetDefinition
        EventStreamWidgetDefinition exampleEventStreamWidgetDefinition = new EventStreamWidgetDefinition();
        // set WidgetDefinition to EventStreamWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleEventStreamWidgetDefinition);
        // to get back the EventStreamWidgetDefinition set earlier
        EventStreamWidgetDefinition testEventStreamWidgetDefinition = (EventStreamWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new EventTimelineWidgetDefinition
        EventTimelineWidgetDefinition exampleEventTimelineWidgetDefinition = new EventTimelineWidgetDefinition();
        // set WidgetDefinition to EventTimelineWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleEventTimelineWidgetDefinition);
        // to get back the EventTimelineWidgetDefinition set earlier
        EventTimelineWidgetDefinition testEventTimelineWidgetDefinition = (EventTimelineWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new FreeTextWidgetDefinition
        FreeTextWidgetDefinition exampleFreeTextWidgetDefinition = new FreeTextWidgetDefinition();
        // set WidgetDefinition to FreeTextWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleFreeTextWidgetDefinition);
        // to get back the FreeTextWidgetDefinition set earlier
        FreeTextWidgetDefinition testFreeTextWidgetDefinition = (FreeTextWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new GeomapWidgetDefinition
        GeomapWidgetDefinition exampleGeomapWidgetDefinition = new GeomapWidgetDefinition();
        // set WidgetDefinition to GeomapWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleGeomapWidgetDefinition);
        // to get back the GeomapWidgetDefinition set earlier
        GeomapWidgetDefinition testGeomapWidgetDefinition = (GeomapWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new GroupWidgetDefinition
        GroupWidgetDefinition exampleGroupWidgetDefinition = new GroupWidgetDefinition();
        // set WidgetDefinition to GroupWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleGroupWidgetDefinition);
        // to get back the GroupWidgetDefinition set earlier
        GroupWidgetDefinition testGroupWidgetDefinition = (GroupWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new HeatMapWidgetDefinition
        HeatMapWidgetDefinition exampleHeatMapWidgetDefinition = new HeatMapWidgetDefinition();
        // set WidgetDefinition to HeatMapWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleHeatMapWidgetDefinition);
        // to get back the HeatMapWidgetDefinition set earlier
        HeatMapWidgetDefinition testHeatMapWidgetDefinition = (HeatMapWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new HostMapWidgetDefinition
        HostMapWidgetDefinition exampleHostMapWidgetDefinition = new HostMapWidgetDefinition();
        // set WidgetDefinition to HostMapWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleHostMapWidgetDefinition);
        // to get back the HostMapWidgetDefinition set earlier
        HostMapWidgetDefinition testHostMapWidgetDefinition = (HostMapWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new IFrameWidgetDefinition
        IFrameWidgetDefinition exampleIFrameWidgetDefinition = new IFrameWidgetDefinition();
        // set WidgetDefinition to IFrameWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleIFrameWidgetDefinition);
        // to get back the IFrameWidgetDefinition set earlier
        IFrameWidgetDefinition testIFrameWidgetDefinition = (IFrameWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new ImageWidgetDefinition
        ImageWidgetDefinition exampleImageWidgetDefinition = new ImageWidgetDefinition();
        // set WidgetDefinition to ImageWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleImageWidgetDefinition);
        // to get back the ImageWidgetDefinition set earlier
        ImageWidgetDefinition testImageWidgetDefinition = (ImageWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new LogStreamWidgetDefinition
        LogStreamWidgetDefinition exampleLogStreamWidgetDefinition = new LogStreamWidgetDefinition();
        // set WidgetDefinition to LogStreamWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleLogStreamWidgetDefinition);
        // to get back the LogStreamWidgetDefinition set earlier
        LogStreamWidgetDefinition testLogStreamWidgetDefinition = (LogStreamWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new MonitorSummaryWidgetDefinition
        MonitorSummaryWidgetDefinition exampleMonitorSummaryWidgetDefinition = new MonitorSummaryWidgetDefinition();
        // set WidgetDefinition to MonitorSummaryWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleMonitorSummaryWidgetDefinition);
        // to get back the MonitorSummaryWidgetDefinition set earlier
        MonitorSummaryWidgetDefinition testMonitorSummaryWidgetDefinition = (MonitorSummaryWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new NoteWidgetDefinition
        NoteWidgetDefinition exampleNoteWidgetDefinition = new NoteWidgetDefinition();
        // set WidgetDefinition to NoteWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleNoteWidgetDefinition);
        // to get back the NoteWidgetDefinition set earlier
        NoteWidgetDefinition testNoteWidgetDefinition = (NoteWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new QueryValueWidgetDefinition
        QueryValueWidgetDefinition exampleQueryValueWidgetDefinition = new QueryValueWidgetDefinition();
        // set WidgetDefinition to QueryValueWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleQueryValueWidgetDefinition);
        // to get back the QueryValueWidgetDefinition set earlier
        QueryValueWidgetDefinition testQueryValueWidgetDefinition = (QueryValueWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new SLOWidgetDefinition
        SLOWidgetDefinition exampleSLOWidgetDefinition = new SLOWidgetDefinition();
        // set WidgetDefinition to SLOWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleSLOWidgetDefinition);
        // to get back the SLOWidgetDefinition set earlier
        SLOWidgetDefinition testSLOWidgetDefinition = (SLOWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new ScatterPlotWidgetDefinition
        ScatterPlotWidgetDefinition exampleScatterPlotWidgetDefinition = new ScatterPlotWidgetDefinition();
        // set WidgetDefinition to ScatterPlotWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleScatterPlotWidgetDefinition);
        // to get back the ScatterPlotWidgetDefinition set earlier
        ScatterPlotWidgetDefinition testScatterPlotWidgetDefinition = (ScatterPlotWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new ServiceMapWidgetDefinition
        ServiceMapWidgetDefinition exampleServiceMapWidgetDefinition = new ServiceMapWidgetDefinition();
        // set WidgetDefinition to ServiceMapWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleServiceMapWidgetDefinition);
        // to get back the ServiceMapWidgetDefinition set earlier
        ServiceMapWidgetDefinition testServiceMapWidgetDefinition = (ServiceMapWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new ServiceSummaryWidgetDefinition
        ServiceSummaryWidgetDefinition exampleServiceSummaryWidgetDefinition = new ServiceSummaryWidgetDefinition();
        // set WidgetDefinition to ServiceSummaryWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleServiceSummaryWidgetDefinition);
        // to get back the ServiceSummaryWidgetDefinition set earlier
        ServiceSummaryWidgetDefinition testServiceSummaryWidgetDefinition = (ServiceSummaryWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new TableWidgetDefinition
        TableWidgetDefinition exampleTableWidgetDefinition = new TableWidgetDefinition();
        // set WidgetDefinition to TableWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleTableWidgetDefinition);
        // to get back the TableWidgetDefinition set earlier
        TableWidgetDefinition testTableWidgetDefinition = (TableWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new TimeseriesWidgetDefinition
        TimeseriesWidgetDefinition exampleTimeseriesWidgetDefinition = new TimeseriesWidgetDefinition();
        // set WidgetDefinition to TimeseriesWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleTimeseriesWidgetDefinition);
        // to get back the TimeseriesWidgetDefinition set earlier
        TimeseriesWidgetDefinition testTimeseriesWidgetDefinition = (TimeseriesWidgetDefinition) exampleWidgetDefinition.getActualInstance();

        // create a new ToplistWidgetDefinition
        ToplistWidgetDefinition exampleToplistWidgetDefinition = new ToplistWidgetDefinition();
        // set WidgetDefinition to ToplistWidgetDefinition
        exampleWidgetDefinition.setActualInstance(exampleToplistWidgetDefinition);
        // to get back the ToplistWidgetDefinition set earlier
        ToplistWidgetDefinition testToplistWidgetDefinition = (ToplistWidgetDefinition) exampleWidgetDefinition.getActualInstance();
    }
}
```


