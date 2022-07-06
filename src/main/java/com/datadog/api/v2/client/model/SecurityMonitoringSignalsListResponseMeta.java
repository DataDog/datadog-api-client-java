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

/** Meta attributes. */
@JsonPropertyOrder({SecurityMonitoringSignalsListResponseMeta.JSON_PROPERTY_PAGE})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalsListResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGE = "page";
  private SecurityMonitoringSignalsListResponseMetaPage page;

  public SecurityMonitoringSignalsListResponseMeta page(
      SecurityMonitoringSignalsListResponseMetaPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Paging attributes.
   *
   * @return page
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalsListResponseMetaPage getPage() {
    return page;
  }

  public void setPage(SecurityMonitoringSignalsListResponseMetaPage page) {
    this.page = page;
  }

  /** Return true if this SecurityMonitoringSignalsListResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalsListResponseMeta securityMonitoringSignalsListResponseMeta =
        (SecurityMonitoringSignalsListResponseMeta) o;
    return Objects.equals(this.page, securityMonitoringSignalsListResponseMeta.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalsListResponseMeta {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
