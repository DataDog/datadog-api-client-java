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

/** Storage tier to query. */
@JsonSerialize(
    using =
        ScatterplotDataProjectionQueryStorage.ScatterplotDataProjectionQueryStorageSerializer.class)
public class ScatterplotDataProjectionQueryStorage extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "live",
              "hot",
              "habanero",
              "online_archives",
              "driveline",
              "flex_tier",
              "case_insensitive",
              "cloud_prem"));

  public static final ScatterplotDataProjectionQueryStorage LIVE =
      new ScatterplotDataProjectionQueryStorage("live");
  public static final ScatterplotDataProjectionQueryStorage HOT =
      new ScatterplotDataProjectionQueryStorage("hot");
  public static final ScatterplotDataProjectionQueryStorage HABANERO =
      new ScatterplotDataProjectionQueryStorage("habanero");
  public static final ScatterplotDataProjectionQueryStorage ONLINE_ARCHIVES =
      new ScatterplotDataProjectionQueryStorage("online_archives");
  public static final ScatterplotDataProjectionQueryStorage DRIVELINE =
      new ScatterplotDataProjectionQueryStorage("driveline");
  public static final ScatterplotDataProjectionQueryStorage FLEX_TIER =
      new ScatterplotDataProjectionQueryStorage("flex_tier");
  public static final ScatterplotDataProjectionQueryStorage CASE_INSENSITIVE =
      new ScatterplotDataProjectionQueryStorage("case_insensitive");
  public static final ScatterplotDataProjectionQueryStorage CLOUD_PREM =
      new ScatterplotDataProjectionQueryStorage("cloud_prem");

  ScatterplotDataProjectionQueryStorage(String value) {
    super(value, allowedValues);
  }

  public static class ScatterplotDataProjectionQueryStorageSerializer
      extends StdSerializer<ScatterplotDataProjectionQueryStorage> {
    public ScatterplotDataProjectionQueryStorageSerializer(
        Class<ScatterplotDataProjectionQueryStorage> t) {
      super(t);
    }

    public ScatterplotDataProjectionQueryStorageSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotDataProjectionQueryStorage value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScatterplotDataProjectionQueryStorage fromValue(String value) {
    return new ScatterplotDataProjectionQueryStorage(value);
  }
}
