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

/** Email destinations for a report. */
@JsonPropertyOrder({DashboardReportDestinationEmail.JSON_PROPERTY_RECIPIENT_ADDRESSES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardReportDestinationEmail {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RECIPIENT_ADDRESSES = "recipient_addresses";
  private List<String> recipientAddresses = null;

  public DashboardReportDestinationEmail recipientAddresses(List<String> recipientAddresses) {
    this.recipientAddresses = recipientAddresses;
    return this;
  }

  public DashboardReportDestinationEmail addRecipientAddressesItem(String recipientAddressesItem) {
    if (this.recipientAddresses == null) {
      this.recipientAddresses = new ArrayList<>();
    }
    this.recipientAddresses.add(recipientAddressesItem);
    return this;
  }

  /**
   * List of email addresses to send reports to.
   *
   * @return recipientAddresses
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRecipientAddresses() {
    return recipientAddresses;
  }

  public void setRecipientAddresses(List<String> recipientAddresses) {
    this.recipientAddresses = recipientAddresses;
  }

  /** Return true if this DashboardReportDestinationEmail object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardReportDestinationEmail dashboardReportDestinationEmail =
        (DashboardReportDestinationEmail) o;
    return Objects.equals(
        this.recipientAddresses, dashboardReportDestinationEmail.recipientAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardReportDestinationEmail {\n");
    sb.append("    recipientAddresses: ").append(toIndentedString(recipientAddresses)).append("\n");
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
