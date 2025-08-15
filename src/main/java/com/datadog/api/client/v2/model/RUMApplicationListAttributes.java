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

/** RUM application list attributes. */
@JsonPropertyOrder({
  RUMApplicationListAttributes.JSON_PROPERTY_APPLICATION_ID,
  RUMApplicationListAttributes.JSON_PROPERTY_CREATED_AT,
  RUMApplicationListAttributes.JSON_PROPERTY_CREATED_BY_HANDLE,
  RUMApplicationListAttributes.JSON_PROPERTY_HASH,
  RUMApplicationListAttributes.JSON_PROPERTY_IS_ACTIVE,
  RUMApplicationListAttributes.JSON_PROPERTY_NAME,
  RUMApplicationListAttributes.JSON_PROPERTY_ORG_ID,
  RUMApplicationListAttributes.JSON_PROPERTY_PRODUCT_SCALES,
  RUMApplicationListAttributes.JSON_PROPERTY_TYPE,
  RUMApplicationListAttributes.JSON_PROPERTY_UPDATED_AT,
  RUMApplicationListAttributes.JSON_PROPERTY_UPDATED_BY_HANDLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMApplicationListAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "created_by_handle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  public static final String JSON_PROPERTY_PRODUCT_SCALES = "product_scales";
  private RUMProductScales productScales;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY_HANDLE = "updated_by_handle";
  private String updatedByHandle;

  public RUMApplicationListAttributes() {}

  @JsonCreator
  public RUMApplicationListAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) Long createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_HANDLE)
          String createdByHandle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Integer orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) Long updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY_HANDLE)
          String updatedByHandle) {
    this.applicationId = applicationId;
    this.createdAt = createdAt;
    this.createdByHandle = createdByHandle;
    this.name = name;
    this.orgId = orgId;
    this.type = type;
    this.updatedAt = updatedAt;
    this.updatedByHandle = updatedByHandle;
  }

  public RUMApplicationListAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * ID of the RUM application.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public RUMApplicationListAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp in ms of the creation date.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public RUMApplicationListAttributes createdByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
    return this;
  }

  /**
   * Handle of the creator user.
   *
   * @return createdByHandle
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedByHandle() {
    return createdByHandle;
  }

  public void setCreatedByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
  }

  public RUMApplicationListAttributes hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Hash of the RUM application. Optional.
   *
   * @return hash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public RUMApplicationListAttributes isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates if the RUM application is active.
   *
   * @return isActive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public RUMApplicationListAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the RUM application.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RUMApplicationListAttributes orgId(Integer orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Org ID of the RUM application. maximum: 2147483647
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public RUMApplicationListAttributes productScales(RUMProductScales productScales) {
    this.productScales = productScales;
    this.unparsed |= productScales.unparsed;
    return this;
  }

  /**
   * Product Scales configuration for the RUM application.
   *
   * @return productScales
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_SCALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMProductScales getProductScales() {
    return productScales;
  }

  public void setProductScales(RUMProductScales productScales) {
    this.productScales = productScales;
  }

  public RUMApplicationListAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the RUM application. Supported values are <code>browser</code>, <code>ios</code>,
   * <code>android</code>, <code>react-native</code>, <code>flutter</code>, <code>roku</code>,
   * <code>electron</code>, <code>unity</code>, <code>kotlin-multiplatform</code>.
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

  public RUMApplicationListAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp in ms of the last update date.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RUMApplicationListAttributes updatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
    return this;
  }

  /**
   * Handle of the updater user.
   *
   * @return updatedByHandle
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedByHandle() {
    return updatedByHandle;
  }

  public void setUpdatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
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
   * @return RUMApplicationListAttributes
   */
  @JsonAnySetter
  public RUMApplicationListAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMApplicationListAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMApplicationListAttributes rumApplicationListAttributes = (RUMApplicationListAttributes) o;
    return Objects.equals(this.applicationId, rumApplicationListAttributes.applicationId)
        && Objects.equals(this.createdAt, rumApplicationListAttributes.createdAt)
        && Objects.equals(this.createdByHandle, rumApplicationListAttributes.createdByHandle)
        && Objects.equals(this.hash, rumApplicationListAttributes.hash)
        && Objects.equals(this.isActive, rumApplicationListAttributes.isActive)
        && Objects.equals(this.name, rumApplicationListAttributes.name)
        && Objects.equals(this.orgId, rumApplicationListAttributes.orgId)
        && Objects.equals(this.productScales, rumApplicationListAttributes.productScales)
        && Objects.equals(this.type, rumApplicationListAttributes.type)
        && Objects.equals(this.updatedAt, rumApplicationListAttributes.updatedAt)
        && Objects.equals(this.updatedByHandle, rumApplicationListAttributes.updatedByHandle)
        && Objects.equals(
            this.additionalProperties, rumApplicationListAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        createdAt,
        createdByHandle,
        hash,
        isActive,
        name,
        orgId,
        productScales,
        type,
        updatedAt,
        updatedByHandle,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMApplicationListAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    productScales: ").append(toIndentedString(productScales)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedByHandle: ").append(toIndentedString(updatedByHandle)).append("\n");
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
