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

/** The pipeline rule type associated to mute rules */
@JsonSerialize(using = MuteRulesType.MuteRulesTypeSerializer.class)
public class MuteRulesType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("mute_rules"));

  public static final MuteRulesType MUTE_RULES = new MuteRulesType("mute_rules");

  MuteRulesType(String value) {
    super(value, allowedValues);
  }

  public static class MuteRulesTypeSerializer extends StdSerializer<MuteRulesType> {
    public MuteRulesTypeSerializer(Class<MuteRulesType> t) {
      super(t);
    }

    public MuteRulesTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MuteRulesType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MuteRulesType fromValue(String value) {
    return new MuteRulesType(value);
  }
}
