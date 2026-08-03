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
   * <p>Object containing the uptime information.</p>
 */
@JsonPropertyOrder({
  SyntheticsUptime.JSON_PROPERTY_ERRORS,
  SyntheticsUptime.JSON_PROPERTY_GROUP,
  SyntheticsUptime.JSON_PROPERTY_HISTORY,
  SyntheticsUptime.JSON_PROPERTY_SPAN_PRECISION,
  SyntheticsUptime.JSON_PROPERTY_UPTIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsUptime {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private JsonNullable<List<SLOHistoryResponseErrorWithType>> errors = JsonNullable.<List<SLOHistoryResponseErrorWithType>>undefined();

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_HISTORY = "history";
  private List<List<Double>> history = null;

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private Double spanPrecision;

  public static final String JSON_PROPERTY_UPTIME = "uptime";
  private Double uptime;

  public SyntheticsUptime errors(List<SLOHistoryResponseErrorWithType> errors) {
    this.errors = JsonNullable.<List<SLOHistoryResponseErrorWithType>>of(errors);
    return this;
  }
  public SyntheticsUptime addErrorsItem(SLOHistoryResponseErrorWithType errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.<List<SLOHistoryResponseErrorWithType>>of(new ArrayList<>());
    }
    try {
      this.errors.get().add(errorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>An array of error objects returned while querying the history data for the service level objective.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<SLOHistoryResponseErrorWithType> getErrors() {
        return errors.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SLOHistoryResponseErrorWithType>> getErrors_JsonNullable() {
    return errors;
  }
  @JsonProperty(JSON_PROPERTY_ERRORS)public void setErrors_JsonNullable(JsonNullable<List<SLOHistoryResponseErrorWithType>> errors) {
    this.errors = errors;
  }
  public void setErrors(List<SLOHistoryResponseErrorWithType> errors) {
    this.errors = JsonNullable.<List<SLOHistoryResponseErrorWithType>>of(errors);
  }
  public SyntheticsUptime group(String group) {
    this.group = group;
    return this;
  }

  /**
   * <p>The location name</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getGroup() {
        return group;
      }
  public void setGroup(String group) {
    this.group = group;
  }
  public SyntheticsUptime history(List<List<Double>> history) {
    this.history = history;
    return this;
  }
  public SyntheticsUptime addHistoryItem(List<Double> historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * <p>The state transition history for the monitor, represented as an array of
   * pairs. Each pair is an array where the first element is the transition timestamp
   * in Unix epoch format (integer) and the second element is the state (integer).
   * For the state, an integer value of <code>0</code> indicates uptime, <code>1</code> indicates downtime,
   * and <code>2</code> indicates no data.</p>
   * @return history
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HISTORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<List<Double>> getHistory() {
        return history;
      }
  public void setHistory(List<List<Double>> history) {
    this.history = history;
  }
  public SyntheticsUptime spanPrecision(Double spanPrecision) {
    this.spanPrecision = spanPrecision;
    return this;
  }

  /**
   * <p>The number of decimal places to which the SLI value is accurate for the given from-to timestamps.</p>
   * @return spanPrecision
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getSpanPrecision() {
        return spanPrecision;
      }
  public void setSpanPrecision(Double spanPrecision) {
    this.spanPrecision = spanPrecision;
  }
  public SyntheticsUptime uptime(Double uptime) {
    this.uptime = uptime;
    return this;
  }

  /**
   * <p>The overall uptime.</p>
   * @return uptime
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPTIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getUptime() {
        return uptime;
      }
  public void setUptime(Double uptime) {
    this.uptime = uptime;
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
   * @return SyntheticsUptime
   */
  @JsonAnySetter
  public SyntheticsUptime putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsUptime object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsUptime syntheticsUptime = (SyntheticsUptime) o;
    return Objects.equals(this.errors, syntheticsUptime.errors) && Objects.equals(this.group, syntheticsUptime.group) && Objects.equals(this.history, syntheticsUptime.history) && Objects.equals(this.spanPrecision, syntheticsUptime.spanPrecision) && Objects.equals(this.uptime, syntheticsUptime.uptime) && Objects.equals(this.additionalProperties, syntheticsUptime.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(errors,group,history,spanPrecision,uptime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsUptime {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    spanPrecision: ").append(toIndentedString(spanPrecision)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
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
