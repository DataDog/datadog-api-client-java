/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Relationship object that should be included in the search response. */
@JsonSerialize(
    using =
        SearchIssuesIncludeQueryParameterItem.SearchIssuesIncludeQueryParameterItemSerializer.class)
public class SearchIssuesIncludeQueryParameterItem extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("issue", "issue.assignee", "issue.case", "issue.team_owners"));

  public static final SearchIssuesIncludeQueryParameterItem ISSUE =
      new SearchIssuesIncludeQueryParameterItem("issue");
  public static final SearchIssuesIncludeQueryParameterItem ISSUE_ASSIGNEE =
      new SearchIssuesIncludeQueryParameterItem("issue.assignee");
  public static final SearchIssuesIncludeQueryParameterItem ISSUE_CASE =
      new SearchIssuesIncludeQueryParameterItem("issue.case");
  public static final SearchIssuesIncludeQueryParameterItem ISSUE_TEAM_OWNERS =
      new SearchIssuesIncludeQueryParameterItem("issue.team_owners");

  SearchIssuesIncludeQueryParameterItem(String value) {
    super(value, allowedValues);
  }

  public static class SearchIssuesIncludeQueryParameterItemSerializer
      extends StdSerializer<SearchIssuesIncludeQueryParameterItem> {
    public SearchIssuesIncludeQueryParameterItemSerializer(
        Class<SearchIssuesIncludeQueryParameterItem> t) {
      super(t);
    }

    public SearchIssuesIncludeQueryParameterItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SearchIssuesIncludeQueryParameterItem value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SearchIssuesIncludeQueryParameterItem fromValue(String value) {
    return new SearchIssuesIncludeQueryParameterItem(value);
  }
}
