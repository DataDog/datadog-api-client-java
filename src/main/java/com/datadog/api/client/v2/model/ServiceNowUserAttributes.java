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
import java.util.UUID;

/** Attributes of a ServiceNow user */
@JsonPropertyOrder({
  ServiceNowUserAttributes.JSON_PROPERTY_EMAIL,
  ServiceNowUserAttributes.JSON_PROPERTY_FULL_NAME,
  ServiceNowUserAttributes.JSON_PROPERTY_INSTANCE_ID,
  ServiceNowUserAttributes.JSON_PROPERTY_USER_NAME,
  ServiceNowUserAttributes.JSON_PROPERTY_USER_SYS_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceNowUserAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  private String fullName;

  public static final String JSON_PROPERTY_INSTANCE_ID = "instance_id";
  private UUID instanceId;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_USER_SYS_ID = "user_sys_id";
  private String userSysId;

  public ServiceNowUserAttributes() {}

  @JsonCreator
  public ServiceNowUserAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EMAIL) String email,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_ID) UUID instanceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_NAME) String userName,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_SYS_ID) String userSysId) {
    this.email = email;
    this.instanceId = instanceId;
    this.userName = userName;
    this.userSysId = userSysId;
  }

  public ServiceNowUserAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   *
   * @return email
   */
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ServiceNowUserAttributes fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The full name of the user
   *
   * @return fullName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public ServiceNowUserAttributes instanceId(UUID instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The ID of the ServiceNow instance
   *
   * @return instanceId
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }

  public ServiceNowUserAttributes userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The username of the ServiceNow user
   *
   * @return userName
   */
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ServiceNowUserAttributes userSysId(String userSysId) {
    this.userSysId = userSysId;
    return this;
  }

  /**
   * The system ID of the user in ServiceNow
   *
   * @return userSysId
   */
  @JsonProperty(JSON_PROPERTY_USER_SYS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserSysId() {
    return userSysId;
  }

  public void setUserSysId(String userSysId) {
    this.userSysId = userSysId;
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
   * @return ServiceNowUserAttributes
   */
  @JsonAnySetter
  public ServiceNowUserAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceNowUserAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowUserAttributes serviceNowUserAttributes = (ServiceNowUserAttributes) o;
    return Objects.equals(this.email, serviceNowUserAttributes.email)
        && Objects.equals(this.fullName, serviceNowUserAttributes.fullName)
        && Objects.equals(this.instanceId, serviceNowUserAttributes.instanceId)
        && Objects.equals(this.userName, serviceNowUserAttributes.userName)
        && Objects.equals(this.userSysId, serviceNowUserAttributes.userSysId)
        && Objects.equals(this.additionalProperties, serviceNowUserAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fullName, instanceId, userName, userSysId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowUserAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userSysId: ").append(toIndentedString(userSysId)).append("\n");
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
