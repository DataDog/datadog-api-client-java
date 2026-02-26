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

/** The definition of <code>AWSAssumeRoleUpdate</code> object. */
@JsonPropertyOrder({
  AWSAssumeRoleUpdate.JSON_PROPERTY_ACCOUNT_ID,
  AWSAssumeRoleUpdate.JSON_PROPERTY_GENERATE_NEW_EXTERNAL_ID,
  AWSAssumeRoleUpdate.JSON_PROPERTY_ROLE,
  AWSAssumeRoleUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAssumeRoleUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_GENERATE_NEW_EXTERNAL_ID = "generate_new_external_id";
  private Boolean generateNewExternalId;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AWSAssumeRoleType type;

  public AWSAssumeRoleUpdate() {}

  @JsonCreator
  public AWSAssumeRoleUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AWSAssumeRoleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AWSAssumeRoleUpdate accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * AWS account the connection is created for
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSAssumeRoleUpdate generateNewExternalId(Boolean generateNewExternalId) {
    this.generateNewExternalId = generateNewExternalId;
    return this;
  }

  /**
   * The <code>AWSAssumeRoleUpdate</code> <code>generate_new_external_id</code>.
   *
   * @return generateNewExternalId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENERATE_NEW_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getGenerateNewExternalId() {
    return generateNewExternalId;
  }

  public void setGenerateNewExternalId(Boolean generateNewExternalId) {
    this.generateNewExternalId = generateNewExternalId;
  }

  public AWSAssumeRoleUpdate role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role to assume
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public AWSAssumeRoleUpdate type(AWSAssumeRoleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of <code>AWSAssumeRoleType</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AWSAssumeRoleType getType() {
    return type;
  }

  public void setType(AWSAssumeRoleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return AWSAssumeRoleUpdate
   */
  @JsonAnySetter
  public AWSAssumeRoleUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSAssumeRoleUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAssumeRoleUpdate awsAssumeRoleUpdate = (AWSAssumeRoleUpdate) o;
    return Objects.equals(this.accountId, awsAssumeRoleUpdate.accountId)
        && Objects.equals(this.generateNewExternalId, awsAssumeRoleUpdate.generateNewExternalId)
        && Objects.equals(this.role, awsAssumeRoleUpdate.role)
        && Objects.equals(this.type, awsAssumeRoleUpdate.type)
        && Objects.equals(this.additionalProperties, awsAssumeRoleUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, generateNewExternalId, role, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAssumeRoleUpdate {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    generateNewExternalId: ")
        .append(toIndentedString(generateNewExternalId))
        .append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
