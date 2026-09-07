/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Guardrail metric details. */
@JsonPropertyOrder({
  GuardrailMetric.JSON_PROPERTY_METRIC_ID,
  GuardrailMetric.JSON_PROPERTY_TRIGGER_ACTION,
  GuardrailMetric.JSON_PROPERTY_TRIGGERED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuardrailMetric {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private String metricId;

  public static final String JSON_PROPERTY_TRIGGER_ACTION = "trigger_action";
  private GuardrailTriggerAction triggerAction;

  public static final String JSON_PROPERTY_TRIGGERED_BY = "triggered_by";
  private JsonNullable<String> triggeredBy = JsonNullable.<String>undefined();

  public GuardrailMetric() {}

  @JsonCreator
  public GuardrailMetric(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_ID) String metricId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIGGER_ACTION)
          GuardrailTriggerAction triggerAction) {
    this.metricId = metricId;
    this.triggerAction = triggerAction;
    this.unparsed |= !triggerAction.isValid();
  }

  public GuardrailMetric metricId(String metricId) {
    this.metricId = metricId;
    return this;
  }

  /**
   * The metric ID to monitor.
   *
   * @return metricId
   */
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetricId() {
    return metricId;
  }

  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }

  public GuardrailMetric triggerAction(GuardrailTriggerAction triggerAction) {
    this.triggerAction = triggerAction;
    this.unparsed |= !triggerAction.isValid();
    return this;
  }

  /**
   * Action to perform when a guardrail threshold is triggered.
   *
   * @return triggerAction
   */
  @JsonProperty(JSON_PROPERTY_TRIGGER_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GuardrailTriggerAction getTriggerAction() {
    return triggerAction;
  }

  public void setTriggerAction(GuardrailTriggerAction triggerAction) {
    if (!triggerAction.isValid()) {
      this.unparsed = true;
    }
    this.triggerAction = triggerAction;
  }

  public GuardrailMetric triggeredBy(String triggeredBy) {
    this.triggeredBy = JsonNullable.<String>of(triggeredBy);
    return this;
  }

  /**
   * The signal or system that triggered the action.
   *
   * @return triggeredBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTriggeredBy() {
    return triggeredBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRIGGERED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTriggeredBy_JsonNullable() {
    return triggeredBy;
  }

  @JsonProperty(JSON_PROPERTY_TRIGGERED_BY)
  public void setTriggeredBy_JsonNullable(JsonNullable<String> triggeredBy) {
    this.triggeredBy = triggeredBy;
  }

  public void setTriggeredBy(String triggeredBy) {
    this.triggeredBy = JsonNullable.<String>of(triggeredBy);
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return GuardrailMetric
   */
  @JsonAnySetter
  public GuardrailMetric putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuardrailMetric object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuardrailMetric guardrailMetric = (GuardrailMetric) o;
    return Objects.equals(this.metricId, guardrailMetric.metricId)
        && Objects.equals(this.triggerAction, guardrailMetric.triggerAction)
        && Objects.equals(this.triggeredBy, guardrailMetric.triggeredBy)
        && Objects.equals(this.additionalProperties, guardrailMetric.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricId, triggerAction, triggeredBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuardrailMetric {\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    triggerAction: ").append(toIndentedString(triggerAction)).append("\n");
    sb.append("    triggeredBy: ").append(toIndentedString(triggeredBy)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
