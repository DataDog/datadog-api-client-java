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

/** Attributes of an agentless host. */
@JsonPropertyOrder({
  CsmAgentlessHostAttributes.JSON_PROPERTY_ACCOUNT_ID,
  CsmAgentlessHostAttributes.JSON_PROPERTY_CLOUD_PROVIDER,
  CsmAgentlessHostAttributes.JSON_PROPERTY_HAS_POSTURE_MANAGEMENT,
  CsmAgentlessHostAttributes.JSON_PROPERTY_HAS_VULNERABILITY_SCANNING,
  CsmAgentlessHostAttributes.JSON_PROPERTY_RESOURCE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmAgentlessHostAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private CsmCloudProvider cloudProvider;

  public static final String JSON_PROPERTY_HAS_POSTURE_MANAGEMENT = "has_posture_management";
  private Boolean hasPostureManagement;

  public static final String JSON_PROPERTY_HAS_VULNERABILITY_SCANNING =
      "has_vulnerability_scanning";
  private Boolean hasVulnerabilityScanning;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private CsmAgentlessHostResourceType resourceType;

  public CsmAgentlessHostAttributes() {}

  @JsonCreator
  public CsmAgentlessHostAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLOUD_PROVIDER)
          CsmCloudProvider cloudProvider,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_POSTURE_MANAGEMENT)
          Boolean hasPostureManagement,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_VULNERABILITY_SCANNING)
          Boolean hasVulnerabilityScanning,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE)
          CsmAgentlessHostResourceType resourceType) {
    this.accountId = accountId;
    this.cloudProvider = cloudProvider;
    this.unparsed |= !cloudProvider.isValid();
    this.hasPostureManagement = hasPostureManagement;
    this.hasVulnerabilityScanning = hasVulnerabilityScanning;
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
  }

  public CsmAgentlessHostAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The ID of the cloud account that the host belongs to.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CsmAgentlessHostAttributes cloudProvider(CsmCloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    this.unparsed |= !cloudProvider.isValid();
    return this;
  }

  /**
   * The cloud provider of a host resource.
   *
   * @return cloudProvider
   */
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CsmCloudProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CsmCloudProvider cloudProvider) {
    if (!cloudProvider.isValid()) {
      this.unparsed = true;
    }
    this.cloudProvider = cloudProvider;
  }

  public CsmAgentlessHostAttributes hasPostureManagement(Boolean hasPostureManagement) {
    this.hasPostureManagement = hasPostureManagement;
    return this;
  }

  /**
   * Whether CSM Misconfigurations is enabled for this host. <code>true</code> if enabled; <code>
   * false</code> if disabled.
   *
   * @return hasPostureManagement
   */
  @JsonProperty(JSON_PROPERTY_HAS_POSTURE_MANAGEMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasPostureManagement() {
    return hasPostureManagement;
  }

  public void setHasPostureManagement(Boolean hasPostureManagement) {
    this.hasPostureManagement = hasPostureManagement;
  }

  public CsmAgentlessHostAttributes hasVulnerabilityScanning(Boolean hasVulnerabilityScanning) {
    this.hasVulnerabilityScanning = hasVulnerabilityScanning;
    return this;
  }

  /**
   * Whether CSM Vulnerabilities is enabled for this host. <code>true</code> if enabled; <code>false
   * </code> if disabled.
   *
   * @return hasVulnerabilityScanning
   */
  @JsonProperty(JSON_PROPERTY_HAS_VULNERABILITY_SCANNING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasVulnerabilityScanning() {
    return hasVulnerabilityScanning;
  }

  public void setHasVulnerabilityScanning(Boolean hasVulnerabilityScanning) {
    this.hasVulnerabilityScanning = hasVulnerabilityScanning;
  }

  public CsmAgentlessHostAttributes resourceType(CsmAgentlessHostResourceType resourceType) {
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    return this;
  }

  /**
   * The type of cloud resource for an agentless host.
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CsmAgentlessHostResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(CsmAgentlessHostResourceType resourceType) {
    if (!resourceType.isValid()) {
      this.unparsed = true;
    }
    this.resourceType = resourceType;
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
   * @return CsmAgentlessHostAttributes
   */
  @JsonAnySetter
  public CsmAgentlessHostAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CsmAgentlessHostAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmAgentlessHostAttributes csmAgentlessHostAttributes = (CsmAgentlessHostAttributes) o;
    return Objects.equals(this.accountId, csmAgentlessHostAttributes.accountId)
        && Objects.equals(this.cloudProvider, csmAgentlessHostAttributes.cloudProvider)
        && Objects.equals(
            this.hasPostureManagement, csmAgentlessHostAttributes.hasPostureManagement)
        && Objects.equals(
            this.hasVulnerabilityScanning, csmAgentlessHostAttributes.hasVulnerabilityScanning)
        && Objects.equals(this.resourceType, csmAgentlessHostAttributes.resourceType)
        && Objects.equals(
            this.additionalProperties, csmAgentlessHostAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        cloudProvider,
        hasPostureManagement,
        hasVulnerabilityScanning,
        resourceType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmAgentlessHostAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    hasPostureManagement: ")
        .append(toIndentedString(hasPostureManagement))
        .append("\n");
    sb.append("    hasVulnerabilityScanning: ")
        .append(toIndentedString(hasVulnerabilityScanning))
        .append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
