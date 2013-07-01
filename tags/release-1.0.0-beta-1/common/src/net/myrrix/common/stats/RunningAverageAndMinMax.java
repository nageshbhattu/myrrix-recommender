/*
 * Copyright Myrrix Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.myrrix.common.stats;

import org.apache.mahout.cf.taste.impl.common.RunningAverage;

/**
 * Implementations of this class also record a min and max observed value.
 *
 * @see org.apache.mahout.cf.taste.impl.common.RunningAverageAndStdDev
 * @author Sean Owen
 * @since 1.0
 */
public interface RunningAverageAndMinMax extends RunningAverage {

  double getMin();

  double getMax();

}