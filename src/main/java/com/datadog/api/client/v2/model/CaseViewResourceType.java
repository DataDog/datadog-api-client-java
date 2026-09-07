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

/** JSON:API resource type for case views. */
@JsonSerialize(using = CaseViewResourceType.CaseViewResourceTypeSerializer.class)
public class CaseViewResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("view"));

  public static final CaseViewResourceType VIEW = new CaseViewResourceType("view");

  CaseViewResourceType(String value) {
    super(value, allowedValues);
  }

  public static class CaseViewResourceTypeSerializer extends StdSerializer<CaseViewResourceType> {
    public CaseViewResourceTypeSerializer(Class<CaseViewResourceType> t) {
      super(t);
    }

    public CaseViewResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CaseViewResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseViewResourceType fromValue(String value) {
    return new CaseViewResourceType(value);
  }
}
