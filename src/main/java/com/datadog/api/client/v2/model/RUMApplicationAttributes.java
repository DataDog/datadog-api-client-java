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
   * <p>RUM application attributes.</p>
 */
@JsonPropertyOrder({
  RUMApplicationAttributes.JSON_PROPERTY_API_KEY_ID,
  RUMApplicationAttributes.JSON_PROPERTY_APPLICATION_ID,
  RUMApplicationAttributes.JSON_PROPERTY_CLIENT_TOKEN,
  RUMApplicationAttributes.JSON_PROPERTY_CREATED_AT,
  RUMApplicationAttributes.JSON_PROPERTY_CREATED_BY_HANDLE,
  RUMApplicationAttributes.JSON_PROPERTY_HASH,
  RUMApplicationAttributes.JSON_PROPERTY_IS_ACTIVE,
  RUMApplicationAttributes.JSON_PROPERTY_NAME,
  RUMApplicationAttributes.JSON_PROPERTY_ORG_ID,
  RUMApplicationAttributes.JSON_PROPERTY_PRODUCT_SCALES,
  RUMApplicationAttributes.JSON_PROPERTY_TYPE,
  RUMApplicationAttributes.JSON_PROPERTY_UPDATED_AT,
  RUMApplicationAttributes.JSON_PROPERTY_UPDATED_BY_HANDLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMApplicationAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY_ID = "api_key_id";
  private Integer apiKeyId;

  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CLIENT_TOKEN = "client_token";
  private String clientToken;

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

  public RUMApplicationAttributes() {}

  @JsonCreator
  public RUMApplicationAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_APPLICATION_ID)String applicationId,
            @JsonProperty(required=true, value=JSON_PROPERTY_CLIENT_TOKEN)String clientToken,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)Long createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY_HANDLE)String createdByHandle,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_ORG_ID)Integer orgId,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)String type,
            @JsonProperty(required=true, value=JSON_PROPERTY_UPDATED_AT)Long updatedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_UPDATED_BY_HANDLE)String updatedByHandle) {
        this.applicationId = applicationId;
        this.clientToken = clientToken;
        this.createdAt = createdAt;
        this.createdByHandle = createdByHandle;
        this.name = name;
        this.orgId = orgId;
        this.type = type;
        this.updatedAt = updatedAt;
        this.updatedByHandle = updatedByHandle;
  }
  public RUMApplicationAttributes apiKeyId(Integer apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  /**
   * <p>ID of the API key associated with the application.</p>
   * maximum: 2147483647
   * @return apiKeyId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_KEY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getApiKeyId() {
        return apiKeyId;
      }
  public void setApiKeyId(Integer apiKeyId) {
    this.apiKeyId = apiKeyId;
  }
  public RUMApplicationAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * <p>ID of the RUM application.</p>
   * @return applicationId
  **/
      @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApplicationId() {
        return applicationId;
      }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }
  public RUMApplicationAttributes clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  /**
   * <p>Client token of the RUM application.</p>
   * @return clientToken
  **/
      @JsonProperty(JSON_PROPERTY_CLIENT_TOKEN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getClientToken() {
        return clientToken;
      }
  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }
  public RUMApplicationAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Timestamp in ms of the creation date.</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  public RUMApplicationAttributes createdByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
    return this;
  }

  /**
   * <p>Handle of the creator user.</p>
   * @return createdByHandle
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCreatedByHandle() {
        return createdByHandle;
      }
  public void setCreatedByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
  }
  public RUMApplicationAttributes hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * <p>Hash of the RUM application. Optional.</p>
   * @return hash
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HASH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHash() {
        return hash;
      }
  public void setHash(String hash) {
    this.hash = hash;
  }
  public RUMApplicationAttributes isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * <p>Indicates if the RUM application is active.</p>
   * @return isActive
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsActive() {
        return isActive;
      }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
  public RUMApplicationAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the RUM application.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public RUMApplicationAttributes orgId(Integer orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>Org ID of the RUM application.</p>
   * maximum: 2147483647
   * @return orgId
  **/
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Integer getOrgId() {
        return orgId;
      }
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }
  public RUMApplicationAttributes productScales(RUMProductScales productScales) {
    this.productScales = productScales;
    this.unparsed |= productScales.unparsed;
    return this;
  }

  /**
   * <p>Product Scales configuration for the RUM application.</p>
   * @return productScales
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT_SCALES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public RUMProductScales getProductScales() {
        return productScales;
      }
  public void setProductScales(RUMProductScales productScales) {
    this.productScales = productScales;
  }
  public RUMApplicationAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Type of the RUM application. Supported values are <code>browser</code>, <code>ios</code>, <code>android</code>, <code>react-native</code>, <code>flutter</code>, <code>roku</code>, <code>electron</code>, <code>unity</code>, <code>kotlin-multiplatform</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }
  public RUMApplicationAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Timestamp in ms of the last update date.</p>
   * @return updatedAt
  **/
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }
  public RUMApplicationAttributes updatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
    return this;
  }

  /**
   * <p>Handle of the updater user.</p>
   * @return updatedByHandle
  **/
      @JsonProperty(JSON_PROPERTY_UPDATED_BY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUpdatedByHandle() {
        return updatedByHandle;
      }
  public void setUpdatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
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
   * @return RUMApplicationAttributes
   */
  @JsonAnySetter
  public RUMApplicationAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RUMApplicationAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMApplicationAttributes rumApplicationAttributes = (RUMApplicationAttributes) o;
    return Objects.equals(this.apiKeyId, rumApplicationAttributes.apiKeyId) && Objects.equals(this.applicationId, rumApplicationAttributes.applicationId) && Objects.equals(this.clientToken, rumApplicationAttributes.clientToken) && Objects.equals(this.createdAt, rumApplicationAttributes.createdAt) && Objects.equals(this.createdByHandle, rumApplicationAttributes.createdByHandle) && Objects.equals(this.hash, rumApplicationAttributes.hash) && Objects.equals(this.isActive, rumApplicationAttributes.isActive) && Objects.equals(this.name, rumApplicationAttributes.name) && Objects.equals(this.orgId, rumApplicationAttributes.orgId) && Objects.equals(this.productScales, rumApplicationAttributes.productScales) && Objects.equals(this.type, rumApplicationAttributes.type) && Objects.equals(this.updatedAt, rumApplicationAttributes.updatedAt) && Objects.equals(this.updatedByHandle, rumApplicationAttributes.updatedByHandle) && Objects.equals(this.additionalProperties, rumApplicationAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiKeyId,applicationId,clientToken,createdAt,createdByHandle,hash,isActive,name,orgId,productScales,type,updatedAt,updatedByHandle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMApplicationAttributes {\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
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
