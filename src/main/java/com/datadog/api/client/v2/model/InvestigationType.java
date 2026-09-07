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

/** The resource type for investigations. */
@JsonSerialize(using = InvestigationType.InvestigationTypeSerializer.class)
public class InvestigationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("investigation"));

  public static final InvestigationType INVESTIGATION = new InvestigationType("investigation");

  InvestigationType(String value) {
    super(value, allowedValues);
  }

  public static class InvestigationTypeSerializer extends StdSerializer<InvestigationType> {
    public InvestigationTypeSerializer(Class<InvestigationType> t) {
      super(t);
    }

    public InvestigationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(InvestigationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static InvestigationType fromValue(String value) {
    return new InvestigationType(value);
  }
}
