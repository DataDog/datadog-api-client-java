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
   * <p>How to generate compliance signals. Useful for cloud_configuration rules only.</p>
 */
@JsonPropertyOrder({
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_DEFAULT_ACTIVATION_STATUS,
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_DEFAULT_GROUP_BY_FIELDS,
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_USER_ACTIVATION_STATUS,
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_USER_GROUP_BY_FIELDS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRuleComplianceSignalOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_ACTIVATION_STATUS = "defaultActivationStatus";
  private JsonNullable<Boolean> defaultActivationStatus = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DEFAULT_GROUP_BY_FIELDS = "defaultGroupByFields";
  private JsonNullable<List<String>> defaultGroupByFields = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_USER_ACTIVATION_STATUS = "userActivationStatus";
  private JsonNullable<Boolean> userActivationStatus = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_USER_GROUP_BY_FIELDS = "userGroupByFields";
  private JsonNullable<List<String>> userGroupByFields = JsonNullable.<List<String>>undefined();

  public CloudConfigurationRuleComplianceSignalOptions defaultActivationStatus(Boolean defaultActivationStatus) {
    this.defaultActivationStatus = JsonNullable.<Boolean>of(defaultActivationStatus);
    return this;
  }

  /**
   * <p>The default activation status.</p>
   * @return defaultActivationStatus
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Boolean getDefaultActivationStatus() {
        return defaultActivationStatus.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DEFAULT_ACTIVATION_STATUS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDefaultActivationStatus_JsonNullable() {
    return defaultActivationStatus;
  }
  @JsonProperty(JSON_PROPERTY_DEFAULT_ACTIVATION_STATUS)public void setDefaultActivationStatus_JsonNullable(JsonNullable<Boolean> defaultActivationStatus) {
    this.defaultActivationStatus = defaultActivationStatus;
  }
  public void setDefaultActivationStatus(Boolean defaultActivationStatus) {
    this.defaultActivationStatus = JsonNullable.<Boolean>of(defaultActivationStatus);
  }
  public CloudConfigurationRuleComplianceSignalOptions defaultGroupByFields(List<String> defaultGroupByFields) {
    this.defaultGroupByFields = JsonNullable.<List<String>>of(defaultGroupByFields);
    return this;
  }
  public CloudConfigurationRuleComplianceSignalOptions addDefaultGroupByFieldsItem(String defaultGroupByFieldsItem) {
    if (this.defaultGroupByFields == null || !this.defaultGroupByFields.isPresent()) {
      this.defaultGroupByFields = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.defaultGroupByFields.get().add(defaultGroupByFieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>The default group by fields.</p>
   * @return defaultGroupByFields
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getDefaultGroupByFields() {
        return defaultGroupByFields.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DEFAULT_GROUP_BY_FIELDS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getDefaultGroupByFields_JsonNullable() {
    return defaultGroupByFields;
  }
  @JsonProperty(JSON_PROPERTY_DEFAULT_GROUP_BY_FIELDS)public void setDefaultGroupByFields_JsonNullable(JsonNullable<List<String>> defaultGroupByFields) {
    this.defaultGroupByFields = defaultGroupByFields;
  }
  public void setDefaultGroupByFields(List<String> defaultGroupByFields) {
    this.defaultGroupByFields = JsonNullable.<List<String>>of(defaultGroupByFields);
  }
  public CloudConfigurationRuleComplianceSignalOptions userActivationStatus(Boolean userActivationStatus) {
    this.userActivationStatus = JsonNullable.<Boolean>of(userActivationStatus);
    return this;
  }

  /**
   * <p>Whether signals will be sent.</p>
   * @return userActivationStatus
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Boolean getUserActivationStatus() {
        return userActivationStatus.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_USER_ACTIVATION_STATUS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getUserActivationStatus_JsonNullable() {
    return userActivationStatus;
  }
  @JsonProperty(JSON_PROPERTY_USER_ACTIVATION_STATUS)public void setUserActivationStatus_JsonNullable(JsonNullable<Boolean> userActivationStatus) {
    this.userActivationStatus = userActivationStatus;
  }
  public void setUserActivationStatus(Boolean userActivationStatus) {
    this.userActivationStatus = JsonNullable.<Boolean>of(userActivationStatus);
  }
  public CloudConfigurationRuleComplianceSignalOptions userGroupByFields(List<String> userGroupByFields) {
    this.userGroupByFields = JsonNullable.<List<String>>of(userGroupByFields);
    return this;
  }
  public CloudConfigurationRuleComplianceSignalOptions addUserGroupByFieldsItem(String userGroupByFieldsItem) {
    if (this.userGroupByFields == null || !this.userGroupByFields.isPresent()) {
      this.userGroupByFields = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.userGroupByFields.get().add(userGroupByFieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>Fields to use to group findings by when sending signals.</p>
   * @return userGroupByFields
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getUserGroupByFields() {
        return userGroupByFields.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_USER_GROUP_BY_FIELDS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getUserGroupByFields_JsonNullable() {
    return userGroupByFields;
  }
  @JsonProperty(JSON_PROPERTY_USER_GROUP_BY_FIELDS)public void setUserGroupByFields_JsonNullable(JsonNullable<List<String>> userGroupByFields) {
    this.userGroupByFields = userGroupByFields;
  }
  public void setUserGroupByFields(List<String> userGroupByFields) {
    this.userGroupByFields = JsonNullable.<List<String>>of(userGroupByFields);
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
   * @return CloudConfigurationRuleComplianceSignalOptions
   */
  @JsonAnySetter
  public CloudConfigurationRuleComplianceSignalOptions putAdditionalProperty(String key, Object value) {
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
   * Return true if this CloudConfigurationRuleComplianceSignalOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConfigurationRuleComplianceSignalOptions cloudConfigurationRuleComplianceSignalOptions = (CloudConfigurationRuleComplianceSignalOptions) o;
    return Objects.equals(this.defaultActivationStatus, cloudConfigurationRuleComplianceSignalOptions.defaultActivationStatus) && Objects.equals(this.defaultGroupByFields, cloudConfigurationRuleComplianceSignalOptions.defaultGroupByFields) && Objects.equals(this.userActivationStatus, cloudConfigurationRuleComplianceSignalOptions.userActivationStatus) && Objects.equals(this.userGroupByFields, cloudConfigurationRuleComplianceSignalOptions.userGroupByFields) && Objects.equals(this.additionalProperties, cloudConfigurationRuleComplianceSignalOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(defaultActivationStatus,defaultGroupByFields,userActivationStatus,userGroupByFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRuleComplianceSignalOptions {\n");
    sb.append("    defaultActivationStatus: ").append(toIndentedString(defaultActivationStatus)).append("\n");
    sb.append("    defaultGroupByFields: ").append(toIndentedString(defaultGroupByFields)).append("\n");
    sb.append("    userActivationStatus: ").append(toIndentedString(userActivationStatus)).append("\n");
    sb.append("    userGroupByFields: ").append(toIndentedString(userGroupByFields)).append("\n");
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
