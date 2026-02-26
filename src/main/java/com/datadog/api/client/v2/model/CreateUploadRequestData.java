/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Request data for creating an upload for a file to be ingested into a reference table. */
@JsonPropertyOrder({
  CreateUploadRequestData.JSON_PROPERTY_ATTRIBUTES,
  CreateUploadRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateUploadRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CreateUploadRequestDataAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CreateUploadRequestDataType type = CreateUploadRequestDataType.UPLOAD;

  public CreateUploadRequestData() {}

  @JsonCreator
  public CreateUploadRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CreateUploadRequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CreateUploadRequestData attributes(CreateUploadRequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Upload configuration specifying how data is uploaded by the user, and properties of the table
   * to associate the upload with.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateUploadRequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CreateUploadRequestDataAttributes attributes) {
    this.attributes = attributes;
  }

  public CreateUploadRequestData type(CreateUploadRequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Upload resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreateUploadRequestDataType getType() {
    return type;
  }

  public void setType(CreateUploadRequestDataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CreateUploadRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUploadRequestData createUploadRequestData = (CreateUploadRequestData) o;
    return Objects.equals(this.attributes, createUploadRequestData.attributes)
        && Objects.equals(this.type, createUploadRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUploadRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
