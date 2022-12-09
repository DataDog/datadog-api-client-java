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

/** How to generate signals */
@JsonPropertyOrder({
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_USER_ACTIVATION_STATUS,
  CloudConfigurationRuleComplianceSignalOptions.JSON_PROPERTY_USER_GROUP_BY_FIELDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRuleComplianceSignalOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USER_ACTIVATION_STATUS = "userActivationStatus";
  private Boolean userActivationStatus;

  public static final String JSON_PROPERTY_USER_GROUP_BY_FIELDS = "userGroupByFields";
  private List<String> userGroupByFields = null;

  public CloudConfigurationRuleComplianceSignalOptions userActivationStatus(
      Boolean userActivationStatus) {
    this.userActivationStatus = userActivationStatus;
    return this;
  }

  /**
   * Whether signals will be sent.
   *
   * @return userActivationStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ACTIVATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUserActivationStatus() {
    return userActivationStatus;
  }

  public void setUserActivationStatus(Boolean userActivationStatus) {
    this.userActivationStatus = userActivationStatus;
  }

  public CloudConfigurationRuleComplianceSignalOptions userGroupByFields(
      List<String> userGroupByFields) {
    this.userGroupByFields = userGroupByFields;
    return this;
  }

  public CloudConfigurationRuleComplianceSignalOptions addUserGroupByFieldsItem(
      String userGroupByFieldsItem) {
    if (this.userGroupByFields == null) {
      this.userGroupByFields = new ArrayList<>();
    }
    this.userGroupByFields.add(userGroupByFieldsItem);
    return this;
  }

  /**
   * Fields to use to group findings by when sending signals.
   *
   * @return userGroupByFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_GROUP_BY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUserGroupByFields() {
    return userGroupByFields;
  }

  public void setUserGroupByFields(List<String> userGroupByFields) {
    this.userGroupByFields = userGroupByFields;
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
