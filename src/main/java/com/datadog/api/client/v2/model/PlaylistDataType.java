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

/** Rum replay playlist resource type. */
@JsonSerialize(using = PlaylistDataType.PlaylistDataTypeSerializer.class)
public class PlaylistDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_replay_playlist"));

  public static final PlaylistDataType RUM_REPLAY_PLAYLIST =
      new PlaylistDataType("rum_replay_playlist");

  PlaylistDataType(String value) {
    super(value, allowedValues);
  }

  public static class PlaylistDataTypeSerializer extends StdSerializer<PlaylistDataType> {
    public PlaylistDataTypeSerializer(Class<PlaylistDataType> t) {
      super(t);
    }

    public PlaylistDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(PlaylistDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PlaylistDataType fromValue(String value) {
    return new PlaylistDataType(value);
  }
}
