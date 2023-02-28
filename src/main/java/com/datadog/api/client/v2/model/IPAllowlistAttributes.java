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

/** Attributes of the IP allowlist. */
@JsonPropertyOrder({
  IPAllowlistAttributes.JSON_PROPERTY_ENABLED,
  IPAllowlistAttributes.JSON_PROPERTY_ENTRIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IPAllowlistAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<IPAllowlistEntry> entries = null;

  public IPAllowlistAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the IP allowlist logic is enabled or not.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IPAllowlistAttributes entries(List<IPAllowlistEntry> entries) {
    this.entries = entries;
    for (IPAllowlistEntry item : entries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IPAllowlistAttributes addEntriesItem(IPAllowlistEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    this.unparsed |= entriesItem.unparsed;
    return this;
  }

  /**
   * Array of entries in the IP allowlist.
   *
   * @return entries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IPAllowlistEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<IPAllowlistEntry> entries) {
    this.entries = entries;
  }

  /** Return true if this IPAllowlistAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAllowlistAttributes ipAllowlistAttributes = (IPAllowlistAttributes) o;
    return Objects.equals(this.enabled, ipAllowlistAttributes.enabled)
        && Objects.equals(this.entries, ipAllowlistAttributes.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAllowlistAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
