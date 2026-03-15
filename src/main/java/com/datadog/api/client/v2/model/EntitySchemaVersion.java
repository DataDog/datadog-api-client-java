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

/** Entity schema version for conversion. */
@JsonSerialize(using = EntitySchemaVersion.EntitySchemaVersionSerializer.class)
public class EntitySchemaVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("v2", "v2.1", "v2.2", "v3"));

  public static final EntitySchemaVersion V2 = new EntitySchemaVersion("v2");
  public static final EntitySchemaVersion V2_1 = new EntitySchemaVersion("v2.1");
  public static final EntitySchemaVersion V2_2 = new EntitySchemaVersion("v2.2");
  public static final EntitySchemaVersion V3 = new EntitySchemaVersion("v3");

  EntitySchemaVersion(String value) {
    super(value, allowedValues);
  }

  public static class EntitySchemaVersionSerializer extends StdSerializer<EntitySchemaVersion> {
    public EntitySchemaVersionSerializer(Class<EntitySchemaVersion> t) {
      super(t);
    }

    public EntitySchemaVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EntitySchemaVersion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntitySchemaVersion fromValue(String value) {
    return new EntitySchemaVersion(value);
  }
}
