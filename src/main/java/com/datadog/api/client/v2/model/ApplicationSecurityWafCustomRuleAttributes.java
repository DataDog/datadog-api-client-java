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
   * <p>A WAF custom rule.</p>
 */
@JsonPropertyOrder({
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_ACTION,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_BLOCKING,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_CONDITIONS,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_ENABLED,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_METADATA,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_NAME,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_PATH_GLOB,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_SCOPE,
  ApplicationSecurityWafCustomRuleAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafCustomRuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private ApplicationSecurityWafCustomRuleAction action;

  public static final String JSON_PROPERTY_BLOCKING = "blocking";
  private Boolean blocking;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<ApplicationSecurityWafCustomRuleCondition> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ApplicationSecurityWafCustomRuleMetadata metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATH_GLOB = "path_glob";
  private String pathGlob;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<ApplicationSecurityWafCustomRuleScope> scope = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private ApplicationSecurityWafCustomRuleTags tags;

  public ApplicationSecurityWafCustomRuleAttributes() {}

  @JsonCreator
  public ApplicationSecurityWafCustomRuleAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_BLOCKING)Boolean blocking,
            @JsonProperty(required=true, value=JSON_PROPERTY_CONDITIONS)List<ApplicationSecurityWafCustomRuleCondition> conditions,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TAGS)ApplicationSecurityWafCustomRuleTags tags) {
        this.blocking = blocking;
        this.conditions = conditions;
        this.enabled = enabled;
        this.name = name;
        this.tags = tags;
        this.unparsed |= tags.unparsed;
  }
  public ApplicationSecurityWafCustomRuleAttributes action(ApplicationSecurityWafCustomRuleAction action) {
    this.action = action;
    this.unparsed |= action.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>ApplicationSecurityWafCustomRuleAction</code> object.</p>
   * @return action
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ApplicationSecurityWafCustomRuleAction getAction() {
        return action;
      }
  public void setAction(ApplicationSecurityWafCustomRuleAction action) {
    this.action = action;
  }
  public ApplicationSecurityWafCustomRuleAttributes blocking(Boolean blocking) {
    this.blocking = blocking;
    return this;
  }

  /**
   * <p>Indicates whether the WAF custom rule will block the request.</p>
   * @return blocking
  **/
      @JsonProperty(JSON_PROPERTY_BLOCKING)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getBlocking() {
        return blocking;
      }
  public void setBlocking(Boolean blocking) {
    this.blocking = blocking;
  }
  public ApplicationSecurityWafCustomRuleAttributes conditions(List<ApplicationSecurityWafCustomRuleCondition> conditions) {
    this.conditions = conditions;
    for (ApplicationSecurityWafCustomRuleCondition item : conditions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ApplicationSecurityWafCustomRuleAttributes addConditionsItem(ApplicationSecurityWafCustomRuleCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    this.unparsed |= conditionsItem.unparsed;
    return this;
  }

  /**
   * <p>Conditions for which the WAF Custom Rule will triggers, all conditions needs to match in order for the WAF
   * rule to trigger.</p>
   * @return conditions
  **/
      @JsonProperty(JSON_PROPERTY_CONDITIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ApplicationSecurityWafCustomRuleCondition> getConditions() {
        return conditions;
      }
  public void setConditions(List<ApplicationSecurityWafCustomRuleCondition> conditions) {
    this.conditions = conditions;
  }
  public ApplicationSecurityWafCustomRuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Indicates whether the WAF custom rule is enabled.</p>
   * @return enabled
  **/
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * <p>Metadata associated with the WAF Custom Rule.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ApplicationSecurityWafCustomRuleMetadata getMetadata() {
        return metadata;
      }
  public ApplicationSecurityWafCustomRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The Name of the WAF custom rule.</p>
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
  public ApplicationSecurityWafCustomRuleAttributes pathGlob(String pathGlob) {
    this.pathGlob = pathGlob;
    return this;
  }

  /**
   * <p>The path glob for the WAF custom rule.</p>
   * @return pathGlob
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATH_GLOB)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPathGlob() {
        return pathGlob;
      }
  public void setPathGlob(String pathGlob) {
    this.pathGlob = pathGlob;
  }
  public ApplicationSecurityWafCustomRuleAttributes scope(List<ApplicationSecurityWafCustomRuleScope> scope) {
    this.scope = scope;
    for (ApplicationSecurityWafCustomRuleScope item : scope) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ApplicationSecurityWafCustomRuleAttributes addScopeItem(ApplicationSecurityWafCustomRuleScope scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    this.unparsed |= scopeItem.unparsed;
    return this;
  }

  /**
   * <p>The scope of the WAF custom rule.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ApplicationSecurityWafCustomRuleScope> getScope() {
        return scope;
      }
  public void setScope(List<ApplicationSecurityWafCustomRuleScope> scope) {
    this.scope = scope;
  }
  public ApplicationSecurityWafCustomRuleAttributes tags(ApplicationSecurityWafCustomRuleTags tags) {
    this.tags = tags;
    this.unparsed |= tags.unparsed;
    return this;
  }

  /**
   * <p>Tags associated with the WAF Custom Rule. The concatenation of category and type will form the security
   * activity field associated with the traces.</p>
   * @return tags
  **/
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ApplicationSecurityWafCustomRuleTags getTags() {
        return tags;
      }
  public void setTags(ApplicationSecurityWafCustomRuleTags tags) {
    this.tags = tags;
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
   * @return ApplicationSecurityWafCustomRuleAttributes
   */
  @JsonAnySetter
  public ApplicationSecurityWafCustomRuleAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ApplicationSecurityWafCustomRuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafCustomRuleAttributes applicationSecurityWafCustomRuleAttributes = (ApplicationSecurityWafCustomRuleAttributes) o;
    return Objects.equals(this.action, applicationSecurityWafCustomRuleAttributes.action) && Objects.equals(this.blocking, applicationSecurityWafCustomRuleAttributes.blocking) && Objects.equals(this.conditions, applicationSecurityWafCustomRuleAttributes.conditions) && Objects.equals(this.enabled, applicationSecurityWafCustomRuleAttributes.enabled) && Objects.equals(this.metadata, applicationSecurityWafCustomRuleAttributes.metadata) && Objects.equals(this.name, applicationSecurityWafCustomRuleAttributes.name) && Objects.equals(this.pathGlob, applicationSecurityWafCustomRuleAttributes.pathGlob) && Objects.equals(this.scope, applicationSecurityWafCustomRuleAttributes.scope) && Objects.equals(this.tags, applicationSecurityWafCustomRuleAttributes.tags) && Objects.equals(this.additionalProperties, applicationSecurityWafCustomRuleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(action,blocking,conditions,enabled,metadata,name,pathGlob,scope,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafCustomRuleAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathGlob: ").append(toIndentedString(pathGlob)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
