/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Client token object. Client tokens (also known as public API keys) enable you to submit data from
 * your browser or mobile applications to Datadog.
 */
@JsonPropertyOrder({
  ClientToken.JSON_PROPERTY_CREATED_AT,
  ClientToken.JSON_PROPERTY_CREATED_BY_HANDLE,
  ClientToken.JSON_PROPERTY_CREATED_BY_UUID,
  ClientToken.JSON_PROPERTY_DISABLED_AT,
  ClientToken.JSON_PROPERTY_DISABLED_BY,
  ClientToken.JSON_PROPERTY_DISABLED_BY_HANDLE,
  ClientToken.JSON_PROPERTY_HASH,
  ClientToken.JSON_PROPERTY_MODIFIED_BY,
  ClientToken.JSON_PROPERTY_NAME,
  ClientToken.JSON_PROPERTY_ORG_ID,
  ClientToken.JSON_PROPERTY_ORIGIN_URLS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ClientToken {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "created_by_handle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_CREATED_BY_UUID = "created_by_uuid";
  private UUID createdByUuid;

  public static final String JSON_PROPERTY_DISABLED_AT = "disabled_at";
  private JsonNullable<OffsetDateTime> disabledAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DISABLED_BY = "disabled_by";
  private Long disabledBy;

  public static final String JSON_PROPERTY_DISABLED_BY_HANDLE = "disabled_by_handle";
  private String disabledByHandle;

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private Long modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_ORIGIN_URLS = "origin_urls";
  private List<String> originUrls = new ArrayList<>();

  public ClientToken() {}

  @JsonCreator
  public ClientToken(
      @JsonProperty(required = true, value = JSON_PROPERTY_ORIGIN_URLS) List<String> originUrls) {
    this.originUrls = originUrls;
  }

  /**
   * Creation timestamp of the client token.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Handle of the user who created the client token.
   *
   * @return createdByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedByHandle() {
    return createdByHandle;
  }

  /**
   * UUID of the user who created the client token.
   *
   * @return createdByUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getCreatedByUuid() {
    return createdByUuid;
  }

  /**
   * Timestamp when the client token was disabled.
   *
   * @return disabledAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDisabledAt() {

    if (disabledAt == null) {
      disabledAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return disabledAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISABLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDisabledAt_JsonNullable() {
    return disabledAt;
  }

  @JsonProperty(JSON_PROPERTY_DISABLED_AT)
  private void setDisabledAt_JsonNullable(JsonNullable<OffsetDateTime> disabledAt) {
    this.disabledAt = disabledAt;
  }

  /**
   * ID of the user who disabled the client token.
   *
   * @return disabledBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDisabledBy() {
    return disabledBy;
  }

  /**
   * Handle of the user who disabled the client token.
   *
   * @return disabledByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisabledByHandle() {
    return disabledByHandle;
  }

  /**
   * The hash value of the client token. This is the secret token value that should be used in your
   * browser or mobile application.
   *
   * @return hash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHash() {
    return hash;
  }

  /**
   * ID of the user who last modified the client token.
   *
   * @return modifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getModifiedBy() {
    return modifiedBy;
  }

  public ClientToken name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the client token.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Organization ID associated with the client token.
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrgId() {
    return orgId;
  }

  public ClientToken originUrls(List<String> originUrls) {
    this.originUrls = originUrls;
    return this;
  }

  public ClientToken addOriginUrlsItem(String originUrlsItem) {
    this.originUrls.add(originUrlsItem);
    return this;
  }

  /**
   * List of allowed origin URLs for browser-based applications. Requests from URLs not in this list
   * will be rejected.
   *
   * @return originUrls
   */
  @JsonProperty(JSON_PROPERTY_ORIGIN_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getOriginUrls() {
    return originUrls;
  }

  public void setOriginUrls(List<String> originUrls) {
    this.originUrls = originUrls;
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
   * @return ClientToken
   */
  @JsonAnySetter
  public ClientToken putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ClientToken object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientToken clientToken = (ClientToken) o;
    return Objects.equals(this.createdAt, clientToken.createdAt)
        && Objects.equals(this.createdByHandle, clientToken.createdByHandle)
        && Objects.equals(this.createdByUuid, clientToken.createdByUuid)
        && Objects.equals(this.disabledAt, clientToken.disabledAt)
        && Objects.equals(this.disabledBy, clientToken.disabledBy)
        && Objects.equals(this.disabledByHandle, clientToken.disabledByHandle)
        && Objects.equals(this.hash, clientToken.hash)
        && Objects.equals(this.modifiedBy, clientToken.modifiedBy)
        && Objects.equals(this.name, clientToken.name)
        && Objects.equals(this.orgId, clientToken.orgId)
        && Objects.equals(this.originUrls, clientToken.originUrls)
        && Objects.equals(this.additionalProperties, clientToken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdByHandle,
        createdByUuid,
        disabledAt,
        disabledBy,
        disabledByHandle,
        hash,
        modifiedBy,
        name,
        orgId,
        originUrls,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientToken {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    createdByUuid: ").append(toIndentedString(createdByUuid)).append("\n");
    sb.append("    disabledAt: ").append(toIndentedString(disabledAt)).append("\n");
    sb.append("    disabledBy: ").append(toIndentedString(disabledBy)).append("\n");
    sb.append("    disabledByHandle: ").append(toIndentedString(disabledByHandle)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    originUrls: ").append(toIndentedString(originUrls)).append("\n");
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
