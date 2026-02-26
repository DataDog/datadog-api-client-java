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
   * <p>Attributes for converting threat hunting job results to signals.</p>
 */
@JsonPropertyOrder({
  ConvertJobResultsToSignalsAttributes.JSON_PROPERTY_ID,
  ConvertJobResultsToSignalsAttributes.JSON_PROPERTY_JOB_RESULT_IDS,
  ConvertJobResultsToSignalsAttributes.JSON_PROPERTY_NOTIFICATIONS,
  ConvertJobResultsToSignalsAttributes.JSON_PROPERTY_SIGNAL_MESSAGE,
  ConvertJobResultsToSignalsAttributes.JSON_PROPERTY_SIGNAL_SEVERITY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConvertJobResultsToSignalsAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_JOB_RESULT_IDS = "jobResultIds";
  private List<String> jobResultIds = new ArrayList<>();

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<String> notifications = new ArrayList<>();

  public static final String JSON_PROPERTY_SIGNAL_MESSAGE = "signalMessage";
  private String signalMessage;

  public static final String JSON_PROPERTY_SIGNAL_SEVERITY = "signalSeverity";
  private SecurityMonitoringRuleSeverity signalSeverity;

  public ConvertJobResultsToSignalsAttributes() {}

  @JsonCreator
  public ConvertJobResultsToSignalsAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_JOB_RESULT_IDS)List<String> jobResultIds,
            @JsonProperty(required=true, value=JSON_PROPERTY_NOTIFICATIONS)List<String> notifications,
            @JsonProperty(required=true, value=JSON_PROPERTY_SIGNAL_MESSAGE)String signalMessage,
            @JsonProperty(required=true, value=JSON_PROPERTY_SIGNAL_SEVERITY)SecurityMonitoringRuleSeverity signalSeverity) {
        this.jobResultIds = jobResultIds;
        this.notifications = notifications;
        this.signalMessage = signalMessage;
        this.signalSeverity = signalSeverity;
        this.unparsed |= !signalSeverity.isValid();
  }
  public ConvertJobResultsToSignalsAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Request ID.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ConvertJobResultsToSignalsAttributes jobResultIds(List<String> jobResultIds) {
    this.jobResultIds = jobResultIds;
    return this;
  }
  public ConvertJobResultsToSignalsAttributes addJobResultIdsItem(String jobResultIdsItem) {
    this.jobResultIds.add(jobResultIdsItem);
    return this;
  }

  /**
   * <p>Job result IDs.</p>
   * @return jobResultIds
  **/
      @JsonProperty(JSON_PROPERTY_JOB_RESULT_IDS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getJobResultIds() {
        return jobResultIds;
      }
  public void setJobResultIds(List<String> jobResultIds) {
    this.jobResultIds = jobResultIds;
  }
  public ConvertJobResultsToSignalsAttributes notifications(List<String> notifications) {
    this.notifications = notifications;
    return this;
  }
  public ConvertJobResultsToSignalsAttributes addNotificationsItem(String notificationsItem) {
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * <p>Notifications sent.</p>
   * @return notifications
  **/
      @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getNotifications() {
        return notifications;
      }
  public void setNotifications(List<String> notifications) {
    this.notifications = notifications;
  }
  public ConvertJobResultsToSignalsAttributes signalMessage(String signalMessage) {
    this.signalMessage = signalMessage;
    return this;
  }

  /**
   * <p>Message of generated signals.</p>
   * @return signalMessage
  **/
      @JsonProperty(JSON_PROPERTY_SIGNAL_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSignalMessage() {
        return signalMessage;
      }
  public void setSignalMessage(String signalMessage) {
    this.signalMessage = signalMessage;
  }
  public ConvertJobResultsToSignalsAttributes signalSeverity(SecurityMonitoringRuleSeverity signalSeverity) {
    this.signalSeverity = signalSeverity;
    this.unparsed |= !signalSeverity.isValid();
    return this;
  }

  /**
   * <p>Severity of the Security Signal.</p>
   * @return signalSeverity
  **/
      @JsonProperty(JSON_PROPERTY_SIGNAL_SEVERITY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SecurityMonitoringRuleSeverity getSignalSeverity() {
        return signalSeverity;
      }
  public void setSignalSeverity(SecurityMonitoringRuleSeverity signalSeverity) {
    if (!signalSeverity.isValid()) {
        this.unparsed = true;
    }
    this.signalSeverity = signalSeverity;
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
   * @return ConvertJobResultsToSignalsAttributes
   */
  @JsonAnySetter
  public ConvertJobResultsToSignalsAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ConvertJobResultsToSignalsAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertJobResultsToSignalsAttributes convertJobResultsToSignalsAttributes = (ConvertJobResultsToSignalsAttributes) o;
    return Objects.equals(this.id, convertJobResultsToSignalsAttributes.id) && Objects.equals(this.jobResultIds, convertJobResultsToSignalsAttributes.jobResultIds) && Objects.equals(this.notifications, convertJobResultsToSignalsAttributes.notifications) && Objects.equals(this.signalMessage, convertJobResultsToSignalsAttributes.signalMessage) && Objects.equals(this.signalSeverity, convertJobResultsToSignalsAttributes.signalSeverity) && Objects.equals(this.additionalProperties, convertJobResultsToSignalsAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,jobResultIds,notifications,signalMessage,signalSeverity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertJobResultsToSignalsAttributes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobResultIds: ").append(toIndentedString(jobResultIds)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    signalMessage: ").append(toIndentedString(signalMessage)).append("\n");
    sb.append("    signalSeverity: ").append(toIndentedString(signalSeverity)).append("\n");
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
