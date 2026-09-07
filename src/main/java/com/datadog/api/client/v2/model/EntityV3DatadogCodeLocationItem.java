/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Code location item.</p>
 */
@JsonPropertyOrder({
  EntityV3DatadogCodeLocationItem.JSON_PROPERTY_PATHS,
  EntityV3DatadogCodeLocationItem.JSON_PROPERTY_REPOSITORY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3DatadogCodeLocationItem {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PATHS = "paths";
  private List<String> paths = null;

  public static final String JSON_PROPERTY_REPOSITORY_URL = "repositoryURL";
  private String repositoryUrl;

  public EntityV3DatadogCodeLocationItem paths(List<String> paths) {
    this.paths = paths;
    return this;
  }
  public EntityV3DatadogCodeLocationItem addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * <p>The paths (glob) to the source code of the service.</p>
   * @return paths
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATHS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getPaths() {
        return paths;
      }
  public void setPaths(List<String> paths) {
    this.paths = paths;
  }
  public EntityV3DatadogCodeLocationItem repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * <p>The repository path of the source code of the entity.</p>
   * @return repositoryUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRepositoryUrl() {
        return repositoryUrl;
      }
  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  /**
   * Return true if this EntityV3DatadogCodeLocationItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3DatadogCodeLocationItem entityV3DatadogCodeLocationItem = (EntityV3DatadogCodeLocationItem) o;
    return Objects.equals(this.paths, entityV3DatadogCodeLocationItem.paths) && Objects.equals(this.repositoryUrl, entityV3DatadogCodeLocationItem.repositoryUrl);
  }


  @Override
  public int hashCode() {
    return Objects.hash(paths,repositoryUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3DatadogCodeLocationItem {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
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
