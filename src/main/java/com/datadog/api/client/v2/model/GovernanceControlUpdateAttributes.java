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

/**
 * The attributes of a governance control that can be updated. Only the attributes present in the
 * request are modified.
 */
@JsonPropertyOrder({
  GovernanceControlUpdateAttributes.JSON_PROPERTY_DETECTION_FREQUENCY,
  GovernanceControlUpdateAttributes.JSON_PROPERTY_DETECTION_PARAMETERS,
  GovernanceControlUpdateAttributes.JSON_PROPERTY_MITIGATION_PARAMETERS,
  GovernanceControlUpdateAttributes.JSON_PROPERTY_MITIGATION_TYPE,
  GovernanceControlUpdateAttributes.JSON_PROPERTY_NAME,
  GovernanceControlUpdateAttributes.JSON_PROPERTY_NOTIFICATION_FREQUENCY,
  GovernanceControlUpdateAttributes.JSON_PROPERTY_NOTIFICATION_PARAMETERS,
  GovernanceControlUpdateAttributes.JSON_PROPERTY_NOTIFICATION_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceControlUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DETECTION_FREQUENCY = "detection_frequency";
  private String detectionFrequency;

  public static final String JSON_PROPERTY_DETECTION_PARAMETERS = "detection_parameters";
  private Map<String, Object> detectionParameters = null;

  public static final String JSON_PROPERTY_MITIGATION_PARAMETERS = "mitigation_parameters";
  private Map<String, Object> mitigationParameters = null;

  public static final String JSON_PROPERTY_MITIGATION_TYPE = "mitigation_type";
  private String mitigationType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NOTIFICATION_FREQUENCY = "notification_frequency";
  private String notificationFrequency;

  public static final String JSON_PROPERTY_NOTIFICATION_PARAMETERS = "notification_parameters";
  private Map<String, Object> notificationParameters = null;

  public static final String JSON_PROPERTY_NOTIFICATION_TYPE = "notification_type";
  private String notificationType;

  public GovernanceControlUpdateAttributes detectionFrequency(String detectionFrequency) {
    this.detectionFrequency = detectionFrequency;
    return this;
  }

  /**
   * How often detections should be evaluated for the control.
   *
   * @return detectionFrequency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTION_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDetectionFrequency() {
    return detectionFrequency;
  }

  public void setDetectionFrequency(String detectionFrequency) {
    this.detectionFrequency = detectionFrequency;
  }

  public GovernanceControlUpdateAttributes detectionParameters(
      Map<String, Object> detectionParameters) {
    this.detectionParameters = detectionParameters;
    return this;
  }

  public GovernanceControlUpdateAttributes putDetectionParametersItem(
      String key, Object detectionParametersItem) {
    if (this.detectionParameters == null) {
      this.detectionParameters = new HashMap<>();
    }
    this.detectionParameters.put(key, detectionParametersItem);
    return this;
  }

  /**
   * A free-form map of parameter names to their configured values.
   *
   * @return detectionParameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getDetectionParameters() {
    return detectionParameters;
  }

  public void setDetectionParameters(Map<String, Object> detectionParameters) {
    this.detectionParameters = detectionParameters;
  }

  public GovernanceControlUpdateAttributes mitigationParameters(
      Map<String, Object> mitigationParameters) {
    this.mitigationParameters = mitigationParameters;
    return this;
  }

  public GovernanceControlUpdateAttributes putMitigationParametersItem(
      String key, Object mitigationParametersItem) {
    if (this.mitigationParameters == null) {
      this.mitigationParameters = new HashMap<>();
    }
    this.mitigationParameters.put(key, mitigationParametersItem);
    return this;
  }

  /**
   * A free-form map of parameter names to their configured values.
   *
   * @return mitigationParameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MITIGATION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMitigationParameters() {
    return mitigationParameters;
  }

  public void setMitigationParameters(Map<String, Object> mitigationParameters) {
    this.mitigationParameters = mitigationParameters;
  }

  public GovernanceControlUpdateAttributes mitigationType(String mitigationType) {
    this.mitigationType = mitigationType;
    return this;
  }

  /**
   * The mitigation type to configure for the control.
   *
   * @return mitigationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MITIGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMitigationType() {
    return mitigationType;
  }

  public void setMitigationType(String mitigationType) {
    this.mitigationType = mitigationType;
  }

  public GovernanceControlUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A new human-readable name for the control.
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

  public GovernanceControlUpdateAttributes notificationFrequency(String notificationFrequency) {
    this.notificationFrequency = notificationFrequency;
    return this;
  }

  /**
   * The notification frequency to configure for the control.
   *
   * @return notificationFrequency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotificationFrequency() {
    return notificationFrequency;
  }

  public void setNotificationFrequency(String notificationFrequency) {
    this.notificationFrequency = notificationFrequency;
  }

  public GovernanceControlUpdateAttributes notificationParameters(
      Map<String, Object> notificationParameters) {
    this.notificationParameters = notificationParameters;
    return this;
  }

  public GovernanceControlUpdateAttributes putNotificationParametersItem(
      String key, Object notificationParametersItem) {
    if (this.notificationParameters == null) {
      this.notificationParameters = new HashMap<>();
    }
    this.notificationParameters.put(key, notificationParametersItem);
    return this;
  }

  /**
   * A free-form map of parameter names to their configured values.
   *
   * @return notificationParameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getNotificationParameters() {
    return notificationParameters;
  }

  public void setNotificationParameters(Map<String, Object> notificationParameters) {
    this.notificationParameters = notificationParameters;
  }

  public GovernanceControlUpdateAttributes notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * The notification type to configure for the control.
   *
   * @return notificationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
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
   * @return GovernanceControlUpdateAttributes
   */
  @JsonAnySetter
  public GovernanceControlUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceControlUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceControlUpdateAttributes governanceControlUpdateAttributes =
        (GovernanceControlUpdateAttributes) o;
    return Objects.equals(
            this.detectionFrequency, governanceControlUpdateAttributes.detectionFrequency)
        && Objects.equals(
            this.detectionParameters, governanceControlUpdateAttributes.detectionParameters)
        && Objects.equals(
            this.mitigationParameters, governanceControlUpdateAttributes.mitigationParameters)
        && Objects.equals(this.mitigationType, governanceControlUpdateAttributes.mitigationType)
        && Objects.equals(this.name, governanceControlUpdateAttributes.name)
        && Objects.equals(
            this.notificationFrequency, governanceControlUpdateAttributes.notificationFrequency)
        && Objects.equals(
            this.notificationParameters, governanceControlUpdateAttributes.notificationParameters)
        && Objects.equals(this.notificationType, governanceControlUpdateAttributes.notificationType)
        && Objects.equals(
            this.additionalProperties, governanceControlUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        detectionFrequency,
        detectionParameters,
        mitigationParameters,
        mitigationType,
        name,
        notificationFrequency,
        notificationParameters,
        notificationType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceControlUpdateAttributes {\n");
    sb.append("    detectionFrequency: ").append(toIndentedString(detectionFrequency)).append("\n");
    sb.append("    detectionParameters: ")
        .append(toIndentedString(detectionParameters))
        .append("\n");
    sb.append("    mitigationParameters: ")
        .append(toIndentedString(mitigationParameters))
        .append("\n");
    sb.append("    mitigationType: ").append(toIndentedString(mitigationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationFrequency: ")
        .append(toIndentedString(notificationFrequency))
        .append("\n");
    sb.append("    notificationParameters: ")
        .append(toIndentedString(notificationParameters))
        .append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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
