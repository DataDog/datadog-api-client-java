/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Settings for creating the Twilio integration account. */
@JsonPropertyOrder({
  TwilioIntegrationAccountSettingsRequest.JSON_PROPERTY_ACCOUNT_SID,
  TwilioIntegrationAccountSettingsRequest.JSON_PROPERTY_CENSOR_LOGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TwilioIntegrationAccountSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_SID = "account_sid";
  private String accountSid;

  public static final String JSON_PROPERTY_CENSOR_LOGS = "censor_logs";
  private Boolean censorLogs;

  public TwilioIntegrationAccountSettingsRequest() {}

  @JsonCreator
  public TwilioIntegrationAccountSettingsRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_SID) String accountSid) {
    this.accountSid = accountSid;
  }

  public TwilioIntegrationAccountSettingsRequest accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * Twilio Account SID that uniquely identifies your Twilio account.
   *
   * @return accountSid
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public TwilioIntegrationAccountSettingsRequest censorLogs(Boolean censorLogs) {
    this.censorLogs = censorLogs;
    return this;
  }

  /**
   * When enabled, Twilio phone numbers in the <code>to</code> field and SMS message bodies are
   * censored for privacy.
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

  /** Return true if this TwilioIntegrationAccountSettingsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioIntegrationAccountSettingsRequest twilioIntegrationAccountSettingsRequest =
        (TwilioIntegrationAccountSettingsRequest) o;
    return Objects.equals(this.accountSid, twilioIntegrationAccountSettingsRequest.accountSid)
        && Objects.equals(this.censorLogs, twilioIntegrationAccountSettingsRequest.censorLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, censorLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioIntegrationAccountSettingsRequest {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    censorLogs: ").append(toIndentedString(censorLogs)).append("\n");
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
