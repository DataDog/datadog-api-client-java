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
import java.util.UUID;

/** The definition of <code>AppMeta</code> object. */
@JsonPropertyOrder({
  AppMeta.JSON_PROPERTY_CREATED_AT,
  AppMeta.JSON_PROPERTY_DELETED_AT,
  AppMeta.JSON_PROPERTY_ORG_ID,
  AppMeta.JSON_PROPERTY_RUN_AS_USER,
  AppMeta.JSON_PROPERTY_UPDATED_AT,
  AppMeta.JSON_PROPERTY_UPDATED_SINCE_DEPLOYMENT,
  AppMeta.JSON_PROPERTY_USER_ID,
  AppMeta.JSON_PROPERTY_USER_NAME,
  AppMeta.JSON_PROPERTY_USER_UUID,
  AppMeta.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AppMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private String deletedAt;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_RUN_AS_USER = "run_as_user";
  private String runAsUser;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_UPDATED_SINCE_DEPLOYMENT = "updated_since_deployment";
  private Boolean updatedSinceDeployment;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Long userId;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private UUID userUuid;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AppMeta createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>created_at</code>.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AppMeta deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>deleted_at</code>.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  public AppMeta orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>org_id</code>.
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public AppMeta runAsUser(String runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>run_as_user</code>.
   *
   * @return runAsUser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUN_AS_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(String runAsUser) {
    this.runAsUser = runAsUser;
  }

  public AppMeta updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>updated_at</code>.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AppMeta updatedSinceDeployment(Boolean updatedSinceDeployment) {
    this.updatedSinceDeployment = updatedSinceDeployment;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>updated_since_deployment</code>.
   *
   * @return updatedSinceDeployment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_SINCE_DEPLOYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUpdatedSinceDeployment() {
    return updatedSinceDeployment;
  }

  public void setUpdatedSinceDeployment(Boolean updatedSinceDeployment) {
    this.updatedSinceDeployment = updatedSinceDeployment;
  }

  public AppMeta userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>user_id</code>.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AppMeta userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>user_name</code>.
   *
   * @return userName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AppMeta userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>user_uuid</code>.
   *
   * @return userUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
  }

  public AppMeta version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The <code>AppMeta</code> <code>version</code>.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return AppMeta
   */
  @JsonAnySetter
  public AppMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AppMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppMeta appMeta = (AppMeta) o;
    return Objects.equals(this.createdAt, appMeta.createdAt)
        && Objects.equals(this.deletedAt, appMeta.deletedAt)
        && Objects.equals(this.orgId, appMeta.orgId)
        && Objects.equals(this.runAsUser, appMeta.runAsUser)
        && Objects.equals(this.updatedAt, appMeta.updatedAt)
        && Objects.equals(this.updatedSinceDeployment, appMeta.updatedSinceDeployment)
        && Objects.equals(this.userId, appMeta.userId)
        && Objects.equals(this.userName, appMeta.userName)
        && Objects.equals(this.userUuid, appMeta.userUuid)
        && Objects.equals(this.version, appMeta.version)
        && Objects.equals(this.additionalProperties, appMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        deletedAt,
        orgId,
        runAsUser,
        updatedAt,
        updatedSinceDeployment,
        userId,
        userName,
        userUuid,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppMeta {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedSinceDeployment: ")
        .append(toIndentedString(updatedSinceDeployment))
        .append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
