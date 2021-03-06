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

package org.trustedanalytics.atk.domain.frame

import org.scalatest.WordSpec
import org.scalatest.mock.MockitoSugar

class RenameFrameArgsTest extends WordSpec with MockitoSugar {

  "RenameFrame" should {

    "require a frame" in {
      intercept[IllegalArgumentException] { RenameFrameArgs(null, "newName") }
    }

    "require a name" in {
      intercept[IllegalArgumentException] { RenameFrameArgs(mock[FrameReference], null) }
    }
  }
}
