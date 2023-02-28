/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Create a new Cloud Workload Security Agent rule.</p>
 */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleCreateAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleCreateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CloudWorkloadSecurityAgentRuleCreateAttributes() {}

  @JsonCreator
  public CloudWorkloadSecurityAgentRuleCreateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_EXPRESSION)String expression,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.expression = expression;
        this.name = name;
  }
  public CloudWorkloadSecurityAgentRuleCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>The description of the Agent rule.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public CloudWorkloadSecurityAgentRuleCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the Agent rule is enabled.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public CloudWorkloadSecurityAgentRuleCreateAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * <p>The SECL expression of the Agent rule.</p>
   * @return expression
  **/
      @JsonProperty(JSON_PROPERTY_EXPRESSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getExpression() {
        return expression;
      }
  public void setExpression(String expression) {
    this.expression = expression;
  }
  public CloudWorkloadSecurityAgentRuleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the Agent rule.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Return true if this CloudWorkloadSecurityAgentRuleCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleCreateAttributes cloudWorkloadSecurityAgentRuleCreateAttributes = (CloudWorkloadSecurityAgentRuleCreateAttributes) o;
    return Objects.equals(this.description, cloudWorkloadSecurityAgentRuleCreateAttributes.description) && Objects.equals(this.enabled, cloudWorkloadSecurityAgentRuleCreateAttributes.enabled) && Objects.equals(this.expression, cloudWorkloadSecurityAgentRuleCreateAttributes.expression) && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleCreateAttributes.name);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,enabled,expression,name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleCreateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
