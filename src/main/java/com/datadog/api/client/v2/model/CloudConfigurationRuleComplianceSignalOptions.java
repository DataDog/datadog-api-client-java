/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** How to generate compliance signals. Useful for cloud_configuration rules only. */
@JsonPropertyOrder({
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_USER_ACTIVATION_STATUS,
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_USER_GROUP_BY_FIELDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRuleComplianceSignalOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USER_ACTIVATION_STATUS = "userActivationStatus";
  private JsonNullable<Boolean> userActivationStatus = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_USER_GROUP_BY_FIELDS = "userGroupByFields";
  private JsonNullable<List<String>> userGroupByFields = JsonNullable.<List<String>>undefined();

  public CloudConfigurationRuleComplianceSignalOptions userActivationStatus(
      Boolean userActivationStatus) {
    this.userActivationStatus = JsonNullable.<Boolean>of(userActivationStatus);
    return this;
  }

  /**
   * Whether signals will be sent.
   *
   * @return userActivationStatus
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getUserActivationStatus() {
    return userActivationStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_ACTIVATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getUserActivationStatus_JsonNullable() {
    return userActivationStatus;
  }

  @JsonProperty(JSON_PROPERTY_USER_ACTIVATION_STATUS)
  public void setUserActivationStatus_JsonNullable(JsonNullable<Boolean> userActivationStatus) {
    this.userActivationStatus = userActivationStatus;
  }

  public void setUserActivationStatus(Boolean userActivationStatus) {
    this.userActivationStatus = JsonNullable.<Boolean>of(userActivationStatus);
  }

  public CloudConfigurationRuleComplianceSignalOptions userGroupByFields(
      List<String> userGroupByFields) {
    this.userGroupByFields = JsonNullable.<List<String>>of(userGroupByFields);
    return this;
  }

  public CloudConfigurationRuleComplianceSignalOptions addUserGroupByFieldsItem(
      String userGroupByFieldsItem) {
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
   * Fields to use to group findings by when sending signals.
   *
   * @return userGroupByFields
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getUserGroupByFields() {
    return userGroupByFields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_GROUP_BY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getUserGroupByFields_JsonNullable() {
    return userGroupByFields;
  }

  @JsonProperty(JSON_PROPERTY_USER_GROUP_BY_FIELDS)
  public void setUserGroupByFields_JsonNullable(JsonNullable<List<String>> userGroupByFields) {
    this.userGroupByFields = userGroupByFields;
  }

  public void setUserGroupByFields(List<String> userGroupByFields) {
    this.userGroupByFields = JsonNullable.<List<String>>of(userGroupByFields);
  }

  /** Return true if this CloudConfigurationRuleComplianceSignalOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConfigurationRuleComplianceSignalOptions cloudConfigurationRuleComplianceSignalOptions =
        (CloudConfigurationRuleComplianceSignalOptions) o;
    return Objects.equals(
            this.userActivationStatus,
            cloudConfigurationRuleComplianceSignalOptions.userActivationStatus)
        && Objects.equals(
            this.userGroupByFields,
            cloudConfigurationRuleComplianceSignalOptions.userGroupByFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userActivationStatus, userGroupByFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRuleComplianceSignalOptions {\n");
    sb.append("    userActivationStatus: ")
        .append(toIndentedString(userActivationStatus))
        .append("\n");
    sb.append("    userGroupByFields: ").append(toIndentedString(userGroupByFields)).append("\n");
    sb.append("}");
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
