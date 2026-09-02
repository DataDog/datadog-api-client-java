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
   * <p>Metadata object containing the publication creation information.</p>
 */
@JsonPropertyOrder({
  DeploymentMetadata.JSON_PROPERTY_CREATED_AT,
  DeploymentMetadata.JSON_PROPERTY_USER_ID,
  DeploymentMetadata.JSON_PROPERTY_USER_NAME,
  DeploymentMetadata.JSON_PROPERTY_USER_UUID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Long userId;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private UUID userUuid;

  public DeploymentMetadata createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Timestamp of when the app was published.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public DeploymentMetadata userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>The ID of the user who published the app.</p>
   * @return userId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUserId() {
        return userId;
      }
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public DeploymentMetadata userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * <p>The name (or email address) of the user who published the app.</p>
   * @return userName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUserName() {
        return userName;
      }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public DeploymentMetadata userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * <p>The UUID of the user who published the app.</p>
   * @return userUuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UUID getUserUuid() {
        return userUuid;
      }
  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
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
   * @return DeploymentMetadata
   */
  @JsonAnySetter
  public DeploymentMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this DeploymentMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentMetadata deploymentMetadata = (DeploymentMetadata) o;
    return Objects.equals(this.createdAt, deploymentMetadata.createdAt) && Objects.equals(this.userId, deploymentMetadata.userId) && Objects.equals(this.userName, deploymentMetadata.userName) && Objects.equals(this.userUuid, deploymentMetadata.userUuid) && Objects.equals(this.additionalProperties, deploymentMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,userId,userName,userUuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentMetadata {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
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
