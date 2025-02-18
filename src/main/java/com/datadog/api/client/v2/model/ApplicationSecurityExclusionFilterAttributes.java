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

/** Attributes describing an Application Security exclusion filter. */
@JsonPropertyOrder({
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_DESCRIPTION,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_ENABLED,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_EVENT_QUERY,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_IP_LIST,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_ON_MATCH,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_PARAMETERS,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_PATH_GLOB,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_RULES_TARGET,
  ApplicationSecurityExclusionFilterAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityExclusionFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private String eventQuery;

  public static final String JSON_PROPERTY_IP_LIST = "ip_list";
  private List<String> ipList = null;

  public static final String JSON_PROPERTY_ON_MATCH = "on_match";
  private ApplicationSecurityExclusionFilterOnMatch onMatch;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<String> parameters = null;

  public static final String JSON_PROPERTY_PATH_GLOB = "path_glob";
  private String pathGlob;

  public static final String JSON_PROPERTY_RULES_TARGET = "rules_target";
  private List<ApplicationSecurityExclusionFilterRulesTarget> rulesTarget = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<ApplicationSecurityExclusionFilterScope> scope = null;

  public ApplicationSecurityExclusionFilterAttributes() {}

  @JsonCreator
  public ApplicationSecurityExclusionFilterAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled) {
    this.description = description;
    this.enabled = enabled;
  }

  public ApplicationSecurityExclusionFilterAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for the exclusion filter.
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

  public ApplicationSecurityExclusionFilterAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the exclusion filter is enabled.
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

  /**
   * The event query matched by the legacy exclusion filter.
   *
   * @return eventQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventQuery() {
    return eventQuery;
  }

  public ApplicationSecurityExclusionFilterAttributes ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public ApplicationSecurityExclusionFilterAttributes addIpListItem(String ipListItem) {
    if (this.ipList == null) {
      this.ipList = new ArrayList<>();
    }
    this.ipList.add(ipListItem);
    return this;
  }

  /**
   * The client IP addresses matched by the exclusion filter (CIDR notation is supported).
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

  public ApplicationSecurityExclusionFilterAttributes onMatch(
      ApplicationSecurityExclusionFilterOnMatch onMatch) {
    this.onMatch = onMatch;
    this.unparsed |= !onMatch.isValid();
    return this;
  }

  /**
   * The action taken when the exclusion filter matches. When set to <code>monitor</code>, security
   * traces are emitted but the requests are not blocked. By default, security traces are not
   * emitted and the requests are not blocked.
   *
   * @return onMatch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationSecurityExclusionFilterOnMatch getOnMatch() {
    return onMatch;
  }

  public void setOnMatch(ApplicationSecurityExclusionFilterOnMatch onMatch) {
    if (!onMatch.isValid()) {
      this.unparsed = true;
    }
    this.onMatch = onMatch;
  }

  public ApplicationSecurityExclusionFilterAttributes parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ApplicationSecurityExclusionFilterAttributes addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * A list of parameters matched by the exclusion filter in the HTTP query string and HTTP request
   * body. Nested parameters can be matched by joining fields with a dot character.
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

  public ApplicationSecurityExclusionFilterAttributes pathGlob(String pathGlob) {
    this.pathGlob = pathGlob;
    return this;
  }

  /**
   * The HTTP path glob expression matched by the exclusion filter.
   *
   * @return pathGlob
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_GLOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPathGlob() {
    return pathGlob;
  }

  public void setPathGlob(String pathGlob) {
    this.pathGlob = pathGlob;
  }

  public ApplicationSecurityExclusionFilterAttributes rulesTarget(
      List<ApplicationSecurityExclusionFilterRulesTarget> rulesTarget) {
    this.rulesTarget = rulesTarget;
    for (ApplicationSecurityExclusionFilterRulesTarget item : rulesTarget) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationSecurityExclusionFilterAttributes addRulesTargetItem(
      ApplicationSecurityExclusionFilterRulesTarget rulesTargetItem) {
    if (this.rulesTarget == null) {
      this.rulesTarget = new ArrayList<>();
    }
    this.rulesTarget.add(rulesTargetItem);
    this.unparsed |= rulesTargetItem.unparsed;
    return this;
  }

  /**
   * The WAF rules targeted by the exclusion filter.
   *
   * @return rulesTarget
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationSecurityExclusionFilterRulesTarget> getRulesTarget() {
    return rulesTarget;
  }

  public void setRulesTarget(List<ApplicationSecurityExclusionFilterRulesTarget> rulesTarget) {
    this.rulesTarget = rulesTarget;
  }

  public ApplicationSecurityExclusionFilterAttributes scope(
      List<ApplicationSecurityExclusionFilterScope> scope) {
    this.scope = scope;
    for (ApplicationSecurityExclusionFilterScope item : scope) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationSecurityExclusionFilterAttributes addScopeItem(
      ApplicationSecurityExclusionFilterScope scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    this.unparsed |= scopeItem.unparsed;
    return this;
  }

  /**
   * The services where the exclusion filter is deployed.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationSecurityExclusionFilterScope> getScope() {
    return scope;
  }

  public void setScope(List<ApplicationSecurityExclusionFilterScope> scope) {
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
   * @return ApplicationSecurityExclusionFilterAttributes
   */
  @JsonAnySetter
  public ApplicationSecurityExclusionFilterAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ApplicationSecurityExclusionFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityExclusionFilterAttributes applicationSecurityExclusionFilterAttributes =
        (ApplicationSecurityExclusionFilterAttributes) o;
    return Objects.equals(
            this.description, applicationSecurityExclusionFilterAttributes.description)
        && Objects.equals(this.enabled, applicationSecurityExclusionFilterAttributes.enabled)
        && Objects.equals(this.eventQuery, applicationSecurityExclusionFilterAttributes.eventQuery)
        && Objects.equals(this.ipList, applicationSecurityExclusionFilterAttributes.ipList)
        && Objects.equals(this.onMatch, applicationSecurityExclusionFilterAttributes.onMatch)
        && Objects.equals(this.parameters, applicationSecurityExclusionFilterAttributes.parameters)
        && Objects.equals(this.pathGlob, applicationSecurityExclusionFilterAttributes.pathGlob)
        && Objects.equals(
            this.rulesTarget, applicationSecurityExclusionFilterAttributes.rulesTarget)
        && Objects.equals(this.scope, applicationSecurityExclusionFilterAttributes.scope)
        && Objects.equals(
            this.additionalProperties,
            applicationSecurityExclusionFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        enabled,
        eventQuery,
        ipList,
        onMatch,
        parameters,
        pathGlob,
        rulesTarget,
        scope,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityExclusionFilterAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    onMatch: ").append(toIndentedString(onMatch)).append("\n");
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
