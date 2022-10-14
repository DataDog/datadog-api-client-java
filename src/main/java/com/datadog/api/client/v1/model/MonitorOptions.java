/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** List of options associated with your monitor. */
@JsonPropertyOrder({
  MonitorOptions.JSON_PROPERTY_AGGREGATION,
  MonitorOptions.JSON_PROPERTY_DEVICE_IDS,
  MonitorOptions.JSON_PROPERTY_ENABLE_LOGS_SAMPLE,
  MonitorOptions.JSON_PROPERTY_ESCALATION_MESSAGE,
  MonitorOptions.JSON_PROPERTY_EVALUATION_DELAY,
  MonitorOptions.JSON_PROPERTY_GROUP_RETENTION_DURATION,
  MonitorOptions.JSON_PROPERTY_GROUPBY_SIMPLE_MONITOR,
  MonitorOptions.JSON_PROPERTY_INCLUDE_TAGS,
  MonitorOptions.JSON_PROPERTY_LOCKED,
  MonitorOptions.JSON_PROPERTY_MIN_FAILURE_DURATION,
  MonitorOptions.JSON_PROPERTY_MIN_LOCATION_FAILED,
  MonitorOptions.JSON_PROPERTY_NEW_GROUP_DELAY,
  MonitorOptions.JSON_PROPERTY_NEW_HOST_DELAY,
  MonitorOptions.JSON_PROPERTY_NO_DATA_TIMEFRAME,
  MonitorOptions.JSON_PROPERTY_NOTIFY_AUDIT,
  MonitorOptions.JSON_PROPERTY_NOTIFY_BY,
  MonitorOptions.JSON_PROPERTY_NOTIFY_NO_DATA,
  MonitorOptions.JSON_PROPERTY_ON_MISSING_DATA,
  MonitorOptions.JSON_PROPERTY_RENOTIFY_INTERVAL,
  MonitorOptions.JSON_PROPERTY_RENOTIFY_OCCURRENCES,
  MonitorOptions.JSON_PROPERTY_RENOTIFY_STATUSES,
  MonitorOptions.JSON_PROPERTY_REQUIRE_FULL_WINDOW,
  MonitorOptions.JSON_PROPERTY_SILENCED,
  MonitorOptions.JSON_PROPERTY_SYNTHETICS_CHECK_ID,
  MonitorOptions.JSON_PROPERTY_THRESHOLD_WINDOWS,
  MonitorOptions.JSON_PROPERTY_THRESHOLDS,
  MonitorOptions.JSON_PROPERTY_TIMEOUT_H,
  MonitorOptions.JSON_PROPERTY_VARIABLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private MonitorOptionsAggregation aggregation;

  public static final String JSON_PROPERTY_DEVICE_IDS = "device_ids";
  private List<MonitorDeviceID> deviceIds = null;

  public static final String JSON_PROPERTY_ENABLE_LOGS_SAMPLE = "enable_logs_sample";
  private Boolean enableLogsSample;

  public static final String JSON_PROPERTY_ESCALATION_MESSAGE = "escalation_message";
  private String escalationMessage = "none";

  public static final String JSON_PROPERTY_EVALUATION_DELAY = "evaluation_delay";
  private JsonNullable<Long> evaluationDelay = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_GROUP_RETENTION_DURATION = "group_retention_duration";
  private String groupRetentionDuration;

  public static final String JSON_PROPERTY_GROUPBY_SIMPLE_MONITOR = "groupby_simple_monitor";
  private Boolean groupbySimpleMonitor;

  public static final String JSON_PROPERTY_INCLUDE_TAGS = "include_tags";
  private Boolean includeTags = true;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private Boolean locked;

  public static final String JSON_PROPERTY_MIN_FAILURE_DURATION = "min_failure_duration";
  private JsonNullable<Long> minFailureDuration = JsonNullable.<Long>of(0l);

  public static final String JSON_PROPERTY_MIN_LOCATION_FAILED = "min_location_failed";
  private JsonNullable<Long> minLocationFailed = JsonNullable.<Long>of(1l);

  public static final String JSON_PROPERTY_NEW_GROUP_DELAY = "new_group_delay";
  private JsonNullable<Long> newGroupDelay = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NEW_HOST_DELAY = "new_host_delay";
  private JsonNullable<Long> newHostDelay = JsonNullable.<Long>of(300l);

  public static final String JSON_PROPERTY_NO_DATA_TIMEFRAME = "no_data_timeframe";
  private JsonNullable<Long> noDataTimeframe = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NOTIFY_AUDIT = "notify_audit";
  private Boolean notifyAudit = false;

  public static final String JSON_PROPERTY_NOTIFY_BY = "notify_by";
  private List<String> notifyBy = null;

  public static final String JSON_PROPERTY_NOTIFY_NO_DATA = "notify_no_data";
  private Boolean notifyNoData = false;

  public static final String JSON_PROPERTY_ON_MISSING_DATA = "on_missing_data";
  private OnMissingDataOption onMissingData;

  public static final String JSON_PROPERTY_RENOTIFY_INTERVAL = "renotify_interval";
  private JsonNullable<Long> renotifyInterval = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RENOTIFY_OCCURRENCES = "renotify_occurrences";
  private JsonNullable<Long> renotifyOccurrences = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_RENOTIFY_STATUSES = "renotify_statuses";
  private JsonNullable<List<MonitorRenotifyStatusType>> renotifyStatuses =
      JsonNullable.<List<MonitorRenotifyStatusType>>undefined();

  public static final String JSON_PROPERTY_REQUIRE_FULL_WINDOW = "require_full_window";
  private Boolean requireFullWindow;

  public static final String JSON_PROPERTY_SILENCED = "silenced";
  private Map<String, Long> silenced = null;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_ID = "synthetics_check_id";
  private JsonNullable<String> syntheticsCheckId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THRESHOLD_WINDOWS = "threshold_windows";
  private MonitorThresholdWindowOptions thresholdWindows;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private MonitorThresholds thresholds;

  public static final String JSON_PROPERTY_TIMEOUT_H = "timeout_h";
  private JsonNullable<Long> timeoutH = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<MonitorFormulaAndFunctionQueryDefinition> variables = null;

  /**
   * Type of aggregation performed in the monitor query.
   *
   * @return aggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOptionsAggregation getAggregation() {
    return aggregation;
  }

  /**
   * IDs of the device the Synthetics monitor is running on.
   *
   * @return deviceIds
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorDeviceID> getDeviceIds() {
    return deviceIds;
  }

  @Deprecated
  public MonitorOptions enableLogsSample(Boolean enableLogsSample) {
    this.enableLogsSample = enableLogsSample;
    return this;
  }

  /**
   * Whether or not to send a log sample when the log monitor triggers.
   *
   * @return enableLogsSample
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_LOGS_SAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnableLogsSample() {
    return enableLogsSample;
  }

  public void setEnableLogsSample(Boolean enableLogsSample) {
    this.enableLogsSample = enableLogsSample;
  }

  public MonitorOptions escalationMessage(String escalationMessage) {
    this.escalationMessage = escalationMessage;
    return this;
  }

  /**
   * We recommend using the <a
   * href="https://docs.datadoghq.com/monitors/notify/?tab=is_alert#renotify">is_renotify</a>, block
   * in the original message instead. A message to include with a re-notification. Supports the
   * <code>@username</code> notification we allow elsewhere. Not applicable if <code>
   * renotify_interval</code> is <code>None</code>.
   *
   * @return escalationMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESCALATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEscalationMessage() {
    return escalationMessage;
  }

  public void setEscalationMessage(String escalationMessage) {
    this.escalationMessage = escalationMessage;
  }

  public MonitorOptions evaluationDelay(Long evaluationDelay) {
    this.evaluationDelay = JsonNullable.<Long>of(evaluationDelay);
    return this;
  }

  /**
   * Time (in seconds) to delay evaluation, as a non-negative integer. For example, if the value is
   * set to <code>300</code> (5min), the timeframe is set to <code>last_5m</code> and the time is
   * 7:00, the monitor evaluates data from 6:50 to 6:55. This is useful for AWS CloudWatch and other
   * backfilled metrics to ensure the monitor always has data during evaluation.
   *
   * @return evaluationDelay
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getEvaluationDelay() {
    return evaluationDelay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVALUATION_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getEvaluationDelay_JsonNullable() {
    return evaluationDelay;
  }

  @JsonProperty(JSON_PROPERTY_EVALUATION_DELAY)
  public void setEvaluationDelay_JsonNullable(JsonNullable<Long> evaluationDelay) {
    this.evaluationDelay = evaluationDelay;
  }

  public void setEvaluationDelay(Long evaluationDelay) {
    this.evaluationDelay = JsonNullable.<Long>of(evaluationDelay);
  }

  public MonitorOptions groupRetentionDuration(String groupRetentionDuration) {
    this.groupRetentionDuration = groupRetentionDuration;
    return this;
  }

  /**
   * The time span after which groups with missing data are dropped from the monitor state. The
   * minimum value is one hour, and the maximum value is 72 hours. Example values are: "60m", "1h",
   * and "2d". This option is only available for APM Trace Analytics, Audit Trail, CI, Error
   * Tracking, Event, Logs, and RUM monitors.
   *
   * @return groupRetentionDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_RETENTION_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGroupRetentionDuration() {
    return groupRetentionDuration;
  }

  public void setGroupRetentionDuration(String groupRetentionDuration) {
    this.groupRetentionDuration = groupRetentionDuration;
  }

  public MonitorOptions groupbySimpleMonitor(Boolean groupbySimpleMonitor) {
    this.groupbySimpleMonitor = groupbySimpleMonitor;
    return this;
  }

  /**
   * Whether the log alert monitor triggers a single alert or multiple alerts when any group
   * breaches a threshold.
   *
   * @return groupbySimpleMonitor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPBY_SIMPLE_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getGroupbySimpleMonitor() {
    return groupbySimpleMonitor;
  }

  public void setGroupbySimpleMonitor(Boolean groupbySimpleMonitor) {
    this.groupbySimpleMonitor = groupbySimpleMonitor;
  }

  public MonitorOptions includeTags(Boolean includeTags) {
    this.includeTags = includeTags;
    return this;
  }

  /**
   * A Boolean indicating whether notifications from this monitor automatically inserts its
   * triggering tags into the title.
   *
   * <p><strong>Examples</strong> - If <code>True</code>, <code>
   * [Triggered on {host:h1}] Monitor Title</code> - If <code>False</code>, <code>
   * [Triggered] Monitor Title</code>
   *
   * @return includeTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeTags() {
    return includeTags;
  }

  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }

  public MonitorOptions locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Whether or not the monitor is locked (only editable by creator and admins). Use <code>
   * restricted_roles</code> instead.
   *
   * @return locked
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLocked() {
    return locked;
  }

  @Deprecated
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public MonitorOptions minFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = JsonNullable.<Long>of(minFailureDuration);
    return this;
  }

  /**
   * How long the test should be in failure before alerting (integer, number of seconds, max 7200).
   * minimum: 0 maximum: 7200
   *
   * @return minFailureDuration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMinFailureDuration() {
    return minFailureDuration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN_FAILURE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMinFailureDuration_JsonNullable() {
    return minFailureDuration;
  }

  @JsonProperty(JSON_PROPERTY_MIN_FAILURE_DURATION)
  public void setMinFailureDuration_JsonNullable(JsonNullable<Long> minFailureDuration) {
    this.minFailureDuration = minFailureDuration;
  }

  public void setMinFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = JsonNullable.<Long>of(minFailureDuration);
  }

  public MonitorOptions minLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = JsonNullable.<Long>of(minLocationFailed);
    return this;
  }

  /**
   * The minimum number of locations in failure at the same time during at least one moment in the
   * <code>min_failure_duration</code> period (<code>min_location_failed</code> and <code>
   * min_failure_duration</code> are part of the advanced alerting rules - integer, &gt;= 1).
   *
   * @return minLocationFailed
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMinLocationFailed() {
    return minLocationFailed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN_LOCATION_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMinLocationFailed_JsonNullable() {
    return minLocationFailed;
  }

  @JsonProperty(JSON_PROPERTY_MIN_LOCATION_FAILED)
  public void setMinLocationFailed_JsonNullable(JsonNullable<Long> minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
  }

  public void setMinLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = JsonNullable.<Long>of(minLocationFailed);
  }

  public MonitorOptions newGroupDelay(Long newGroupDelay) {
    this.newGroupDelay = JsonNullable.<Long>of(newGroupDelay);
    return this;
  }

  /**
   * Time (in seconds) to skip evaluations for new groups.
   *
   * <p>For example, this option can be used to skip evaluations for new hosts while they
   * initialize.
   *
   * <p>Must be a non negative integer.
   *
   * @return newGroupDelay
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNewGroupDelay() {
    return newGroupDelay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_GROUP_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNewGroupDelay_JsonNullable() {
    return newGroupDelay;
  }

  @JsonProperty(JSON_PROPERTY_NEW_GROUP_DELAY)
  public void setNewGroupDelay_JsonNullable(JsonNullable<Long> newGroupDelay) {
    this.newGroupDelay = newGroupDelay;
  }

  public void setNewGroupDelay(Long newGroupDelay) {
    this.newGroupDelay = JsonNullable.<Long>of(newGroupDelay);
  }

  public MonitorOptions newHostDelay(Long newHostDelay) {
    this.newHostDelay = JsonNullable.<Long>of(newHostDelay);
    return this;
  }

  /**
   * Time (in seconds) to allow a host to boot and applications to fully start before starting the
   * evaluation of monitor results. Should be a non negative integer.
   *
   * <p>Use new_group_delay instead.
   *
   * @return newHostDelay
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNewHostDelay() {
    return newHostDelay.orElse(null);
  }

  @Deprecated
  @JsonProperty(JSON_PROPERTY_NEW_HOST_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNewHostDelay_JsonNullable() {
    return newHostDelay;
  }

  @JsonProperty(JSON_PROPERTY_NEW_HOST_DELAY)
  public void setNewHostDelay_JsonNullable(JsonNullable<Long> newHostDelay) {
    this.newHostDelay = newHostDelay;
  }

  public void setNewHostDelay(Long newHostDelay) {
    this.newHostDelay = JsonNullable.<Long>of(newHostDelay);
  }

  public MonitorOptions noDataTimeframe(Long noDataTimeframe) {
    this.noDataTimeframe = JsonNullable.<Long>of(noDataTimeframe);
    return this;
  }

  /**
   * The number of minutes before a monitor notifies after data stops reporting. Datadog recommends
   * at least 2x the monitor timeframe for query alerts or 2 minutes for service checks. If omitted,
   * 2x the evaluation timeframe is used for query alerts, and 24 hours is used for service checks.
   *
   * @return noDataTimeframe
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNoDataTimeframe() {
    return noDataTimeframe.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NO_DATA_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNoDataTimeframe_JsonNullable() {
    return noDataTimeframe;
  }

  @JsonProperty(JSON_PROPERTY_NO_DATA_TIMEFRAME)
  public void setNoDataTimeframe_JsonNullable(JsonNullable<Long> noDataTimeframe) {
    this.noDataTimeframe = noDataTimeframe;
  }

  public void setNoDataTimeframe(Long noDataTimeframe) {
    this.noDataTimeframe = JsonNullable.<Long>of(noDataTimeframe);
  }

  public MonitorOptions notifyAudit(Boolean notifyAudit) {
    this.notifyAudit = notifyAudit;
    return this;
  }

  /**
   * A Boolean indicating whether tagged users is notified on changes to this monitor.
   *
   * @return notifyAudit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_AUDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyAudit() {
    return notifyAudit;
  }

  public void setNotifyAudit(Boolean notifyAudit) {
    this.notifyAudit = notifyAudit;
  }

  public MonitorOptions notifyBy(List<String> notifyBy) {
    this.notifyBy = notifyBy;
    return this;
  }

  public MonitorOptions addNotifyByItem(String notifyByItem) {
    if (this.notifyBy == null) {
      this.notifyBy = new ArrayList<>();
    }
    this.notifyBy.add(notifyByItem);
    return this;
  }

  /**
   * Controls what granularity a monitor alerts on. Only available for monitors with groupings. For
   * instance, a monitor grouped by <code>cluster</code>, <code>namespace</code>, and <code>pod
   * </code> can be configured to only notify on each new <code>cluster</code> violating the alert
   * conditions by setting <code>notify_by</code> to <code>["cluster"]</code>. Tags mentioned in
   * <code>notify_by</code> must be a subset of the grouping tags in the query. For example, a query
   * grouped by <code>cluster</code> and <code>namespace</code> cannot notify on <code>region</code>
   * . Setting <code>notify_by</code> to <code>[*]</code> configures the monitor to notify as a
   * simple-alert.
   *
   * @return notifyBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getNotifyBy() {
    return notifyBy;
  }

  public void setNotifyBy(List<String> notifyBy) {
    this.notifyBy = notifyBy;
  }

  public MonitorOptions notifyNoData(Boolean notifyNoData) {
    this.notifyNoData = notifyNoData;
    return this;
  }

  /**
   * A Boolean indicating whether this monitor notifies when data stops reporting.
   *
   * @return notifyNoData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_NO_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotifyNoData() {
    return notifyNoData;
  }

  public void setNotifyNoData(Boolean notifyNoData) {
    this.notifyNoData = notifyNoData;
  }

  public MonitorOptions onMissingData(OnMissingDataOption onMissingData) {
    this.onMissingData = onMissingData;
    this.unparsed |= !onMissingData.isValid();
    return this;
  }

  /**
   * Controls how groups or monitors are treated if an evaluation does not return any data points.
   * The default option results in different behavior depending on the monitor query type. For
   * monitors using Count queries, an empty monitor evaluation is treated as 0 and is compared to
   * the threshold conditions. For monitors using any query type other than Count, for example
   * Gauge, Measure, or Rate, the monitor shows the last known status. This option is only available
   * for APM Trace Analytics, Audit Trail, CI, Error Tracking, Event, Logs, and RUM monitors.
   *
   * @return onMissingData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_MISSING_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OnMissingDataOption getOnMissingData() {
    return onMissingData;
  }

  public void setOnMissingData(OnMissingDataOption onMissingData) {
    if (!onMissingData.isValid()) {
      this.unparsed = true;
    }
    this.onMissingData = onMissingData;
  }

  public MonitorOptions renotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = JsonNullable.<Long>of(renotifyInterval);
    return this;
  }

  /**
   * The number of minutes after the last notification before a monitor re-notifies on the current
   * status. It only re-notifies if it’s not resolved.
   *
   * @return renotifyInterval
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRenotifyInterval() {
    return renotifyInterval.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RENOTIFY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRenotifyInterval_JsonNullable() {
    return renotifyInterval;
  }

  @JsonProperty(JSON_PROPERTY_RENOTIFY_INTERVAL)
  public void setRenotifyInterval_JsonNullable(JsonNullable<Long> renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
  }

  public void setRenotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = JsonNullable.<Long>of(renotifyInterval);
  }

  public MonitorOptions renotifyOccurrences(Long renotifyOccurrences) {
    this.renotifyOccurrences = JsonNullable.<Long>of(renotifyOccurrences);
    return this;
  }

  /**
   * The number of times re-notification messages should be sent on the current status at the
   * provided re-notification interval.
   *
   * @return renotifyOccurrences
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRenotifyOccurrences() {
    return renotifyOccurrences.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RENOTIFY_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRenotifyOccurrences_JsonNullable() {
    return renotifyOccurrences;
  }

  @JsonProperty(JSON_PROPERTY_RENOTIFY_OCCURRENCES)
  public void setRenotifyOccurrences_JsonNullable(JsonNullable<Long> renotifyOccurrences) {
    this.renotifyOccurrences = renotifyOccurrences;
  }

  public void setRenotifyOccurrences(Long renotifyOccurrences) {
    this.renotifyOccurrences = JsonNullable.<Long>of(renotifyOccurrences);
  }

  public MonitorOptions renotifyStatuses(List<MonitorRenotifyStatusType> renotifyStatuses) {
    this.renotifyStatuses = JsonNullable.<List<MonitorRenotifyStatusType>>of(renotifyStatuses);
    return this;
  }

  public MonitorOptions addRenotifyStatusesItem(MonitorRenotifyStatusType renotifyStatusesItem) {
    if (this.renotifyStatuses == null || !this.renotifyStatuses.isPresent()) {
      this.renotifyStatuses = JsonNullable.<List<MonitorRenotifyStatusType>>of(new ArrayList<>());
    }
    try {
      this.renotifyStatuses.get().add(renotifyStatusesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The types of monitor statuses for which re-notification messages are sent.
   *
   * @return renotifyStatuses
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<MonitorRenotifyStatusType> getRenotifyStatuses() {
    return renotifyStatuses.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RENOTIFY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<MonitorRenotifyStatusType>> getRenotifyStatuses_JsonNullable() {
    return renotifyStatuses;
  }

  @JsonProperty(JSON_PROPERTY_RENOTIFY_STATUSES)
  public void setRenotifyStatuses_JsonNullable(
      JsonNullable<List<MonitorRenotifyStatusType>> renotifyStatuses) {
    this.renotifyStatuses = renotifyStatuses;
  }

  public void setRenotifyStatuses(List<MonitorRenotifyStatusType> renotifyStatuses) {
    this.renotifyStatuses = JsonNullable.<List<MonitorRenotifyStatusType>>of(renotifyStatuses);
  }

  public MonitorOptions requireFullWindow(Boolean requireFullWindow) {
    this.requireFullWindow = requireFullWindow;
    return this;
  }

  /**
   * A Boolean indicating whether this monitor needs a full window of data before it’s evaluated. We
   * highly recommend you set this to <code>false</code> for sparse metrics, otherwise some
   * evaluations are skipped. Default is false.
   *
   * @return requireFullWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_FULL_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequireFullWindow() {
    return requireFullWindow;
  }

  public void setRequireFullWindow(Boolean requireFullWindow) {
    this.requireFullWindow = requireFullWindow;
  }

  public MonitorOptions silenced(Map<String, Long> silenced) {
    this.silenced = silenced;
    return this;
  }

  public MonitorOptions putSilencedItem(String key, Long silencedItem) {
    if (this.silenced == null) {
      this.silenced = new HashMap<>();
    }
    this.silenced.put(key, silencedItem);
    return this;
  }

  /**
   * Information about the downtime applied to the monitor.
   *
   * @return silenced
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SILENCED)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Long> getSilenced() {
    return silenced;
  }

  @Deprecated
  public void setSilenced(Map<String, Long> silenced) {
    this.silenced = silenced;
  }

  public MonitorOptions syntheticsCheckId(String syntheticsCheckId) {
    this.syntheticsCheckId = JsonNullable.<String>of(syntheticsCheckId);
    return this;
  }

  /**
   * ID of the corresponding Synthetic check.
   *
   * @return syntheticsCheckId
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSyntheticsCheckId() {
    return syntheticsCheckId.orElse(null);
  }

  @Deprecated
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSyntheticsCheckId_JsonNullable() {
    return syntheticsCheckId;
  }

  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_ID)
  public void setSyntheticsCheckId_JsonNullable(JsonNullable<String> syntheticsCheckId) {
    this.syntheticsCheckId = syntheticsCheckId;
  }

  public void setSyntheticsCheckId(String syntheticsCheckId) {
    this.syntheticsCheckId = JsonNullable.<String>of(syntheticsCheckId);
  }

  public MonitorOptions thresholdWindows(MonitorThresholdWindowOptions thresholdWindows) {
    this.thresholdWindows = thresholdWindows;
    this.unparsed |= thresholdWindows.unparsed;
    return this;
  }

  /**
   * Alerting time window options.
   *
   * @return thresholdWindows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorThresholdWindowOptions getThresholdWindows() {
    return thresholdWindows;
  }

  public void setThresholdWindows(MonitorThresholdWindowOptions thresholdWindows) {
    this.thresholdWindows = thresholdWindows;
  }

  public MonitorOptions thresholds(MonitorThresholds thresholds) {
    this.thresholds = thresholds;
    this.unparsed |= thresholds.unparsed;
    return this;
  }

  /**
   * List of the different monitor threshold available.
   *
   * @return thresholds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorThresholds getThresholds() {
    return thresholds;
  }

  public void setThresholds(MonitorThresholds thresholds) {
    this.thresholds = thresholds;
  }

  public MonitorOptions timeoutH(Long timeoutH) {
    this.timeoutH = JsonNullable.<Long>of(timeoutH);
    return this;
  }

  /**
   * The number of hours of the monitor not reporting data before it automatically resolves from a
   * triggered state. The minimum allowed value is 0 hours. The maximum allowed value is 24 hours.
   *
   * @return timeoutH
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTimeoutH() {
    return timeoutH.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIMEOUT_H)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTimeoutH_JsonNullable() {
    return timeoutH;
  }

  @JsonProperty(JSON_PROPERTY_TIMEOUT_H)
  public void setTimeoutH_JsonNullable(JsonNullable<Long> timeoutH) {
    this.timeoutH = timeoutH;
  }

  public void setTimeoutH(Long timeoutH) {
    this.timeoutH = JsonNullable.<Long>of(timeoutH);
  }

  public MonitorOptions variables(List<MonitorFormulaAndFunctionQueryDefinition> variables) {
    this.variables = variables;
    for (MonitorFormulaAndFunctionQueryDefinition item : variables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorOptions addVariablesItem(MonitorFormulaAndFunctionQueryDefinition variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    this.unparsed |= variablesItem.unparsed;
    return this;
  }

  /**
   * List of requests that can be used in the monitor query. <strong>This feature is currently in
   * beta.</strong>
   *
   * @return variables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorFormulaAndFunctionQueryDefinition> getVariables() {
    return variables;
  }

  public void setVariables(List<MonitorFormulaAndFunctionQueryDefinition> variables) {
    this.variables = variables;
  }

  /** Return true if this MonitorOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorOptions monitorOptions = (MonitorOptions) o;
    return Objects.equals(this.aggregation, monitorOptions.aggregation)
        && Objects.equals(this.deviceIds, monitorOptions.deviceIds)
        && Objects.equals(this.enableLogsSample, monitorOptions.enableLogsSample)
        && Objects.equals(this.escalationMessage, monitorOptions.escalationMessage)
        && Objects.equals(this.evaluationDelay, monitorOptions.evaluationDelay)
        && Objects.equals(this.groupRetentionDuration, monitorOptions.groupRetentionDuration)
        && Objects.equals(this.groupbySimpleMonitor, monitorOptions.groupbySimpleMonitor)
        && Objects.equals(this.includeTags, monitorOptions.includeTags)
        && Objects.equals(this.locked, monitorOptions.locked)
        && Objects.equals(this.minFailureDuration, monitorOptions.minFailureDuration)
        && Objects.equals(this.minLocationFailed, monitorOptions.minLocationFailed)
        && Objects.equals(this.newGroupDelay, monitorOptions.newGroupDelay)
        && Objects.equals(this.newHostDelay, monitorOptions.newHostDelay)
        && Objects.equals(this.noDataTimeframe, monitorOptions.noDataTimeframe)
        && Objects.equals(this.notifyAudit, monitorOptions.notifyAudit)
        && Objects.equals(this.notifyBy, monitorOptions.notifyBy)
        && Objects.equals(this.notifyNoData, monitorOptions.notifyNoData)
        && Objects.equals(this.onMissingData, monitorOptions.onMissingData)
        && Objects.equals(this.renotifyInterval, monitorOptions.renotifyInterval)
        && Objects.equals(this.renotifyOccurrences, monitorOptions.renotifyOccurrences)
        && Objects.equals(this.renotifyStatuses, monitorOptions.renotifyStatuses)
        && Objects.equals(this.requireFullWindow, monitorOptions.requireFullWindow)
        && Objects.equals(this.silenced, monitorOptions.silenced)
        && Objects.equals(this.syntheticsCheckId, monitorOptions.syntheticsCheckId)
        && Objects.equals(this.thresholdWindows, monitorOptions.thresholdWindows)
        && Objects.equals(this.thresholds, monitorOptions.thresholds)
        && Objects.equals(this.timeoutH, monitorOptions.timeoutH)
        && Objects.equals(this.variables, monitorOptions.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregation,
        deviceIds,
        enableLogsSample,
        escalationMessage,
        evaluationDelay,
        groupRetentionDuration,
        groupbySimpleMonitor,
        includeTags,
        locked,
        minFailureDuration,
        minLocationFailed,
        newGroupDelay,
        newHostDelay,
        noDataTimeframe,
        notifyAudit,
        notifyBy,
        notifyNoData,
        onMissingData,
        renotifyInterval,
        renotifyOccurrences,
        renotifyStatuses,
        requireFullWindow,
        silenced,
        syntheticsCheckId,
        thresholdWindows,
        thresholds,
        timeoutH,
        variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorOptions {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    enableLogsSample: ").append(toIndentedString(enableLogsSample)).append("\n");
    sb.append("    escalationMessage: ").append(toIndentedString(escalationMessage)).append("\n");
    sb.append("    evaluationDelay: ").append(toIndentedString(evaluationDelay)).append("\n");
    sb.append("    groupRetentionDuration: ")
        .append(toIndentedString(groupRetentionDuration))
        .append("\n");
    sb.append("    groupbySimpleMonitor: ")
        .append(toIndentedString(groupbySimpleMonitor))
        .append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    minFailureDuration: ").append(toIndentedString(minFailureDuration)).append("\n");
    sb.append("    minLocationFailed: ").append(toIndentedString(minLocationFailed)).append("\n");
    sb.append("    newGroupDelay: ").append(toIndentedString(newGroupDelay)).append("\n");
    sb.append("    newHostDelay: ").append(toIndentedString(newHostDelay)).append("\n");
    sb.append("    noDataTimeframe: ").append(toIndentedString(noDataTimeframe)).append("\n");
    sb.append("    notifyAudit: ").append(toIndentedString(notifyAudit)).append("\n");
    sb.append("    notifyBy: ").append(toIndentedString(notifyBy)).append("\n");
    sb.append("    notifyNoData: ").append(toIndentedString(notifyNoData)).append("\n");
    sb.append("    onMissingData: ").append(toIndentedString(onMissingData)).append("\n");
    sb.append("    renotifyInterval: ").append(toIndentedString(renotifyInterval)).append("\n");
    sb.append("    renotifyOccurrences: ")
        .append(toIndentedString(renotifyOccurrences))
        .append("\n");
    sb.append("    renotifyStatuses: ").append(toIndentedString(renotifyStatuses)).append("\n");
    sb.append("    requireFullWindow: ").append(toIndentedString(requireFullWindow)).append("\n");
    sb.append("    silenced: ").append(toIndentedString(silenced)).append("\n");
    sb.append("    syntheticsCheckId: ").append(toIndentedString(syntheticsCheckId)).append("\n");
    sb.append("    thresholdWindows: ").append(toIndentedString(thresholdWindows)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    timeoutH: ").append(toIndentedString(timeoutH)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
