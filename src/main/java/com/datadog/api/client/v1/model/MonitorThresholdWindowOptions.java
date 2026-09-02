/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Alerting time window options.</p>
 */
@JsonPropertyOrder({
  MonitorThresholdWindowOptions.JSON_PROPERTY_RECOVERY_WINDOW,
  MonitorThresholdWindowOptions.JSON_PROPERTY_TRIGGER_WINDOW
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorThresholdWindowOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_RECOVERY_WINDOW = "recovery_window";
  private JsonNullable<String> recoveryWindow = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRIGGER_WINDOW = "trigger_window";
  private JsonNullable<String> triggerWindow = JsonNullable.<String>undefined();

  public MonitorThresholdWindowOptions recoveryWindow(String recoveryWindow) {
    this.recoveryWindow = JsonNullable.<String>of(recoveryWindow);
    return this;
  }

  /**
   * <p>Describes how long an anomalous metric must be normal before the alert recovers.</p>
   * @return recoveryWindow
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getRecoveryWindow() {
        return recoveryWindow.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_RECOVERY_WINDOW)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRecoveryWindow_JsonNullable() {
    return recoveryWindow;
  }
  @JsonProperty(JSON_PROPERTY_RECOVERY_WINDOW)public void setRecoveryWindow_JsonNullable(JsonNullable<String> recoveryWindow) {
    this.recoveryWindow = recoveryWindow;
  }
  public void setRecoveryWindow(String recoveryWindow) {
    this.recoveryWindow = JsonNullable.<String>of(recoveryWindow);
  }
  public MonitorThresholdWindowOptions triggerWindow(String triggerWindow) {
    this.triggerWindow = JsonNullable.<String>of(triggerWindow);
    return this;
  }

  /**
   * <p>Describes how long a metric must be anomalous before an alert triggers.</p>
   * @return triggerWindow
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getTriggerWindow() {
        return triggerWindow.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TRIGGER_WINDOW)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTriggerWindow_JsonNullable() {
    return triggerWindow;
  }
  @JsonProperty(JSON_PROPERTY_TRIGGER_WINDOW)public void setTriggerWindow_JsonNullable(JsonNullable<String> triggerWindow) {
    this.triggerWindow = triggerWindow;
  }
  public void setTriggerWindow(String triggerWindow) {
    this.triggerWindow = JsonNullable.<String>of(triggerWindow);
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
   * @return MonitorThresholdWindowOptions
   */
  @JsonAnySetter
  public MonitorThresholdWindowOptions putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorThresholdWindowOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorThresholdWindowOptions monitorThresholdWindowOptions = (MonitorThresholdWindowOptions) o;
    return Objects.equals(this.recoveryWindow, monitorThresholdWindowOptions.recoveryWindow) && Objects.equals(this.triggerWindow, monitorThresholdWindowOptions.triggerWindow) && Objects.equals(this.additionalProperties, monitorThresholdWindowOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(recoveryWindow,triggerWindow, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorThresholdWindowOptions {\n");
    sb.append("    recoveryWindow: ").append(toIndentedString(recoveryWindow)).append("\n");
    sb.append("    triggerWindow: ").append(toIndentedString(triggerWindow)).append("\n");
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
