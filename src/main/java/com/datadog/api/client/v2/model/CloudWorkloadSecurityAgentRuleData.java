/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object for a single Agent rule. */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleData.JSON_PROPERTY_ATTRIBUTES,
  CloudWorkloadSecurityAgentRuleData.JSON_PROPERTY_ID,
  CloudWorkloadSecurityAgentRuleData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CloudWorkloadSecurityAgentRuleAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CloudWorkloadSecurityAgentRuleType type = CloudWorkloadSecurityAgentRuleType.AGENT_RULE;

  public CloudWorkloadSecurityAgentRuleData attributes(
      CloudWorkloadSecurityAgentRuleAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * A Cloud Workload Security Agent rule returned by the API.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CloudWorkloadSecurityAgentRuleAttributes attributes) {
    this.attributes = attributes;
  }

  public CloudWorkloadSecurityAgentRuleData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the Agent rule.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudWorkloadSecurityAgentRuleData type(CloudWorkloadSecurityAgentRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the resource. The value should always be <code>agent_rule</code>.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleType getType() {
    return type;
  }

  public void setType(CloudWorkloadSecurityAgentRuleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CloudWorkloadSecurityAgentRuleData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleData cloudWorkloadSecurityAgentRuleData =
        (CloudWorkloadSecurityAgentRuleData) o;
    return Objects.equals(this.attributes, cloudWorkloadSecurityAgentRuleData.attributes)
        && Objects.equals(this.id, cloudWorkloadSecurityAgentRuleData.id)
        && Objects.equals(this.type, cloudWorkloadSecurityAgentRuleData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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