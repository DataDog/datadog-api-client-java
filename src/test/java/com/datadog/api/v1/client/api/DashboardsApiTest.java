/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * API tests for DashboardsApi
 */
public class DashboardsApiTest extends V1ApiTest{

    private static DashboardsApi api;
    private static SloApi sloApi;
    private List<String> cleanupDashIDs = new ArrayList<>();
    private String deleteSLO = null;
    private final ServiceLevelObjective eventSLO = new ServiceLevelObjective()
            .type(ServiceLevelObjectiveType.METRIC)
            .name("HTTP Return Codes")
            .description("Make sure we don't have too many failed HTTP responses")
            .thresholds(Arrays.asList(new SLOThreshold()
                    .timeframe(SLOTimeframe.SEVEN_DAYS)
                    .target(95.0)
                    .warning(98.0)
            ))
            .query(new ServiceLevelObjectiveQuery()
                // Using the default function with non-existant metrics ensures that this
                // test will behave the same in all environments. The default function
                // should never be used for real SLO queries.
                 .numerator("default(sum:non_existant_metric{*}.as_count(), 1)")
                 .denominator("default(sum:non_existant_metric{*}.as_count(), 2)")
            );

    @BeforeClass
    public static void initAPI() {
        api = new DashboardsApi(generalApiClient);
        sloApi = new SloApi(generalApiClient);
    }

    @After
    public void cleanupDash() throws ApiException {
        try {
            for(String id: cleanupDashIDs) {
                api.deleteDashboard(id).execute();
            }
        } catch (ApiException e) {
            System.out.printf("Error deleting dashboard, it may have already been deleted by a test: %s", e.getMessage());
        }
        cleanupDashIDs = new ArrayList<>();
        if (deleteSLO != null) {
            try {
                sloApi.deleteSLO(deleteSLO).execute();
            } catch (ApiException e) {
                if (e.getCode() == 404) {
                    // doesn't exist => ok
                } else {
                    throw e;
                }
            } finally {
                deleteSLO = null;
            }
        }
    }

