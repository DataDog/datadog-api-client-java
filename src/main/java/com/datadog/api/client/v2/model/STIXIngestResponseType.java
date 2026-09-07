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

/** The STIX ingestion resource type. */
@JsonSerialize(using = STIXIngestResponseType.STIXIngestResponseTypeSerializer.class)
public class STIXIngestResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("threat-intel-stix-ingest"));

  public static final STIXIngestResponseType THREAT_INTEL_STIX_INGEST =
      new STIXIngestResponseType("threat-intel-stix-ingest");

  STIXIngestResponseType(String value) {
    super(value, allowedValues);
  }

  public static class STIXIngestResponseTypeSerializer
      extends StdSerializer<STIXIngestResponseType> {
    public STIXIngestResponseTypeSerializer(Class<STIXIngestResponseType> t) {
      super(t);
    }

    public STIXIngestResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        STIXIngestResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static STIXIngestResponseType fromValue(String value) {
    return new STIXIngestResponseType(value);
  }
}
