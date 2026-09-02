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
import java.util.UUID;
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
   * <p>A target this policy is scoped to, expressed as a set of Agent tags.</p>
 */
@JsonPropertyOrder({
  ExecutionPolicyTarget.JSON_PROPERTY_AGENT_TAGS,
  ExecutionPolicyTarget.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExecutionPolicyTarget {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_TAGS = "agent_tags";
  private List<String> agentTags = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public ExecutionPolicyTarget() {}

  @JsonCreator
  public ExecutionPolicyTarget(
            @JsonProperty(required=true, value=JSON_PROPERTY_AGENT_TAGS)List<String> agentTags) {
        this.agentTags = agentTags;
  }
  public ExecutionPolicyTarget agentTags(List<String> agentTags) {
    this.agentTags = agentTags;
    return this;
  }
  public ExecutionPolicyTarget addAgentTagsItem(String agentTagsItem) {
    this.agentTags.add(agentTagsItem);
    return this;
  }

  /**
   * <p>The Agent tags identifying the target.</p>
   * @return agentTags
  **/
      @JsonProperty(JSON_PROPERTY_AGENT_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getAgentTags() {
        return agentTags;
      }
  public void setAgentTags(List<String> agentTags) {
    this.agentTags = agentTags;
  }
  public ExecutionPolicyTarget name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * <p>A human-readable name for the target.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getName() {
        return name.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  @JsonProperty(JSON_PROPERTY_NAME)public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }
  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ExecutionPolicyTarget
   */
  @JsonAnySetter
  public ExecutionPolicyTarget putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ExecutionPolicyTarget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionPolicyTarget executionPolicyTarget = (ExecutionPolicyTarget) o;
    return Objects.equals(this.agentTags, executionPolicyTarget.agentTags) && Objects.equals(this.name, executionPolicyTarget.name) && Objects.equals(this.additionalProperties, executionPolicyTarget.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(agentTags,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionPolicyTarget {\n");
    sb.append("    agentTags: ").append(toIndentedString(agentTags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
