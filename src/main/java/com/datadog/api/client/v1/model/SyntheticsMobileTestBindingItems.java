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

/** Object describing the binding used for a mobile test. */
@JsonPropertyOrder({
  SyntheticsMobileTestBindingItems.JSON_PROPERTY_PRINCIPALS,
  SyntheticsMobileTestBindingItems.JSON_PROPERTY_ROLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileTestBindingItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRINCIPALS = "principals";
  private List<String> principals = null;

  public static final String JSON_PROPERTY_ROLE = "role";
  private SyntheticsMobileTestBindingItemsRole role;

  public SyntheticsMobileTestBindingItems principals(List<String> principals) {
    this.principals = principals;
    return this;
  }

  public SyntheticsMobileTestBindingItems addPrincipalsItem(String principalsItem) {
    if (this.principals == null) {
      this.principals = new ArrayList<>();
    }
    this.principals.add(principalsItem);
    return this;
  }

  /**
   * List of principals for a mobile test binding.
   *
   * @return principals
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINCIPALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPrincipals() {
    return principals;
  }

  public void setPrincipals(List<String> principals) {
    this.principals = principals;
  }

  public SyntheticsMobileTestBindingItems role(SyntheticsMobileTestBindingItemsRole role) {
    this.role = role;
    this.unparsed |= !role.isValid();
    return this;
  }

  /**
   * The definition of <code>SyntheticsMobileTestBindingItemsRole</code> object.
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsMobileTestBindingItemsRole getRole() {
    return role;
  }

  public void setRole(SyntheticsMobileTestBindingItemsRole role) {
    if (!role.isValid()) {
      this.unparsed = true;
    }
    this.role = role;
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
   * @return SyntheticsMobileTestBindingItems
   */
  @JsonAnySetter
  public SyntheticsMobileTestBindingItems putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsMobileTestBindingItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileTestBindingItems syntheticsMobileTestBindingItems =
        (SyntheticsMobileTestBindingItems) o;
    return Objects.equals(this.principals, syntheticsMobileTestBindingItems.principals)
        && Objects.equals(this.role, syntheticsMobileTestBindingItems.role)
        && Objects.equals(
            this.additionalProperties, syntheticsMobileTestBindingItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principals, role, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileTestBindingItems {\n");
    sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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