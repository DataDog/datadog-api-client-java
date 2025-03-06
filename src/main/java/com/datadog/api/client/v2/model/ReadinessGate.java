/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Used to merge multiple branches into a single branch. */
@JsonPropertyOrder({ReadinessGate.JSON_PROPERTY_THRESHOLD_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReadinessGate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_THRESHOLD_TYPE = "thresholdType";
  private ReadinessGateThresholdType thresholdType;

  public ReadinessGate() {}

  @JsonCreator
  public ReadinessGate(
      @JsonProperty(required = true, value = JSON_PROPERTY_THRESHOLD_TYPE)
          ReadinessGateThresholdType thresholdType) {
    this.thresholdType = thresholdType;
    this.unparsed |= !thresholdType.isValid();
  }

  public ReadinessGate thresholdType(ReadinessGateThresholdType thresholdType) {
    this.thresholdType = thresholdType;
    this.unparsed |= !thresholdType.isValid();
    return this;
  }

  /**
   * The definition of <code>ReadinessGateThresholdType</code> object.
   *
   * @return thresholdType
   */
  @JsonProperty(JSON_PROPERTY_THRESHOLD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReadinessGateThresholdType getThresholdType() {
    return thresholdType;
  }

  public void setThresholdType(ReadinessGateThresholdType thresholdType) {
    if (!thresholdType.isValid()) {
      this.unparsed = true;
    }
    this.thresholdType = thresholdType;
  }

  /** Return true if this ReadinessGate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadinessGate readinessGate = (ReadinessGate) o;
    return Objects.equals(this.thresholdType, readinessGate.thresholdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresholdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadinessGate {\n");
    sb.append("    thresholdType: ").append(toIndentedString(thresholdType)).append("\n");
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
