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

/** Test-only request-body discriminator for the dashboard schema-versioning proof of concept. */
@JsonSerialize(
    using = Dashboard20270101SchemaVersion.Dashboard20270101SchemaVersionSerializer.class)
public class Dashboard20270101SchemaVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("2027-01-01"));

  public static final Dashboard20270101SchemaVersion VERSION_2027_01_01 =
      new Dashboard20270101SchemaVersion("2027-01-01");

  Dashboard20270101SchemaVersion(String value) {
    super(value, allowedValues);
  }

  public static class Dashboard20270101SchemaVersionSerializer
      extends StdSerializer<Dashboard20270101SchemaVersion> {
    public Dashboard20270101SchemaVersionSerializer(Class<Dashboard20270101SchemaVersion> t) {
      super(t);
    }

    public Dashboard20270101SchemaVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        Dashboard20270101SchemaVersion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Dashboard20270101SchemaVersion fromValue(String value) {
    return new Dashboard20270101SchemaVersion(value);
  }
}
