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

/**
 * The source of a unified host entry, indicating whether it was discovered via agent, agentless
 * scanning, or both.
 */
@JsonSerialize(using = CsmUnifiedHostSource.CsmUnifiedHostSourceSerializer.class)
public class CsmUnifiedHostSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("agent", "agentless", "both"));

  public static final CsmUnifiedHostSource AGENT = new CsmUnifiedHostSource("agent");
  public static final CsmUnifiedHostSource AGENTLESS = new CsmUnifiedHostSource("agentless");
  public static final CsmUnifiedHostSource BOTH = new CsmUnifiedHostSource("both");

  CsmUnifiedHostSource(String value) {
    super(value, allowedValues);
  }

  public static class CsmUnifiedHostSourceSerializer extends StdSerializer<CsmUnifiedHostSource> {
    public CsmUnifiedHostSourceSerializer(Class<CsmUnifiedHostSource> t) {
      super(t);
    }

    public CsmUnifiedHostSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CsmUnifiedHostSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CsmUnifiedHostSource fromValue(String value) {
    return new CsmUnifiedHostSource(value);
  }
}
