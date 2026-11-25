/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448_20270101 type;

  public ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744() {}

  @JsonCreator
  public ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448_20270101 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744 type(
      ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448_20270101 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448_20270101 getType() {
    return type;
  }

  public void setType(
      ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448_20270101 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744 object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744
        toplistBackendDefinitionStyle20270101DisplayOneOf4453175744 =
            (ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744) o;
    return Objects.equals(
        this.type, toplistBackendDefinitionStyle20270101DisplayOneOf4453175744.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendDefinitionStyle20270101DisplayOneOf4453175744 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
