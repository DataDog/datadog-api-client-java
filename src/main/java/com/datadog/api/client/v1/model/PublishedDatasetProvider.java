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
 * Product page that published the dataset queried by a <code>DatasetListQuery</code>. <code>
 * ddsql_query</code> is the only provider currently supported for host map widgets.
 */
@JsonSerialize(using = PublishedDatasetProvider.PublishedDatasetProviderSerializer.class)
public class PublishedDatasetProvider extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ddsql_query"));

  public static final PublishedDatasetProvider DDSQL_QUERY =
      new PublishedDatasetProvider("ddsql_query");

  PublishedDatasetProvider(String value) {
    super(value, allowedValues);
  }

  public static class PublishedDatasetProviderSerializer
      extends StdSerializer<PublishedDatasetProvider> {
    public PublishedDatasetProviderSerializer(Class<PublishedDatasetProvider> t) {
      super(t);
    }

    public PublishedDatasetProviderSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PublishedDatasetProvider value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PublishedDatasetProvider fromValue(String value) {
    return new PublishedDatasetProvider(value);
  }
}
