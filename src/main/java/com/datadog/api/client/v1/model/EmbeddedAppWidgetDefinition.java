/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The embedded app widget displays an App Builder app on a dashboard. Exactly one of <code>app_id
 * </code> or <code>template_id</code> must be provided; they cannot be provided together.
 */
@JsonPropertyOrder({
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_APP_ID,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_DESCRIPTION,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_INPUTS,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_TEMPLATE_ID,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_TIME,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_TITLE,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  EmbeddedAppWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EmbeddedAppWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APP_ID = "app_id";
  private String appId;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<EmbeddedAppWidgetInput> inputs = null;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "template_id";
  private String templateId;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EmbeddedAppWidgetDefinitionType type = EmbeddedAppWidgetDefinitionType.EMBEDDED_APP;

  public EmbeddedAppWidgetDefinition() {}

  @JsonCreator
  public EmbeddedAppWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          EmbeddedAppWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public EmbeddedAppWidgetDefinition appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * UUID of the App Builder app to embed.
   *
   * @return appId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public EmbeddedAppWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public EmbeddedAppWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * List of custom links.
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

  public EmbeddedAppWidgetDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the widget.
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

  public EmbeddedAppWidgetDefinition inputs(List<EmbeddedAppWidgetInput> inputs) {
    this.inputs = inputs;
    if (inputs != null) {
      for (EmbeddedAppWidgetInput item : inputs) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public EmbeddedAppWidgetDefinition addInputsItem(EmbeddedAppWidgetInput inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    this.unparsed |= inputsItem.unparsed;
    return this;
  }

  /**
   * Inputs passed to the embedded app.
   *
   * @return inputs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EmbeddedAppWidgetInput> getInputs() {
    return inputs;
  }

  public void setInputs(List<EmbeddedAppWidgetInput> inputs) {
    this.inputs = inputs;
    if (inputs != null) {
      for (EmbeddedAppWidgetInput item : inputs) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public EmbeddedAppWidgetDefinition templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * ID of the built-in app template to embed.
   *
   * @return templateId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public EmbeddedAppWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
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

  public EmbeddedAppWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the widget.
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

  public EmbeddedAppWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
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

  public EmbeddedAppWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
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

  public EmbeddedAppWidgetDefinition type(EmbeddedAppWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the embedded app widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EmbeddedAppWidgetDefinitionType getType() {
    return type;
  }

  public void setType(EmbeddedAppWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this EmbeddedAppWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedAppWidgetDefinition embeddedAppWidgetDefinition = (EmbeddedAppWidgetDefinition) o;
    return Objects.equals(this.appId, embeddedAppWidgetDefinition.appId)
        && Objects.equals(this.customLinks, embeddedAppWidgetDefinition.customLinks)
        && Objects.equals(this.description, embeddedAppWidgetDefinition.description)
        && Objects.equals(this.inputs, embeddedAppWidgetDefinition.inputs)
        && Objects.equals(this.templateId, embeddedAppWidgetDefinition.templateId)
        && Objects.equals(this.time, embeddedAppWidgetDefinition.time)
        && Objects.equals(this.title, embeddedAppWidgetDefinition.title)
        && Objects.equals(this.titleAlign, embeddedAppWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, embeddedAppWidgetDefinition.titleSize)
        && Objects.equals(this.type, embeddedAppWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appId,
        customLinks,
        description,
        inputs,
        templateId,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedAppWidgetDefinition {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
