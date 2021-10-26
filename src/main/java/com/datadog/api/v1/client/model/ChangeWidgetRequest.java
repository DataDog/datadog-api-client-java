/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.datadog.api.v1.client.model.LogQueryDefinition;
import com.datadog.api.v1.client.model.ProcessQueryDefinition;
import com.datadog.api.v1.client.model.WidgetChangeType;
import com.datadog.api.v1.client.model.WidgetCompareTo;
import com.datadog.api.v1.client.model.WidgetOrderBy;
import com.datadog.api.v1.client.model.WidgetSort;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Updated change widget.
 */
@ApiModel(description = "Updated change widget.")
@JsonPropertyOrder(
    {
        ChangeWidgetRequest.JSON_PROPERTY_APM_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_CHANGE_TYPE,
        ChangeWidgetRequest.JSON_PROPERTY_COMPARE_TO,
        ChangeWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_INCREASE_GOOD,
        ChangeWidgetRequest.JSON_PROPERTY_LOG_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_ORDER_BY,
        ChangeWidgetRequest.JSON_PROPERTY_ORDER_DIR,
        ChangeWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_PROFILE_METRICS_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_Q,
        ChangeWidgetRequest.JSON_PROPERTY_RUM_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_SECURITY_QUERY,
        ChangeWidgetRequest.JSON_PROPERTY_SHOW_PRESENT
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChangeWidgetRequest {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
    private LogQueryDefinition apmQuery;

    public static final String JSON_PROPERTY_CHANGE_TYPE = "change_type";
    private WidgetChangeType changeType;

    public static final String JSON_PROPERTY_COMPARE_TO = "compare_to";
    private WidgetCompareTo compareTo;

    public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
    private LogQueryDefinition eventQuery;

    public static final String JSON_PROPERTY_INCREASE_GOOD = "increase_good";
    private Boolean increaseGood;

    public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
    private LogQueryDefinition logQuery;

    public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
    private LogQueryDefinition networkQuery;

    public static final String JSON_PROPERTY_ORDER_BY = "order_by";
    private WidgetOrderBy orderBy;

    public static final String JSON_PROPERTY_ORDER_DIR = "order_dir";
    private WidgetSort orderDir;

    public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
    private ProcessQueryDefinition processQuery;

    public static final String JSON_PROPERTY_PROFILE_METRICS_QUERY = "profile_metrics_query";
    private LogQueryDefinition profileMetricsQuery;

    public static final String JSON_PROPERTY_Q = "q";
    private String q;

    public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
    private LogQueryDefinition rumQuery;

    public static final String JSON_PROPERTY_SECURITY_QUERY = "security_query";
    private LogQueryDefinition securityQuery;

    public static final String JSON_PROPERTY_SHOW_PRESENT = "show_present";
    private Boolean showPresent;

    public ChangeWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
        this.apmQuery = apmQuery;
        this.unparsed |= apmQuery.unparsed;
        return this;
    }

    /**
     * Get apmQuery
     * @return apmQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APM_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogQueryDefinition getApmQuery() {
        return apmQuery;
    }

    public void setApmQuery(LogQueryDefinition apmQuery) {
        this.apmQuery = apmQuery;
    }

    public ChangeWidgetRequest changeType(WidgetChangeType changeType) {
        this.changeType = changeType;
        this.unparsed |= !changeType.isValid();
        return this;
    }

    /**
     * Get changeType
     * @return changeType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CHANGE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WidgetChangeType getChangeType() {
        return changeType;
    }

    public void setChangeType(WidgetChangeType changeType) {
        if (!changeType.isValid()) {
            this.unparsed = true;
        }
        this.changeType = changeType;
    }

    public ChangeWidgetRequest compareTo(WidgetCompareTo compareTo) {
        this.compareTo = compareTo;
        this.unparsed |= !compareTo.isValid();
        return this;
    }

    /**
     * Get compareTo
     * @return compareTo
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPARE_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WidgetCompareTo getCompareTo() {
        return compareTo;
    }

    public void setCompareTo(WidgetCompareTo compareTo) {
        if (!compareTo.isValid()) {
            this.unparsed = true;
        }
        this.compareTo = compareTo;
    }

    public ChangeWidgetRequest eventQuery(LogQueryDefinition eventQuery) {
        this.eventQuery = eventQuery;
        this.unparsed |= eventQuery.unparsed;
        return this;
    }

    /**
     * Get eventQuery
     * @return eventQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogQueryDefinition getEventQuery() {
        return eventQuery;
    }

    public void setEventQuery(LogQueryDefinition eventQuery) {
        this.eventQuery = eventQuery;
    }

    public ChangeWidgetRequest increaseGood(Boolean increaseGood) {
        this.increaseGood = increaseGood;
        return this;
    }

    /**
     * Whether to show increase as good.
     * @return increaseGood
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Whether to show increase as good.")
    @JsonProperty(JSON_PROPERTY_INCREASE_GOOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIncreaseGood() {
        return increaseGood;
    }

    public void setIncreaseGood(Boolean increaseGood) {
        this.increaseGood = increaseGood;
    }

    public ChangeWidgetRequest logQuery(LogQueryDefinition logQuery) {
        this.logQuery = logQuery;
        this.unparsed |= logQuery.unparsed;
        return this;
    }

    /**
     * Get logQuery
     * @return logQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LOG_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogQueryDefinition getLogQuery() {
        return logQuery;
    }

    public void setLogQuery(LogQueryDefinition logQuery) {
        this.logQuery = logQuery;
    }

    public ChangeWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
        this.networkQuery = networkQuery;
        this.unparsed |= networkQuery.unparsed;
        return this;
    }

    /**
     * Get networkQuery
     * @return networkQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NETWORK_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogQueryDefinition getNetworkQuery() {
        return networkQuery;
    }

    public void setNetworkQuery(LogQueryDefinition networkQuery) {
        this.networkQuery = networkQuery;
    }

    public ChangeWidgetRequest orderBy(WidgetOrderBy orderBy) {
        this.orderBy = orderBy;
        this.unparsed |= !orderBy.isValid();
        return this;
    }

    /**
     * Get orderBy
     * @return orderBy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ORDER_BY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WidgetOrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(WidgetOrderBy orderBy) {
        if (!orderBy.isValid()) {
            this.unparsed = true;
        }
        this.orderBy = orderBy;
    }

    public ChangeWidgetRequest orderDir(WidgetSort orderDir) {
        this.orderDir = orderDir;
        this.unparsed |= !orderDir.isValid();
        return this;
    }

    /**
     * Get orderDir
     * @return orderDir
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ORDER_DIR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WidgetSort getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(WidgetSort orderDir) {
        if (!orderDir.isValid()) {
            this.unparsed = true;
        }
        this.orderDir = orderDir;
    }

    public ChangeWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
        this.processQuery = processQuery;
        this.unparsed |= processQuery.unparsed;
        return this;
    }

    /**
     * Get processQuery
     * @return processQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ProcessQueryDefinition getProcessQuery() {
        return processQuery;
    }

    public void setProcessQuery(ProcessQueryDefinition processQuery) {
        this.processQuery = processQuery;
    }

    public ChangeWidgetRequest profileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
        this.profileMetricsQuery = profileMetricsQuery;
        this.unparsed |= profileMetricsQuery.unparsed;
        return this;
    }

    /**
     * Get profileMetricsQuery
     * @return profileMetricsQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PROFILE_METRICS_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogQueryDefinition getProfileMetricsQuery() {
        return profileMetricsQuery;
    }

    public void setProfileMetricsQuery(LogQueryDefinition profileMetricsQuery) {
        this.profileMetricsQuery = profileMetricsQuery;
    }

    public ChangeWidgetRequest q(String q) {
        this.q = q;
        return this;
    }

    /**
     * Query definition.
     * @return q
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Query definition.")
    @JsonProperty(JSON_PROPERTY_Q)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public ChangeWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
        this.rumQuery = rumQuery;
        this.unparsed |= rumQuery.unparsed;
        return this;
    }

    /**
     * Get rumQuery
     * @return rumQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RUM_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogQueryDefinition getRumQuery() {
        return rumQuery;
    }

    public void setRumQuery(LogQueryDefinition rumQuery) {
        this.rumQuery = rumQuery;
    }

    public ChangeWidgetRequest securityQuery(LogQueryDefinition securityQuery) {
        this.securityQuery = securityQuery;
        this.unparsed |= securityQuery.unparsed;
        return this;
    }

    /**
     * Get securityQuery
     * @return securityQuery
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SECURITY_QUERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LogQueryDefinition getSecurityQuery() {
        return securityQuery;
    }

    public void setSecurityQuery(LogQueryDefinition securityQuery) {
        this.securityQuery = securityQuery;
    }

    public ChangeWidgetRequest showPresent(Boolean showPresent) {
        this.showPresent = showPresent;
        return this;
    }

    /**
     * Whether to show the present value.
     * @return showPresent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Whether to show the present value.")
    @JsonProperty(JSON_PROPERTY_SHOW_PRESENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getShowPresent() {
        return showPresent;
    }

    public void setShowPresent(Boolean showPresent) {
        this.showPresent = showPresent;
    }

    /**
     * Return true if this ChangeWidgetRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeWidgetRequest changeWidgetRequest = (ChangeWidgetRequest) o;
        return (
            Objects.equals(this.apmQuery, changeWidgetRequest.apmQuery) &&
            Objects.equals(this.changeType, changeWidgetRequest.changeType) &&
            Objects.equals(this.compareTo, changeWidgetRequest.compareTo) &&
            Objects.equals(this.eventQuery, changeWidgetRequest.eventQuery) &&
            Objects.equals(this.increaseGood, changeWidgetRequest.increaseGood) &&
            Objects.equals(this.logQuery, changeWidgetRequest.logQuery) &&
            Objects.equals(this.networkQuery, changeWidgetRequest.networkQuery) &&
            Objects.equals(this.orderBy, changeWidgetRequest.orderBy) &&
            Objects.equals(this.orderDir, changeWidgetRequest.orderDir) &&
            Objects.equals(this.processQuery, changeWidgetRequest.processQuery) &&
            Objects.equals(this.profileMetricsQuery, changeWidgetRequest.profileMetricsQuery) &&
            Objects.equals(this.q, changeWidgetRequest.q) &&
            Objects.equals(this.rumQuery, changeWidgetRequest.rumQuery) &&
            Objects.equals(this.securityQuery, changeWidgetRequest.securityQuery) &&
            Objects.equals(this.showPresent, changeWidgetRequest.showPresent)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            apmQuery,
            changeType,
            compareTo,
            eventQuery,
            increaseGood,
            logQuery,
            networkQuery,
            orderBy,
            orderDir,
            processQuery,
            profileMetricsQuery,
            q,
            rumQuery,
            securityQuery,
            showPresent
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeWidgetRequest {\n");
        sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    compareTo: ").append(toIndentedString(compareTo)).append("\n");
        sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
        sb.append("    increaseGood: ").append(toIndentedString(increaseGood)).append("\n");
        sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
        sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    orderDir: ").append(toIndentedString(orderDir)).append("\n");
        sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
        sb.append("    profileMetricsQuery: ").append(toIndentedString(profileMetricsQuery)).append("\n");
        sb.append("    q: ").append(toIndentedString(q)).append("\n");
        sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
        sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
        sb.append("    showPresent: ").append(toIndentedString(showPresent)).append("\n");
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
