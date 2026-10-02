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

/** A single daily AI tool activity entry. */
@JsonPropertyOrder({
  AIImpactUserActivityData.JSON_PROPERTY_ATTRIBUTES,
  AIImpactUserActivityData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIImpactUserActivityData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private AIImpactUserActivityAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AIImpactUserActivityType type = AIImpactUserActivityType.AI_IMPACT_USER_ACTIVITY;

  public AIImpactUserActivityData() {}

  @JsonCreator
  public AIImpactUserActivityData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          AIImpactUserActivityAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AIImpactUserActivityType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AIImpactUserActivityData attributes(AIImpactUserActivityAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Daily AI coding tool activity for a single user. Each entry reports whether the user was active
   * on a given day and which AI tools and models they used.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIImpactUserActivityAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AIImpactUserActivityAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public AIImpactUserActivityData type(AIImpactUserActivityType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * JSON:API type for AI Impact user activity entries.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIImpactUserActivityType getType() {
    return type;
  }

  public void setType(AIImpactUserActivityType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this AIImpactUserActivityData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIImpactUserActivityData aiImpactUserActivityData = (AIImpactUserActivityData) o;
    return Objects.equals(this.attributes, aiImpactUserActivityData.attributes)
        && Objects.equals(this.type, aiImpactUserActivityData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIImpactUserActivityData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
