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

/** Update an existing Cloud Workload Security Agent rule */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_POLICY_ID,
  CloudWorkloadSecurityAgentRuleUpdateAttributes.JSON_PROPERTY_PRODUCT_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_POLICY_ID = "policy_id";
  private String policyId;

  public static final String JSON_PROPERTY_PRODUCT_TAGS = "product_tags";
  private List<String> productTags = null;

  public CloudWorkloadSecurityAgentRuleUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the Agent rule
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

  public CloudWorkloadSecurityAgentRuleUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the Agent rule is enabled
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

  public CloudWorkloadSecurityAgentRuleUpdateAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The SECL expression of the Agent rule
   *
   * @return expression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public CloudWorkloadSecurityAgentRuleUpdateAttributes policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * The ID of the policy where the Agent rule is saved
   *
   * @return policyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public CloudWorkloadSecurityAgentRuleUpdateAttributes productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public CloudWorkloadSecurityAgentRuleUpdateAttributes addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * The list of product tags associated with the rule
   *
   * @return productTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
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
   * @return CloudWorkloadSecurityAgentRuleUpdateAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleUpdateAttributes putAdditionalProperty(
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

  /** Return true if this CloudWorkloadSecurityAgentRuleUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleUpdateAttributes cloudWorkloadSecurityAgentRuleUpdateAttributes =
        (CloudWorkloadSecurityAgentRuleUpdateAttributes) o;
    return Objects.equals(
            this.description, cloudWorkloadSecurityAgentRuleUpdateAttributes.description)
        && Objects.equals(this.enabled, cloudWorkloadSecurityAgentRuleUpdateAttributes.enabled)
        && Objects.equals(
            this.expression, cloudWorkloadSecurityAgentRuleUpdateAttributes.expression)
        && Objects.equals(this.policyId, cloudWorkloadSecurityAgentRuleUpdateAttributes.policyId)
        && Objects.equals(
            this.productTags, cloudWorkloadSecurityAgentRuleUpdateAttributes.productTags)
        && Objects.equals(
            this.additionalProperties,
            cloudWorkloadSecurityAgentRuleUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, enabled, expression, policyId, productTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleUpdateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
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
