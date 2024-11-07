/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Objects describing the binding used for a mobile test. */
@JsonPropertyOrder({
  SyntheticsTestRestrictionPolicyBinding.JSON_PROPERTY_PRINCIPAL,
  SyntheticsTestRestrictionPolicyBinding.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestRestrictionPolicyBinding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private List<String> principal = null;

  public static final String JSON_PROPERTY_RELATION = "relation";
  private SyntheticsTestRestrictionPolicyBindingRelation relation;

  public SyntheticsTestRestrictionPolicyBinding principal(List<String> principal) {
    this.principal = principal;
    return this;
  }

  public SyntheticsTestRestrictionPolicyBinding addPrincipalItem(String principalItem) {
    if (this.principal == null) {
      this.principal = new ArrayList<>();
    }
    this.principal.add(principalItem);
    return this;
  }

  /**
   * List of principals for a mobile test binding.
   *
   * @return principal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPrincipal() {
    return principal;
  }

  public void setPrincipal(List<String> principal) {
    this.principal = principal;
  }

  public SyntheticsTestRestrictionPolicyBinding relation(
      SyntheticsTestRestrictionPolicyBindingRelation relation) {
    this.relation = relation;
    this.unparsed |= !relation.isValid();
    return this;
  }

  /**
   * The type of relation for the binding.
   *
   * @return relation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestRestrictionPolicyBindingRelation getRelation() {
    return relation;
  }

  public void setRelation(SyntheticsTestRestrictionPolicyBindingRelation relation) {
    if (!relation.isValid()) {
      this.unparsed = true;
    }
    this.relation = relation;
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
   * @return SyntheticsTestRestrictionPolicyBinding
   */
  @JsonAnySetter
  public SyntheticsTestRestrictionPolicyBinding putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestRestrictionPolicyBinding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestRestrictionPolicyBinding syntheticsTestRestrictionPolicyBinding =
        (SyntheticsTestRestrictionPolicyBinding) o;
    return Objects.equals(this.principal, syntheticsTestRestrictionPolicyBinding.principal)
        && Objects.equals(this.relation, syntheticsTestRestrictionPolicyBinding.relation)
        && Objects.equals(
            this.additionalProperties, syntheticsTestRestrictionPolicyBinding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, relation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRestrictionPolicyBinding {\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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
