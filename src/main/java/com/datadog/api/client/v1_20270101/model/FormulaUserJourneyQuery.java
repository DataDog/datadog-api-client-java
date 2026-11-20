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
  FormulaUserJourneyQuery.JSON_PROPERTY_COMPUTE,
  FormulaUserJourneyQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaUserJourneyQuery.JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC,
  FormulaUserJourneyQuery.JSON_PROPERTY_GROUP_BY,
  FormulaUserJourneyQuery.JSON_PROPERTY_NAME,
  FormulaUserJourneyQuery.JSON_PROPERTY_SEARCH,
  FormulaUserJourneyQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaUserJourneyQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private FormulaUserJourneyQueryCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaUserJourneyQueryDataSource dataSource;

  public static final String JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC = "exclude_anonymous_traffic";
  private Boolean excludeAnonymousTraffic;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<UserJourneyGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private FormulaUserJourneyQuery20270101Search search;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public FormulaUserJourneyQuery() {}

  @JsonCreator
  public FormulaUserJourneyQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          FormulaUserJourneyQueryCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaUserJourneyQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          FormulaUserJourneyQuery20270101Search search) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public FormulaUserJourneyQuery compute(FormulaUserJourneyQueryCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaUserJourneyQueryCompute getCompute() {
    return compute;
  }

  public void setCompute(FormulaUserJourneyQueryCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public FormulaUserJourneyQuery dataSource(FormulaUserJourneyQueryDataSource dataSource) {
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
  public FormulaUserJourneyQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaUserJourneyQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaUserJourneyQuery excludeAnonymousTraffic(Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return excludeAnonymousTraffic
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeAnonymousTraffic() {
    return excludeAnonymousTraffic;
  }

  public void setExcludeAnonymousTraffic(Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
  }

  public FormulaUserJourneyQuery groupBy(List<UserJourneyGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (UserJourneyGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaUserJourneyQuery addGroupByItem(UserJourneyGroupBy groupByItem) {
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
  public List<UserJourneyGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<UserJourneyGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (UserJourneyGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaUserJourneyQuery name(String name) {
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

  public FormulaUserJourneyQuery search(FormulaUserJourneyQuery20270101Search search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaUserJourneyQuery20270101Search getSearch() {
    return search;
  }

  public void setSearch(FormulaUserJourneyQuery20270101Search search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public FormulaUserJourneyQuery storage(StorageType storage) {
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

  /** Return true if this FormulaUserJourneyQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaUserJourneyQuery formulaUserJourneyQuery = (FormulaUserJourneyQuery) o;
    return Objects.equals(this.compute, formulaUserJourneyQuery.compute)
        && Objects.equals(this.dataSource, formulaUserJourneyQuery.dataSource)
        && Objects.equals(
            this.excludeAnonymousTraffic, formulaUserJourneyQuery.excludeAnonymousTraffic)
        && Objects.equals(this.groupBy, formulaUserJourneyQuery.groupBy)
        && Objects.equals(this.name, formulaUserJourneyQuery.name)
        && Objects.equals(this.search, formulaUserJourneyQuery.search)
        && Objects.equals(this.storage, formulaUserJourneyQuery.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compute, dataSource, excludeAnonymousTraffic, groupBy, name, search, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaUserJourneyQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    excludeAnonymousTraffic: ")
        .append(toIndentedString(excludeAnonymousTraffic))
        .append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
