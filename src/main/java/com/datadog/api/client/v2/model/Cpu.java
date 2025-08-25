/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CPU usage statistics derived from historical Spark job metrics. Provides multiple estimates so
 * users can choose between conservative and cost-saving risk profiles.
 */
@JsonPropertyOrder({Cpu.JSON_PROPERTY_MAX, Cpu.JSON_PROPERTY_P75, Cpu.JSON_PROPERTY_P95})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Cpu {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX = "max";
  private Long max;

  public static final String JSON_PROPERTY_P75 = "p75";
  private Long p75;

  public static final String JSON_PROPERTY_P95 = "p95";
  private Long p95;

  public Cpu max(Long max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum CPU usage observed for the job, expressed in millicores. This represents the upper
   * bound of usage.
   *
   * @return max
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public Cpu p75(Long p75) {
    this.p75 = p75;
    return this;
  }

  /**
   * 75th percentile of CPU usage (millicores). Represents a cost-saving configuration while
   * covering most workloads.
   *
   * @return p75
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P75)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getP75() {
    return p75;
  }

  public void setP75(Long p75) {
    this.p75 = p75;
  }

  public Cpu p95(Long p95) {
    this.p95 = p95;
    return this;
  }

  /**
   * 95th percentile of CPU usage (millicores). Balances performance and cost, providing a safer
   * margin than p75.
   *
   * @return p95
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P95)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getP95() {
    return p95;
  }

  public void setP95(Long p95) {
    this.p95 = p95;
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
   * @return Cpu
   */
  @JsonAnySetter
  public Cpu putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Cpu object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cpu cpu = (Cpu) o;
    return Objects.equals(this.max, cpu.max)
        && Objects.equals(this.p75, cpu.p75)
        && Objects.equals(this.p95, cpu.p95)
        && Objects.equals(this.additionalProperties, cpu.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, p75, p95, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cpu {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    p75: ").append(toIndentedString(p75)).append("\n");
    sb.append("    p95: ").append(toIndentedString(p95)).append("\n");
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
