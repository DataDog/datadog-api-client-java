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

/** Action of the mute rule */
@JsonPropertyOrder({
  ActionMute.JSON_PROPERTY_ENABLED_UNTIL,
  ActionMute.JSON_PROPERTY_REASON,
  ActionMute.JSON_PROPERTY_REASON_DESCRIPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionMute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED_UNTIL = "enabled_until";
  private Long enabledUntil;

  public static final String JSON_PROPERTY_REASON = "reason";
  private MuteReason reason;

  public static final String JSON_PROPERTY_REASON_DESCRIPTION = "reason_description";
  private String reasonDescription;

  public ActionMute() {}

  @JsonCreator
  public ActionMute(
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON) MuteReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
  }

  public ActionMute enabledUntil(Long enabledUntil) {
    this.enabledUntil = enabledUntil;
    return this;
  }

  /**
   * End date of the mute rule (null means mute forever)
   *
   * @return enabledUntil
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEnabledUntil() {
    return enabledUntil;
  }

  public void setEnabledUntil(Long enabledUntil) {
    this.enabledUntil = enabledUntil;
  }

  public ActionMute reason(MuteReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * Reason for muting a vulnerability
   *
   * @return reason
   */
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MuteReason getReason() {
    return reason;
  }

  public void setReason(MuteReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
    this.reason = reason;
  }

  public ActionMute reasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
    return this;
  }

  /**
   * Free text to add a reason description.
   *
   * @return reasonDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReasonDescription() {
    return reasonDescription;
  }

  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
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
   * @return ActionMute
   */
  @JsonAnySetter
  public ActionMute putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ActionMute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMute actionMute = (ActionMute) o;
    return Objects.equals(this.enabledUntil, actionMute.enabledUntil)
        && Objects.equals(this.reason, actionMute.reason)
        && Objects.equals(this.reasonDescription, actionMute.reasonDescription)
        && Objects.equals(this.additionalProperties, actionMute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledUntil, reason, reasonDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMute {\n");
    sb.append("    enabledUntil: ").append(toIndentedString(enabledUntil)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
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