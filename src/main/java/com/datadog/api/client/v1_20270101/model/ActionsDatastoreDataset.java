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
  ActionsDatastoreDataset.JSON_PROPERTY_COLUMNS,
  ActionsDatastoreDataset.JSON_PROPERTY_DATA_SOURCE,
  ActionsDatastoreDataset.JSON_PROPERTY_ID,
  ActionsDatastoreDataset.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionsDatastoreDataset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<DatasetColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ActionsDatastoreDatasetDataSource dataSource;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ActionsDatastoreDataset() {}

  @JsonCreator
  public ActionsDatastoreDataset(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS) List<DatasetColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ActionsDatastoreDatasetDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.columns = columns;
    for (DatasetColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.id = id;
    this.name = name;
  }

  public ActionsDatastoreDataset columns(List<DatasetColumn> columns) {
    this.columns = columns;
    for (DatasetColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ActionsDatastoreDataset addColumnsItem(DatasetColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DatasetColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DatasetColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DatasetColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ActionsDatastoreDataset dataSource(ActionsDatastoreDatasetDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ActionsDatastoreDatasetDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ActionsDatastoreDatasetDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ActionsDatastoreDataset id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActionsDatastoreDataset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** Return true if this ActionsDatastoreDataset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionsDatastoreDataset actionsDatastoreDataset = (ActionsDatastoreDataset) o;
    return Objects.equals(this.columns, actionsDatastoreDataset.columns)
        && Objects.equals(this.dataSource, actionsDatastoreDataset.dataSource)
        && Objects.equals(this.id, actionsDatastoreDataset.id)
        && Objects.equals(this.name, actionsDatastoreDataset.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, dataSource, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionsDatastoreDataset {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
