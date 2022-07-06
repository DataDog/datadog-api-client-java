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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response with the list of organizations. */
@JsonPropertyOrder({OrganizationListResponse.JSON_PROPERTY_ORGS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORGS = "orgs";
  private List<Organization> orgs = null;

  public OrganizationListResponse orgs(List<Organization> orgs) {
    this.orgs = orgs;
    for (Organization item : orgs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public OrganizationListResponse addOrgsItem(Organization orgsItem) {
    if (this.orgs == null) {
      this.orgs = new ArrayList<>();
    }
    this.orgs.add(orgsItem);
    this.unparsed |= orgsItem.unparsed;
    return this;
  }

  /**
   * Array of organization objects.
   *
   * @return orgs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Organization> getOrgs() {
    return orgs;
  }

  public void setOrgs(List<Organization> orgs) {
    this.orgs = orgs;
  }

  /** Return true if this OrganizationListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationListResponse organizationListResponse = (OrganizationListResponse) o;
    return Objects.equals(this.orgs, organizationListResponse.orgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationListResponse {\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
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
