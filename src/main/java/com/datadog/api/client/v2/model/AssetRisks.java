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

/** Asset risks. */
@JsonPropertyOrder({
  AssetRisks.JSON_PROPERTY_HAS_ACCESS_TO_SENSITIVE_DATA,
  AssetRisks.JSON_PROPERTY_HAS_PRIVILEGED_ACCESS,
  AssetRisks.JSON_PROPERTY_IN_PRODUCTION,
  AssetRisks.JSON_PROPERTY_IS_PUBLICLY_ACCESSIBLE,
  AssetRisks.JSON_PROPERTY_UNDER_ATTACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AssetRisks {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_ACCESS_TO_SENSITIVE_DATA =
      "has_access_to_sensitive_data";
  private Boolean hasAccessToSensitiveData;

  public static final String JSON_PROPERTY_HAS_PRIVILEGED_ACCESS = "has_privileged_access";
  private Boolean hasPrivilegedAccess;

  public static final String JSON_PROPERTY_IN_PRODUCTION = "in_production";
  private Boolean inProduction;

  public static final String JSON_PROPERTY_IS_PUBLICLY_ACCESSIBLE = "is_publicly_accessible";
  private Boolean isPubliclyAccessible;

  public static final String JSON_PROPERTY_UNDER_ATTACK = "under_attack";
  private Boolean underAttack;

  public AssetRisks() {}

  @JsonCreator
  public AssetRisks(
      @JsonProperty(required = true, value = JSON_PROPERTY_IN_PRODUCTION) Boolean inProduction) {
    this.inProduction = inProduction;
  }

  public AssetRisks hasAccessToSensitiveData(Boolean hasAccessToSensitiveData) {
    this.hasAccessToSensitiveData = hasAccessToSensitiveData;
    return this;
  }

  /**
   * Whether the asset has access to sensitive data or not.
   *
   * @return hasAccessToSensitiveData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ACCESS_TO_SENSITIVE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasAccessToSensitiveData() {
    return hasAccessToSensitiveData;
  }

  public void setHasAccessToSensitiveData(Boolean hasAccessToSensitiveData) {
    this.hasAccessToSensitiveData = hasAccessToSensitiveData;
  }

  public AssetRisks hasPrivilegedAccess(Boolean hasPrivilegedAccess) {
    this.hasPrivilegedAccess = hasPrivilegedAccess;
    return this;
  }

  /**
   * Whether the asset has privileged access or not.
   *
   * @return hasPrivilegedAccess
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PRIVILEGED_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasPrivilegedAccess() {
    return hasPrivilegedAccess;
  }

  public void setHasPrivilegedAccess(Boolean hasPrivilegedAccess) {
    this.hasPrivilegedAccess = hasPrivilegedAccess;
  }

  public AssetRisks inProduction(Boolean inProduction) {
    this.inProduction = inProduction;
    return this;
  }

  /**
   * Whether the asset is in production or not.
   *
   * @return inProduction
   */
  @JsonProperty(JSON_PROPERTY_IN_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getInProduction() {
    return inProduction;
  }

  public void setInProduction(Boolean inProduction) {
    this.inProduction = inProduction;
  }

  public AssetRisks isPubliclyAccessible(Boolean isPubliclyAccessible) {
    this.isPubliclyAccessible = isPubliclyAccessible;
    return this;
  }

  /**
   * Whether the asset is publicly accessible or not.
   *
   * @return isPubliclyAccessible
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PUBLICLY_ACCESSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPubliclyAccessible() {
    return isPubliclyAccessible;
  }

  public void setIsPubliclyAccessible(Boolean isPubliclyAccessible) {
    this.isPubliclyAccessible = isPubliclyAccessible;
  }

  public AssetRisks underAttack(Boolean underAttack) {
    this.underAttack = underAttack;
    return this;
  }

  /**
   * Whether the asset is under attack or not.
   *
   * @return underAttack
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNDER_ATTACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUnderAttack() {
    return underAttack;
  }

  public void setUnderAttack(Boolean underAttack) {
    this.underAttack = underAttack;
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
   * @return AssetRisks
   */
  @JsonAnySetter
  public AssetRisks putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AssetRisks object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetRisks assetRisks = (AssetRisks) o;
    return Objects.equals(this.hasAccessToSensitiveData, assetRisks.hasAccessToSensitiveData)
        && Objects.equals(this.hasPrivilegedAccess, assetRisks.hasPrivilegedAccess)
        && Objects.equals(this.inProduction, assetRisks.inProduction)
        && Objects.equals(this.isPubliclyAccessible, assetRisks.isPubliclyAccessible)
        && Objects.equals(this.underAttack, assetRisks.underAttack)
        && Objects.equals(this.additionalProperties, assetRisks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hasAccessToSensitiveData,
        hasPrivilegedAccess,
        inProduction,
        isPubliclyAccessible,
        underAttack,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetRisks {\n");
    sb.append("    hasAccessToSensitiveData: ")
        .append(toIndentedString(hasAccessToSensitiveData))
        .append("\n");
    sb.append("    hasPrivilegedAccess: ")
        .append(toIndentedString(hasPrivilegedAccess))
        .append("\n");
    sb.append("    inProduction: ").append(toIndentedString(inProduction)).append("\n");
    sb.append("    isPubliclyAccessible: ")
        .append(toIndentedString(isPubliclyAccessible))
        .append("\n");
    sb.append("    underAttack: ").append(toIndentedString(underAttack)).append("\n");
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
