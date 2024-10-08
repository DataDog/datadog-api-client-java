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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Update an existing ASM Exclusion filter. */
@JsonPropertyOrder({
  ASMExclusionFilterUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  ASMExclusionFilterUpdateAttributes.JSON_PROPERTY_ENABLED,
  ASMExclusionFilterUpdateAttributes.JSON_PROPERTY_IP_LIST,
  ASMExclusionFilterUpdateAttributes.JSON_PROPERTY_PARAMETERS,
  ASMExclusionFilterUpdateAttributes.JSON_PROPERTY_PATH_GLOB,
  ASMExclusionFilterUpdateAttributes.JSON_PROPERTY_RULES_TARGET,
  ASMExclusionFilterUpdateAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ASMExclusionFilterUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_IP_LIST = "ip_list";
  private List<String> ipList = null;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<String> parameters = null;

  public static final String JSON_PROPERTY_PATH_GLOB = "path_glob";
  private String pathGlob;

  public static final String JSON_PROPERTY_RULES_TARGET = "rules_target";
  private List<ASMExclusionFilterRulesTarget> rulesTarget = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<ASMExclusionFilterScope> scope = null;

  public ASMExclusionFilterUpdateAttributes() {}

  @JsonCreator
  public ASMExclusionFilterUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH_GLOB) String pathGlob) {
    this.description = description;
    this.enabled = enabled;
    this.pathGlob = pathGlob;
  }

  public ASMExclusionFilterUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the Exclusion filter.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ASMExclusionFilterUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the Exclusion filter is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ASMExclusionFilterUpdateAttributes ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public ASMExclusionFilterUpdateAttributes addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

  /**
   * The IPs list for the exclusion filter.
   *
   * @return ipList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIpList() {
    return ipList;
  }

  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }

  public ASMExclusionFilterUpdateAttributes parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ASMExclusionFilterUpdateAttributes addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * A list of parameters for the exclusion filter.
   *
   * @return parameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  public ASMExclusionFilterUpdateAttributes pathGlob(String pathGlob) {
    this.pathGlob = pathGlob;
    return this;
  }

  /**
   * The path glob for the exclusion filter.
   *
   * @return pathGlob
   */
  @JsonProperty(JSON_PROPERTY_PATH_GLOB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPathGlob() {
    return pathGlob;
  }

  public void setPathGlob(String pathGlob) {
    this.pathGlob = pathGlob;
  }

  public ASMExclusionFilterUpdateAttributes rulesTarget(
      List<ASMExclusionFilterRulesTarget> rulesTarget) {
    this.rulesTarget = rulesTarget;
    for (ASMExclusionFilterRulesTarget item : rulesTarget) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ASMExclusionFilterUpdateAttributes addRulesTargetItem(
      ASMExclusionFilterRulesTarget rulesTargetItem) {
    if (this.rulesTarget == null) {
      this.rulesTarget = new ArrayList<>();
    }
    this.rulesTarget.add(rulesTargetItem);
    this.unparsed |= rulesTargetItem.unparsed;
    return this;
  }

  /**
   * A list of rules targeted by the exclusion filter.
   *
   * @return rulesTarget
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ASMExclusionFilterRulesTarget> getRulesTarget() {
    return rulesTarget;
  }

  public void setRulesTarget(List<ASMExclusionFilterRulesTarget> rulesTarget) {
    this.rulesTarget = rulesTarget;
  }

  public ASMExclusionFilterUpdateAttributes scope(List<ASMExclusionFilterScope> scope) {
    this.scope = scope;
    for (ASMExclusionFilterScope item : scope) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ASMExclusionFilterUpdateAttributes addScopeItem(ASMExclusionFilterScope scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    this.unparsed |= scopeItem.unparsed;
    return this;
  }

  /**
   * The scope of the exclusion filter.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ASMExclusionFilterScope> getScope() {
    return scope;
  }

  public void setScope(List<ASMExclusionFilterScope> scope) {
    this.scope = scope;
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
   * @return ASMExclusionFilterUpdateAttributes
   */
  @JsonAnySetter
  public ASMExclusionFilterUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ASMExclusionFilterUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ASMExclusionFilterUpdateAttributes asmExclusionFilterUpdateAttributes =
        (ASMExclusionFilterUpdateAttributes) o;
    return Objects.equals(this.description, asmExclusionFilterUpdateAttributes.description)
        && Objects.equals(this.enabled, asmExclusionFilterUpdateAttributes.enabled)
        && Objects.equals(this.ipList, asmExclusionFilterUpdateAttributes.ipList)
        && Objects.equals(this.parameters, asmExclusionFilterUpdateAttributes.parameters)
        && Objects.equals(this.pathGlob, asmExclusionFilterUpdateAttributes.pathGlob)
        && Objects.equals(this.rulesTarget, asmExclusionFilterUpdateAttributes.rulesTarget)
        && Objects.equals(this.scope, asmExclusionFilterUpdateAttributes.scope)
        && Objects.equals(
            this.additionalProperties, asmExclusionFilterUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        enabled,
        ipList,
        parameters,
        pathGlob,
        rulesTarget,
        scope,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ASMExclusionFilterUpdateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    pathGlob: ").append(toIndentedString(pathGlob)).append("\n");
    sb.append("    rulesTarget: ").append(toIndentedString(rulesTarget)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
