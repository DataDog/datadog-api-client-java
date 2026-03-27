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

/** Case field that can be sorted on */
@JsonSerialize(using = CaseSortableField.CaseSortableFieldSerializer.class)
public class CaseSortableField extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("created_at", "priority", "status"));

  public static final CaseSortableField CREATED_AT = new CaseSortableField("created_at");
  public static final CaseSortableField PRIORITY = new CaseSortableField("priority");
  public static final CaseSortableField STATUS = new CaseSortableField("status");

  CaseSortableField(String value) {
    super(value, allowedValues);
  }

  public static class CaseSortableFieldSerializer extends StdSerializer<CaseSortableField> {
    public CaseSortableFieldSerializer(Class<CaseSortableField> t) {
      super(t);
    }

    public CaseSortableFieldSerializer() {
      this(null);
    }

    @Override
    public void serialize(CaseSortableField value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseSortableField fromValue(String value) {
    return new CaseSortableField(value);
  }
}
