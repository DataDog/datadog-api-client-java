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
   * <p>Attributes used to create or update an execution policy.</p>
 */
@JsonPropertyOrder({
  ExecutionPolicyWriteAttributes.JSON_PROPERTY_ACTION_PATTERN,
  ExecutionPolicyWriteAttributes.JSON_PROPERTY_EFFECT,
  ExecutionPolicyWriteAttributes.JSON_PROPERTY_NAME,
  ExecutionPolicyWriteAttributes.JSON_PROPERTY_SCOPE,
  ExecutionPolicyWriteAttributes.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExecutionPolicyWriteAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION_PATTERN = "action_pattern";
  private ExecutionPolicyActionPattern actionPattern;

  public static final String JSON_PROPERTY_EFFECT = "effect";
  private ExecutionPolicyEffect effect;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private ExecutionPolicyScope scope;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<ExecutionPolicyTarget> targets = null;

  public ExecutionPolicyWriteAttributes() {}

  @JsonCreator
  public ExecutionPolicyWriteAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACTION_PATTERN)ExecutionPolicyActionPattern actionPattern,
            @JsonProperty(required=true, value=JSON_PROPERTY_EFFECT)ExecutionPolicyEffect effect,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.actionPattern = actionPattern;
        this.unparsed |= actionPattern.unparsed;
        this.effect = effect;
        this.unparsed |= !effect.isValid();
        this.name = name;
  }
  public ExecutionPolicyWriteAttributes actionPattern(ExecutionPolicyActionPattern actionPattern) {
    this.actionPattern = actionPattern;
    this.unparsed |= actionPattern.unparsed;
    return this;
  }

  /**
   * <p>The set of actions this policy applies to.</p>
   * @return actionPattern
  **/
      @JsonProperty(JSON_PROPERTY_ACTION_PATTERN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ExecutionPolicyActionPattern getActionPattern() {
        return actionPattern;
      }
  public void setActionPattern(ExecutionPolicyActionPattern actionPattern) {
    this.actionPattern = actionPattern;
    if (actionPattern != null) {
      this.unparsed |= actionPattern.unparsed;
    }
  }
  public ExecutionPolicyWriteAttributes effect(ExecutionPolicyEffect effect) {
    this.effect = effect;
    this.unparsed |= !effect.isValid();
    return this;
  }

  /**
   * <p>Whether the policy allows or denies matching actions.</p>
   * @return effect
  **/
      @JsonProperty(JSON_PROPERTY_EFFECT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ExecutionPolicyEffect getEffect() {
        return effect;
      }
  public void setEffect(ExecutionPolicyEffect effect) {
    if (!effect.isValid()) {
        this.unparsed = true;
    }
    this.effect = effect;
  }
  public ExecutionPolicyWriteAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the execution policy.</p>
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
  public ExecutionPolicyWriteAttributes scope(ExecutionPolicyScope scope) {
    this.scope = scope;
    this.unparsed |= scope.unparsed;
    return this;
  }

  /**
   * <p>Restricts where the policy applies. At most one of <code>kubernetes</code>, <code>scripts</code>,
   * or <code>remote_action_rshell</code> can be set. An empty object means the policy has
   * no scope restriction.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ExecutionPolicyScope getScope() {
        return scope;
      }
  public void setScope(ExecutionPolicyScope scope) {
    this.scope = scope;
    if (scope != null) {
      this.unparsed |= scope.unparsed;
    }
  }
  public ExecutionPolicyWriteAttributes targets(List<ExecutionPolicyTarget> targets) {
    this.targets = targets;
    if (targets != null) {
    for (ExecutionPolicyTarget item : targets) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public ExecutionPolicyWriteAttributes addTargetsItem(ExecutionPolicyTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    this.unparsed |= targetsItem.unparsed;
    return this;
  }

  /**
   * <p>The targets this policy applies to.</p>
   * @return targets
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGETS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ExecutionPolicyTarget> getTargets() {
        return targets;
      }
  public void setTargets(List<ExecutionPolicyTarget> targets) {
    this.targets = targets;
    if (targets != null) {
      for (ExecutionPolicyTarget item : targets) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return ExecutionPolicyWriteAttributes
   */
  @JsonAnySetter
  public ExecutionPolicyWriteAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ExecutionPolicyWriteAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionPolicyWriteAttributes executionPolicyWriteAttributes = (ExecutionPolicyWriteAttributes) o;
    return Objects.equals(this.actionPattern, executionPolicyWriteAttributes.actionPattern) && Objects.equals(this.effect, executionPolicyWriteAttributes.effect) && Objects.equals(this.name, executionPolicyWriteAttributes.name) && Objects.equals(this.scope, executionPolicyWriteAttributes.scope) && Objects.equals(this.targets, executionPolicyWriteAttributes.targets) && Objects.equals(this.additionalProperties, executionPolicyWriteAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(actionPattern,effect,name,scope,targets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionPolicyWriteAttributes {\n");
    sb.append("    actionPattern: ").append(toIndentedString(actionPattern)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
