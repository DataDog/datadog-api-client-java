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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Tags associated with the WAF Custom Rule. The concatenation of category and type will form the
 * security activity field associated with the traces.
 */
@JsonPropertyOrder({
  ApplicationSecurityWafCustomRuleTags.JSON_PROPERTY_CATEGORY,
  ApplicationSecurityWafCustomRuleTags.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafCustomRuleTags {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private ApplicationSecurityWafCustomRuleTagsCategory category;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ApplicationSecurityWafCustomRuleTags() {}

  @JsonCreator
  public ApplicationSecurityWafCustomRuleTags(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY)
          ApplicationSecurityWafCustomRuleTagsCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.category = category;
    this.unparsed |= !category.isValid();
    this.type = type;
  }

  public ApplicationSecurityWafCustomRuleTags category(
      ApplicationSecurityWafCustomRuleTagsCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * The category of the WAF Rule, can be either <code>business_logic</code>, <code>attack_attempt
   * </code> or <code>security_response</code>.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApplicationSecurityWafCustomRuleTagsCategory getCategory() {
    return category;
  }

  public void setCategory(ApplicationSecurityWafCustomRuleTagsCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  public ApplicationSecurityWafCustomRuleTags type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the WAF rule, associated with the category will form the security activity.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, String> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ApplicationSecurityWafCustomRuleTags
   */
  @JsonAnySetter
  public ApplicationSecurityWafCustomRuleTags putAdditionalProperty(String key, String value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, String>();
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
  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public String getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this ApplicationSecurityWafCustomRuleTags object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafCustomRuleTags applicationSecurityWafCustomRuleTags =
        (ApplicationSecurityWafCustomRuleTags) o;
    return Objects.equals(this.category, applicationSecurityWafCustomRuleTags.category)
        && Objects.equals(this.type, applicationSecurityWafCustomRuleTags.type)
        && Objects.equals(
            this.additionalProperties, applicationSecurityWafCustomRuleTags.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafCustomRuleTags {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
