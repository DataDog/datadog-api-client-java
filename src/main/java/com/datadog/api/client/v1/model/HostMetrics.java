/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Host Metrics collected. */
@JsonPropertyOrder({
  HostMetrics.JSON_PROPERTY_CPU,
  HostMetrics.JSON_PROPERTY_IOWAIT,
  HostMetrics.JSON_PROPERTY_LOAD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMetrics {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CPU = "cpu";
  private Double cpu;

  public static final String JSON_PROPERTY_IOWAIT = "iowait";
  private Double iowait;

  public static final String JSON_PROPERTY_LOAD = "load";
  private Double load;

  public HostMetrics cpu(Double cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * The percent of CPU used (everything but idle).
   *
   * @return cpu
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCpu() {
    return cpu;
  }

  public void setCpu(Double cpu) {
    this.cpu = cpu;
  }

  public HostMetrics iowait(Double iowait) {
    this.iowait = iowait;
    return this;
  }

  /**
   * The percent of CPU spent waiting on the IO (not reported for all platforms).
   *
   * @return iowait
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IOWAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getIowait() {
    return iowait;
  }

  public void setIowait(Double iowait) {
    this.iowait = iowait;
  }

  public HostMetrics load(Double load) {
    this.load = load;
    return this;
  }

  /**
   * The system load over the last 15 minutes.
   *
   * @return load
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLoad() {
    return load;
  }

  public void setLoad(Double load) {
    this.load = load;
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
   * @return HostMetrics
   */
  @JsonAnySetter
  public HostMetrics putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMetrics object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMetrics hostMetrics = (HostMetrics) o;
    return Objects.equals(this.cpu, hostMetrics.cpu)
        && Objects.equals(this.iowait, hostMetrics.iowait)
        && Objects.equals(this.load, hostMetrics.load)
        && Objects.equals(this.additionalProperties, hostMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, iowait, load, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMetrics {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    iowait: ").append(toIndentedString(iowait)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
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
