/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.common.metrics.common;

import java.io.IOException;

import org.apache.hadoop.hive.conf.HiveConf;

import java.io.IOException;

/**
 * Generic Metics interface.
 */
public interface Metrics {

  //Must declare CTOR taking in HiveConf.

  /**
   * Deinitializes the Metrics system.
   */
  public void close() throws Exception;

  /**
   * @param name
   * @throws IOException
   */
  public void startScope(String name) throws IOException;

  public void endScope(String name) throws IOException;

  //Counter-related methods

  /**
   * Increments a counter of the given name by 1.
   * @param name
   * @return
   * @throws IOException
   */
  public Long incrementCounter(String name) throws IOException;

  /**
   * Increments a counter of the given name by "increment"
   * @param name
   * @param increment
   * @return
   * @throws IOException
   */
  public Long incrementCounter(String name, long increment) throws IOException;
}
