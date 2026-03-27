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
   * <p>The definition of <code>AWSAssumeRole</code> object.</p>
 */
@JsonPropertyOrder({
  AWSAssumeRole.JSON_PROPERTY_ACCOUNT_ID,
  AWSAssumeRole.JSON_PROPERTY_EXTERNAL_ID,
  AWSAssumeRole.JSON_PROPERTY_PRINCIPAL_ID,
  AWSAssumeRole.JSON_PROPERTY_ROLE,
  AWSAssumeRole.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAssumeRole {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_PRINCIPAL_ID = "principal_id";
  private String principalId;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AWSAssumeRoleType type;

  public AWSAssumeRole() {}

  @JsonCreator
  public AWSAssumeRole(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCOUNT_ID)String accountId,
            @JsonProperty(required=true, value=JSON_PROPERTY_ROLE)String role,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)AWSAssumeRoleType type) {
        this.accountId = accountId;
        this.role = role;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public AWSAssumeRole accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>AWS account the connection is created for</p>
   * @return accountId
  **/
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * <p>External ID used to scope which connection can be used to assume the role</p>
   * @return externalId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getExternalId() {
        return externalId;
      }

  /**
   * <p>AWS account that will assume the role</p>
   * @return principalId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRINCIPAL_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPrincipalId() {
        return principalId;
      }
  public AWSAssumeRole role(String role) {
    this.role = role;
    return this;
  }

  /**
   * <p>Role to assume</p>
   * @return role
  **/
      @JsonProperty(JSON_PROPERTY_ROLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRole() {
        return role;
      }
  public void setRole(String role) {
    this.role = role;
  }
  public AWSAssumeRole type(AWSAssumeRoleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The definition of <code>AWSAssumeRoleType</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return AWSAssumeRole
   */
  @JsonAnySetter
  public AWSAssumeRole putAdditionalProperty(String key, Object value) {
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
   * Return true if this AWSAssumeRole object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAssumeRole awsAssumeRole = (AWSAssumeRole) o;
    return Objects.equals(this.accountId, awsAssumeRole.accountId) && Objects.equals(this.externalId, awsAssumeRole.externalId) && Objects.equals(this.principalId, awsAssumeRole.principalId) && Objects.equals(this.role, awsAssumeRole.role) && Objects.equals(this.type, awsAssumeRole.type) && Objects.equals(this.additionalProperties, awsAssumeRole.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountId,externalId,principalId,role,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAssumeRole {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
