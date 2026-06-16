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
import java.util.UUID;

/** The configuration of the report schedule to create. */
@JsonPropertyOrder({
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_DELIVERY_FORMAT,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_RECIPIENTS,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_RESOURCE_ID,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_RRULE,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_TAB_ID,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_TIMEFRAME,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_TIMEZONE,
  ReportScheduleCreateRequestAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReportScheduleCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELIVERY_FORMAT = "delivery_format";
  private ReportScheduleDeliveryFormat deliveryFormat;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private List<String> recipients = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private ReportScheduleResourceType resourceType;

  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_TAB_ID = "tab_id";
  private UUID tabId;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<ReportScheduleTemplateVariable> templateVariables = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ReportScheduleCreateRequestAttributes() {}

  @JsonCreator
  public ReportScheduleCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECIPIENTS) List<String> recipients,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE)
          ReportScheduleResourceType resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RRULE) String rrule,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE_VARIABLES)
          List<ReportScheduleTemplateVariable> templateVariables,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEFRAME) String timeframe,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.description = description;
    this.recipients = recipients;
    this.resourceId = resourceId;
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    this.rrule = rrule;
    this.templateVariables = templateVariables;
    this.timeframe = timeframe;
    this.timezone = timezone;
    this.title = title;
  }

  public ReportScheduleCreateRequestAttributes deliveryFormat(
      ReportScheduleDeliveryFormat deliveryFormat) {
    this.deliveryFormat = deliveryFormat;
    this.unparsed |= !deliveryFormat.isValid();
    return this;
  }

  /**
   * How a PDF-export report is delivered. <code>pdf</code> attaches a PDF file, <code>png</code>
   * embeds an inline PNG image, and <code>pdf_and_png</code> delivers both.
   *
   * @return deliveryFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReportScheduleDeliveryFormat getDeliveryFormat() {
    return deliveryFormat;
  }

  public void setDeliveryFormat(ReportScheduleDeliveryFormat deliveryFormat) {
    if (!deliveryFormat.isValid()) {
      this.unparsed = true;
    }
    this.deliveryFormat = deliveryFormat;
  }

  public ReportScheduleCreateRequestAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the report, up to 4096 characters.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReportScheduleCreateRequestAttributes recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public ReportScheduleCreateRequestAttributes addRecipientsItem(String recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * The recipients of the report. Each entry is an email address, a Slack channel reference in the
   * form <code>slack:{team_id}.{channel_id}.{channel_name}</code>, or a Microsoft Teams channel
   * reference in the form <code>teams:{tenant_id}|{team_id}|{channel_id}</code>.
   *
   * @return recipients
   */
  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  public ReportScheduleCreateRequestAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the dashboard or integration dashboard to render in the report.
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

  public ReportScheduleCreateRequestAttributes resourceType(
      ReportScheduleResourceType resourceType) {
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

  public ReportScheduleCreateRequestAttributes rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

  /**
   * The recurrence rule for the schedule, expressed as an iCalendar <code>RRULE</code> string.
   *
   * @return rrule
   */
  @JsonProperty(JSON_PROPERTY_RRULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  public ReportScheduleCreateRequestAttributes tabId(UUID tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The identifier of the dashboard tab to render, when the dashboard has tabs.
   *
   * @return tabId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getTabId() {
    return tabId;
  }

  public void setTabId(UUID tabId) {
    this.tabId = tabId;
  }

  public ReportScheduleCreateRequestAttributes templateVariables(
      List<ReportScheduleTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    for (ReportScheduleTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ReportScheduleCreateRequestAttributes addTemplateVariablesItem(
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

  public ReportScheduleCreateRequestAttributes timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

  /**
   * The relative timeframe of data to include in the report.
   *
   * @return timeframe
   */
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  public ReportScheduleCreateRequestAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The IANA time zone identifier the recurrence rule is evaluated in.
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

  public ReportScheduleCreateRequestAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the report, between 1 and 78 characters.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return ReportScheduleCreateRequestAttributes
   */
  @JsonAnySetter
  public ReportScheduleCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReportScheduleCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportScheduleCreateRequestAttributes reportScheduleCreateRequestAttributes =
        (ReportScheduleCreateRequestAttributes) o;
    return Objects.equals(this.deliveryFormat, reportScheduleCreateRequestAttributes.deliveryFormat)
        && Objects.equals(this.description, reportScheduleCreateRequestAttributes.description)
        && Objects.equals(this.recipients, reportScheduleCreateRequestAttributes.recipients)
        && Objects.equals(this.resourceId, reportScheduleCreateRequestAttributes.resourceId)
        && Objects.equals(this.resourceType, reportScheduleCreateRequestAttributes.resourceType)
        && Objects.equals(this.rrule, reportScheduleCreateRequestAttributes.rrule)
        && Objects.equals(this.tabId, reportScheduleCreateRequestAttributes.tabId)
        && Objects.equals(
            this.templateVariables, reportScheduleCreateRequestAttributes.templateVariables)
        && Objects.equals(this.timeframe, reportScheduleCreateRequestAttributes.timeframe)
        && Objects.equals(this.timezone, reportScheduleCreateRequestAttributes.timezone)
        && Objects.equals(this.title, reportScheduleCreateRequestAttributes.title)
        && Objects.equals(
            this.additionalProperties, reportScheduleCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deliveryFormat,
        description,
        recipients,
        resourceId,
        resourceType,
        rrule,
        tabId,
        templateVariables,
        timeframe,
        timezone,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportScheduleCreateRequestAttributes {\n");
    sb.append("    deliveryFormat: ").append(toIndentedString(deliveryFormat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
