/**
 * Copyright 2017 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package io.fixprotocol.orchestra.model;

/**
 * An Exception that occurs in the evaluation of a model
 * 
 * @author Don Mendelson
 *
 */
public class ModelException extends Exception {

  private static final long serialVersionUID = 6950517934100277304L;

  /**
   * 
   */
  public ModelException() {
   }

  /**
   * @param message error text
   */
  public ModelException(String message) {
    super(message);
  }

  /**
   * @param cause nested exception
   */
  public ModelException(Throwable cause) {
    super(cause);
  }

  /**
   * @param message error text
   * @param cause nested exception
   */
  public ModelException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * @param message error text
   * @param cause nested exception
   * @param enableSuppression
   * @param writableStackTrace
   */
  public ModelException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
