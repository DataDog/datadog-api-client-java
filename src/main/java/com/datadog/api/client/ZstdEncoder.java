/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */
package com.datadog.api.client;

import jakarta.annotation.Priority;
import jakarta.ws.rs.Priorities;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import org.glassfish.jersey.spi.ContentEncoder;

/** Zstd encoding support */
@Priority(Priorities.ENTITY_CODER)
public class ZstdEncoder extends ContentEncoder {
  public ZstdEncoder() {
    super("zstd1");
  }

  @Override
  public InputStream decode(String contentEncoding, InputStream encodedStream) throws IOException {
    try {
      Class<?> streamClass = Class.forName("com.github.luben.zstd.ZstdInputStream");
      return (InputStream) streamClass.getConstructor(InputStream.class).newInstance(encodedStream);
    } catch (ClassNotFoundException
        | NoSuchMethodException
        | InstantiationException
        | IllegalAccessException
        | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OutputStream encode(String contentEncoding, OutputStream entityStream) throws IOException {
    try {
      Class<?> streamClass = Class.forName("com.github.luben.zstd.ZstdOutputStream");
      return (OutputStream)
          streamClass.getConstructor(OutputStream.class).newInstance(entityStream);
    } catch (ClassNotFoundException
        | NoSuchMethodException
        | InstantiationException
        | IllegalAccessException
        | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}
