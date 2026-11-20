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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ServiceSummaryBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_DISPLAY_FORMAT,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_ENV,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_NOTES,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SERVICE,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SHOW_BREAKDOWN,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SHOW_DISTRIBUTION,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SHOW_ERRORS,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SHOW_HITS,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SHOW_LATENCY,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SHOW_RESOURCE_LIST,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SIZE_FORMAT,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_SPAN_NAME,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_TIME,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_TITLE,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  ServiceSummaryBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceSummaryBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_FORMAT = "display_format";
  private ServiceSummaryLayout displayFormat;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SHOW_BREAKDOWN = "show_breakdown";
  private Boolean showBreakdown;

  public static final String JSON_PROPERTY_SHOW_DISTRIBUTION = "show_distribution";
  private Boolean showDistribution;

  public static final String JSON_PROPERTY_SHOW_ERRORS = "show_errors";
  private Boolean showErrors;

  public static final String JSON_PROPERTY_SHOW_HITS = "show_hits";
  private Boolean showHits;

  public static final String JSON_PROPERTY_SHOW_LATENCY = "show_latency";
  private Boolean showLatency;

  public static final String JSON_PROPERTY_SHOW_RESOURCE_LIST = "show_resource_list";
  private Boolean showResourceList;

  public static final String JSON_PROPERTY_SIZE_FORMAT = "size_format";
  private ServiceSummarySize sizeFormat;

  public static final String JSON_PROPERTY_SPAN_NAME = "span_name";
  private String spanName;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceSummaryBackendDefinitionType type;

  public ServiceSummaryBackendDefinition() {}

  @JsonCreator
  public ServiceSummaryBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_SPAN_NAME) String spanName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ServiceSummaryBackendDefinitionType type) {
    this.env = env;
    this.service = service;
    this.spanName = spanName;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ServiceSummaryBackendDefinition description(String description) {
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

  public ServiceSummaryBackendDefinition displayFormat(ServiceSummaryLayout displayFormat) {
    this.displayFormat = displayFormat;
    this.unparsed |= !displayFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return displayFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceSummaryLayout getDisplayFormat() {
    return displayFormat;
  }

  public void setDisplayFormat(ServiceSummaryLayout displayFormat) {
    if (!displayFormat.isValid()) {
      this.unparsed = true;
    }
    this.displayFormat = displayFormat;
  }

  public ServiceSummaryBackendDefinition env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return env
   */
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public ServiceSummaryBackendDefinition notes(String notes) {
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

  public ServiceSummaryBackendDefinition service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public ServiceSummaryBackendDefinition showBreakdown(Boolean showBreakdown) {
    this.showBreakdown = showBreakdown;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showBreakdown
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowBreakdown() {
    return showBreakdown;
  }

  public void setShowBreakdown(Boolean showBreakdown) {
    this.showBreakdown = showBreakdown;
  }

  public ServiceSummaryBackendDefinition showDistribution(Boolean showDistribution) {
    this.showDistribution = showDistribution;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showDistribution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowDistribution() {
    return showDistribution;
  }

  public void setShowDistribution(Boolean showDistribution) {
    this.showDistribution = showDistribution;
  }

  public ServiceSummaryBackendDefinition showErrors(Boolean showErrors) {
    this.showErrors = showErrors;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showErrors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowErrors() {
    return showErrors;
  }

  public void setShowErrors(Boolean showErrors) {
    this.showErrors = showErrors;
  }

  public ServiceSummaryBackendDefinition showHits(Boolean showHits) {
    this.showHits = showHits;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showHits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowHits() {
    return showHits;
  }

  public void setShowHits(Boolean showHits) {
    this.showHits = showHits;
  }

  public ServiceSummaryBackendDefinition showLatency(Boolean showLatency) {
    this.showLatency = showLatency;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showLatency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLatency() {
    return showLatency;
  }

  public void setShowLatency(Boolean showLatency) {
    this.showLatency = showLatency;
  }

  public ServiceSummaryBackendDefinition showResourceList(Boolean showResourceList) {
    this.showResourceList = showResourceList;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showResourceList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_RESOURCE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowResourceList() {
    return showResourceList;
  }

  public void setShowResourceList(Boolean showResourceList) {
    this.showResourceList = showResourceList;
  }

  public ServiceSummaryBackendDefinition sizeFormat(ServiceSummarySize sizeFormat) {
    this.sizeFormat = sizeFormat;
    this.unparsed |= !sizeFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sizeFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceSummarySize getSizeFormat() {
    return sizeFormat;
  }

  public void setSizeFormat(ServiceSummarySize sizeFormat) {
    if (!sizeFormat.isValid()) {
      this.unparsed = true;
    }
    this.sizeFormat = sizeFormat;
  }

  public ServiceSummaryBackendDefinition spanName(String spanName) {
    this.spanName = spanName;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return spanName
   */
  @JsonProperty(JSON_PROPERTY_SPAN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSpanName() {
    return spanName;
  }

  public void setSpanName(String spanName) {
    this.spanName = spanName;
  }

  public ServiceSummaryBackendDefinition time(WidgetTime time) {
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

  public ServiceSummaryBackendDefinition title(String title) {
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

  public ServiceSummaryBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public ServiceSummaryBackendDefinition titleSize(String titleSize) {
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

  public ServiceSummaryBackendDefinition type(ServiceSummaryBackendDefinitionType type) {
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
  public ServiceSummaryBackendDefinitionType getType() {
    return type;
  }

  public void setType(ServiceSummaryBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ServiceSummaryBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSummaryBackendDefinition serviceSummaryBackendDefinition =
        (ServiceSummaryBackendDefinition) o;
    return Objects.equals(this.description, serviceSummaryBackendDefinition.description)
        && Objects.equals(this.displayFormat, serviceSummaryBackendDefinition.displayFormat)
        && Objects.equals(this.env, serviceSummaryBackendDefinition.env)
        && Objects.equals(this.notes, serviceSummaryBackendDefinition.notes)
        && Objects.equals(this.service, serviceSummaryBackendDefinition.service)
        && Objects.equals(this.showBreakdown, serviceSummaryBackendDefinition.showBreakdown)
        && Objects.equals(this.showDistribution, serviceSummaryBackendDefinition.showDistribution)
        && Objects.equals(this.showErrors, serviceSummaryBackendDefinition.showErrors)
        && Objects.equals(this.showHits, serviceSummaryBackendDefinition.showHits)
        && Objects.equals(this.showLatency, serviceSummaryBackendDefinition.showLatency)
        && Objects.equals(this.showResourceList, serviceSummaryBackendDefinition.showResourceList)
        && Objects.equals(this.sizeFormat, serviceSummaryBackendDefinition.sizeFormat)
        && Objects.equals(this.spanName, serviceSummaryBackendDefinition.spanName)
        && Objects.equals(this.time, serviceSummaryBackendDefinition.time)
        && Objects.equals(this.title, serviceSummaryBackendDefinition.title)
        && Objects.equals(this.titleAlign, serviceSummaryBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, serviceSummaryBackendDefinition.titleSize)
        && Objects.equals(this.type, serviceSummaryBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        displayFormat,
        env,
        notes,
        service,
        showBreakdown,
        showDistribution,
        showErrors,
        showHits,
        showLatency,
        showResourceList,
        sizeFormat,
        spanName,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSummaryBackendDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayFormat: ").append(toIndentedString(displayFormat)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    showBreakdown: ").append(toIndentedString(showBreakdown)).append("\n");
    sb.append("    showDistribution: ").append(toIndentedString(showDistribution)).append("\n");
    sb.append("    showErrors: ").append(toIndentedString(showErrors)).append("\n");
    sb.append("    showHits: ").append(toIndentedString(showHits)).append("\n");
    sb.append("    showLatency: ").append(toIndentedString(showLatency)).append("\n");
    sb.append("    showResourceList: ").append(toIndentedString(showResourceList)).append("\n");
    sb.append("    sizeFormat: ").append(toIndentedString(sizeFormat)).append("\n");
    sb.append("    spanName: ").append(toIndentedString(spanName)).append("\n");
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
