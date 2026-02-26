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

/** Relationship object that should be included in the response. */
@JsonSerialize(
    using = GetIssueIncludeQueryParameterItem.GetIssueIncludeQueryParameterItemSerializer.class)
public class GetIssueIncludeQueryParameterItem extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("assignee", "case", "team_owners"));

  public static final GetIssueIncludeQueryParameterItem ASSIGNEE =
      new GetIssueIncludeQueryParameterItem("assignee");
  public static final GetIssueIncludeQueryParameterItem CASE =
      new GetIssueIncludeQueryParameterItem("case");
  public static final GetIssueIncludeQueryParameterItem TEAM_OWNERS =
      new GetIssueIncludeQueryParameterItem("team_owners");

  GetIssueIncludeQueryParameterItem(String value) {
    super(value, allowedValues);
  }

  public static class GetIssueIncludeQueryParameterItemSerializer
      extends StdSerializer<GetIssueIncludeQueryParameterItem> {
    public GetIssueIncludeQueryParameterItemSerializer(Class<GetIssueIncludeQueryParameterItem> t) {
      super(t);
    }

    public GetIssueIncludeQueryParameterItemSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GetIssueIncludeQueryParameterItem value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GetIssueIncludeQueryParameterItem fromValue(String value) {
    return new GetIssueIncludeQueryParameterItem(value);
  }
}
