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

/** AWS Resources Collection config. */
@JsonPropertyOrder({
  AWSResourcesConfig.JSON_PROPERTY_CLOUD_SECURITY_POSTURE_MANAGEMENT_COLLECTION,
  AWSResourcesConfig.JSON_PROPERTY_EXTENDED_COLLECTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSResourcesConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLOUD_SECURITY_POSTURE_MANAGEMENT_COLLECTION =
      "cloud_security_posture_management_collection";
  private Boolean cloudSecurityPostureManagementCollection;

  public static final String JSON_PROPERTY_EXTENDED_COLLECTION = "extended_collection";
  private Boolean extendedCollection;

  public AWSResourcesConfig cloudSecurityPostureManagementCollection(
      Boolean cloudSecurityPostureManagementCollection) {
    this.cloudSecurityPostureManagementCollection = cloudSecurityPostureManagementCollection;
    return this;
  }

  /**
   * Enable Cloud Security Management to scan AWS resources for vulnerabilities, misconfigurations,
   * identity risks, and compliance violations. Defaults to <code>false</code>. Requires <code>
   * extended_collection</code> to be set to <code>true</code>.
   *
   * @return cloudSecurityPostureManagementCollection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_SECURITY_POSTURE_MANAGEMENT_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCloudSecurityPostureManagementCollection() {
    return cloudSecurityPostureManagementCollection;
  }

  public void setCloudSecurityPostureManagementCollection(
      Boolean cloudSecurityPostureManagementCollection) {
    this.cloudSecurityPostureManagementCollection = cloudSecurityPostureManagementCollection;
  }

  public AWSResourcesConfig extendedCollection(Boolean extendedCollection) {
    this.extendedCollection = extendedCollection;
    return this;
  }

  /**
   * Whether Datadog collects additional attributes and configuration information about the
   * resources in your AWS account. Defaults to <code>true</code>. Required for <code>
   * cloud_security_posture_management_collection</code>.
   *
   * @return extendedCollection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTENDED_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExtendedCollection() {
    return extendedCollection;
  }

  public void setExtendedCollection(Boolean extendedCollection) {
    this.extendedCollection = extendedCollection;
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
   * @return AWSResourcesConfig
   */
  @JsonAnySetter
  public AWSResourcesConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSResourcesConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSResourcesConfig awsResourcesConfig = (AWSResourcesConfig) o;
    return Objects.equals(
            this.cloudSecurityPostureManagementCollection,
            awsResourcesConfig.cloudSecurityPostureManagementCollection)
        && Objects.equals(this.extendedCollection, awsResourcesConfig.extendedCollection)
        && Objects.equals(this.additionalProperties, awsResourcesConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cloudSecurityPostureManagementCollection, extendedCollection, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSResourcesConfig {\n");
    sb.append("    cloudSecurityPostureManagementCollection: ")
        .append(toIndentedString(cloudSecurityPostureManagementCollection))
        .append("\n");
    sb.append("    extendedCollection: ").append(toIndentedString(extendedCollection)).append("\n");
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
