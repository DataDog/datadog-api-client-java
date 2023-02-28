/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>A response with one or more service level objective.</p>
 */
@JsonPropertyOrder({
  SLOListResponse.JSON_PROPERTY_DATA,
  SLOListResponse.JSON_PROPERTY_ERRORS,
  SLOListResponse.JSON_PROPERTY_METADATA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOListResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ServiceLevelObjective> data = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SLOListResponseMetadata metadata;

  public SLOListResponse data(List<ServiceLevelObjective> data) {
    this.data = data;
    for (ServiceLevelObjective item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SLOListResponse addDataItem(ServiceLevelObjective dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>An array of service level objective objects.</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ServiceLevelObjective> getData() {
        return data;
      }
  public void setData(List<ServiceLevelObjective> data) {
    this.data = data;
  }
  public SLOListResponse errors(List<String> errors) {
    this.errors = errors;
    return this;
  }
  public SLOListResponse addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * <p>An array of error messages. Each endpoint documents how/whether this field is
   * used.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERRORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getErrors() {
        return errors;
      }
  public void setErrors(List<String> errors) {
    this.errors = errors;
  }
  public SLOListResponse metadata(SLOListResponseMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>The metadata object containing additional information about the list of SLOs.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SLOListResponseMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(SLOListResponseMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * Return true if this SLOListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOListResponse sloListResponse = (SLOListResponse) o;
    return Objects.equals(this.data, sloListResponse.data) && Objects.equals(this.errors, sloListResponse.errors) && Objects.equals(this.metadata, sloListResponse.metadata);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,errors,metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
