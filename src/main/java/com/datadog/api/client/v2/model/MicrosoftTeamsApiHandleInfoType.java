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

/** Handle resource type. */
@JsonSerialize(
    using = MicrosoftTeamsApiHandleInfoType.MicrosoftTeamsApiHandleInfoTypeSerializer.class)
public class MicrosoftTeamsApiHandleInfoType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ms-teams-handle-info"));

  public static final MicrosoftTeamsApiHandleInfoType MS_TEAMS_HANDLE_INFO =
      new MicrosoftTeamsApiHandleInfoType("ms-teams-handle-info");

  MicrosoftTeamsApiHandleInfoType(String value) {
    super(value, allowedValues);
  }

  public static class MicrosoftTeamsApiHandleInfoTypeSerializer
      extends StdSerializer<MicrosoftTeamsApiHandleInfoType> {
    public MicrosoftTeamsApiHandleInfoTypeSerializer(Class<MicrosoftTeamsApiHandleInfoType> t) {
      super(t);
    }

    public MicrosoftTeamsApiHandleInfoTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MicrosoftTeamsApiHandleInfoType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MicrosoftTeamsApiHandleInfoType fromValue(String value) {
    return new MicrosoftTeamsApiHandleInfoType(value);
  }
}
