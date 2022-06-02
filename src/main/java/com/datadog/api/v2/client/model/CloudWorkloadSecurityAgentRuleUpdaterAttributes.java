/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The attributes of the user who last updated the Agent rule. */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleUpdaterAttributes.JSON_PROPERTY_HANDLE,
  CloudWorkloadSecurityAgentRuleUpdaterAttributes.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleUpdaterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CloudWorkloadSecurityAgentRuleUpdaterAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The handle of the user.
   *
   * @return handle
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public CloudWorkloadSecurityAgentRuleUpdaterAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** Return true if this CloudWorkloadSecurityAgentRuleUpdaterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleUpdaterAttributes
        cloudWorkloadSecurityAgentRuleUpdaterAttributes =
            (CloudWorkloadSecurityAgentRuleUpdaterAttributes) o;
    return Objects.equals(this.handle, cloudWorkloadSecurityAgentRuleUpdaterAttributes.handle)
        && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleUpdaterAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleUpdaterAttributes {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
