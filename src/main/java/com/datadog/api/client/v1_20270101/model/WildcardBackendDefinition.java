/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  WildcardBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  WildcardBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  WildcardBackendDefinition.JSON_PROPERTY_NOTES,
  WildcardBackendDefinition.JSON_PROPERTY_REQUESTS,
  WildcardBackendDefinition.JSON_PROPERTY_SPECIFICATION,
  WildcardBackendDefinition.JSON_PROPERTY_TIME,
  WildcardBackendDefinition.JSON_PROPERTY_TITLE,
  WildcardBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  WildcardBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  WildcardBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WildcardBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<WildcardTileDefRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SPECIFICATION = "specification";
  private WildcardBackendDefinitionSpecification specification;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WildcardBackendDefinitionType type;

  public WildcardBackendDefinition() {}

  @JsonCreator
  public WildcardBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<WildcardTileDefRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPECIFICATION)
          WildcardBackendDefinitionSpecification specification,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          WildcardBackendDefinitionType type) {
    this.requests = requests;
    for (WildcardTileDefRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.specification = specification;
    this.unparsed |= specification.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public WildcardBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public WildcardBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return customLinks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }

  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public WildcardBackendDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WildcardBackendDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public WildcardBackendDefinition requests(List<WildcardTileDefRequest> requests) {
    this.requests = requests;
    for (WildcardTileDefRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public WildcardBackendDefinition addRequestsItem(WildcardTileDefRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<WildcardTileDefRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<WildcardTileDefRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (WildcardTileDefRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public WildcardBackendDefinition specification(
      WildcardBackendDefinitionSpecification specification) {
    this.specification = specification;
    this.unparsed |= specification.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return specification
   */
  @JsonProperty(JSON_PROPERTY_SPECIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WildcardBackendDefinitionSpecification getSpecification() {
    return specification;
  }

  public void setSpecification(WildcardBackendDefinitionSpecification specification) {
    this.specification = specification;
    if (specification != null) {
      this.unparsed |= specification.unparsed;
    }
  }

  public WildcardBackendDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public WildcardBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public WildcardBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public WildcardBackendDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return titleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public WildcardBackendDefinition type(WildcardBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WildcardBackendDefinitionType getType() {
    return type;
  }

  public void setType(WildcardBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this WildcardBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WildcardBackendDefinition wildcardBackendDefinition = (WildcardBackendDefinition) o;
    return Objects.equals(this.customLinks, wildcardBackendDefinition.customLinks)
        && Objects.equals(this.description, wildcardBackendDefinition.description)
        && Objects.equals(this.notes, wildcardBackendDefinition.notes)
        && Objects.equals(this.requests, wildcardBackendDefinition.requests)
        && Objects.equals(this.specification, wildcardBackendDefinition.specification)
        && Objects.equals(this.time, wildcardBackendDefinition.time)
        && Objects.equals(this.title, wildcardBackendDefinition.title)
        && Objects.equals(this.titleAlign, wildcardBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, wildcardBackendDefinition.titleSize)
        && Objects.equals(this.type, wildcardBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        description,
        notes,
        requests,
        specification,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WildcardBackendDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append('}');
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
