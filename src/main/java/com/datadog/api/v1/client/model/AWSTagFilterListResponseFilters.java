/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.AWSNamespace;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * A list of tag filters.
 */
@ApiModel(description = "A list of tag filters.")
@JsonPropertyOrder({
  AWSTagFilterListResponseFilters.JSON_PROPERTY_NAMESPACE,
  AWSTagFilterListResponseFilters.JSON_PROPERTY_TAG_FILTER_STR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AWSTagFilterListResponseFilters {
  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private AWSNamespace namespace;

  public static final String JSON_PROPERTY_TAG_FILTER_STR = "tag_filter_str";
  private String tagFilterStr;


  public AWSTagFilterListResponseFilters namespace(AWSNamespace namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AWSNamespace getNamespace() {
    return namespace;
  }


  public void setNamespace(AWSNamespace namespace) {
    this.namespace = namespace;
  }


  public AWSTagFilterListResponseFilters tagFilterStr(String tagFilterStr) {
    this.tagFilterStr = tagFilterStr;
    return this;
  }

   /**
   * The tag filter string.
   * @return tagFilterStr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "prod*", value = "The tag filter string.")
  @JsonProperty(JSON_PROPERTY_TAG_FILTER_STR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTagFilterStr() {
    return tagFilterStr;
  }


  public void setTagFilterStr(String tagFilterStr) {
    this.tagFilterStr = tagFilterStr;
  }


  /**
   * Return true if this AWSTagFilterListResponse_filters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSTagFilterListResponseFilters awSTagFilterListResponseFilters = (AWSTagFilterListResponseFilters) o;
    return Objects.equals(this.namespace, awSTagFilterListResponseFilters.namespace) &&
        Objects.equals(this.tagFilterStr, awSTagFilterListResponseFilters.tagFilterStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, tagFilterStr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSTagFilterListResponseFilters {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    tagFilterStr: ").append(toIndentedString(tagFilterStr)).append("\n");
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

