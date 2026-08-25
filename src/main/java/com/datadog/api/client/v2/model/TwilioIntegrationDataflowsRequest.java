/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Dataflows to configure on the Twilio integration account, keyed by dataflow id. */
@JsonPropertyOrder({
  TwilioIntegrationDataflowsRequest.JSON_PROPERTY_TWILIO_ALERTS_LOGS,
  TwilioIntegrationDataflowsRequest.JSON_PROPERTY_TWILIO_CALL_SUMMARIES_LOGS,
  TwilioIntegrationDataflowsRequest.JSON_PROPERTY_TWILIO_CLOUD_COST_METRICS,
  TwilioIntegrationDataflowsRequest.JSON_PROPERTY_TWILIO_EVENTS_LOGS,
  TwilioIntegrationDataflowsRequest.JSON_PROPERTY_TWILIO_MESSAGES_LOGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioIntegrationDataflowsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TWILIO_ALERTS_LOGS = "twilio-alerts-logs";
  private TwilioAlertsLogsIntegrationDataflowRequest twilioAlertsLogs;

  public static final String JSON_PROPERTY_TWILIO_CALL_SUMMARIES_LOGS =
      "twilio-call-summaries-logs";
  private TwilioCallSummariesLogsIntegrationDataflowRequest twilioCallSummariesLogs;

  public static final String JSON_PROPERTY_TWILIO_CLOUD_COST_METRICS = "twilio-cloud-cost-metrics";
  private TwilioCloudCostMetricsIntegrationDataflowRequest twilioCloudCostMetrics;

  public static final String JSON_PROPERTY_TWILIO_EVENTS_LOGS = "twilio-events-logs";
  private TwilioEventsLogsIntegrationDataflowRequest twilioEventsLogs;

  public static final String JSON_PROPERTY_TWILIO_MESSAGES_LOGS = "twilio-messages-logs";
  private TwilioMessagesLogsIntegrationDataflowRequest twilioMessagesLogs;

  public TwilioIntegrationDataflowsRequest twilioAlertsLogs(
      TwilioAlertsLogsIntegrationDataflowRequest twilioAlertsLogs) {
    this.twilioAlertsLogs = twilioAlertsLogs;
    this.unparsed |= twilioAlertsLogs.unparsed;
    return this;
  }

  /**
   * The Twilio alerts logs dataflow.
   *
   * @return twilioAlertsLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWILIO_ALERTS_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioAlertsLogsIntegrationDataflowRequest getTwilioAlertsLogs() {
    return twilioAlertsLogs;
  }

  public void setTwilioAlertsLogs(TwilioAlertsLogsIntegrationDataflowRequest twilioAlertsLogs) {
    this.twilioAlertsLogs = twilioAlertsLogs;
    if (twilioAlertsLogs != null) {
      this.unparsed |= twilioAlertsLogs.unparsed;
    }
  }

  public TwilioIntegrationDataflowsRequest twilioCallSummariesLogs(
      TwilioCallSummariesLogsIntegrationDataflowRequest twilioCallSummariesLogs) {
    this.twilioCallSummariesLogs = twilioCallSummariesLogs;
    this.unparsed |= twilioCallSummariesLogs.unparsed;
    return this;
  }

  /**
   * The Twilio call summaries logs dataflow.
   *
   * @return twilioCallSummariesLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWILIO_CALL_SUMMARIES_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioCallSummariesLogsIntegrationDataflowRequest getTwilioCallSummariesLogs() {
    return twilioCallSummariesLogs;
  }

  public void setTwilioCallSummariesLogs(
      TwilioCallSummariesLogsIntegrationDataflowRequest twilioCallSummariesLogs) {
    this.twilioCallSummariesLogs = twilioCallSummariesLogs;
    if (twilioCallSummariesLogs != null) {
      this.unparsed |= twilioCallSummariesLogs.unparsed;
    }
  }

  public TwilioIntegrationDataflowsRequest twilioCloudCostMetrics(
      TwilioCloudCostMetricsIntegrationDataflowRequest twilioCloudCostMetrics) {
    this.twilioCloudCostMetrics = twilioCloudCostMetrics;
    this.unparsed |= twilioCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * The Twilio cloud cost metrics dataflow.
   *
   * @return twilioCloudCostMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWILIO_CLOUD_COST_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioCloudCostMetricsIntegrationDataflowRequest getTwilioCloudCostMetrics() {
    return twilioCloudCostMetrics;
  }

  public void setTwilioCloudCostMetrics(
      TwilioCloudCostMetricsIntegrationDataflowRequest twilioCloudCostMetrics) {
    this.twilioCloudCostMetrics = twilioCloudCostMetrics;
    if (twilioCloudCostMetrics != null) {
      this.unparsed |= twilioCloudCostMetrics.unparsed;
    }
  }

  public TwilioIntegrationDataflowsRequest twilioEventsLogs(
      TwilioEventsLogsIntegrationDataflowRequest twilioEventsLogs) {
    this.twilioEventsLogs = twilioEventsLogs;
    this.unparsed |= twilioEventsLogs.unparsed;
    return this;
  }

  /**
   * The Twilio events logs dataflow.
   *
   * @return twilioEventsLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWILIO_EVENTS_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioEventsLogsIntegrationDataflowRequest getTwilioEventsLogs() {
    return twilioEventsLogs;
  }

  public void setTwilioEventsLogs(TwilioEventsLogsIntegrationDataflowRequest twilioEventsLogs) {
    this.twilioEventsLogs = twilioEventsLogs;
    if (twilioEventsLogs != null) {
      this.unparsed |= twilioEventsLogs.unparsed;
    }
  }

  public TwilioIntegrationDataflowsRequest twilioMessagesLogs(
      TwilioMessagesLogsIntegrationDataflowRequest twilioMessagesLogs) {
    this.twilioMessagesLogs = twilioMessagesLogs;
    this.unparsed |= twilioMessagesLogs.unparsed;
    return this;
  }

  /**
   * The Twilio messages logs dataflow.
   *
   * @return twilioMessagesLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWILIO_MESSAGES_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TwilioMessagesLogsIntegrationDataflowRequest getTwilioMessagesLogs() {
    return twilioMessagesLogs;
  }

  public void setTwilioMessagesLogs(
      TwilioMessagesLogsIntegrationDataflowRequest twilioMessagesLogs) {
    this.twilioMessagesLogs = twilioMessagesLogs;
    if (twilioMessagesLogs != null) {
      this.unparsed |= twilioMessagesLogs.unparsed;
    }
  }

  /** Return true if this TwilioIntegrationDataflowsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioIntegrationDataflowsRequest twilioIntegrationDataflowsRequest =
        (TwilioIntegrationDataflowsRequest) o;
    return Objects.equals(this.twilioAlertsLogs, twilioIntegrationDataflowsRequest.twilioAlertsLogs)
        && Objects.equals(
            this.twilioCallSummariesLogs, twilioIntegrationDataflowsRequest.twilioCallSummariesLogs)
        && Objects.equals(
            this.twilioCloudCostMetrics, twilioIntegrationDataflowsRequest.twilioCloudCostMetrics)
        && Objects.equals(this.twilioEventsLogs, twilioIntegrationDataflowsRequest.twilioEventsLogs)
        && Objects.equals(
            this.twilioMessagesLogs, twilioIntegrationDataflowsRequest.twilioMessagesLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        twilioAlertsLogs,
        twilioCallSummariesLogs,
        twilioCloudCostMetrics,
        twilioEventsLogs,
        twilioMessagesLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioIntegrationDataflowsRequest {\n");
    sb.append("    twilioAlertsLogs: ").append(toIndentedString(twilioAlertsLogs)).append("\n");
    sb.append("    twilioCallSummariesLogs: ")
        .append(toIndentedString(twilioCallSummariesLogs))
        .append("\n");
    sb.append("    twilioCloudCostMetrics: ")
        .append(toIndentedString(twilioCloudCostMetrics))
        .append("\n");
    sb.append("    twilioEventsLogs: ").append(toIndentedString(twilioEventsLogs)).append("\n");
    sb.append("    twilioMessagesLogs: ").append(toIndentedString(twilioMessagesLogs)).append("\n");
    sb.append('}');
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
