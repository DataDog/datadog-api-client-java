/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Response metadata object. */
@ApiModel(description = "Response metadata object.")
@JsonPropertyOrder({ProcessSummariesMeta.JSON_PROPERTY_PAGE})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessSummariesMeta {
  public static final String JSON_PROPERTY_PAGE = "page";
  private ProcessSummariesMetaPage page;

  public ProcessSummariesMeta page(ProcessSummariesMetaPage page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProcessSummariesMetaPage getPage() {
    return page;
  }

  public void setPage(ProcessSummariesMetaPage page) {
    this.page = page;
  }

  /** Return true if this ProcessSummariesMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessSummariesMeta processSummariesMeta = (ProcessSummariesMeta) o;
    return Objects.equals(this.page, processSummariesMeta.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessSummariesMeta {\n");
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
