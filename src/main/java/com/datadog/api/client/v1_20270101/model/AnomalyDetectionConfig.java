/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({AnomalyDetectionConfig.JSON_PROPERTY_DETECTION_SENSITIVITY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnomalyDetectionConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DETECTION_SENSITIVITY = "detection_sensitivity";
  private AnomalyDetectionConfigDetectionSensitivity detectionSensitivity;

  public AnomalyDetectionConfig() {}

  @JsonCreator
  public AnomalyDetectionConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_DETECTION_SENSITIVITY)
          AnomalyDetectionConfigDetectionSensitivity detectionSensitivity) {
    this.detectionSensitivity = detectionSensitivity;
    this.unparsed |= !detectionSensitivity.isValid();
  }

  public AnomalyDetectionConfig detectionSensitivity(
      AnomalyDetectionConfigDetectionSensitivity detectionSensitivity) {
    this.detectionSensitivity = detectionSensitivity;
    this.unparsed |= !detectionSensitivity.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return detectionSensitivity
   */
  @JsonProperty(JSON_PROPERTY_DETECTION_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnomalyDetectionConfigDetectionSensitivity getDetectionSensitivity() {
    return detectionSensitivity;
  }

  public void setDetectionSensitivity(
      AnomalyDetectionConfigDetectionSensitivity detectionSensitivity) {
    if (!detectionSensitivity.isValid()) {
      this.unparsed = true;
    }
    this.detectionSensitivity = detectionSensitivity;
  }

  /** Return true if this AnomalyDetectionConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyDetectionConfig anomalyDetectionConfig = (AnomalyDetectionConfig) o;
    return Objects.equals(this.detectionSensitivity, anomalyDetectionConfig.detectionSensitivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectionSensitivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyDetectionConfig {\n");
    sb.append("    detectionSensitivity: ")
        .append(toIndentedString(detectionSensitivity))
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
