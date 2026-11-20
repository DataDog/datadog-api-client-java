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
@JsonSerialize(using = StorageType.StorageTypeSerializer.class)
public class StorageType extends ModelEnum<String> {

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

  public static final StorageType LIVE = new StorageType("live");
  public static final StorageType HOT = new StorageType("hot");
  public static final StorageType ONLINE_ARCHIVES = new StorageType("online_archives");
  public static final StorageType DRIVELINE = new StorageType("driveline");
  public static final StorageType FLEX_TIER = new StorageType("flex_tier");
  public static final StorageType CASE_INSENSITIVE = new StorageType("case_insensitive");
  public static final StorageType CLOUD_PREM = new StorageType("cloud_prem");

  StorageType(String value) {
    super(value, allowedValues);
  }

  public static class StorageTypeSerializer extends StdSerializer<StorageType> {
    public StorageTypeSerializer(Class<StorageType> t) {
      super(t);
    }

    public StorageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(StorageType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StorageType fromValue(String value) {
    return new StorageType(value);
  }
}
