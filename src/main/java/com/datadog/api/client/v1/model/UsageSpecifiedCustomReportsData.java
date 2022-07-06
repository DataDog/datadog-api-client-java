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

/** Response containing date and type for specified custom reports. */
@JsonPropertyOrder({
  UsageSpecifiedCustomReportsData.JSON_PROPERTY_ATTRIBUTES,
  UsageSpecifiedCustomReportsData.JSON_PROPERTY_ID,
  UsageSpecifiedCustomReportsData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSpecifiedCustomReportsData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private UsageSpecifiedCustomReportsAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private UsageReportsType type = UsageReportsType.REPORTS;

  public UsageSpecifiedCustomReportsData attributes(
      UsageSpecifiedCustomReportsAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The response containing attributes for specified custom reports.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageSpecifiedCustomReportsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UsageSpecifiedCustomReportsAttributes attributes) {
    this.attributes = attributes;
  }

  public UsageSpecifiedCustomReportsData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The date for specified custom reports.
   *
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UsageSpecifiedCustomReportsData type(UsageReportsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of reports.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageReportsType getType() {
    return type;
  }

  public void setType(UsageReportsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this UsageSpecifiedCustomReportsData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSpecifiedCustomReportsData usageSpecifiedCustomReportsData =
        (UsageSpecifiedCustomReportsData) o;
    return Objects.equals(this.attributes, usageSpecifiedCustomReportsData.attributes)
        && Objects.equals(this.id, usageSpecifiedCustomReportsData.id)
        && Objects.equals(this.type, usageSpecifiedCustomReportsData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSpecifiedCustomReportsData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
