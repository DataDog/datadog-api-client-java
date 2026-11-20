/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({UserDefinedLink.JSON_PROPERTY_LABEL, UserDefinedLink.JSON_PROPERTY_LINK})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserDefinedLink {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public UserDefinedLink() {}

  @JsonCreator
  public UserDefinedLink(
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL) String label,
      @JsonProperty(required = true, value = JSON_PROPERTY_LINK) String link) {
    this.label = label;
    this.link = link;
  }

  public UserDefinedLink label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return label
   */
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public UserDefinedLink link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return link
   */
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /** Return true if this UserDefinedLink object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDefinedLink userDefinedLink = (UserDefinedLink) o;
    return Objects.equals(this.label, userDefinedLink.label)
        && Objects.equals(this.link, userDefinedLink.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDefinedLink {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
