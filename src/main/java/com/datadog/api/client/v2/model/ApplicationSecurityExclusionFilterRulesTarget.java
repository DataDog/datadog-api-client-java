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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Target WAF rules based either on an identifier or tags. */
@JsonPropertyOrder({
  ApplicationSecurityExclusionFilterRulesTarget.JSON_PROPERTY_RULE_ID,
  ApplicationSecurityExclusionFilterRulesTarget.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityExclusionFilterRulesTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private String ruleId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private ApplicationSecurityExclusionFilterRulesTargetTags tags;

  public ApplicationSecurityExclusionFilterRulesTarget ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * Target a single WAF rule based on its identifier.
   *
   * @return ruleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public ApplicationSecurityExclusionFilterRulesTarget tags(
      ApplicationSecurityExclusionFilterRulesTargetTags tags) {
    this.tags = tags;
    this.unparsed |= tags.unparsed;
    return this;
  }

  /**
   * Target multiple WAF rules based on their tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationSecurityExclusionFilterRulesTargetTags getTags() {
    return tags;
  }

  public void setTags(ApplicationSecurityExclusionFilterRulesTargetTags tags) {
    this.tags = tags;
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
   * @return ApplicationSecurityExclusionFilterRulesTarget
   */
  @JsonAnySetter
  public ApplicationSecurityExclusionFilterRulesTarget putAdditionalProperty(
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

  /** Return true if this ApplicationSecurityExclusionFilterRulesTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityExclusionFilterRulesTarget applicationSecurityExclusionFilterRulesTarget =
        (ApplicationSecurityExclusionFilterRulesTarget) o;
    return Objects.equals(this.ruleId, applicationSecurityExclusionFilterRulesTarget.ruleId)
        && Objects.equals(this.tags, applicationSecurityExclusionFilterRulesTarget.tags)
        && Objects.equals(
            this.additionalProperties,
            applicationSecurityExclusionFilterRulesTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityExclusionFilterRulesTarget {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
