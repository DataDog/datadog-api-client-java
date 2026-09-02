/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Dataflows configured on the Twilio integration account, keyed by dataflow id.</p>
 */
@JsonPropertyOrder({
  TwilioIntegrationDataflowsResponse.JSON_PROPERTY_TWILIO_ALERTS_LOGS,
  TwilioIntegrationDataflowsResponse.JSON_PROPERTY_TWILIO_CALL_SUMMARIES_LOGS,
  TwilioIntegrationDataflowsResponse.JSON_PROPERTY_TWILIO_CLOUD_COST_METRICS,
  TwilioIntegrationDataflowsResponse.JSON_PROPERTY_TWILIO_EVENTS_LOGS,
  TwilioIntegrationDataflowsResponse.JSON_PROPERTY_TWILIO_MESSAGES_LOGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioIntegrationDataflowsResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_TWILIO_ALERTS_LOGS = "twilio-alerts-logs";
  private TwilioAlertsLogsIntegrationDataflowResponse twilioAlertsLogs;

  public static final String JSON_PROPERTY_TWILIO_CALL_SUMMARIES_LOGS = "twilio-call-summaries-logs";
  private TwilioCallSummariesLogsIntegrationDataflowResponse twilioCallSummariesLogs;

  public static final String JSON_PROPERTY_TWILIO_CLOUD_COST_METRICS = "twilio-cloud-cost-metrics";
  private TwilioCloudCostMetricsIntegrationDataflowResponse twilioCloudCostMetrics;

  public static final String JSON_PROPERTY_TWILIO_EVENTS_LOGS = "twilio-events-logs";
  private TwilioEventsLogsIntegrationDataflowResponse twilioEventsLogs;

  public static final String JSON_PROPERTY_TWILIO_MESSAGES_LOGS = "twilio-messages-logs";
  private TwilioMessagesLogsIntegrationDataflowResponse twilioMessagesLogs;

  public TwilioIntegrationDataflowsResponse twilioAlertsLogs(TwilioAlertsLogsIntegrationDataflowResponse twilioAlertsLogs) {
    this.twilioAlertsLogs = twilioAlertsLogs;
    this.unparsed |= twilioAlertsLogs.unparsed;
    return this;
  }

  /**
   * <p>The Twilio alerts logs dataflow.</p>
   * @return twilioAlertsLogs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TWILIO_ALERTS_LOGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TwilioAlertsLogsIntegrationDataflowResponse getTwilioAlertsLogs() {
        return twilioAlertsLogs;
      }
  public void setTwilioAlertsLogs(TwilioAlertsLogsIntegrationDataflowResponse twilioAlertsLogs) {
    this.twilioAlertsLogs = twilioAlertsLogs;
    if (twilioAlertsLogs != null) {
      this.unparsed |= twilioAlertsLogs.unparsed;
    }
  }
  public TwilioIntegrationDataflowsResponse twilioCallSummariesLogs(TwilioCallSummariesLogsIntegrationDataflowResponse twilioCallSummariesLogs) {
    this.twilioCallSummariesLogs = twilioCallSummariesLogs;
    this.unparsed |= twilioCallSummariesLogs.unparsed;
    return this;
  }

  /**
   * <p>The Twilio call summaries logs dataflow.</p>
   * @return twilioCallSummariesLogs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TWILIO_CALL_SUMMARIES_LOGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TwilioCallSummariesLogsIntegrationDataflowResponse getTwilioCallSummariesLogs() {
        return twilioCallSummariesLogs;
      }
  public void setTwilioCallSummariesLogs(TwilioCallSummariesLogsIntegrationDataflowResponse twilioCallSummariesLogs) {
    this.twilioCallSummariesLogs = twilioCallSummariesLogs;
    if (twilioCallSummariesLogs != null) {
      this.unparsed |= twilioCallSummariesLogs.unparsed;
    }
  }
  public TwilioIntegrationDataflowsResponse twilioCloudCostMetrics(TwilioCloudCostMetricsIntegrationDataflowResponse twilioCloudCostMetrics) {
    this.twilioCloudCostMetrics = twilioCloudCostMetrics;
    this.unparsed |= twilioCloudCostMetrics.unparsed;
    return this;
  }

  /**
   * <p>The Twilio cloud cost metrics dataflow.</p>
   * @return twilioCloudCostMetrics
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TWILIO_CLOUD_COST_METRICS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TwilioCloudCostMetricsIntegrationDataflowResponse getTwilioCloudCostMetrics() {
        return twilioCloudCostMetrics;
      }
  public void setTwilioCloudCostMetrics(TwilioCloudCostMetricsIntegrationDataflowResponse twilioCloudCostMetrics) {
    this.twilioCloudCostMetrics = twilioCloudCostMetrics;
    if (twilioCloudCostMetrics != null) {
      this.unparsed |= twilioCloudCostMetrics.unparsed;
    }
  }
  public TwilioIntegrationDataflowsResponse twilioEventsLogs(TwilioEventsLogsIntegrationDataflowResponse twilioEventsLogs) {
    this.twilioEventsLogs = twilioEventsLogs;
    this.unparsed |= twilioEventsLogs.unparsed;
    return this;
  }

  /**
   * <p>The Twilio events logs dataflow.</p>
   * @return twilioEventsLogs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TWILIO_EVENTS_LOGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TwilioEventsLogsIntegrationDataflowResponse getTwilioEventsLogs() {
        return twilioEventsLogs;
      }
  public void setTwilioEventsLogs(TwilioEventsLogsIntegrationDataflowResponse twilioEventsLogs) {
    this.twilioEventsLogs = twilioEventsLogs;
    if (twilioEventsLogs != null) {
      this.unparsed |= twilioEventsLogs.unparsed;
    }
  }
  public TwilioIntegrationDataflowsResponse twilioMessagesLogs(TwilioMessagesLogsIntegrationDataflowResponse twilioMessagesLogs) {
    this.twilioMessagesLogs = twilioMessagesLogs;
    this.unparsed |= twilioMessagesLogs.unparsed;
    return this;
  }

  /**
   * <p>The Twilio messages logs dataflow.</p>
   * @return twilioMessagesLogs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TWILIO_MESSAGES_LOGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TwilioMessagesLogsIntegrationDataflowResponse getTwilioMessagesLogs() {
        return twilioMessagesLogs;
      }
  public void setTwilioMessagesLogs(TwilioMessagesLogsIntegrationDataflowResponse twilioMessagesLogs) {
    this.twilioMessagesLogs = twilioMessagesLogs;
    if (twilioMessagesLogs != null) {
      this.unparsed |= twilioMessagesLogs.unparsed;
    }
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return TwilioIntegrationDataflowsResponse
   */
  @JsonAnySetter
  public TwilioIntegrationDataflowsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this TwilioIntegrationDataflowsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioIntegrationDataflowsResponse twilioIntegrationDataflowsResponse = (TwilioIntegrationDataflowsResponse) o;
    return Objects.equals(this.twilioAlertsLogs, twilioIntegrationDataflowsResponse.twilioAlertsLogs) && Objects.equals(this.twilioCallSummariesLogs, twilioIntegrationDataflowsResponse.twilioCallSummariesLogs) && Objects.equals(this.twilioCloudCostMetrics, twilioIntegrationDataflowsResponse.twilioCloudCostMetrics) && Objects.equals(this.twilioEventsLogs, twilioIntegrationDataflowsResponse.twilioEventsLogs) && Objects.equals(this.twilioMessagesLogs, twilioIntegrationDataflowsResponse.twilioMessagesLogs) && Objects.equals(this.additionalProperties, twilioIntegrationDataflowsResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(twilioAlertsLogs,twilioCallSummariesLogs,twilioCloudCostMetrics,twilioEventsLogs,twilioMessagesLogs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioIntegrationDataflowsResponse {\n");
    sb.append("    twilioAlertsLogs: ").append(toIndentedString(twilioAlertsLogs)).append("\n");
    sb.append("    twilioCallSummariesLogs: ").append(toIndentedString(twilioCallSummariesLogs)).append("\n");
    sb.append("    twilioCloudCostMetrics: ").append(toIndentedString(twilioCloudCostMetrics)).append("\n");
    sb.append("    twilioEventsLogs: ").append(toIndentedString(twilioEventsLogs)).append("\n");
    sb.append("    twilioMessagesLogs: ").append(toIndentedString(twilioMessagesLogs)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
