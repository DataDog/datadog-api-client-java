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
 * JSON:API type for files coverage response. The value must always be <code>ci_app_coverage_files
 * </code>.
 */
@JsonSerialize(using = FilesCoverageResponseType.FilesCoverageResponseTypeSerializer.class)
public class FilesCoverageResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ci_app_coverage_files"));

  public static final FilesCoverageResponseType CI_APP_COVERAGE_FILES =
      new FilesCoverageResponseType("ci_app_coverage_files");

  FilesCoverageResponseType(String value) {
    super(value, allowedValues);
  }

  public static class FilesCoverageResponseTypeSerializer
      extends StdSerializer<FilesCoverageResponseType> {
    public FilesCoverageResponseTypeSerializer(Class<FilesCoverageResponseType> t) {
      super(t);
    }

    public FilesCoverageResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FilesCoverageResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FilesCoverageResponseType fromValue(String value) {
    return new FilesCoverageResponseType(value);
  }
}
