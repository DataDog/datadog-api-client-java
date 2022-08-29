/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The funnel step. */
@JsonPropertyOrder({FunnelStep.JSON_PROPERTY_FACET, FunnelStep.JSON_PROPERTY_VALUE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public FunnelStep() {}

  @JsonCreator
  public FunnelStep(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.facet = facet;
    this.value = value;
  }

  public FunnelStep facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * The facet of the step.
   *
   * @return facet
   */
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public FunnelStep value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the step.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this FunnelStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelStep funnelStep = (FunnelStep) o;
    return Objects.equals(this.facet, funnelStep.facet)
        && Objects.equals(this.value, funnelStep.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelStep {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
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
