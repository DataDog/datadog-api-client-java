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

/** */
@JsonPropertyOrder({
  FunnelResponseElapsedTime.JSON_PROPERTY_AVG,
  FunnelResponseElapsedTime.JSON_PROPERTY_MAX,
  FunnelResponseElapsedTime.JSON_PROPERTY_MIN,
  FunnelResponseElapsedTime.JSON_PROPERTY_P5,
  FunnelResponseElapsedTime.JSON_PROPERTY_P50,
  FunnelResponseElapsedTime.JSON_PROPERTY_P95
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelResponseElapsedTime {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG = "avg";
  private Long avg;

  public static final String JSON_PROPERTY_MAX = "max";
  private Long max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Long min;

  public static final String JSON_PROPERTY_P5 = "p5";
  private Long p5;

  public static final String JSON_PROPERTY_P50 = "p50";
  private Long p50;

  public static final String JSON_PROPERTY_P95 = "p95";
  private Long p95;

  public FunnelResponseElapsedTime avg(Long avg) {
    this.avg = avg;
    return this;
  }

  /**
   * Getavg
   *
   * @return avg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvg() {
    return avg;
  }

  public void setAvg(Long avg) {
    this.avg = avg;
  }

  public FunnelResponseElapsedTime max(Long max) {
    this.max = max;
    return this;
  }

  /**
   * Getmax
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

  public FunnelResponseElapsedTime min(Long min) {
    this.min = min;
    return this;
  }

  /**
   * Getmin
   *
   * @return min
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }

  public FunnelResponseElapsedTime p5(Long p5) {
    this.p5 = p5;
    return this;
  }

  /**
   * Getp5
   *
   * @return p5
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getP5() {
    return p5;
  }

  public void setP5(Long p5) {
    this.p5 = p5;
  }

  public FunnelResponseElapsedTime p50(Long p50) {
    this.p50 = p50;
    return this;
  }

  /**
   * Getp50
   *
   * @return p50
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getP50() {
    return p50;
  }

  public void setP50(Long p50) {
    this.p50 = p50;
  }

  public FunnelResponseElapsedTime p95(Long p95) {
    this.p95 = p95;
    return this;
  }

  /**
   * Getp95
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
   * @return FunnelResponseElapsedTime
   */
  @JsonAnySetter
  public FunnelResponseElapsedTime putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FunnelResponseElapsedTime object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelResponseElapsedTime funnelResponseElapsedTime = (FunnelResponseElapsedTime) o;
    return Objects.equals(this.avg, funnelResponseElapsedTime.avg)
        && Objects.equals(this.max, funnelResponseElapsedTime.max)
        && Objects.equals(this.min, funnelResponseElapsedTime.min)
        && Objects.equals(this.p5, funnelResponseElapsedTime.p5)
        && Objects.equals(this.p50, funnelResponseElapsedTime.p50)
        && Objects.equals(this.p95, funnelResponseElapsedTime.p95)
        && Objects.equals(
            this.additionalProperties, funnelResponseElapsedTime.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avg, max, min, p5, p50, p95, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelResponseElapsedTime {\n");
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    p5: ").append(toIndentedString(p5)).append("\n");
    sb.append("    p50: ").append(toIndentedString(p50)).append("\n");
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
