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

/**
 * Editable attributes of a dataset restriction. Only <code>restriction_mode</code> is required;
 * omitted optional fields retain their current values.
 */
@JsonPropertyOrder({
  DatasetRestrictionUpdateRequestAttributes.JSON_PROPERTY_OWNERSHIP_MODE,
  DatasetRestrictionUpdateRequestAttributes.JSON_PROPERTY_RESTRICTION_MODE,
  DatasetRestrictionUpdateRequestAttributes.JSON_PROPERTY_UNRESTRICTED_PRINCIPALS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatasetRestrictionUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OWNERSHIP_MODE = "ownership_mode";
  private DatasetRestrictionOwnershipMode ownershipMode;

  public static final String JSON_PROPERTY_RESTRICTION_MODE = "restriction_mode";
  private DatasetRestrictionRestrictionMode restrictionMode;

  public static final String JSON_PROPERTY_UNRESTRICTED_PRINCIPALS = "unrestricted_principals";
  private List<String> unrestrictedPrincipals = null;

  public DatasetRestrictionUpdateRequestAttributes() {}

  @JsonCreator
  public DatasetRestrictionUpdateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESTRICTION_MODE)
          DatasetRestrictionRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    this.unparsed |= !restrictionMode.isValid();
  }

  public DatasetRestrictionUpdateRequestAttributes ownershipMode(
      DatasetRestrictionOwnershipMode ownershipMode) {
    this.ownershipMode = ownershipMode;
    this.unparsed |= !ownershipMode.isValid();
    return this;
  }

  /**
   * Controls how dataset ownership is determined. <code>disabled</code> turns off ownership-based
   * access entirely. <code>team_tag_based</code> assigns dataset ownership based on the team tags
   * applied to the data, allowing team members to see their own team's datasets.
   *
   * @return ownershipMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNERSHIP_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatasetRestrictionOwnershipMode getOwnershipMode() {
    return ownershipMode;
  }

  public void setOwnershipMode(DatasetRestrictionOwnershipMode ownershipMode) {
    if (!ownershipMode.isValid()) {
      this.unparsed = true;
    }
    this.ownershipMode = ownershipMode;
  }

  public DatasetRestrictionUpdateRequestAttributes restrictionMode(
      DatasetRestrictionRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    this.unparsed |= !restrictionMode.isValid();
    return this;
  }

  /**
   * Controls the default data visibility for the product type. <code>standard</code> makes data
   * visible to all users with appropriate product access. <code>default_hide</code> hides data by
   * default and requires explicit grants for each dataset.
   *
   * @return restrictionMode
   */
  @JsonProperty(JSON_PROPERTY_RESTRICTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DatasetRestrictionRestrictionMode getRestrictionMode() {
    return restrictionMode;
  }

  public void setRestrictionMode(DatasetRestrictionRestrictionMode restrictionMode) {
    if (!restrictionMode.isValid()) {
      this.unparsed = true;
    }
    this.restrictionMode = restrictionMode;
  }

  public DatasetRestrictionUpdateRequestAttributes unrestrictedPrincipals(
      List<String> unrestrictedPrincipals) {
    this.unrestrictedPrincipals = unrestrictedPrincipals;
    return this;
  }

  public DatasetRestrictionUpdateRequestAttributes addUnrestrictedPrincipalsItem(
      String unrestrictedPrincipalsItem) {
    if (this.unrestrictedPrincipals == null) {
      this.unrestrictedPrincipals = new ArrayList<>();
    }
    this.unrestrictedPrincipals.add(unrestrictedPrincipalsItem);
    return this;
  }

  /**
   * Principal identifiers (users or roles) that are exempt from the restriction and can always
   * access all datasets for this product type.
   *
   * @return unrestrictedPrincipals
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNRESTRICTED_PRINCIPALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUnrestrictedPrincipals() {
    return unrestrictedPrincipals;
  }

  public void setUnrestrictedPrincipals(List<String> unrestrictedPrincipals) {
    this.unrestrictedPrincipals = unrestrictedPrincipals;
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
   * @return DatasetRestrictionUpdateRequestAttributes
   */
  @JsonAnySetter
  public DatasetRestrictionUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DatasetRestrictionUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetRestrictionUpdateRequestAttributes datasetRestrictionUpdateRequestAttributes =
        (DatasetRestrictionUpdateRequestAttributes) o;
    return Objects.equals(
            this.ownershipMode, datasetRestrictionUpdateRequestAttributes.ownershipMode)
        && Objects.equals(
            this.restrictionMode, datasetRestrictionUpdateRequestAttributes.restrictionMode)
        && Objects.equals(
            this.unrestrictedPrincipals,
            datasetRestrictionUpdateRequestAttributes.unrestrictedPrincipals)
        && Objects.equals(
            this.additionalProperties,
            datasetRestrictionUpdateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ownershipMode, restrictionMode, unrestrictedPrincipals, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetRestrictionUpdateRequestAttributes {\n");
    sb.append("    ownershipMode: ").append(toIndentedString(ownershipMode)).append("\n");
    sb.append("    restrictionMode: ").append(toIndentedString(restrictionMode)).append("\n");
    sb.append("    unrestrictedPrincipals: ")
        .append(toIndentedString(unrestrictedPrincipals))
        .append("\n");
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
