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

/**
 * Binary decision. Overrides, reason fields, and unknown attributes are rejected, including null
 * values.
 */
@JsonPropertyOrder({TemporaryGrantRequestDecisionAttributes.JSON_PROPERTY_DECISION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TemporaryGrantRequestDecisionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DECISION = "decision";
  private TemporaryGrantRequestDecision decision;

  public TemporaryGrantRequestDecisionAttributes() {}

  @JsonCreator
  public TemporaryGrantRequestDecisionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DECISION)
          TemporaryGrantRequestDecision decision) {
    this.decision = decision;
    this.unparsed |= !decision.isValid();
  }

  public TemporaryGrantRequestDecisionAttributes decision(TemporaryGrantRequestDecision decision) {
    this.decision = decision;
    this.unparsed |= !decision.isValid();
    return this;
  }

  /**
   * Approve the exact submitted total and expiry, or deny the request.
   *
   * @return decision
   */
  @JsonProperty(JSON_PROPERTY_DECISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TemporaryGrantRequestDecision getDecision() {
    return decision;
  }

  public void setDecision(TemporaryGrantRequestDecision decision) {
    if (!decision.isValid()) {
      this.unparsed = true;
    }
    this.decision = decision;
  }

  /** Return true if this TemporaryGrantRequestDecisionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporaryGrantRequestDecisionAttributes temporaryGrantRequestDecisionAttributes =
        (TemporaryGrantRequestDecisionAttributes) o;
    return Objects.equals(this.decision, temporaryGrantRequestDecisionAttributes.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporaryGrantRequestDecisionAttributes {\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
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
