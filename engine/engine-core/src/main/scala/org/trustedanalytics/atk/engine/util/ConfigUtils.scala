/*
// Copyright (c) 2015 Intel Corporation 
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
*/

package org.trustedanalytics.atk.engine.util

import com.typesafe.config.{ ConfigValue, Config }
import scala.collection.JavaConversions._

object ConfigUtils {

  /**
   * Convert a config into a Map of config keys to values
   */
  def toMap(config: Config): Map[String, ConfigValue] = {
    config.entrySet().map(entry => entry.getKey -> entry.getValue).toMap
  }

}
