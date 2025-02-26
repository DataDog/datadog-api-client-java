/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes describing a WAF exclusion filter. */
@JsonPropertyOrder({
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_DESCRIPTION,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_ENABLED,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_EVENT_QUERY,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_IP_LIST,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_METADATA,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_ON_MATCH,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_PARAMETERS,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_PATH_GLOB,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_RULES_TARGET,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_SCOPE,
  ApplicationSecurityWafExclusionFilterAttributes.JSON_PROPERTY_SEARCH_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafExclusionFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private String eventQuery;

  public static final String JSON_PROPERTY_IP_LIST = "ip_list";
  private List<String> ipList = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ApplicationSecurityWafExclusionFilterMetadata metadata;

  public static final String JSON_PROPERTY_ON_MATCH = "on_match";
  private ApplicationSecurityWafExclusionFilterOnMatch onMatch;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<String> parameters = null;

  public static final String JSON_PROPERTY_PATH_GLOB = "path_glob";
  private String pathGlob;

  public static final String JSON_PROPERTY_RULES_TARGET = "rules_target";
  private List<ApplicationSecurityWafExclusionFilterRulesTarget> rulesTarget = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<ApplicationSecurityWafExclusionFilterScope> scope = null;

  public static final String JSON_PROPERTY_SEARCH_QUERY = "search_query";
  private String searchQuery;

  public ApplicationSecurityWafExclusionFilterAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for the exclusion filter.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationSecurityWafExclusionFilterAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the exclusion filter is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ApplicationSecurityWafExclusionFilterAttributes eventQuery(String eventQuery) {
    this.eventQuery = eventQuery;
    return this;
  }

  /**
   * The event query matched by the legacy exclusion filter. Cannot be created nor updated.
   *
   * @return eventQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(String eventQuery) {
    this.eventQuery = eventQuery;
  }

  public ApplicationSecurityWafExclusionFilterAttributes ipList(List<String> ipList) {
    this.ipList = ipList;
    return this;
  }

  public ApplicationSecurityWafExclusionFilterAttributes addIpListItem(String ipListItem) {
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

  /**
   * Extra information about the exclusion filter.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationSecurityWafExclusionFilterMetadata getMetadata() {
    return metadata;
  }

  public ApplicationSecurityWafExclusionFilterAttributes onMatch(
      ApplicationSecurityWafExclusionFilterOnMatch onMatch) {
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
  public ApplicationSecurityWafExclusionFilterOnMatch getOnMatch() {
    return onMatch;
  }

  public void setOnMatch(ApplicationSecurityWafExclusionFilterOnMatch onMatch) {
    if (!onMatch.isValid()) {
      this.unparsed = true;
    }
    this.onMatch = onMatch;
  }

  public ApplicationSecurityWafExclusionFilterAttributes parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ApplicationSecurityWafExclusionFilterAttributes addParametersItem(String parametersItem) {
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

  public ApplicationSecurityWafExclusionFilterAttributes pathGlob(String pathGlob) {
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

  public ApplicationSecurityWafExclusionFilterAttributes rulesTarget(
      List<ApplicationSecurityWafExclusionFilterRulesTarget> rulesTarget) {
    this.rulesTarget = rulesTarget;
    for (ApplicationSecurityWafExclusionFilterRulesTarget item : rulesTarget) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationSecurityWafExclusionFilterAttributes addRulesTargetItem(
      ApplicationSecurityWafExclusionFilterRulesTarget rulesTargetItem) {
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
  public List<ApplicationSecurityWafExclusionFilterRulesTarget> getRulesTarget() {
    return rulesTarget;
  }

  public void setRulesTarget(List<ApplicationSecurityWafExclusionFilterRulesTarget> rulesTarget) {
    this.rulesTarget = rulesTarget;
  }

  public ApplicationSecurityWafExclusionFilterAttributes scope(
      List<ApplicationSecurityWafExclusionFilterScope> scope) {
    this.scope = scope;
    for (ApplicationSecurityWafExclusionFilterScope item : scope) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationSecurityWafExclusionFilterAttributes addScopeItem(
      ApplicationSecurityWafExclusionFilterScope scopeItem) {
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
  public List<ApplicationSecurityWafExclusionFilterScope> getScope() {
    return scope;
  }

  public void setScope(List<ApplicationSecurityWafExclusionFilterScope> scope) {
    this.scope = scope;
  }

  /**
   * Generated event search query for traces matching the exclusion filter.
   *
   * @return searchQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSearchQuery() {
    return searchQuery;
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
   * @return ApplicationSecurityWafExclusionFilterAttributes
   */
  @JsonAnySetter
  public ApplicationSecurityWafExclusionFilterAttributes putAdditionalProperty(
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

  /** Return true if this ApplicationSecurityWafExclusionFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafExclusionFilterAttributes
        applicationSecurityWafExclusionFilterAttributes =
            (ApplicationSecurityWafExclusionFilterAttributes) o;
    return Objects.equals(
            this.description, applicationSecurityWafExclusionFilterAttributes.description)
        && Objects.equals(this.enabled, applicationSecurityWafExclusionFilterAttributes.enabled)
        && Objects.equals(
            this.eventQuery, applicationSecurityWafExclusionFilterAttributes.eventQuery)
        && Objects.equals(this.ipList, applicationSecurityWafExclusionFilterAttributes.ipList)
        && Objects.equals(this.metadata, applicationSecurityWafExclusionFilterAttributes.metadata)
        && Objects.equals(this.onMatch, applicationSecurityWafExclusionFilterAttributes.onMatch)
        && Objects.equals(
            this.parameters, applicationSecurityWafExclusionFilterAttributes.parameters)
        && Objects.equals(this.pathGlob, applicationSecurityWafExclusionFilterAttributes.pathGlob)
        && Objects.equals(
            this.rulesTarget, applicationSecurityWafExclusionFilterAttributes.rulesTarget)
        && Objects.equals(this.scope, applicationSecurityWafExclusionFilterAttributes.scope)
        && Objects.equals(
            this.searchQuery, applicationSecurityWafExclusionFilterAttributes.searchQuery)
        && Objects.equals(
            this.additionalProperties,
            applicationSecurityWafExclusionFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        enabled,
        eventQuery,
        ipList,
        metadata,
        onMatch,
        parameters,
        pathGlob,
        rulesTarget,
        scope,
        searchQuery,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafExclusionFilterAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    onMatch: ").append(toIndentedString(onMatch)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    pathGlob: ").append(toIndentedString(pathGlob)).append("\n");
    sb.append("    rulesTarget: ").append(toIndentedString(rulesTarget)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
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
