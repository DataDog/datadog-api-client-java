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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The reason why the resource could not be published. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationPublishError.JSON_PROPERTY_CODE,
  SecurityMonitoringBatchMigrationPublishError.JSON_PROPERTY_DETAILS,
  SecurityMonitoringBatchMigrationPublishError.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationPublishError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<SecurityMonitoringBatchMigrationPublishErrorDetail> details = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public SecurityMonitoringBatchMigrationPublishError() {}

  @JsonCreator
  public SecurityMonitoringBatchMigrationPublishError(
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message) {
    this.message = message;
  }

  public SecurityMonitoringBatchMigrationPublishError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The error code returned on rule creation.
   *
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SecurityMonitoringBatchMigrationPublishError details(
      List<SecurityMonitoringBatchMigrationPublishErrorDetail> details) {
    this.details = details;
    if (details != null) {
      for (SecurityMonitoringBatchMigrationPublishErrorDetail item : details) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SecurityMonitoringBatchMigrationPublishError addDetailsItem(
      SecurityMonitoringBatchMigrationPublishErrorDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    this.unparsed |= detailsItem.unparsed;
    return this;
  }

  /**
   * The rule validation errors returned on rule creation.
   *
   * @return details
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringBatchMigrationPublishErrorDetail> getDetails() {
    return details;
  }

  public void setDetails(List<SecurityMonitoringBatchMigrationPublishErrorDetail> details) {
    this.details = details;
    if (details != null) {
      for (SecurityMonitoringBatchMigrationPublishErrorDetail item : details) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityMonitoringBatchMigrationPublishError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The error message.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
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
   * @return SecurityMonitoringBatchMigrationPublishError
   */
  @JsonAnySetter
  public SecurityMonitoringBatchMigrationPublishError putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SecurityMonitoringBatchMigrationPublishError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationPublishError securityMonitoringBatchMigrationPublishError =
        (SecurityMonitoringBatchMigrationPublishError) o;
    return Objects.equals(this.code, securityMonitoringBatchMigrationPublishError.code)
        && Objects.equals(this.details, securityMonitoringBatchMigrationPublishError.details)
        && Objects.equals(this.message, securityMonitoringBatchMigrationPublishError.message)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringBatchMigrationPublishError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationPublishError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
