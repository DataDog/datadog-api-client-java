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
import java.util.Objects;

/** Relationships of the configuration. */
@JsonPropertyOrder({SensitiveDataScannerConfigurationRelationships.JSON_PROPERTY_GROUPS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerConfigurationRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUPS = "groups";
  private SensitiveDataScannerGroupList groups;

  public SensitiveDataScannerConfigurationRelationships groups(
      SensitiveDataScannerGroupList groups) {
    this.groups = groups;
    this.unparsed |= groups.unparsed;
    return this;
  }

  /**
   * List of groups, ordered.
   *
   * @return groups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerGroupList getGroups() {
    return groups;
  }

  public void setGroups(SensitiveDataScannerGroupList groups) {
    this.groups = groups;
  }

  /** Return true if this SensitiveDataScannerConfigurationRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerConfigurationRelationships sensitiveDataScannerConfigurationRelationships =
        (SensitiveDataScannerConfigurationRelationships) o;
    return Objects.equals(this.groups, sensitiveDataScannerConfigurationRelationships.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerConfigurationRelationships {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
