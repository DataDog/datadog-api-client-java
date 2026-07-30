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

/** Partial Twilio interface settings for updates. */
@JsonPropertyOrder({
  TwilioSettingsUpdate.JSON_PROPERTY_ACCOUNT_SID,
  TwilioSettingsUpdate.JSON_PROPERTY_CENSOR_LOGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioSettingsUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_SID = "account_sid";
  private String accountSid;

  public static final String JSON_PROPERTY_CENSOR_LOGS = "censor_logs";
  private Boolean censorLogs;

  public TwilioSettingsUpdate accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * Twilio Account SID that uniquely identifies your Twilio account.
   *
   * @return accountSid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public TwilioSettingsUpdate censorLogs(Boolean censorLogs) {
    this.censorLogs = censorLogs;
    return this;
  }

  /**
   * When enabled, phone numbers in the <code>to</code> field and SMS message bodies are censored
   * for privacy.
   *
   * @return censorLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CENSOR_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCensorLogs() {
    return censorLogs;
  }

  public void setCensorLogs(Boolean censorLogs) {
    this.censorLogs = censorLogs;
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
   * @return TwilioSettingsUpdate
   */
  @JsonAnySetter
  public TwilioSettingsUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TwilioSettingsUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioSettingsUpdate twilioSettingsUpdate = (TwilioSettingsUpdate) o;
    return Objects.equals(this.accountSid, twilioSettingsUpdate.accountSid)
        && Objects.equals(this.censorLogs, twilioSettingsUpdate.censorLogs)
        && Objects.equals(this.additionalProperties, twilioSettingsUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, censorLogs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioSettingsUpdate {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    censorLogs: ").append(toIndentedString(censorLogs)).append("\n");
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
