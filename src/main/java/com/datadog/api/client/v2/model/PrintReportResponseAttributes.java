/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The configuration and download URL for the initiated print-only report. */
@JsonPropertyOrder({
  PrintReportResponseAttributes.JSON_PROPERTY_DOWNLOAD_URL,
  PrintReportResponseAttributes.JSON_PROPERTY_FROM_TS,
  PrintReportResponseAttributes.JSON_PROPERTY_RESOURCE_ID,
  PrintReportResponseAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  PrintReportResponseAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  PrintReportResponseAttributes.JSON_PROPERTY_TIMEFRAME,
  PrintReportResponseAttributes.JSON_PROPERTY_TIMEZONE,
  PrintReportResponseAttributes.JSON_PROPERTY_TO_TS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PrintReportResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOWNLOAD_URL = "download_url";
  private String downloadUrl;

  public static final String JSON_PROPERTY_FROM_TS = "from_ts";
  private Long fromTs;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private ReportScheduleResourceType resourceType;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<ReportScheduleTemplateVariable> templateVariables = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TO_TS = "to_ts";
  private Long toTs;

  public PrintReportResponseAttributes() {}

  @JsonCreator
  public PrintReportResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DOWNLOAD_URL) String downloadUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM_TS) Long fromTs,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE)
          ReportScheduleResourceType resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE_VARIABLES)
          List<ReportScheduleTemplateVariable> templateVariables,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO_TS) Long toTs) {
    this.downloadUrl = downloadUrl;
    this.fromTs = fromTs;
    this.resourceId = resourceId;
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    this.templateVariables = templateVariables;
    for (ReportScheduleTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    this.timezone = timezone;
    this.toTs = toTs;
  }

  public PrintReportResponseAttributes downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * The URL from which the rendered PDF report can be downloaded.
   *
   * @return downloadUrl
   */
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public PrintReportResponseAttributes fromTs(Long fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * The start of the rendered time range, as a Unix timestamp in milliseconds.
   *
   * @return fromTs
   */
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFromTs() {
    return fromTs;
  }

  public void setFromTs(Long fromTs) {
    this.fromTs = fromTs;
  }

  public PrintReportResponseAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the dashboard or integration dashboard.
   *
   * @return resourceId
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public PrintReportResponseAttributes resourceType(ReportScheduleResourceType resourceType) {
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    return this;
  }

  /**
   * The type of dashboard resource the report schedule targets.
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportScheduleResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ReportScheduleResourceType resourceType) {
    if (!resourceType.isValid()) {
      this.unparsed = true;
    }
    this.resourceType = resourceType;
  }

  public PrintReportResponseAttributes templateVariables(
      List<ReportScheduleTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    for (ReportScheduleTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PrintReportResponseAttributes addTemplateVariablesItem(
      ReportScheduleTemplateVariable templateVariablesItem) {
    this.templateVariables.add(templateVariablesItem);
    this.unparsed |= templateVariablesItem.unparsed;
    return this;
  }

  /**
   * The dashboard template variables applied when rendering the report.
   *
   * @return templateVariables
   */
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ReportScheduleTemplateVariable> getTemplateVariables() {
    return templateVariables;
  }

  public void setTemplateVariables(List<ReportScheduleTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    if (templateVariables != null) {
      for (ReportScheduleTemplateVariable item : templateVariables) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public PrintReportResponseAttributes timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

  /**
   * The relative time window used, if one was specified in the request.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  public PrintReportResponseAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The IANA time zone identifier used when rendering the report.
   *
   * @return timezone
   */
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public PrintReportResponseAttributes toTs(Long toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * The end of the rendered time range, as a Unix timestamp in milliseconds.
   *
   * @return toTs
   */
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getToTs() {
    return toTs;
  }

  public void setToTs(Long toTs) {
    this.toTs = toTs;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return PrintReportResponseAttributes
   */
  @JsonAnySetter
  public PrintReportResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PrintReportResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrintReportResponseAttributes printReportResponseAttributes = (PrintReportResponseAttributes) o;
    return Objects.equals(this.downloadUrl, printReportResponseAttributes.downloadUrl)
        && Objects.equals(this.fromTs, printReportResponseAttributes.fromTs)
        && Objects.equals(this.resourceId, printReportResponseAttributes.resourceId)
        && Objects.equals(this.resourceType, printReportResponseAttributes.resourceType)
        && Objects.equals(this.templateVariables, printReportResponseAttributes.templateVariables)
        && Objects.equals(this.timeframe, printReportResponseAttributes.timeframe)
        && Objects.equals(this.timezone, printReportResponseAttributes.timezone)
        && Objects.equals(this.toTs, printReportResponseAttributes.toTs)
        && Objects.equals(
            this.additionalProperties, printReportResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        downloadUrl,
        fromTs,
        resourceId,
        resourceType,
        templateVariables,
        timeframe,
        timezone,
        toTs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrintReportResponseAttributes {\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
