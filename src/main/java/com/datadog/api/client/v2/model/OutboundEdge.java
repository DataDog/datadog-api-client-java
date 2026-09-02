/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The definition of <code>OutboundEdge</code> object. */
@JsonPropertyOrder({
  OutboundEdge.JSON_PROPERTY_BRANCH_NAME,
  OutboundEdge.JSON_PROPERTY_NEXT_STEP_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OutboundEdge {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCH_NAME = "branchName";
  private String branchName;

  public static final String JSON_PROPERTY_NEXT_STEP_NAME = "nextStepName";
  private String nextStepName;

  public OutboundEdge() {}

  @JsonCreator
  public OutboundEdge(
      @JsonProperty(required = true, value = JSON_PROPERTY_BRANCH_NAME) String branchName,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT_STEP_NAME) String nextStepName) {
    this.branchName = branchName;
    this.nextStepName = nextStepName;
  }

  public OutboundEdge branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * The <code>OutboundEdge</code> <code>branchName</code>.
   *
   * @return branchName
   */
  @JsonProperty(JSON_PROPERTY_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public OutboundEdge nextStepName(String nextStepName) {
    this.nextStepName = nextStepName;
    return this;
  }

  /**
   * The <code>OutboundEdge</code> <code>nextStepName</code>.
   *
   * @return nextStepName
   */
  @JsonProperty(JSON_PROPERTY_NEXT_STEP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNextStepName() {
    return nextStepName;
  }

  public void setNextStepName(String nextStepName) {
    this.nextStepName = nextStepName;
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
   * @return OutboundEdge
   */
  @JsonAnySetter
  public OutboundEdge putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OutboundEdge object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundEdge outboundEdge = (OutboundEdge) o;
    return Objects.equals(this.branchName, outboundEdge.branchName)
        && Objects.equals(this.nextStepName, outboundEdge.nextStepName)
        && Objects.equals(this.additionalProperties, outboundEdge.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName, nextStepName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundEdge {\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    nextStepName: ").append(toIndentedString(nextStepName)).append("\n");
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
