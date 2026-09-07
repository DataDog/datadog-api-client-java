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
   * <p>Configuration risks associated with the entity</p>
 */
@JsonPropertyOrder({
  SecurityEntityConfigRisks.JSON_PROPERTY_HAS_IDENTITY_RISK,
  SecurityEntityConfigRisks.JSON_PROPERTY_HAS_MISCONFIGURATION,
  SecurityEntityConfigRisks.JSON_PROPERTY_HAS_PRIVILEGED_ROLE,
  SecurityEntityConfigRisks.JSON_PROPERTY_IS_PRIVILEGED,
  SecurityEntityConfigRisks.JSON_PROPERTY_IS_PRODUCTION,
  SecurityEntityConfigRisks.JSON_PROPERTY_IS_PUBLICLY_ACCESSIBLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityEntityConfigRisks {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_IDENTITY_RISK = "hasIdentityRisk";
  private Boolean hasIdentityRisk;

  public static final String JSON_PROPERTY_HAS_MISCONFIGURATION = "hasMisconfiguration";
  private Boolean hasMisconfiguration;

  public static final String JSON_PROPERTY_HAS_PRIVILEGED_ROLE = "hasPrivilegedRole";
  private Boolean hasPrivilegedRole;

  public static final String JSON_PROPERTY_IS_PRIVILEGED = "isPrivileged";
  private Boolean isPrivileged;

  public static final String JSON_PROPERTY_IS_PRODUCTION = "isProduction";
  private Boolean isProduction;

  public static final String JSON_PROPERTY_IS_PUBLICLY_ACCESSIBLE = "isPubliclyAccessible";
  private Boolean isPubliclyAccessible;

  public SecurityEntityConfigRisks() {}

  @JsonCreator
  public SecurityEntityConfigRisks(
            @JsonProperty(required=true, value=JSON_PROPERTY_HAS_IDENTITY_RISK)Boolean hasIdentityRisk,
            @JsonProperty(required=true, value=JSON_PROPERTY_HAS_MISCONFIGURATION)Boolean hasMisconfiguration,
            @JsonProperty(required=true, value=JSON_PROPERTY_HAS_PRIVILEGED_ROLE)Boolean hasPrivilegedRole,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_PRIVILEGED)Boolean isPrivileged,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_PRODUCTION)Boolean isProduction,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_PUBLICLY_ACCESSIBLE)Boolean isPubliclyAccessible) {
        this.hasIdentityRisk = hasIdentityRisk;
        this.hasMisconfiguration = hasMisconfiguration;
        this.hasPrivilegedRole = hasPrivilegedRole;
        this.isPrivileged = isPrivileged;
        this.isProduction = isProduction;
        this.isPubliclyAccessible = isPubliclyAccessible;
  }
  public SecurityEntityConfigRisks hasIdentityRisk(Boolean hasIdentityRisk) {
    this.hasIdentityRisk = hasIdentityRisk;
    return this;
  }

  /**
   * <p>Whether the entity has identity risks</p>
   * @return hasIdentityRisk
  **/
      @JsonProperty(JSON_PROPERTY_HAS_IDENTITY_RISK)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getHasIdentityRisk() {
        return hasIdentityRisk;
      }
  public void setHasIdentityRisk(Boolean hasIdentityRisk) {
    this.hasIdentityRisk = hasIdentityRisk;
  }
  public SecurityEntityConfigRisks hasMisconfiguration(Boolean hasMisconfiguration) {
    this.hasMisconfiguration = hasMisconfiguration;
    return this;
  }

  /**
   * <p>Whether the entity has misconfigurations</p>
   * @return hasMisconfiguration
  **/
      @JsonProperty(JSON_PROPERTY_HAS_MISCONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getHasMisconfiguration() {
        return hasMisconfiguration;
      }
  public void setHasMisconfiguration(Boolean hasMisconfiguration) {
    this.hasMisconfiguration = hasMisconfiguration;
  }
  public SecurityEntityConfigRisks hasPrivilegedRole(Boolean hasPrivilegedRole) {
    this.hasPrivilegedRole = hasPrivilegedRole;
    return this;
  }

  /**
   * <p>Whether the entity has privileged roles</p>
   * @return hasPrivilegedRole
  **/
      @JsonProperty(JSON_PROPERTY_HAS_PRIVILEGED_ROLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getHasPrivilegedRole() {
        return hasPrivilegedRole;
      }
  public void setHasPrivilegedRole(Boolean hasPrivilegedRole) {
    this.hasPrivilegedRole = hasPrivilegedRole;
  }
  public SecurityEntityConfigRisks isPrivileged(Boolean isPrivileged) {
    this.isPrivileged = isPrivileged;
    return this;
  }

  /**
   * <p>Whether the entity has privileged access</p>
   * @return isPrivileged
  **/
      @JsonProperty(JSON_PROPERTY_IS_PRIVILEGED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsPrivileged() {
        return isPrivileged;
      }
  public void setIsPrivileged(Boolean isPrivileged) {
    this.isPrivileged = isPrivileged;
  }
  public SecurityEntityConfigRisks isProduction(Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

  /**
   * <p>Whether the entity is in a production environment</p>
   * @return isProduction
  **/
      @JsonProperty(JSON_PROPERTY_IS_PRODUCTION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsProduction() {
        return isProduction;
      }
  public void setIsProduction(Boolean isProduction) {
    this.isProduction = isProduction;
  }
  public SecurityEntityConfigRisks isPubliclyAccessible(Boolean isPubliclyAccessible) {
    this.isPubliclyAccessible = isPubliclyAccessible;
    return this;
  }

  /**
   * <p>Whether the entity is publicly accessible</p>
   * @return isPubliclyAccessible
  **/
      @JsonProperty(JSON_PROPERTY_IS_PUBLICLY_ACCESSIBLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsPubliclyAccessible() {
        return isPubliclyAccessible;
      }
  public void setIsPubliclyAccessible(Boolean isPubliclyAccessible) {
    this.isPubliclyAccessible = isPubliclyAccessible;
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
   * @return SecurityEntityConfigRisks
   */
  @JsonAnySetter
  public SecurityEntityConfigRisks putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityEntityConfigRisks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityEntityConfigRisks securityEntityConfigRisks = (SecurityEntityConfigRisks) o;
    return Objects.equals(this.hasIdentityRisk, securityEntityConfigRisks.hasIdentityRisk) && Objects.equals(this.hasMisconfiguration, securityEntityConfigRisks.hasMisconfiguration) && Objects.equals(this.hasPrivilegedRole, securityEntityConfigRisks.hasPrivilegedRole) && Objects.equals(this.isPrivileged, securityEntityConfigRisks.isPrivileged) && Objects.equals(this.isProduction, securityEntityConfigRisks.isProduction) && Objects.equals(this.isPubliclyAccessible, securityEntityConfigRisks.isPubliclyAccessible) && Objects.equals(this.additionalProperties, securityEntityConfigRisks.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hasIdentityRisk,hasMisconfiguration,hasPrivilegedRole,isPrivileged,isProduction,isPubliclyAccessible, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityEntityConfigRisks {\n");
    sb.append("    hasIdentityRisk: ").append(toIndentedString(hasIdentityRisk)).append("\n");
    sb.append("    hasMisconfiguration: ").append(toIndentedString(hasMisconfiguration)).append("\n");
    sb.append("    hasPrivilegedRole: ").append(toIndentedString(hasPrivilegedRole)).append("\n");
    sb.append("    isPrivileged: ").append(toIndentedString(isPrivileged)).append("\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    isPubliclyAccessible: ").append(toIndentedString(isPubliclyAccessible)).append("\n");
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
