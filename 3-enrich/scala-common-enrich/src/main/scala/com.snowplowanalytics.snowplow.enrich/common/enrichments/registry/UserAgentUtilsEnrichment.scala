/*
 * Copyright (c) 2012-2014 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package com.snowplowanalytics
package snowplow
package enrich
package common
package enrichments
package registry

// Maven Artifact
import org.apache.maven.artifact.versioning.DefaultArtifactVersion


// Scalaz
import scalaz._
import Scalaz._

// json4s
import org.json4s.JValue

// Iglu
import iglu.client.SchemaKey
import iglu.client.validation.ProcessingMessageMethods._

// This project
import utils.ScalazJson4sUtils

/**
* Companion object. Lets us create a UaParserUtilityConfigurationEnrichment
* from a JValue.
*/

object UserAgentUtilsEnrichment extends ParseableEnrichment {

	val supportedSchemaKey = SchemaKey("com.snowplowanalytics.snowplow", "user_agent_utils_config", "jsonschema", "1-0-0")

}
