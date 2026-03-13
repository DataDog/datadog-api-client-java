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

/** Storage tier to target for an events-platform query in a guided table. */
@JsonSerialize(using = GuidedTableStorageType.GuidedTableStorageTypeSerializer.class)
public class GuidedTableStorageType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "live",
              "hot",
              "online_archives",
              "driveline",
              "flex_tier",
              "case_insensitive",
              "cloud_prem"));

  public static final GuidedTableStorageType LIVE = new GuidedTableStorageType("live");
  public static final GuidedTableStorageType HOT = new GuidedTableStorageType("hot");
  public static final GuidedTableStorageType ONLINE_ARCHIVES =
      new GuidedTableStorageType("online_archives");
  public static final GuidedTableStorageType DRIVELINE = new GuidedTableStorageType("driveline");
  public static final GuidedTableStorageType FLEX_TIER = new GuidedTableStorageType("flex_tier");
  public static final GuidedTableStorageType CASE_INSENSITIVE =
      new GuidedTableStorageType("case_insensitive");
  public static final GuidedTableStorageType CLOUD_PREM = new GuidedTableStorageType("cloud_prem");

  GuidedTableStorageType(String value) {
    super(value, allowedValues);
  }

  public static class GuidedTableStorageTypeSerializer
      extends StdSerializer<GuidedTableStorageType> {
    public GuidedTableStorageTypeSerializer(Class<GuidedTableStorageType> t) {
      super(t);
    }

    public GuidedTableStorageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTableStorageType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuidedTableStorageType fromValue(String value) {
    return new GuidedTableStorageType(value);
  }
}
