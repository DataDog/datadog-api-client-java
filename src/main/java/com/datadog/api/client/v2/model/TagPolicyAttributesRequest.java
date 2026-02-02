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

/** Attributes for creating or updating a tag policy. */
@JsonPropertyOrder({
  TagPolicyAttributesRequest.JSON_PROPERTY_ENABLED,
  TagPolicyAttributesRequest.JSON_PROPERTY_NEGATED,
  TagPolicyAttributesRequest.JSON_PROPERTY_POLICY_NAME,
  TagPolicyAttributesRequest.JSON_PROPERTY_REQUIRED,
  TagPolicyAttributesRequest.JSON_PROPERTY_SCOPE,
  TagPolicyAttributesRequest.JSON_PROPERTY_SOURCE,
  TagPolicyAttributesRequest.JSON_PROPERTY_TAG_KEY,
  TagPolicyAttributesRequest.JSON_PROPERTY_TAG_VALUE_PATTERNS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagPolicyAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NEGATED = "negated";
  private Boolean negated;

  public static final String JSON_PROPERTY_POLICY_NAME = "policy_name";
  private String policyName;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TAG_KEY = "tag_key";
  private String tagKey;

  public static final String JSON_PROPERTY_TAG_VALUE_PATTERNS = "tag_value_patterns";
  private List<String> tagValuePatterns = new ArrayList<>();

  public TagPolicyAttributesRequest() {}

  @JsonCreator
  public TagPolicyAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEGATED) Boolean negated,
      @JsonProperty(required = true, value = JSON_PROPERTY_POLICY_NAME) String policyName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRED) Boolean required,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEY) String tagKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_VALUE_PATTERNS)
          List<String> tagValuePatterns) {
    this.enabled = enabled;
    this.negated = negated;
    this.policyName = policyName;
    this.required = required;
    this.scope = scope;
    this.source = source;
    this.tagKey = tagKey;
    this.tagValuePatterns = tagValuePatterns;
  }

  public TagPolicyAttributesRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the policy is enabled.
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

  public TagPolicyAttributesRequest negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * Whether the policy is negated.
   *
   * @return negated
   */
  @JsonProperty(JSON_PROPERTY_NEGATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public TagPolicyAttributesRequest policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * The name of the tag policy.
   *
   * @return policyName
   */
  @JsonProperty(JSON_PROPERTY_POLICY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public TagPolicyAttributesRequest required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the tag is required.
   *
   * @return required
   */
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public TagPolicyAttributesRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope of the tag policy.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public TagPolicyAttributesRequest source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The data source for the tag policy (e.g., logs, metrics).
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public TagPolicyAttributesRequest tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }

  /**
   * The tag key that the policy applies to.
   *
   * @return tagKey
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTagKey() {
    return tagKey;
  }

  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  public TagPolicyAttributesRequest tagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
    return this;
  }

  public TagPolicyAttributesRequest addTagValuePatternsItem(String tagValuePatternsItem) {
    this.tagValuePatterns.add(tagValuePatternsItem);
    return this;
  }

  /**
   * List of patterns that tag values must match.
   *
   * @return tagValuePatterns
   */
  @JsonProperty(JSON_PROPERTY_TAG_VALUE_PATTERNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTagValuePatterns() {
    return tagValuePatterns;
  }

  public void setTagValuePatterns(List<String> tagValuePatterns) {
    this.tagValuePatterns = tagValuePatterns;
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
   * @return TagPolicyAttributesRequest
   */
  @JsonAnySetter
  public TagPolicyAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagPolicyAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagPolicyAttributesRequest tagPolicyAttributesRequest = (TagPolicyAttributesRequest) o;
    return Objects.equals(this.enabled, tagPolicyAttributesRequest.enabled)
        && Objects.equals(this.negated, tagPolicyAttributesRequest.negated)
        && Objects.equals(this.policyName, tagPolicyAttributesRequest.policyName)
        && Objects.equals(this.required, tagPolicyAttributesRequest.required)
        && Objects.equals(this.scope, tagPolicyAttributesRequest.scope)
        && Objects.equals(this.source, tagPolicyAttributesRequest.source)
        && Objects.equals(this.tagKey, tagPolicyAttributesRequest.tagKey)
        && Objects.equals(this.tagValuePatterns, tagPolicyAttributesRequest.tagValuePatterns)
        && Objects.equals(
            this.additionalProperties, tagPolicyAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        enabled,
        negated,
        policyName,
        required,
        scope,
        source,
        tagKey,
        tagValuePatterns,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagPolicyAttributesRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValuePatterns: ").append(toIndentedString(tagValuePatterns)).append("\n");
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
