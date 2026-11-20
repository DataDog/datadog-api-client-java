/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using = PresetPeriodTableColumnPresetType.PresetPeriodTableColumnPresetTypeSerializer.class)
public class PresetPeriodTableColumnPresetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("previous_period"));

  public static final PresetPeriodTableColumnPresetType PREVIOUS_PERIOD =
      new PresetPeriodTableColumnPresetType("previous_period");

  PresetPeriodTableColumnPresetType(String value) {
    super(value, allowedValues);
  }

  public static class PresetPeriodTableColumnPresetTypeSerializer
      extends StdSerializer<PresetPeriodTableColumnPresetType> {
    public PresetPeriodTableColumnPresetTypeSerializer(Class<PresetPeriodTableColumnPresetType> t) {
      super(t);
    }

    public PresetPeriodTableColumnPresetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PresetPeriodTableColumnPresetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PresetPeriodTableColumnPresetType fromValue(String value) {
    return new PresetPeriodTableColumnPresetType(value);
  }
}
