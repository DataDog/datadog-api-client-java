/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Paging attributes. */
@JsonPropertyOrder({SecurityMonitoringSignalsListResponseMetaPage.JSON_PROPERTY_AFTER})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalsListResponseMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  public SecurityMonitoringSignalsListResponseMetaPage after(String after) {
    this.after = after;
    return this;
  }

  /**
   * The cursor used to get the next results, if any. To make the next request, use the same
   * parameters with the addition of the <code>page[cursor]</code>.
   *
   * @return after
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  /** Return true if this SecurityMonitoringSignalsListResponseMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalsListResponseMetaPage securityMonitoringSignalsListResponseMetaPage =
        (SecurityMonitoringSignalsListResponseMetaPage) o;
    return Objects.equals(this.after, securityMonitoringSignalsListResponseMetaPage.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalsListResponseMetaPage {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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
