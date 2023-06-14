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

/**
 * If the pipeline is triggered as child of another pipeline, this should contain the details of the
 * parent pipeline.
 */
@JsonPropertyOrder({
  CIAppPipelineEventParentPipeline.JSON_PROPERTY_ID,
  CIAppPipelineEventParentPipeline.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventParentPipeline {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public CIAppPipelineEventParentPipeline() {}

  @JsonCreator
  public CIAppPipelineEventParentPipeline(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id) {
    this.id = id;
  }

  public CIAppPipelineEventParentPipeline id(String id) {
    this.id = id;
    return this;
  }

  /**
   * UUID of a pipeline.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CIAppPipelineEventParentPipeline url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to look at the pipeline in the CI provider UI.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this CIAppPipelineEventParentPipeline object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventParentPipeline ciAppPipelineEventParentPipeline =
        (CIAppPipelineEventParentPipeline) o;
    return Objects.equals(this.id, ciAppPipelineEventParentPipeline.id)
        && Objects.equals(this.url, ciAppPipelineEventParentPipeline.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventParentPipeline {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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