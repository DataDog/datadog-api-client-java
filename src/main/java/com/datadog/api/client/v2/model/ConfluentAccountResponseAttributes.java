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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The attributes of a Confluent account. */
@JsonPropertyOrder({
  ConfluentAccountResponseAttributes.JSON_PROPERTY_API_KEY,
  ConfluentAccountResponseAttributes.JSON_PROPERTY_RESOURCES,
  ConfluentAccountResponseAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentAccountResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<ConfluentResourceResponseAttributes> resources = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ConfluentAccountResponseAttributes() {}

  @JsonCreator
  public ConfluentAccountResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_KEY) String apiKey) {
    this.apiKey = apiKey;
  }

  public ConfluentAccountResponseAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The API key associated with your Confluent account.
   *
   * @return apiKey
   */
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ConfluentAccountResponseAttributes resources(
      List<ConfluentResourceResponseAttributes> resources) {
    this.resources = resources;
    for (ConfluentResourceResponseAttributes item : resources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ConfluentAccountResponseAttributes addResourcesItem(
      ConfluentResourceResponseAttributes resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    this.unparsed |= resourcesItem.unparsed;
    return this;
  }

  /**
   * A list of Confluent resources associated with the Confluent account.
   *
   * @return resources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ConfluentResourceResponseAttributes> getResources() {
    return resources;
  }

  public void setResources(List<ConfluentResourceResponseAttributes> resources) {
    this.resources = resources;
  }

  public ConfluentAccountResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ConfluentAccountResponseAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of strings representing tags. Can be a single key, or key-value pairs separated by a
   * colon.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this ConfluentAccountResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfluentAccountResponseAttributes confluentAccountResponseAttributes =
        (ConfluentAccountResponseAttributes) o;
    return Objects.equals(this.apiKey, confluentAccountResponseAttributes.apiKey)
        && Objects.equals(this.resources, confluentAccountResponseAttributes.resources)
        && Objects.equals(this.tags, confluentAccountResponseAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, resources, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfluentAccountResponseAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
