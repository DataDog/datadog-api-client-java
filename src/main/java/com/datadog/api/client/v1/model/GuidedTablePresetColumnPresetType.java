/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** */
@JsonSerialize(
    using = GuidedTablePresetColumnPresetType.GuidedTablePresetColumnPresetTypeSerializer.class)
public class GuidedTablePresetColumnPresetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("previous_period"));

  public static final GuidedTablePresetColumnPresetType PREVIOUS_PERIOD =
      new GuidedTablePresetColumnPresetType("previous_period");

  GuidedTablePresetColumnPresetType(String value) {
    super(value, allowedValues);
  }

  public static class GuidedTablePresetColumnPresetTypeSerializer
      extends StdSerializer<GuidedTablePresetColumnPresetType> {
    public GuidedTablePresetColumnPresetTypeSerializer(Class<GuidedTablePresetColumnPresetType> t) {
      super(t);
    }

    public GuidedTablePresetColumnPresetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTablePresetColumnPresetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuidedTablePresetColumnPresetType fromValue(String value) {
    return new GuidedTablePresetColumnPresetType(value);
  }
}
