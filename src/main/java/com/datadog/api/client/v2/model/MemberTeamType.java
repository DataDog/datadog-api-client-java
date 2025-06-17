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

/** Member team type */
@JsonSerialize(using = MemberTeamType.MemberTeamTypeSerializer.class)
public class MemberTeamType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("member_teams"));

  public static final MemberTeamType MEMBER_TEAMS = new MemberTeamType("member_teams");

  MemberTeamType(String value) {
    super(value, allowedValues);
  }

  public static class MemberTeamTypeSerializer extends StdSerializer<MemberTeamType> {
    public MemberTeamTypeSerializer(Class<MemberTeamType> t) {
      super(t);
    }

    public MemberTeamTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MemberTeamType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MemberTeamType fromValue(String value) {
    return new MemberTeamType(value);
  }
}
