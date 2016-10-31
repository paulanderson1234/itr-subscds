/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package common

object Regex {
  //val tavcReferenceRegex = """^X[A-Z]TAVC000[0-9]{6}$""".r
  // TEMPORARY REGEX
  val tavcReferenceRegex = """^[A-Z]{2}[0-9]{13}$""".r
  val processingDateRegex = """^\d\d\d\d-([0-9]{1,2})-([0-9]{1,2})T([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,3})Z$""".r
  val safeIdRegex = """^X[A-Z]000[0-9]{10}$""".r
}
