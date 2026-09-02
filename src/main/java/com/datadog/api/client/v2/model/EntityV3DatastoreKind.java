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

/** The definition of Entity V3 Datastore Kind object. */
@JsonSerialize(using = EntityV3DatastoreKind.EntityV3DatastoreKindSerializer.class)
public class EntityV3DatastoreKind extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("datastore"));

  public static final EntityV3DatastoreKind DATASTORE = new EntityV3DatastoreKind("datastore");

  EntityV3DatastoreKind(String value) {
    super(value, allowedValues);
  }

  public static class EntityV3DatastoreKindSerializer extends StdSerializer<EntityV3DatastoreKind> {
    public EntityV3DatastoreKindSerializer(Class<EntityV3DatastoreKind> t) {
      super(t);
    }

    public EntityV3DatastoreKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EntityV3DatastoreKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EntityV3DatastoreKind fromValue(String value) {
    return new EntityV3DatastoreKind(value);
  }
}
