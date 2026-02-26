/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Map;

@JsonSerialize(using = UnparsedObject.UnparsedObjectSerializer.class)
public class UnparsedObject {
  Map<String, Object> data;

  public UnparsedObject(Map<String, Object> data) {
    this.data = data;
  }

  public static class UnparsedObjectSerializer extends StdSerializer<UnparsedObject> {
    public UnparsedObjectSerializer(Class<UnparsedObject> t) {
      super(t);
    }

    public UnparsedObjectSerializer() {
      this(null);
    }

    @Override
    public void serialize(UnparsedObject value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.data);
    }
  }

  public Map<String, Object> getData() {
    return this.data;
  }

  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  @Override
  public int hashCode() {
    return data.hashCode();
  }

  /** Return true if this UnparsedObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.data.equals(((UnparsedObject) o).data);
  }

  @JsonCreator
  public static UnparsedObject fromValue(Map<String, Object> value) {
    return new UnparsedObject(value);
  }
}