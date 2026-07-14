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

/**
 * The configuration for a print-only report. Specify exactly one of <code>timeframe</code> (for a
 * relative time window) or both <code>from_ts</code> and <code>to_ts</code> (for an absolute time
 * range).
 */
@JsonPropertyOrder({
  PrintReportRequestAttributes.JSON_PROPERTY_FROM_TS,
  PrintReportRequestAttributes.JSON_PROPERTY_RESOURCE_ID,
  PrintReportRequestAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  PrintReportRequestAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  PrintReportRequestAttributes.JSON_PROPERTY_TIMEFRAME,
  PrintReportRequestAttributes.JSON_PROPERTY_TIMEZONE,
  PrintReportRequestAttributes.JSON_PROPERTY_TO_TS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PrintReportRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
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

  public PrintReportRequestAttributes() {}

  @JsonCreator
  public PrintReportRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE)
          ReportScheduleResourceType resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE_VARIABLES)
          List<ReportScheduleTemplateVariable> templateVariables,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone) {
    this.resourceId = resourceId;
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    this.templateVariables = templateVariables;
    this.timezone = timezone;
  }

  public PrintReportRequestAttributes fromTs(Long fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * The start of an absolute time range, as a Unix timestamp in milliseconds. Required when <code>
   * timeframe</code> is omitted.
   *
   * @return fromTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFromTs() {
    return fromTs;
  }

  public void setFromTs(Long fromTs) {
    this.fromTs = fromTs;
  }

  public PrintReportRequestAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the dashboard or integration dashboard to render.
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

  public PrintReportRequestAttributes resourceType(ReportScheduleResourceType resourceType) {
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

  public PrintReportRequestAttributes templateVariables(
      List<ReportScheduleTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    for (ReportScheduleTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PrintReportRequestAttributes addTemplateVariablesItem(
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
  }

  public PrintReportRequestAttributes timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

  /**
   * A relative time window (for example <code>1w</code> or <code>calendar_month</code>). Mutually
   * exclusive with <code>from_ts</code> and <code>to_ts</code>.
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

  public PrintReportRequestAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The IANA time zone identifier used to evaluate the time window.
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

  public PrintReportRequestAttributes toTs(Long toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * The end of an absolute time range, as a Unix timestamp in milliseconds. Required when <code>
   * timeframe</code> is omitted.
   *
   * @return toTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return PrintReportRequestAttributes
   */
  @JsonAnySetter
  public PrintReportRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PrintReportRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrintReportRequestAttributes printReportRequestAttributes = (PrintReportRequestAttributes) o;
    return Objects.equals(this.fromTs, printReportRequestAttributes.fromTs)
        && Objects.equals(this.resourceId, printReportRequestAttributes.resourceId)
        && Objects.equals(this.resourceType, printReportRequestAttributes.resourceType)
        && Objects.equals(this.templateVariables, printReportRequestAttributes.templateVariables)
        && Objects.equals(this.timeframe, printReportRequestAttributes.timeframe)
        && Objects.equals(this.timezone, printReportRequestAttributes.timezone)
        && Objects.equals(this.toTs, printReportRequestAttributes.toTs)
        && Objects.equals(
            this.additionalProperties, printReportRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
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
    sb.append("class PrintReportRequestAttributes {\n");
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
