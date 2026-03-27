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
   * <p>Provides additional information about a BOM.</p>
 */
@JsonPropertyOrder({
  SBOMMetadata.JSON_PROPERTY_AUTHORS,
  SBOMMetadata.JSON_PROPERTY_COMPONENT,
  SBOMMetadata.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SBOMMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHORS = "authors";
  private List<SBOMMetadataAuthor> authors = null;

  public static final String JSON_PROPERTY_COMPONENT = "component";
  private SBOMMetadataComponent component;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public SBOMMetadata authors(List<SBOMMetadataAuthor> authors) {
    this.authors = authors;
    for (SBOMMetadataAuthor item : authors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SBOMMetadata addAuthorsItem(SBOMMetadataAuthor authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<>();
    }
    this.authors.add(authorsItem);
    this.unparsed |= authorsItem.unparsed;
    return this;
  }

  /**
   * <p>List of authors of the SBOM.</p>
   * @return authors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SBOMMetadataAuthor> getAuthors() {
        return authors;
      }
  public void setAuthors(List<SBOMMetadataAuthor> authors) {
    this.authors = authors;
  }
  public SBOMMetadata component(SBOMMetadataComponent component) {
    this.component = component;
    this.unparsed |= component.unparsed;
    return this;
  }

  /**
   * <p>The component that the BOM describes.</p>
   * @return component
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPONENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SBOMMetadataComponent getComponent() {
        return component;
      }
  public void setComponent(SBOMMetadataComponent component) {
    this.component = component;
  }
  public SBOMMetadata timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>The timestamp of the SBOM creation.</p>
   * @return timestamp
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimestamp() {
        return timestamp;
      }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
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
   * @return SBOMMetadata
   */
  @JsonAnySetter
  public SBOMMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this SBOMMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBOMMetadata sbomMetadata = (SBOMMetadata) o;
    return Objects.equals(this.authors, sbomMetadata.authors) && Objects.equals(this.component, sbomMetadata.component) && Objects.equals(this.timestamp, sbomMetadata.timestamp) && Objects.equals(this.additionalProperties, sbomMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authors,component,timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBOMMetadata {\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
