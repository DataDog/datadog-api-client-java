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

/** Denotes whether mapping keys were available for this endpoint. */
@JsonSerialize(
    using =
        BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus
            .BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatusSerializer.class)
public class BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("OK", "NOT_FOUND"));

  public static final BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus OK =
      new BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus("OK");
  public static final BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus NOT_FOUND =
      new BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus("NOT_FOUND");

  BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus(String value) {
    super(value, allowedValues);
  }

  public static class BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatusSerializer
      extends StdSerializer<BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus> {
    public BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatusSerializer(
        Class<BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus> t) {
      super(t);
    }

    public BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus fromValue(
      String value) {
    return new BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus(value);
  }
}
