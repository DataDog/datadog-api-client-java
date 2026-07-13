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
import org.openapitools.jackson.nullable.JsonNullable;

/** The configuration and derived state of a report schedule in a list response. */
@JsonPropertyOrder({
  ReportScheduleListResponseAttributes.JSON_PROPERTY_DELIVERY_FORMAT,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_NEXT_RECURRENCE,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_RECIPIENTS,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_RESOURCE_ID,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_RRULE,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_STATUS,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_TIMEFRAME,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_TIMEZONE,
  ReportScheduleListResponseAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReportScheduleListResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELIVERY_FORMAT = "delivery_format";
  private JsonNullable<ReportScheduleResponseAttributesDeliveryFormat> deliveryFormat =
      JsonNullable.<ReportScheduleResponseAttributesDeliveryFormat>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NEXT_RECURRENCE = "next_recurrence";
  private Long nextRecurrence;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private List<String> recipients = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private ReportScheduleResourceType resourceType;

  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ReportScheduleStatus status;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<ReportScheduleTemplateVariable> templateVariables = new ArrayList<>();

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ReportScheduleListResponseAttributes() {}

  @JsonCreator
  public ReportScheduleListResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT_RECURRENCE) Long nextRecurrence,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECIPIENTS) List<String> recipients,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ID) String resourceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE)
          ReportScheduleResourceType resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RRULE) String rrule,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) ReportScheduleStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE_VARIABLES)
          List<ReportScheduleTemplateVariable> templateVariables,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEFRAME) String timeframe,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMEZONE) String timezone,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.description = description;
    this.nextRecurrence = nextRecurrence;
    if (nextRecurrence != null) {}
    this.recipients = recipients;
    this.resourceId = resourceId;
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    this.rrule = rrule;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.templateVariables = templateVariables;
    for (ReportScheduleTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    this.timeframe = timeframe;
    if (timeframe != null) {}
    this.timezone = timezone;
    this.title = title;
  }

  public ReportScheduleListResponseAttributes deliveryFormat(
      ReportScheduleResponseAttributesDeliveryFormat deliveryFormat) {
    this.deliveryFormat =
        JsonNullable.<ReportScheduleResponseAttributesDeliveryFormat>of(deliveryFormat);
    return this;
  }

  /**
   * The delivery format for dashboard report schedules, or <code>null</code> if not set.
   *
   * @return deliveryFormat
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ReportScheduleResponseAttributesDeliveryFormat getDeliveryFormat() {
    return deliveryFormat.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELIVERY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ReportScheduleResponseAttributesDeliveryFormat>
      getDeliveryFormat_JsonNullable() {
    return deliveryFormat;
  }

  @JsonProperty(JSON_PROPERTY_DELIVERY_FORMAT)
  public void setDeliveryFormat_JsonNullable(
      JsonNullable<ReportScheduleResponseAttributesDeliveryFormat> deliveryFormat) {
    this.deliveryFormat = deliveryFormat;
  }

  public void setDeliveryFormat(ReportScheduleResponseAttributesDeliveryFormat deliveryFormat) {
    if (!deliveryFormat.isValid()) {
      this.unparsed = true;
    }
    this.deliveryFormat =
        JsonNullable.<ReportScheduleResponseAttributesDeliveryFormat>of(deliveryFormat);
  }

  public ReportScheduleListResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the report.
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

  public ReportScheduleListResponseAttributes nextRecurrence(Long nextRecurrence) {
    this.nextRecurrence = nextRecurrence;
    if (nextRecurrence != null) {}
    return this;
  }

  /**
   * The Unix timestamp, in milliseconds, of the next scheduled delivery, or <code>null</code> if
   * none is scheduled.
   *
   * @return nextRecurrence
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_RECURRENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNextRecurrence() {
    return nextRecurrence;
  }

  public void setNextRecurrence(Long nextRecurrence) {
    this.nextRecurrence = nextRecurrence;
  }

  public ReportScheduleListResponseAttributes recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public ReportScheduleListResponseAttributes addRecipientsItem(String recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * The recipients of the report (email addresses, Slack channel references, or Microsoft Teams
   * channel references).
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

  public ReportScheduleListResponseAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The identifier of the resource rendered in the report.
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

  public ReportScheduleListResponseAttributes resourceType(
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

  public ReportScheduleListResponseAttributes rrule(String rrule) {
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

  public ReportScheduleListResponseAttributes status(ReportScheduleStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Whether the schedule is currently delivering reports (<code>active</code>) or paused (<code>
   * inactive</code>).
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportScheduleStatus getStatus() {
    return status;
  }

  public void setStatus(ReportScheduleStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ReportScheduleListResponseAttributes templateVariables(
      List<ReportScheduleTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    for (ReportScheduleTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ReportScheduleListResponseAttributes addTemplateVariablesItem(
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

  public ReportScheduleListResponseAttributes timeframe(String timeframe) {
    this.timeframe = timeframe;
    if (timeframe != null) {}
    return this;
  }

  /**
   * The relative timeframe of data included in the report, or <code>null</code> if not set.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  public ReportScheduleListResponseAttributes timezone(String timezone) {
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

  public ReportScheduleListResponseAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the report.
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
   * @return ReportScheduleListResponseAttributes
   */
  @JsonAnySetter
  public ReportScheduleListResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReportScheduleListResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportScheduleListResponseAttributes reportScheduleListResponseAttributes =
        (ReportScheduleListResponseAttributes) o;
    return Objects.equals(this.deliveryFormat, reportScheduleListResponseAttributes.deliveryFormat)
        && Objects.equals(this.description, reportScheduleListResponseAttributes.description)
        && Objects.equals(this.nextRecurrence, reportScheduleListResponseAttributes.nextRecurrence)
        && Objects.equals(this.recipients, reportScheduleListResponseAttributes.recipients)
        && Objects.equals(this.resourceId, reportScheduleListResponseAttributes.resourceId)
        && Objects.equals(this.resourceType, reportScheduleListResponseAttributes.resourceType)
        && Objects.equals(this.rrule, reportScheduleListResponseAttributes.rrule)
        && Objects.equals(this.status, reportScheduleListResponseAttributes.status)
        && Objects.equals(
            this.templateVariables, reportScheduleListResponseAttributes.templateVariables)
        && Objects.equals(this.timeframe, reportScheduleListResponseAttributes.timeframe)
        && Objects.equals(this.timezone, reportScheduleListResponseAttributes.timezone)
        && Objects.equals(this.title, reportScheduleListResponseAttributes.title)
        && Objects.equals(
            this.additionalProperties, reportScheduleListResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deliveryFormat,
        description,
        nextRecurrence,
        recipients,
        resourceId,
        resourceType,
        rrule,
        status,
        templateVariables,
        timeframe,
        timezone,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportScheduleListResponseAttributes {\n");
    sb.append("    deliveryFormat: ").append(toIndentedString(deliveryFormat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nextRecurrence: ").append(toIndentedString(nextRecurrence)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
