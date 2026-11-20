/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  LogQueryDefinition.JSON_PROPERTY_CALCULATED_FIELDS,
  LogQueryDefinition.JSON_PROPERTY_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_GROUP_BY,
  LogQueryDefinition.JSON_PROPERTY_INDEX,
  LogQueryDefinition.JSON_PROPERTY_MULTI_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_SEARCH,
  LogQueryDefinition.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculated_fields";
  private List<EventsCalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsQueryCompute compute;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogQueryDefinitionGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_MULTI_COMPUTE = "multi_compute";
  private List<LogsQueryCompute> multiCompute = null;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private LogQueryDefinitionSearch search;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public LogQueryDefinition calculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LogQueryDefinition addCalculatedFieldsItem(EventsCalculatedField calculatedFieldsItem) {
    if (this.calculatedFields == null) {
      this.calculatedFields = new ArrayList<>();
    }
    this.calculatedFields.add(calculatedFieldsItem);
    this.unparsed |= calculatedFieldsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return calculatedFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALCULATED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsCalculatedField> getCalculatedFields() {
    return calculatedFields;
  }

  public void setCalculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LogQueryDefinition compute(LogsQueryCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsQueryCompute getCompute() {
    return compute;
  }

  public void setCompute(LogsQueryCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public LogQueryDefinition groupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (LogQueryDefinitionGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LogQueryDefinition addGroupByItem(LogQueryDefinitionGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogQueryDefinitionGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (LogQueryDefinitionGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LogQueryDefinition index(String index) {
    this.index = index;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return index
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public LogQueryDefinition multiCompute(List<LogsQueryCompute> multiCompute) {
    this.multiCompute = multiCompute;
    if (multiCompute != null) {
      for (LogsQueryCompute item : multiCompute) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LogQueryDefinition addMultiComputeItem(LogsQueryCompute multiComputeItem) {
    if (this.multiCompute == null) {
      this.multiCompute = new ArrayList<>();
    }
    this.multiCompute.add(multiComputeItem);
    this.unparsed |= multiComputeItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return multiCompute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsQueryCompute> getMultiCompute() {
    return multiCompute;
  }

  public void setMultiCompute(List<LogsQueryCompute> multiCompute) {
    this.multiCompute = multiCompute;
    if (multiCompute != null) {
      for (LogsQueryCompute item : multiCompute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LogQueryDefinition search(LogQueryDefinitionSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogQueryDefinitionSearch getSearch() {
    return search;
  }

  public void setSearch(LogQueryDefinitionSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public LogQueryDefinition storage(StorageType storage) {
    this.storage = storage;
    this.unparsed |= !storage.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StorageType getStorage() {
    return storage;
  }

  public void setStorage(StorageType storage) {
    if (!storage.isValid()) {
      this.unparsed = true;
    }
    this.storage = storage;
  }

  /** Return true if this LogQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogQueryDefinition logQueryDefinition = (LogQueryDefinition) o;
    return Objects.equals(this.calculatedFields, logQueryDefinition.calculatedFields)
        && Objects.equals(this.compute, logQueryDefinition.compute)
        && Objects.equals(this.groupBy, logQueryDefinition.groupBy)
        && Objects.equals(this.index, logQueryDefinition.index)
        && Objects.equals(this.multiCompute, logQueryDefinition.multiCompute)
        && Objects.equals(this.search, logQueryDefinition.search)
        && Objects.equals(this.storage, logQueryDefinition.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedFields, compute, groupBy, index, multiCompute, search, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogQueryDefinition {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    multiCompute: ").append(toIndentedString(multiCompute)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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
