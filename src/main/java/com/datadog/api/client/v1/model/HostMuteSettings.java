/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Combination of settings to mute a host. */
@JsonPropertyOrder({
  HostMuteSettings.JSON_PROPERTY_END,
  HostMuteSettings.JSON_PROPERTY_MESSAGE,
  HostMuteSettings.JSON_PROPERTY_OVERRIDE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMuteSettings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_OVERRIDE = "override";
  private Boolean override;

  public HostMuteSettings end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * POSIX timestamp in seconds when the host is unmuted. If omitted, the host remains muted until
   * explicitly unmuted.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public HostMuteSettings message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message to associate with the muting of this host.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HostMuteSettings override(Boolean override) {
    this.override = override;
    return this;
  }

  /**
   * If true and the host is already muted, replaces existing host mute settings.
   *
   * @return override
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOverride() {
    return override;
  }

  public void setOverride(Boolean override) {
    this.override = override;
  }

  /** Return true if this HostMuteSettings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMuteSettings hostMuteSettings = (HostMuteSettings) o;
    return Objects.equals(this.end, hostMuteSettings.end)
        && Objects.equals(this.message, hostMuteSettings.message)
        && Objects.equals(this.override, hostMuteSettings.override);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, message, override);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMuteSettings {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
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
