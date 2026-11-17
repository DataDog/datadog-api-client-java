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
 * Datadog's coverage of the model's operations under zero data retention. A model is eligible when
 * coverage is <code>full</code> and its provider's <code>zdr_eligible</code> is <code>true</code>.
 * <code>partial</code> means only the <code>covered_operations</code> can be served: requests on
 * other operations are not dispatched to it.
 */
@JsonSerialize(using = AiGatewayModelZdrCoverage.AiGatewayModelZdrCoverageSerializer.class)
public class AiGatewayModelZdrCoverage extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("full", "partial", "none"));

  public static final AiGatewayModelZdrCoverage FULL = new AiGatewayModelZdrCoverage("full");
  public static final AiGatewayModelZdrCoverage PARTIAL = new AiGatewayModelZdrCoverage("partial");
  public static final AiGatewayModelZdrCoverage NONE = new AiGatewayModelZdrCoverage("none");

  AiGatewayModelZdrCoverage(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelZdrCoverageSerializer
      extends StdSerializer<AiGatewayModelZdrCoverage> {
    public AiGatewayModelZdrCoverageSerializer(Class<AiGatewayModelZdrCoverage> t) {
      super(t);
    }

    public AiGatewayModelZdrCoverageSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelZdrCoverage value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelZdrCoverage fromValue(String value) {
    return new AiGatewayModelZdrCoverage(value);
  }
}
