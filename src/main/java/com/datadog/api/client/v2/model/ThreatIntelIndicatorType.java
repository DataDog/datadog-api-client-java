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

/** The type of threat indicator. */
@JsonSerialize(using = ThreatIntelIndicatorType.ThreatIntelIndicatorTypeSerializer.class)
public class ThreatIntelIndicatorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ip_address", "domain", "sha256"));

  public static final ThreatIntelIndicatorType IP_ADDRESS =
      new ThreatIntelIndicatorType("ip_address");
  public static final ThreatIntelIndicatorType DOMAIN = new ThreatIntelIndicatorType("domain");
  public static final ThreatIntelIndicatorType SHA256 = new ThreatIntelIndicatorType("sha256");

  ThreatIntelIndicatorType(String value) {
    super(value, allowedValues);
  }

  public static class ThreatIntelIndicatorTypeSerializer
      extends StdSerializer<ThreatIntelIndicatorType> {
    public ThreatIntelIndicatorTypeSerializer(Class<ThreatIntelIndicatorType> t) {
      super(t);
    }

    public ThreatIntelIndicatorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ThreatIntelIndicatorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ThreatIntelIndicatorType fromValue(String value) {
    return new ThreatIntelIndicatorType(value);
  }
}
