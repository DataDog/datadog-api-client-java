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

/** Specifies the order of the returned teams */
@JsonSerialize(using = ListTeamsSort.ListTeamsSortSerializer.class)
public class ListTeamsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("name", "-name", "user_count", "-user_count"));

  public static final ListTeamsSort NAME = new ListTeamsSort("name");
  public static final ListTeamsSort _NAME = new ListTeamsSort("-name");
  public static final ListTeamsSort USER_COUNT = new ListTeamsSort("user_count");
  public static final ListTeamsSort _USER_COUNT = new ListTeamsSort("-user_count");

  ListTeamsSort(String value) {
    super(value, allowedValues);
  }

  public static class ListTeamsSortSerializer extends StdSerializer<ListTeamsSort> {
    public ListTeamsSortSerializer(Class<ListTeamsSort> t) {
      super(t);
    }

    public ListTeamsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(ListTeamsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListTeamsSort fromValue(String value) {
    return new ListTeamsSort(value);
  }
}
