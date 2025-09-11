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

/** How to handle conflicts when inserting items that already exist in the datastore. */
@JsonSerialize(using = DatastoreItemConflictMode.DatastoreItemConflictModeSerializer.class)
public class DatastoreItemConflictMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("fail_on_conflict", "overwrite_on_conflict"));

  public static final DatastoreItemConflictMode FAIL_ON_CONFLICT =
      new DatastoreItemConflictMode("fail_on_conflict");
  public static final DatastoreItemConflictMode OVERWRITE_ON_CONFLICT =
      new DatastoreItemConflictMode("overwrite_on_conflict");

  DatastoreItemConflictMode(String value) {
    super(value, allowedValues);
  }

  public static class DatastoreItemConflictModeSerializer
      extends StdSerializer<DatastoreItemConflictMode> {
    public DatastoreItemConflictModeSerializer(Class<DatastoreItemConflictMode> t) {
      super(t);
    }

    public DatastoreItemConflictModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatastoreItemConflictMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatastoreItemConflictMode fromValue(String value) {
    return new DatastoreItemConflictMode(value);
  }
}