    /**
     * Tests the lifecycle of a dashbaord
     * Includes creating an example of each widget and creating an example of a FREE and ORDERED dashboard
     *
     * @throws ApiException
     */
    @Test
    public void dashboardLifecycleTest() throws ApiException {
        // Create a Dashboard with each available Widget type

        // Create an SLO to reference in the SLO widget
        ServiceLevelObjectiveListResponse sloResp = sloApi.createSLO().body(eventSLO).execute();
        ServiceLevelObjective slo = sloResp.getData().get(0);
        deleteSLO = slo.getId();

        // Add widgets to this list and the created dashboard to have them dynamically tested against the "get" call
        Set<Widget> orderedWidgetList = new HashSet();
        Set<Widget> freeWidgetList = new HashSet();

        // Alert Graph Widget
        AlertGraphWidgetDefinition alertGraphDefinition = new AlertGraphWidgetDefinition()
                .alertId("1234").vizType(WidgetVizType.TIMESERIES)
                .title("Test Alert Graph Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES)
                );
        Widget alertGraphWidget = new Widget().definition(alertGraphDefinition);
        orderedWidgetList.add(alertGraphWidget);

        // Alert Value Widget
        AlertValueWidgetDefinition alertValueDefinition = new AlertValueWidgetDefinition()
                .alertId("1234").precision(2L).unit("ms").titleSize("12")
                .textAlign(WidgetTextAlign.CENTER)
                .title("Test Alert Value Widget")
                .titleAlign(WidgetTextAlign.RIGHT);
        Widget alertValueWidget = new Widget().definition(alertValueDefinition);
        orderedWidgetList.add(alertValueWidget);

        // Change Widget
        ChangeWidgetDefinition changeWidgetDefinition = new ChangeWidgetDefinition()
                .title("Test Change Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES))
                .addRequestsItem(new ChangeWidgetRequest().q("avg:system.load.1{*}").changeType(
                        WidgetChangeType.ABSOLUTE)
                        .compareTo(WidgetCompareTo.HOUR_BEFORE)
                        .increaseGood(true).orderBy(WidgetOrderBy.CHANGE)
                        .orderDir(WidgetSort.ASCENDING)
                        .showPresent(true)
                );

        Widget changeWidget = new Widget().definition(changeWidgetDefinition);
        orderedWidgetList.add(changeWidget);

        // Check Status Widget
        CheckStatusWidgetDefinition checkStatusWidgetDefinition = new CheckStatusWidgetDefinition()
                .check("service_check.up").grouping(WidgetGrouping.CHECK)
                .group("*").addTagsItem("foo:bar").addGroupByItem("bar").title("Test Check Status Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES));
        Widget checkStatusWidget = new Widget().definition(checkStatusWidgetDefinition);
        orderedWidgetList.add(checkStatusWidget);

        // Distribution Widget
        DistributionWidgetDefinition distributionWidgetDefinition = new DistributionWidgetDefinition()
                .addRequestsItem(
                        new DistributionWidgetRequest()
                                .q("avg:system.load.1{*}")
                                .style(new WidgetStyle().palette("dog_classic"))
                ).showLegend(true).title("Test Distribution Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES));
        Widget distributionWidget = new Widget().definition(distributionWidgetDefinition);
        orderedWidgetList.add(distributionWidget);

        // Event Stream Widget ONLY AVAILABLE ON FREE LAYOUTS
        EventStreamWidgetDefinition eventStreamWidgetDefinition = new EventStreamWidgetDefinition()
                .query("Build successful").eventSize(WidgetEventSize.LARGE)
                .title("Test Event Stream Widget").titleSize("16")
                .titleAlign(WidgetTextAlign.CENTER)
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_ONE_DAY));
        Widget eventStreamWidget = new Widget().definition(eventStreamWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(eventStreamWidget);

        // Event Timeline Widget ONLY AVAILABLE ON FREE LAYOUTS
        EventTimelineWidgetDefinition eventTimelineWidgetDefinition = new EventTimelineWidgetDefinition()
                .query("Build Failed").title("Test Event Timeline Widget").titleSize("16")
                .titleAlign(WidgetTextAlign.LEFT)
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_ONE_MONTH));
        Widget eventTimelineWidget = new Widget().definition(eventTimelineWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(eventTimelineWidget);

        // Free Text Widget ONLY AVAILABLE ON FREE LAYOUTS
        FreeTextWidgetDefinition freeTextWidgetDefinition = new FreeTextWidgetDefinition()
                .text("Test me text").color("blue").fontSize("16")
                .textAlign(WidgetTextAlign.CENTER);
        Widget freeTextWidget = new Widget().definition(freeTextWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(freeTextWidget);

        // Group Widget
        NoteWidgetDefinition groupNoteWidgetDefinition = new NoteWidgetDefinition()
                .content("Test Note Inside Group");
        Widget groupNoteWidget = new Widget().definition(groupNoteWidgetDefinition);
        GroupWidgetDefinition groupWidgetDefinition = new GroupWidgetDefinition()
                .layoutType(WidgetLayoutType.ORDERED)
                .title("Test Group Widget")
                .addWidgetsItem(groupNoteWidget);
        Widget groupWidget = new Widget().definition(groupWidgetDefinition);
        orderedWidgetList.add(groupWidget);

        // HeatMap Widget
        HeatMapWidgetDefinition heatMapWidgetDefinition = new HeatMapWidgetDefinition()
                .addRequestsItem(new HeatMapWidgetRequest()
                        .style(new WidgetStyle().palette("dog_classic"))
                        .q("avg:system.load.1{*}")
                ).yaxis(new WidgetAxis().includeZero(true).min("0").max("100").scale("linear"))
                .addEventsItem(new WidgetEvent().q("Build succeeded").tagsExecution("tags"))
                .title("Test Headmap Widget").showLegend(true)
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES))
                .showLegend(true).legendSize(WidgetLegendSize.FOUR);
        Widget heatMapWidget = new Widget().definition(heatMapWidgetDefinition);
        orderedWidgetList.add(heatMapWidget);

        // HostMap Widget
        HostMapWidgetDefinition hostMapWidgetDefinition = new HostMapWidgetDefinition()
                .nodeType(WidgetNodeType.CONTAINER)
                .requests(new HostMapWidgetDefinitionRequests()
                        .fill(new HostMapRequest().q("avg:system.load.1{*}"))
                        .size(new HostMapRequest().q("avg:system.load.1{*}"))
                )
                .noMetricHosts(true)
                .noGroupHosts(true)
                .addGroupItem("env:prod")
                .addScopeItem("foo")
                .style(new HostMapWidgetDefinitionStyle()
                        .palette("dog_classic").paletteFlip(true).fillMin("0").fillMax("100"))
                .title("Test HostMap Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16");
        Widget hostMapWidget = new Widget().definition(hostMapWidgetDefinition);
        orderedWidgetList.add(hostMapWidget);

        // Iframe Widget ONLY AVAILABLE ON FREE LAYOUTS
        IFrameWidgetDefinition iFrameWidgetDefinition = new IFrameWidgetDefinition()
                .url("https://datadoghq.com");
        Widget iFrameWidget = new Widget().definition(iFrameWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(iFrameWidget);

        // Image Widget ONLY AVAILABLE ON FREE LAYOUTS
        ImageWidgetDefinition imageWidgetDefinition = new ImageWidgetDefinition()
                .url("https://docs.datadoghq.com/images/dashboards/widgets/image/image.mp4")
                .sizing(WidgetImageSizing.CENTER)
                .margin(WidgetMargin.LARGE);
        Widget imageWidget = new Widget().definition(imageWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(imageWidget);

        // LogStream ONLY AVAILABLE ON FREE LAYOUTS
        LogStreamWidgetDefinition logStreamWidgetDefinition = new LogStreamWidgetDefinition()
                .addIndexesItem("main")
                .query("Route XYZ failed")
                .addColumnsItem("Route")
                .title("Test Logstream Widget")
                .titleSize("16")
                .titleAlign(WidgetTextAlign.RIGHT)
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_TWO_DAYS));
        Widget logStreamWidget = new Widget().definition(logStreamWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(logStreamWidget);

        // Monitor Summary ONLY AVAILABLE ON FREE LAYOUTS
        MonitorSummaryWidgetDefinition monitorSummaryWidgetDefinition = new MonitorSummaryWidgetDefinition()
                .query("Errors are increasing")
                .summaryType(WidgetSummaryType.COMBINED)
                .sort(WidgetSort.ASCENDING)
                .displayFormat(WidgetMonitorSummaryDisplayFormat.COUNTS)
                .colorPreference(WidgetColorPreference.BACKGROUND)
                .hideZeroCounts(false)
                .showLastTriggered(true)
                .title("Test Monitor Summary Widget")
                .titleSize("16")
                .titleAlign(WidgetTextAlign.CENTER);
        Widget monitorSummaryWidget = new Widget().definition(monitorSummaryWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(monitorSummaryWidget);

        // Note Widget
        NoteWidgetDefinition noteDefinition = new NoteWidgetDefinition()
                .fontSize("13").content("Test Note Widget Example")
                .backgroundColor("blue").textAlign(WidgetTextAlign.CENTER)
                .showTick(true).tickPos("4").tickEdge(WidgetTickEdge.BOTTOM);
        Widget noteWidget = new Widget().definition(noteDefinition);
        orderedWidgetList.add(noteWidget);

        // Query Value Widget
        QueryValueWidgetDefinition queryValueWidgetDefinition = new QueryValueWidgetDefinition()
                .addRequestsItem(
                        new QueryValueWidgetRequest().q("avg:system.load.1{*}")
                                .aggregator(WidgetAggregator.AVERAGE)
                                .addConditionalFormatsItem(new WidgetConditionalFormat()
                                        .comparator(WidgetComparator.GREATER_THAN)
                                        .value(7.)
                                        .palette(WidgetPalette.RED_ON_WHITE)
                                        .customBgColor("blue")
                                        .customFgColor("black")
                                        .imageUrl("https://docs.datadoghq.com/images/dashboards/widgets/image/image.mp4")
                                )
                ).autoscale(true)
                .customUnit("ns")
                .precision(2L)
                .textAlign(WidgetTextAlign.CENTER)
                .title("Test Query Value Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES));
        Widget queryValueWidget = new Widget().definition(queryValueWidgetDefinition);
        orderedWidgetList.add(queryValueWidget);

        // Scatter Plot Widget
        ScatterPlotWidgetDefinition scatterPlotWidgetDefinition = new ScatterPlotWidgetDefinition()
                .requests(new ScatterPlotWidgetDefinitionRequests()
                        .x(new ScatterPlotRequest()
                                .q("avg:system.load.1{*}")
                                .aggregator(WidgetAggregator.AVERAGE)
                        )
                        .y(new ScatterPlotRequest()
                                .q("avg:system.load.1{*}")
                                .aggregator(WidgetAggregator.AVERAGE)
                        )
                ).xaxis(new WidgetAxis().scale("linear").min("0").max("100").includeZero(true))
                .yaxis(new WidgetAxis().scale("linear").min("0").max("100").includeZero(true))
                .addColorByGroupsItem("env")
                .title("Test ScatterPlot Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES));
        Widget scatterPlotWidget = new Widget().definition(scatterPlotWidgetDefinition);
        orderedWidgetList.add(scatterPlotWidget);

        // SLO Widget
        SLOWidgetDefinition sloWidgetDefinition = new SLOWidgetDefinition()
                .viewType("detail").title("Test SLO Widget").titleSize("16")
                .titleAlign(WidgetTextAlign.CENTER)
                .sloId(slo.getId())
                .showErrorBudget(true)
                .viewMode(WidgetViewMode.BOTH)
                .addTimeWindowsItem(WidgetTimeWindows.SEVEN_DAYS);
        Widget sloWidget = new Widget().definition(sloWidgetDefinition);
        orderedWidgetList.add(sloWidget);

        // Service Map Widget
        ServiceMapWidgetDefinition serviceMapWidgetDefinition = new ServiceMapWidgetDefinition()
                .addFiltersItem("*")
                .service("1234")
                .title("Test Service Map Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16");
        Widget serviceMapWidget = new Widget().definition(serviceMapWidgetDefinition);
        orderedWidgetList.add(serviceMapWidget);

        // Service Summary Widget
        ServiceSummaryWidgetDefinition serviceSummaryWidgetDefinition = new ServiceSummaryWidgetDefinition()
                .env("prod")
                .service("web")
                .spanName("endpoint")
                .showHits(true).showErrors(true).showLatency(true).showBreakdown(true)
                .showDistribution(true).showResourceList(true)
                .sizeFormat(WidgetSizeFormat.LARGE)
                .displayFormat(WidgetServiceSummaryDisplayFormat.TWO_COLUMN)
                .title("Test Service Summary Widget")
                .titleSize("16")
                .titleAlign(WidgetTextAlign.CENTER)
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_ONE_HOUR));
        Widget serviceSummaryWidget = new Widget().definition(serviceSummaryWidgetDefinition)
                .layout(new WidgetLayout().height(10L).width(10L).x(0L).y(0L));
        freeWidgetList.add(serviceSummaryWidget);

        // Table Widget
        TableWidgetDefinition tableWidgetDefinition = new TableWidgetDefinition()
                .addRequestsItem(new TableWidgetRequest()
                        .q("avg:system.load.1{*}")
                        .alias("System Load")
                        .aggregator(WidgetAggregator.AVERAGE)
                        .limit(50L)
                        .order(WidgetSort.ASCENDING)
                        .addConditionalFormatsItem(new WidgetConditionalFormat()
                                .comparator(WidgetComparator.GREATER_THAN)
                                .value(7.)
                                .palette(WidgetPalette.RED_ON_WHITE)
                                .customBgColor("blue")
                                .customFgColor("black")
                                .imageUrl("https://docs.datadoghq.com/images/dashboards/widgets/image/image.mp4")
                        )
                ).title("Test Table Widget").titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES));
        Widget tableWidget = new Widget().definition(tableWidgetDefinition);
        orderedWidgetList.add(tableWidget);

        // Timeseries Widget
        TimeseriesWidgetDefinition timeseriesWidgetDefinition = new TimeseriesWidgetDefinition()
                .addRequestsItem(new TimeseriesWidgetRequest()
                        .q("avg:system.load.1{*}")
                        .style(new TimeseriesWidgetRequestStyle()
                                .palette("dog_classic")
                                .lineType(WidgetLineType.DASHED)
                                .lineWidth(WidgetLineWidth.THICK)
                        ).addMetadataItem(new TimeseriesWidgetRequestMetadata()
                                .expression("avg:system.load.1{*}").aliasName("Aliased metric")
                        ).displayType(WidgetDisplayType.LINE)
                ).yaxis(new WidgetAxis().includeZero(true).min("0").max("100").scale("linear").label("Widget Scale"))
                .addEventsItem(new WidgetEvent().q("Build succeeded"))
                .addMarkersItem(new WidgetMarker()
                        .value("y=15").displayType("error dashed").label("error threshold")
                        .time(WidgetLiveSpan.PAST_FOUR_HOURS.toString()))
                .title("Test Timeseries Widget").showLegend(true)
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16")
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES))
                .showLegend(true).legendSize(WidgetLegendSize.SIXTEEN);
        Widget timeseriesWidget = new Widget().definition(timeseriesWidgetDefinition);
        orderedWidgetList.add(timeseriesWidget);

        // Timeseries Widget with Process query
        TimeseriesWidgetDefinition timeseriesWidgetDefinitionProcessQuery = new TimeseriesWidgetDefinition()
                .addRequestsItem(new TimeseriesWidgetRequest()
                        .processQuery(
                                new ProcessQueryDefinition()
                                        .metric("process.stat.cpu.total_pct")
                                        .addFilterByItem("account:test")
                                        .limit(10L)
                                        .searchBy("editor")
                        )
                        .style(new TimeseriesWidgetRequestStyle()
                                .palette("dog_classic")
                                .lineType(WidgetLineType.DASHED)
                                .lineWidth(WidgetLineWidth.THICK)
                        ).addMetadataItem(new TimeseriesWidgetRequestMetadata()
                                .expression("avg:system.load.1{*}").aliasName("Aliased metric")
                        ).displayType(WidgetDisplayType.LINE)
                ).yaxis(new WidgetAxis().includeZero(true).min("0").max("100").scale("linear"))
                .addEventsItem(new WidgetEvent().q("Build succeeded"))
                .addMarkersItem(new WidgetMarker()
                        .value("y=15").displayType("error dashed").label("error threshold")
                        .time(WidgetLiveSpan.PAST_FOUR_HOURS.toString()))
                .title("Test Timeseries Widget with Process Query").showLegend(true)
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16")
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES))
                .showLegend(true).legendSize(WidgetLegendSize.SIXTEEN);
        Widget timeseriesWidgetProcessQuery = new Widget().definition(timeseriesWidgetDefinitionProcessQuery);
        orderedWidgetList.add(timeseriesWidgetProcessQuery);

        // Timeseries Widget with Log query (APM/Log/Network/Rum share schemas, so only test one)
        TimeseriesWidgetDefinition timeseriesWidgetDefinitionLogQuery = new TimeseriesWidgetDefinition()
                .addRequestsItem(new TimeseriesWidgetRequest()
                        .logQuery(
                                new LogQueryDefinition()
                                        .index("main")
                                        .compute(new LogsQueryCompute().aggregation("count").facet("host").interval(10L))
                                        .search(new LogQueryDefinitionSearch().query("Error parsing"))
                                        .addGroupByItem(new LogQueryDefinitionGroupBy().facet("host").limit(5L).sort(
                                                new LogQueryDefinitionSort().aggregation("count").order(WidgetSort.ASCENDING)
                                        ))
                        )
                        .style(new TimeseriesWidgetRequestStyle()
                                .palette("dog_classic")
                                .lineType(WidgetLineType.DASHED)
                                .lineWidth(WidgetLineWidth.THICK)
                        ).addMetadataItem(new TimeseriesWidgetRequestMetadata()
                                .expression("avg:system.load.1{*}").aliasName("Aliased metric")
                        ).displayType(WidgetDisplayType.LINE)
                ).yaxis(new WidgetAxis().includeZero(true).min("0").max("100").scale("linear"))
                .addEventsItem(new WidgetEvent().q("Build succeeded"))
                .addMarkersItem(new WidgetMarker()
                        .value("y=15").displayType("error dashed").label("error threshold")
                        .time(WidgetLiveSpan.PAST_FOUR_HOURS.toString()))
                .title("Test Timeseries Widget with Log Query").showLegend(true)
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16")
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES))
                .showLegend(true).legendSize(WidgetLegendSize.SIXTEEN);
        Widget timeseriesWidgetLogQuery = new Widget().definition(timeseriesWidgetDefinitionLogQuery);
        orderedWidgetList.add(timeseriesWidgetLogQuery);

        // Timeseries Widget with Event query
        TimeseriesWidgetDefinition timeseriesWidgetDefinitionEventQuery = new TimeseriesWidgetDefinition()
                .addRequestsItem(new TimeseriesWidgetRequest()
                        .eventQuery(new EventQueryDefinition()
                                .search("Build failure").tagsExecution("build")
                        )
                        .style(new TimeseriesWidgetRequestStyle()
                                .palette("dog_classic")
                                .lineType(WidgetLineType.DASHED)
                                .lineWidth(WidgetLineWidth.THICK)
                        ).addMetadataItem(new TimeseriesWidgetRequestMetadata()
                                .expression("avg:system.load.1{*}").aliasName("Aliased metric")
                        ).displayType(WidgetDisplayType.LINE)
                ).yaxis(new WidgetAxis().includeZero(true).min("0").max("100").scale("linear"))
                .addEventsItem(new WidgetEvent().q("Build succeeded"))
                .addMarkersItem(new WidgetMarker()
                        .value("y=15").displayType("error dashed").label("error threshold")
                        .time(WidgetLiveSpan.PAST_FOUR_HOURS.toString()))
                .title("Test Timeseries Widget with Event Query").showLegend(true)
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16")
                .time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES))
                .showLegend(true).legendSize(WidgetLegendSize.SIXTEEN);
        Widget timeseriesWidgetEventQuery = new Widget().definition(timeseriesWidgetDefinitionEventQuery);
        orderedWidgetList.add(timeseriesWidgetEventQuery);

        // Toplist Widget
        ToplistWidgetDefinition toplistWidgetDefinition = new ToplistWidgetDefinition()
                .addRequestsItem(new ToplistWidgetRequest()
                        .q("avg:system.load.1{*}")
                        .addConditionalFormatsItem(new WidgetConditionalFormat()
                                .comparator(WidgetComparator.GREATER_THAN)
                                .value(7.)
                                .palette(WidgetPalette.RED_ON_WHITE)
                                .customBgColor("blue")
                                .customFgColor("black")
                                .imageUrl("https://docs.datadoghq.com/images/dashboards/widgets/image/image.mp4")
                        )
                ).title("Test Toplist Widget")
                .titleAlign(WidgetTextAlign.CENTER).titleSize("16").time(new WidgetTime().liveSpan(WidgetLiveSpan.PAST_FIFTEEN_MINUTES));
        Widget toplistWidget = new Widget().definition(toplistWidgetDefinition);
        orderedWidgetList.add(toplistWidget);

        // Template Variables
        DashboardTemplateVariables templateVariable = new DashboardTemplateVariables()
                .name("test template var").prefix("test-java")._default("*");
        List<DashboardTemplateVariables> templateVariables = new ArrayList<>();
        templateVariables.add(templateVariable);

        // Template Variable Presets
        DashboardTemplateVariablePreset dashboardTemplateVariablePreset = new DashboardTemplateVariablePreset()
                .name("Test Preset")
                .addTemplateVariablesItem(
                        new DashboardTemplateVariablePresetValue().name("test preset").value("*")
                );

        Dashboard dashboard = new Dashboard()
                .layoutType(DashboardLayoutType.ORDERED)
                .addWidgetsItem(noteWidget)
                .addWidgetsItem(alertGraphWidget)
                .addWidgetsItem(alertValueWidget)
                .addWidgetsItem(changeWidget)
                .addWidgetsItem(checkStatusWidget)
                .addWidgetsItem(distributionWidget)
                .addWidgetsItem(groupWidget)
                .addWidgetsItem(heatMapWidget)
                .addWidgetsItem(hostMapWidget)
                .addWidgetsItem(queryValueWidget)
                .addWidgetsItem(scatterPlotWidget)
                .addWidgetsItem(sloWidget)
                .addWidgetsItem(serviceMapWidget)
                .addWidgetsItem(tableWidget)
                .addWidgetsItem(timeseriesWidget)
                .addWidgetsItem(timeseriesWidgetProcessQuery)
                .addWidgetsItem(timeseriesWidgetLogQuery)
                .addWidgetsItem(timeseriesWidgetEventQuery)
                .addWidgetsItem(toplistWidget)
                .title("Java Client Test ORDERED Dashboard")
                .description("Test dashboard for Java client")
                .isReadOnly(false)
                .templateVariables(templateVariables)
                .addTemplateVariablePresetsItem(dashboardTemplateVariablePreset)
                .addNotifyListItem("test@example.com");
        // Create ordered dashboard with all expected fields
        Dashboard response = api.createDashboard()
                .body(dashboard)
                .execute();
        cleanupDashIDs.add(response.getId());

        // Assert the get response for this dashboard matches the create response
        Dashboard getResponse = api.getDashboard(response.getId()).execute();
        assertEquals(getResponse, response);

        // Assert the same for the free widgets
        Dashboard freeDashboard = new Dashboard()
                .layoutType(DashboardLayoutType.FREE)
                .addWidgetsItem(eventStreamWidget)
                .addWidgetsItem(eventTimelineWidget)
                .addWidgetsItem(freeTextWidget)
                .addWidgetsItem(iFrameWidget)
                .addWidgetsItem(imageWidget)
                .addWidgetsItem(logStreamWidget)
                .addWidgetsItem(monitorSummaryWidget)
                .addWidgetsItem(serviceSummaryWidget)
                .title("Java Client Test Free Dashboard")
                .description("Test Free layout dashboard for Java client")
                .isReadOnly(false)
                .templateVariables(templateVariables);
        Dashboard createFreeResponse = api.createDashboard().body(freeDashboard).execute();
        cleanupDashIDs.add(createFreeResponse.getId());
        Dashboard getFreeResponse = api.getDashboard(createFreeResponse.getId()).execute();
        assertEquals(createFreeResponse, getFreeResponse);

        // Assert root dashboard items on the create response
        assertEquals(dashboard.getTitle(), response.getTitle());
        assertEquals(dashboard.getDescription(), response.getDescription());
        assertEquals(dashboard.getIsReadOnly(), response.getIsReadOnly());
        assertEquals(dashboard.getNotifyList(), response.getNotifyList());
        // The end of the url is a normalized version fo the title, so lets just check the beginning of the URL
        assertTrue(response.getUrl().contains(String.format("/dashboard/%s", response.getId())));
        assertNotNull(response.getCreatedAt());
        assertNotNull(response.getModifiedAt());
        assertNotNull(response.getAuthorHandle());
        assertEquals(dashboard.getLayoutType(), response.getLayoutType());
        assertEquals(dashboard.getNotifyList(), response.getNotifyList());

        // Template Variables
        assertEquals(templateVariables, response.getTemplateVariables());

        // Template Variable Presets aren't available in the get/create response payload right now
        // assertEquals(templateVariablePresets, response.getTemplateVariablePresets());

        // Assert each individual widget but first remove the readOnly field `id`
        for(Widget checkWidget: response.getWidgets()) {
            assertNotNull(checkWidget.getId());
            checkWidget.setId(null);
            // Unset the `id` from the sub widgets definitions of the group widget
            if (checkWidget.getDefinition().getType().equals("group")) {
                for(Widget subWidget:  ((GroupWidgetDefinition) checkWidget.getDefinition()).getWidgets()) {
                    subWidget.id(null);
                }
            }
        }
        assertEquals(new HashSet<>(response.getWidgets()), orderedWidgetList);

        // Assert the same for the free dashboard widgets
        for(Widget checkWidget: getFreeResponse.getWidgets()) {
            assertNotNull(checkWidget.getId());
            checkWidget.id(null);
        }
        assertEquals(new HashSet<>(getFreeResponse.getWidgets()), freeWidgetList);

        // Update the dashboard and set all nullable fields to null
        dashboard.description(null)
                .templateVariables(null)
                .templateVariablePresets(null)
                .notifyList(null)
                .addWidgetsItem(noteWidget
                        .definition(noteDefinition
                                .content("Updated content").fontSize("30")
                        )
                );
        Dashboard updateResponse = api.updateDashboard(response.getId()).body(dashboard).execute();
        assertNull(dashboard.getDescription());
        assertNull(dashboard.getTemplateVariables());
        assertNull(dashboard.getTemplateVariablePresets());
        assertNull(dashboard.getNotifyList());
        assertEquals(dashboard.getTitle(), updateResponse.getTitle());
        assertEquals(dashboard.getWidgets().get(0), updateResponse.getWidgets().get(0).id(null));
        Boolean foundWidget = false;
        for (Widget noteWidgetResponse: updateResponse.getWidgets()) {
            if (noteWidgetResponse.getDefinition().getType().equals("note")) {
                NoteWidgetDefinition def = (NoteWidgetDefinition) noteWidgetResponse.getDefinition();
                foundWidget = true;
                assertEquals("Updated content", def.getContent());
                assertEquals("30", def.getFontSize());
                break;
            }
        }
        assertTrue(foundWidget);
        assertTrue(updateResponse.getWidgets().size() > 1);

        // Delete the dashboard and assert response
        DashboardDeleteResponse deleteResponse = api.deleteDashboard(response.getId()).execute();
        assertEquals(deleteResponse.getDeletedDashboardId(), response.getId());
    }

    /**
     * Tests the get all dashboards endpoint to confirm we get an expected set of data back
     *
     * @throws ApiException
     */
    @Test
    public void getAllDashboardTest() throws ApiException {
        // Get all dashboards and confirm the first returned entry has all expected fields set to not null
        DashboardSummary getAllResponse = api.getAllDashboards().execute();
        assertNotNull(getAllResponse.getDashboards().get(0).getAuthorHandle());
        assertNotNull(getAllResponse.getDashboards().get(0).getCreatedAt());
        assertNotNull(getAllResponse.getDashboards().get(0).getModifiedAt());
        // Its possible the description isn't set by the user
//        assertNotNull(getAllResponse.getDashboards().get(0).getDescription());
        assertNotNull(getAllResponse.getDashboards().get(0).getId());
        assertNotNull(getAllResponse.getDashboards().get(0).getIsReadOnly());
        assertNotNull(getAllResponse.getDashboards().get(0).getLayoutType());
        assertNotNull(getAllResponse.getDashboards().get(0).getTitle());
        assertNotNull(getAllResponse.getDashboards().get(0).getUrl());
    }
}
