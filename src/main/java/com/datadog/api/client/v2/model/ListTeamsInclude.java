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

/** Included related resources optionally requested. */
@JsonSerialize(using = ListTeamsInclude.ListTeamsIncludeSerializer.class)
public class ListTeamsInclude extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_links", "user_team_permissions"));

  public static final ListTeamsInclude TEAM_LINKS = new ListTeamsInclude("team_links");
  public static final ListTeamsInclude USER_TEAM_PERMISSIONS =
      new ListTeamsInclude("user_team_permissions");

  ListTeamsInclude(String value) {
    super(value, allowedValues);
  }

  public static class ListTeamsIncludeSerializer extends StdSerializer<ListTeamsInclude> {
    public ListTeamsIncludeSerializer(Class<ListTeamsInclude> t) {
      super(t);
    }

    public ListTeamsIncludeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ListTeamsInclude value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListTeamsInclude fromValue(String value) {
    return new ListTeamsInclude(value);
  }
}
