/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JSON;
import com.datadog.api.v2.client.model.IncidentFieldAttributes;
import com.datadog.api.v2.client.model.IncidentNotificationHandle;
import com.datadog.api.v2.client.model.IncidentTimelineCellCreateAttributes;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;

/**
 * The incident&#39;s attributes for a create request.
 */
@ApiModel(description = "The incident's attributes for a create request.")
@JsonPropertyOrder(
    {
        IncidentCreateAttributes.JSON_PROPERTY_CUSTOMER_IMPACTED,
        IncidentCreateAttributes.JSON_PROPERTY_FIELDS,
        IncidentCreateAttributes.JSON_PROPERTY_INITIAL_CELLS,
        IncidentCreateAttributes.JSON_PROPERTY_NOTIFICATION_HANDLES,
        IncidentCreateAttributes.JSON_PROPERTY_TITLE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentCreateAttributes {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_CUSTOMER_IMPACTED = "customer_impacted";
    private Boolean customerImpacted;

    public static final String JSON_PROPERTY_FIELDS = "fields";
    private Map<String, IncidentFieldAttributes> fields = null;

    public static final String JSON_PROPERTY_INITIAL_CELLS = "initial_cells";
    private List<IncidentTimelineCellCreateAttributes> initialCells = null;

    public static final String JSON_PROPERTY_NOTIFICATION_HANDLES = "notification_handles";
    private List<IncidentNotificationHandle> notificationHandles = null;

    public static final String JSON_PROPERTY_TITLE = "title";
    private String title;

    public IncidentCreateAttributes() {}

    @JsonCreator
    public IncidentCreateAttributes(
        @JsonProperty(required = true, value = JSON_PROPERTY_CUSTOMER_IMPACTED) Boolean customerImpacted,
        @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title
    ) {
        this.customerImpacted = customerImpacted;
        this.title = title;
    }

    public IncidentCreateAttributes customerImpacted(Boolean customerImpacted) {
        this.customerImpacted = customerImpacted;
        return this;
    }

    /**
     * A flag indicating whether the incident caused customer impact.
     * @return customerImpacted
     **/
    @ApiModelProperty(example = "false", required = true, value = "A flag indicating whether the incident caused customer impact.")
    @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACTED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getCustomerImpacted() {
        return customerImpacted;
    }

    public void setCustomerImpacted(Boolean customerImpacted) {
        this.customerImpacted = customerImpacted;
    }

    public IncidentCreateAttributes fields(Map<String, IncidentFieldAttributes> fields) {
        this.fields = fields;
        return this;
    }

    public IncidentCreateAttributes putFieldsItem(String key, IncidentFieldAttributes fieldsItem) {
        if (this.fields == null) {
            this.fields = new HashMap<>();
        }
        this.fields.put(key, fieldsItem);
        return this;
    }

    /**
     * A condensed view of the user-defined fields for which to create initial selections.
     * @return fields
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "{\"severity\":{\"type\":\"dropdown\",\"value\":\"SEV-5\"}}",
        value = "A condensed view of the user-defined fields for which to create initial selections."
    )
    @JsonProperty(JSON_PROPERTY_FIELDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, IncidentFieldAttributes> getFields() {
        return fields;
    }

    public void setFields(Map<String, IncidentFieldAttributes> fields) {
        this.fields = fields;
    }

    public IncidentCreateAttributes initialCells(List<IncidentTimelineCellCreateAttributes> initialCells) {
        this.initialCells = initialCells;
        for (IncidentTimelineCellCreateAttributes item : initialCells) {
            this.unparsed |= item.unparsed;
        }
        return this;
    }

    public IncidentCreateAttributes addInitialCellsItem(IncidentTimelineCellCreateAttributes initialCellsItem) {
        if (this.initialCells == null) {
            this.initialCells = new ArrayList<>();
        }
        this.initialCells.add(initialCellsItem);
        this.unparsed |= initialCellsItem.unparsed;
        return this;
    }

    /**
     * An array of initial timeline cells to be placed at the beginning of the incident timeline.
     * @return initialCells
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "An array of initial timeline cells to be placed at the beginning of the incident timeline.")
    @JsonProperty(JSON_PROPERTY_INITIAL_CELLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<IncidentTimelineCellCreateAttributes> getInitialCells() {
        return initialCells;
    }

    public void setInitialCells(List<IncidentTimelineCellCreateAttributes> initialCells) {
        this.initialCells = initialCells;
    }

    public IncidentCreateAttributes notificationHandles(List<IncidentNotificationHandle> notificationHandles) {
        this.notificationHandles = notificationHandles;
        for (IncidentNotificationHandle item : notificationHandles) {
            this.unparsed |= item.unparsed;
        }
        return this;
    }

    public IncidentCreateAttributes addNotificationHandlesItem(IncidentNotificationHandle notificationHandlesItem) {
        if (this.notificationHandles == null) {
            this.notificationHandles = new ArrayList<>();
        }
        this.notificationHandles.add(notificationHandlesItem);
        this.unparsed |= notificationHandlesItem.unparsed;
        return this;
    }

    /**
     * Notification handles that will be notified of the incident at creation.
     * @return notificationHandles
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Notification handles that will be notified of the incident at creation.")
    @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<IncidentNotificationHandle> getNotificationHandles() {
        return notificationHandles;
    }

    public void setNotificationHandles(List<IncidentNotificationHandle> notificationHandles) {
        this.notificationHandles = notificationHandles;
    }

    public IncidentCreateAttributes title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the incident, which summarizes what happened.
     * @return title
     **/
    @ApiModelProperty(
        example = "A test incident title",
        required = true,
        value = "The title of the incident, which summarizes what happened."
    )
    @JsonProperty(JSON_PROPERTY_TITLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Return true if this IncidentCreateAttributes object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncidentCreateAttributes incidentCreateAttributes = (IncidentCreateAttributes) o;
        return (
            Objects.equals(this.customerImpacted, incidentCreateAttributes.customerImpacted) &&
            Objects.equals(this.fields, incidentCreateAttributes.fields) &&
            Objects.equals(this.initialCells, incidentCreateAttributes.initialCells) &&
            Objects.equals(this.notificationHandles, incidentCreateAttributes.notificationHandles) &&
            Objects.equals(this.title, incidentCreateAttributes.title)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerImpacted, fields, initialCells, notificationHandles, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentCreateAttributes {\n");
        sb.append("    customerImpacted: ").append(toIndentedString(customerImpacted)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    initialCells: ").append(toIndentedString(initialCells)).append("\n");
        sb.append("    notificationHandles: ").append(toIndentedString(notificationHandles)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("}");
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
