/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object for a single Agent rule. */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleCreateData.JSON_PROPERTY_ATTRIBUTES,
  CloudWorkloadSecurityAgentRuleCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CloudWorkloadSecurityAgentRuleCreateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CloudWorkloadSecurityAgentRuleType type = CloudWorkloadSecurityAgentRuleType.AGENT_RULE;

  public CloudWorkloadSecurityAgentRuleCreateData() {}

  @JsonCreator
  public CloudWorkloadSecurityAgentRuleCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          CloudWorkloadSecurityAgentRuleCreateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CloudWorkloadSecurityAgentRuleType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CloudWorkloadSecurityAgentRuleCreateData attributes(
      CloudWorkloadSecurityAgentRuleCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Create a new Cloud Workload Security Agent rule.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudWorkloadSecurityAgentRuleCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CloudWorkloadSecurityAgentRuleCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public CloudWorkloadSecurityAgentRuleCreateData type(CloudWorkloadSecurityAgentRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the resource. The value should always be <code>agent_rule</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudWorkloadSecurityAgentRuleType getType() {
    return type;
  }

  public void setType(CloudWorkloadSecurityAgentRuleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CloudWorkloadSecurityAgentRuleCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleCreateData cloudWorkloadSecurityAgentRuleCreateData =
        (CloudWorkloadSecurityAgentRuleCreateData) o;
    return Objects.equals(this.attributes, cloudWorkloadSecurityAgentRuleCreateData.attributes)
        && Objects.equals(this.type, cloudWorkloadSecurityAgentRuleCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
