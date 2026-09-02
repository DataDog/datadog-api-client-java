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

/**
 * A numeric representation of the type of the service level objective (<code>0</code> for monitor,
 * <code>1</code> for metric). Always included in service level objective responses. Ignored in
 * create/update requests.
 */
@JsonSerialize(using = SLOTypeNumeric.SLOTypeNumericSerializer.class)
public class SLOTypeNumeric extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 2));

  public static final SLOTypeNumeric MONITOR = new SLOTypeNumeric(0);
  public static final SLOTypeNumeric METRIC = new SLOTypeNumeric(1);
  public static final SLOTypeNumeric TIME_SLICE = new SLOTypeNumeric(2);

  SLOTypeNumeric(Integer value) {
    super(value, allowedValues);
  }

  public static class SLOTypeNumericSerializer extends StdSerializer<SLOTypeNumeric> {
    public SLOTypeNumericSerializer(Class<SLOTypeNumeric> t) {
      super(t);
    }

    public SLOTypeNumericSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOTypeNumeric value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOTypeNumeric fromValue(Integer value) {
    return new SLOTypeNumeric(value);
  }
}
