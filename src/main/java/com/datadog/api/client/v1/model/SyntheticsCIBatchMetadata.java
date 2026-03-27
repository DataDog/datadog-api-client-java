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
import java.util.UUID;
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
   * <p>Metadata for the Synthetic tests run.</p>
 */
@JsonPropertyOrder({
  SyntheticsCIBatchMetadata.JSON_PROPERTY_CI,
  SyntheticsCIBatchMetadata.JSON_PROPERTY_GIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsCIBatchMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CI = "ci";
  private SyntheticsCIBatchMetadataCI ci;

  public static final String JSON_PROPERTY_GIT = "git";
  private SyntheticsCIBatchMetadataGit git;

  public SyntheticsCIBatchMetadata ci(SyntheticsCIBatchMetadataCI ci) {
    this.ci = ci;
    this.unparsed |= ci.unparsed;
    return this;
  }

  /**
   * <p>Description of the CI provider.</p>
   * @return ci
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsCIBatchMetadataCI getCi() {
        return ci;
      }
  public void setCi(SyntheticsCIBatchMetadataCI ci) {
    this.ci = ci;
  }
  public SyntheticsCIBatchMetadata git(SyntheticsCIBatchMetadataGit git) {
    this.git = git;
    this.unparsed |= git.unparsed;
    return this;
  }

  /**
   * <p>Git information.</p>
   * @return git
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsCIBatchMetadataGit getGit() {
        return git;
      }
  public void setGit(SyntheticsCIBatchMetadataGit git) {
    this.git = git;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsCIBatchMetadata
   */
  @JsonAnySetter
  public SyntheticsCIBatchMetadata putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this SyntheticsCIBatchMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCIBatchMetadata syntheticsCiBatchMetadata = (SyntheticsCIBatchMetadata) o;
    return Objects.equals(this.ci, syntheticsCiBatchMetadata.ci) && Objects.equals(this.git, syntheticsCiBatchMetadata.git) && Objects.equals(this.additionalProperties, syntheticsCiBatchMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(ci,git, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCIBatchMetadata {\n");
    sb.append("    ci: ").append(toIndentedString(ci)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
