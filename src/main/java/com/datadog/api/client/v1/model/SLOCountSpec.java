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

/** A metric SLI specification. */
@JsonPropertyOrder({SLOCountSpec.JSON_PROPERTY_COUNT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCountSpec {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private SLOCountDefinition count;

  public SLOCountSpec() {}

  @JsonCreator
  public SLOCountSpec(
      @JsonProperty(required = true, value = JSON_PROPERTY_COUNT) SLOCountDefinition count) {
    this.count = count;
    this.unparsed |= count.unparsed;
  }

  public SLOCountSpec count(SLOCountDefinition count) {
    this.count = count;
    this.unparsed |= count.unparsed;
    return this;
  }

  /**
   * A count-based (metric) SLI specification, composed of three parts: the good events formula, the
   * total events formula, and the underlying queries.
   *
   * @return count
   */
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOCountDefinition getCount() {
    return count;
  }

  public void setCount(SLOCountDefinition count) {
    this.count = count;
  }

  /** Return true if this SLOCountSpec object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCountSpec sloCountSpec = (SLOCountSpec) o;
    return Objects.equals(this.count, sloCountSpec.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCountSpec {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
