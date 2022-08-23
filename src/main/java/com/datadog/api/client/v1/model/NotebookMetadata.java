/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Metadata associated with the notebook. */
@JsonPropertyOrder({
  NotebookMetadata.JSON_PROPERTY_IS_TEMPLATE,
  NotebookMetadata.JSON_PROPERTY_TAKE_SNAPSHOTS,
  NotebookMetadata.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_TEMPLATE = "is_template";
  private Boolean isTemplate = false;

  public static final String JSON_PROPERTY_TAKE_SNAPSHOTS = "take_snapshots";
  private Boolean takeSnapshots = false;

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<NotebookMetadataType> type = JsonNullable.<NotebookMetadataType>undefined();

  public NotebookMetadata isTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

  /**
   * Whether or not the notebook is a template.
   *
   * @return isTemplate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public NotebookMetadata takeSnapshots(Boolean takeSnapshots) {
    this.takeSnapshots = takeSnapshots;
    return this;
  }

  /**
   * Whether or not the notebook takes snapshot image backups of the notebook's fixed-time graphs.
   *
   * @return takeSnapshots
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAKE_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTakeSnapshots() {
    return takeSnapshots;
  }

  public void setTakeSnapshots(Boolean takeSnapshots) {
    this.takeSnapshots = takeSnapshots;
  }

  public NotebookMetadata type(NotebookMetadataType type) {
    this.type = JsonNullable.<NotebookMetadataType>of(type);
    return this;
  }

  /**
   * Metadata type of the notebook.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NotebookMetadataType getType() {
    return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NotebookMetadataType> getType_JsonNullable() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<NotebookMetadataType> type) {
    this.type = type;
  }

  public void setType(NotebookMetadataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = JsonNullable.<NotebookMetadataType>of(type);
  }

  /** Return true if this NotebookMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookMetadata notebookMetadata = (NotebookMetadata) o;
    return Objects.equals(this.isTemplate, notebookMetadata.isTemplate)
        && Objects.equals(this.takeSnapshots, notebookMetadata.takeSnapshots)
        && Objects.equals(this.type, notebookMetadata.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTemplate, takeSnapshots, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookMetadata {\n");
    sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
    sb.append("    takeSnapshots: ").append(toIndentedString(takeSnapshots)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
