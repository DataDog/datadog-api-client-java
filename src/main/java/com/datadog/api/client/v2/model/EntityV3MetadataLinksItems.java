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
   * <p>The definition of Entity V3 Metadata Links Items object.</p>
 */
@JsonPropertyOrder({
  EntityV3MetadataLinksItems.JSON_PROPERTY_NAME,
  EntityV3MetadataLinksItems.JSON_PROPERTY_PROVIDER,
  EntityV3MetadataLinksItems.JSON_PROPERTY_TYPE,
  EntityV3MetadataLinksItems.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3MetadataLinksItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "other";

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public EntityV3MetadataLinksItems() {}

  @JsonCreator
  public EntityV3MetadataLinksItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)String type,
            @JsonProperty(required=true, value=JSON_PROPERTY_URL)String url) {
        this.name = name;
        this.type = type;
        this.url = url;
  }
  public EntityV3MetadataLinksItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Link name.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public EntityV3MetadataLinksItems provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * <p>Link provider.</p>
   * @return provider
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROVIDER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProvider() {
        return provider;
      }
  public void setProvider(String provider) {
    this.provider = provider;
  }
  public EntityV3MetadataLinksItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Link type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }
  public EntityV3MetadataLinksItems url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <p>Link URL.</p>
   * @return url
  **/
      @JsonProperty(JSON_PROPERTY_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUrl() {
        return url;
      }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Return true if this EntityV3MetadataLinksItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3MetadataLinksItems entityV3MetadataLinksItems = (EntityV3MetadataLinksItems) o;
    return Objects.equals(this.name, entityV3MetadataLinksItems.name) && Objects.equals(this.provider, entityV3MetadataLinksItems.provider) && Objects.equals(this.type, entityV3MetadataLinksItems.type) && Objects.equals(this.url, entityV3MetadataLinksItems.url);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,provider,type,url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3MetadataLinksItems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
